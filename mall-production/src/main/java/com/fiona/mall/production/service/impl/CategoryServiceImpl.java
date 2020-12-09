package com.fiona.mall.production.service.impl;

import com.fiona.mall.common.utils.PageUtils;
import com.fiona.mall.common.utils.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;


import com.fiona.mall.production.dao.CategoryDao;
import com.fiona.mall.production.entity.CategoryEntity;
import com.fiona.mall.production.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {
//  @Autowired
//  CategoryDao categoryDao;
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> listWithTree() {
        //1.查询所有分类
        List<CategoryEntity> entities = baseMapper.selectList(null);

        //2.组装成父子的树形结构
        //2.1)找到所有的一级分类
        List<CategoryEntity> level1= entities.stream().filter((entity) -> {
            return entity.getParentCid() == 0;
        }).map((menu) -> {menu.setChildren(recursiveGetChildren(menu, entities));
          return menu; }).sorted((menu1, menu2)->{ return (menu1.getSort()==null?0:menu1.getSort()) - (menu2.getSort()==null?0:menu2.getSort());}).collect(Collectors.toList());

        return level1;
    }
    //2.2）递归查找所有entriy的子entry
    private List<CategoryEntity> recursiveGetChildren(CategoryEntity currentEntry, List<CategoryEntity> all){
        List<CategoryEntity> children = all.stream().filter((entity) -> {
            return entity.getParentCid() == currentEntry.getCatId();
        }).map((e)->{
            //递归找子菜单
            e.setChildren(recursiveGetChildren(e, all));
            return e;
        }).sorted((menu1, menu2)->{ return (menu1.getSort()==null?0:menu1.getSort()) - (menu2.getSort()==null?0:menu2.getSort());}).collect(Collectors.toList());
        return children;
    }

}