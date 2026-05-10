# 建华建材配方管理系统

> 企业级BOM配方管理系统

## 系统概述

实现集团统一管控、多组织数据隔离的BOM配方管理系统。

## 技术栈

- Java 17 + Spring Boot 3.x
- MyBatis-Plus
- MySQL 8.0
- Redis 7.x

## 模块结构

```
formula-management/
├── fm-common/         # 公共模块（实体、枚举、工具类）
├── fm-system/         # FM01 系统设置
├── fm-basic/         # FM02 基础资料
├── fm-bom/           # FM03 BOM计算
├── fm-altlist/       # FM04 备选物料清单
├── fm-sync/         # SAP同步服务
├── fm-scheduler/    # 定时任务
└── fm-admin/        # API聚合
```

## 功能模块

| 模块 | 说明 |
|------|------|
| FM01 系统设置 | 用户、角色、组织管理 |
| FM02 基础资料 | 工厂、车间、物料、桩长等基础资料 |
| FM03 BOM计算 | 计算对象、计算公式、BOM管理 |
| FM04 备选物料清单 | 备选物料清单计算与历史管理 |

## 开发规范

- 分层架构：Controller → Service → Mapper
- 数据状态：创建(0) → 提交(1) → 审核(2) → 反审核(3)
- 多租户：通过 org_id 进行数据隔离

## 参考文档

- [需求规格说明书](./docs/需求规格说明书V3.0.pdf)
- [系统设计文档](./docs/系统设计文档.md)