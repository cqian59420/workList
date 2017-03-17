## 技术概览

### 前段
 * 使用vueJs

### 后端
 * 微框架 spark framework 
 * liquibase 数据库脚本维护
 * jooq 数据库操作框架 
 * jackson json的代码转换
 * lombok 简化java代码的编写
 * logback 日志系统
 
 ### 运行
 mvn compile && mvn liquibase:update && mvn exec:java
 
 http://localhost:4567/