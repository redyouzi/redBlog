package com.red.controller;

import com.red.controller.utils.Result;
import com.red.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 后台博客管理
 */
@RestController
@RequestMapping("/adminBlog")
public class AdminBlogController {
    @Autowired
    private BlogService blogService;

    /**
     * 查询全部-部分字段
     *
     * @return
     */
    @GetMapping
    public Result getBlogList() {
        return blogService.getBlogs();
    }

    /**
     * 根据id查询博客
     *
     * @param blogId
     * @return
     */
    @GetMapping("/{blogId}")
    public Result getBlogById(@PathVariable("blogId") Long blogId) {
        return Result.ok(blogService.getBaseMapper().selectById(blogId));
    }


}
