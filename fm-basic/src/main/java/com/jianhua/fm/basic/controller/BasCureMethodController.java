package com.jianhua.fm.basic.controller;

import com.jianhua.fm.basic.entity.BasCureMethod;
import com.jianhua.fm.basic.service.BasCureMethodService;
import com.jianhua.fm.common.utils.R;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@Tag(name = "养护方式管理")
@RestController
@RequestMapping("/basic/cureMethod")
@RequiredArgsConstructor
public class BasCureMethodController {
    private final BasCureMethodService basCureMethodService;

    @GetMapping("/list")
    public R list() { return R.ok(basCureMethodService.list()); }
    @GetMapping("/{id}")
    public R get(@PathVariable Long id) { return R.ok(basCureMethodService.getById(id)); }
    @PostMapping
    public R add(@RequestBody BasCureMethod e) { basCureMethodService.save(e); return R.ok(); }
    @PutMapping
    public R update(@RequestBody BasCureMethod e) { basCureMethodService.updateById(e); return R.ok(); }
    @DeleteMapping("/{id}")
    public R delete(@PathVariable Long id) { basCureMethodService.removeById(id); return R.ok(); }
}
