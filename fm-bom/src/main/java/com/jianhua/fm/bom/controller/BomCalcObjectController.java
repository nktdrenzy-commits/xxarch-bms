package com.jianhua.fm.bom.controller;

import com.jianhua.fm.bom.entity.BomCalcObject;
import com.jianhua.fm.bom.service.BomCalcObjectService;
import com.jianhua.fm.common.utils.R;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@Tag(name = "计算对象管理")
@RestController
@RequestMapping("/bom/calcObject")
@RequiredArgsConstructor
public class BomCalcObjectController {
    private final BomCalcObjectService service;

    @GetMapping("/list")
    public R list() { return R.ok(service.list()); }
    @GetMapping("/{id}")
    public R get(@PathVariable Long id) { return R.ok(service.getById(id)); }
    @PostMapping
    public R add(@RequestBody BomCalcObject e) { service.save(e); return R.ok(); }
    @PutMapping
    public R update(@RequestBody BomCalcObject e) { service.updateById(e); return R.ok(); }
    @DeleteMapping("/{id}")
    public R delete(@PathVariable Long id) { service.removeById(id); return R.ok(); }
}
