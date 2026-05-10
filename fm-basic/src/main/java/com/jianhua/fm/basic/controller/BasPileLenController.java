package com.jianhua.fm.basic.controller;

import com.jianhua.fm.basic.entity.BasPileLen;
import com.jianhua.fm.basic.service.BasPileLenService;
import com.jianhua.fm.common.utils.R;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@Tag(name = "桩长管理")
@RestController
@RequestMapping("/basic/pileLen")
@RequiredArgsConstructor
public class BasPileLenController {
    private final BasPileLenService basPileLenService;

    @GetMapping("/list")
    public R list() { return R.ok(basPileLenService.list()); }
    @GetMapping("/{id}")
    public R get(@PathVariable Long id) { return R.ok(basPileLenService.getById(id)); }
    @PostMapping
    public R add(@RequestBody BasPileLen e) { basPileLenService.save(e); return R.ok(); }
    @PutMapping
    public R update(@RequestBody BasPileLen e) { basPileLenService.updateById(e); return R.ok(); }
    @DeleteMapping("/{id}")
    public R delete(@PathVariable Long id) { basPileLenService.removeById(id); return R.ok(); }
}
