package com.jianhua.fm.basic.controller;

import com.jianhua.fm.basic.entity.BasFactory;
import com.jianhua.fm.basic.service.BasFactoryService;
import com.jianhua.fm.common.utils.R;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

/**
 * 工厂Controller
 */
@Tag(name = "工厂管理")
@RestController
@RequestMapping("/basic/factory")
@RequiredArgsConstructor
public class BasFactoryController {

    private final BasFactoryService basFactoryService;

    @Operation(summary = "工厂列表")
    @GetMapping("/list")
    public R list() {
        return R.ok(basFactoryService.list());
    }

    @Operation(summary = "工厂详情")
    @GetMapping("/{id}")
    public R get(@PathVariable Long id) {
        return R.ok(basFactoryService.getById(id));
    }

    @Operation(summary = "新增工厂")
    @PostMapping
    public R add(@RequestBody BasFactory basFactory) {
        basFactoryService.save(basFactory);
        return R.ok();
    }

    @Operation(summary = "修改工厂")
    @PutMapping
    public R update(@RequestBody BasFactory basFactory) {
        basFactoryService.updateById(basFactory);
        return R.ok();
    }

    @Operation(summary = "删除工厂")
    @DeleteMapping("/{id}")
    public R delete(@PathVariable Long id) {
        basFactoryService.removeById(id);
        return R.ok();
    }
}