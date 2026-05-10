package com.jianhua.fm.bom.controller;

import com.jianhua.fm.bom.entity.BomCalcFormula;
import com.jianhua.fm.bom.service.BomCalcFormulaService;
import com.jianhua.fm.common.utils.R;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@Tag(name = "计算公式管理")
@RestController
@RequestMapping("/bom/calcFormula")
@RequiredArgsConstructor
public class BomCalcFormulaController {
    private final BomCalcFormulaService service;

    @GetMapping("/list")
    public R list() { return R.ok(service.list()); }
    @GetMapping("/{id}")
    public R get(@PathVariable Long id) { return R.ok(service.getById(id)); }
    @PostMapping
    public R add(@RequestBody BomCalcFormula e) { service.save(e); return R.ok(); }
    @PutMapping
    public R update(@RequestBody BomCalcFormula e) { service.updateById(e); return R.ok(); }
    @DeleteMapping("/{id}")
    public R delete(@PathVariable Long id) { service.removeById(id); return R.ok(); }
}
