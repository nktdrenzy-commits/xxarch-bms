package com.jianhua.fm.basic.controller;

import com.jianhua.fm.basic.entity.BasMaterial;
import com.jianhua.fm.basic.service.BasMaterialService;
import com.jianhua.fm.common.utils.R;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@Tag(name = "物料管理")
@RestController
@RequestMapping("/basic/material")
@RequiredArgsConstructor
public class BasMaterialController {
    private final BasMaterialService basMaterialService;

    @GetMapping("/list")
    public R list() { return R.ok(basMaterialService.list()); }
    @GetMapping("/{id}")
    public R get(@PathVariable Long id) { return R.ok(basMaterialService.getById(id)); }
    @PostMapping
    public R add(@RequestBody BasMaterial e) { basMaterialService.save(e); return R.ok(); }
    @PutMapping
    public R update(@RequestBody BasMaterial e) { basMaterialService.updateById(e); return R.ok(); }
    @DeleteMapping("/{id}")
    public R delete(@PathVariable Long id) { basMaterialService.removeById(id); return R.ok(); }
}
