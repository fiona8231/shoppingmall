package com.fiona.mall.production.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fiona.mall.production.entity.CategoryEntity;
import com.fiona.mall.production.service.CategoryService;
import com.fiona.mall.common.utils.PageUtils;
import com.fiona.mall.common.utils.R;




/**
 * 商品三级分类
 *
 * @author yue
 * @email wahtever@gmail.com
 * @date 2020-12-03 22:35:02
 */
@RestController
@RequestMapping("production/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    /**
     *  查出所有分类和子分类，并把他们按照父子结构组装起来
     */
    @RequestMapping("/list/tree")
    public R list(){
     List<CategoryEntity> entities = categoryService.listWithTree();


        return R.ok().put("data", entities);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{catId}")
    public R info(@PathVariable("catId") Long catId){
		CategoryEntity category = categoryService.getById(catId);

        return R.ok().put("data", category);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody CategoryEntity category){
		categoryService.save(category);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody CategoryEntity category){
		categoryService.updateById(category);

        return R.ok();
    }

    /**
     * 删除
     * @Requestbody 必须请求是post
     * springMVC 自动将请求题的数据（json）转换为对应的对象
     *
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] catIds){
        //1, 检查当前删除的菜单，是否被其他地方应用，我们自己定义一个批量删除

        categoryService.removeMenuByIds(Arrays.asList(catIds));
		//categoryService.removeByIds(Arrays.asList(catIds));

        return R.ok();
    }

}
