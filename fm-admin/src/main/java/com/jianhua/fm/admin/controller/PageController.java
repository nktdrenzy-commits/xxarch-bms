package com.jianhua.fm.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * 页面Controller
 */
@Controller
public class PageController {

    /**
     * 工作台首页
     */
    @GetMapping("/")
    public String index() {
        return "redirect:/dashboard";
    }

    /**
     * 工作台
     */
    @GetMapping("/dashboard")
    public String dashboard(Model model) {
        model.addAttribute("pageTitle", "工作台");
        return "dashboard";
    }

    /**
     * 组织管理列表
     */
    @GetMapping("/system/org")
    public String orgList(Model model) {
        model.addAttribute("pageTitle", "组织管理");
        return "system/org";
    }

    /**
     * 组织详情
     */
    @GetMapping("/system/org/{id}")
    public String orgDetail(@PathVariable Long id, Model model) {
        model.addAttribute("pageTitle", "组织详情");
        return "system/org-detail";
    }

    /**
     * 工厂管理列表
     */
    @GetMapping("/basic/factory")
    public String factoryList(Model model) {
        model.addAttribute("pageTitle", "工厂管理");
        return "basic/factory";
    }

    /**
     * 物料管理列表
     */
    @GetMapping("/basic/material")
    public String materialList(Model model) {
        model.addAttribute("pageTitle", "物料管理");
        return "basic/material";
    }

    /**
     * BOM管理列表
     */
    @GetMapping("/bom/main")
    public String bomList(Model model) {
        model.addAttribute("pageTitle", "BOM计算");
        return "bom/main";
    }

    /**
     * 备选物料列表
     */
    @GetMapping("/altlist")
    public String altList(Model model) {
        model.addAttribute("pageTitle", "备选物料");
        return "altlist";
    }
}