package com.jianhua.fm.system.controller;

import com.jianhua.fm.common.utils.R;
import com.jianhua.fm.system.entity.SysOrg;
import com.jianhua.fm.system.service.SysOrgService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

/**
 * 组织Controller
 */
@Tag(name = "组织管理")
@RestController
@RequestMapping("/system/org")
@RequiredArgsConstructor
public class SysOrgController {

    private final SysOrgService sysOrgService;

    @Operation(summary = "组织列表")
    @GetMapping("/list")
    public R list() {
        return R.ok(sysOrgService.list());
    }

    @Operation(summary = "组织详情")
    @GetMapping("/{id}")
    public R get(@PathVariable Long id) {
        return R.ok(sysOrgService.getById(id));
    }

    @Operation(summary = "新增组织")
    @PostMapping
    public R add(@RequestBody SysOrg sysOrg) {
        sysOrgService.save(sysOrg);
        return R.ok();
    }

    @Operation(summary = "修改组织")
    @PutMapping
    public R update(@RequestBody SysOrg sysOrg) {
        sysOrgService.updateById(sysOrg);
        return R.ok();
    }

    @Operation(summary = "删除组织")
    @DeleteMapping("/{id}")
    public R delete(@PathVariable Long id) {
        sysOrgService.removeById(id);
        return R.ok();
    }
}