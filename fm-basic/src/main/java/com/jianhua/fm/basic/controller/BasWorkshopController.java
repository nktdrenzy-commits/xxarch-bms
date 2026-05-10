package com.jianhua.fm.basic.controller;

import com.jianhua.fm.basic.entity.BasWorkshop;
import com.jianhua.fm.basic.service.BasWorkshopService;
import com.jianhua.fm.common.utils.R;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@Tag(name = "车间管理")
@RestController
@RequestMapping("/basic/workshop")
@RequiredArgsConstructor
public class BasWorkshopController {
    private final BasWorkshopService basWorkshopService;

    @GetMapping("/list")
    public R list() { return R.ok(basWorkshopService.list()); }
    @GetMapping("/{id}")
    public R get(@PathVariable Long id) { return R.ok(basWorkshopService.getById(id)); }
    @PostMapping
    public R add(@RequestBody BasWorkshop e) { basWorkshopService.save(e); return R.ok(); }
    @PutMapping
    public R update(@RequestBody BasWorkshop e) { basWorkshopService.updateById(e); return R.ok(); }
    @DeleteMapping("/{id}")
    public R delete(@PathVariable Long id) { basWorkshopService.removeById(id); return R.ok(); }
}
