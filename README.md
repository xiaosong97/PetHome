## 程序使用指南

### 1. 组成

1. PetHome为项目所有代码以及资源（图片、引入的包等）
2. 数据库表格（里面的CSV文件名对应各张表）

### 2. 程序的加载

1. 下载Eclipse Java EE IDE for Web Developers (Oxygen Release) 并安装
2. 在Eclipse 中加载插件Spring Tools 3.9.0.RELEACE
3. 解压PetHome，导入项目
4. 运行

### 3.数据库的表生成

1. 下载MySQL

2. 打开项目 src/main/resources/application.properties，将内容修改为

   ```properties
   spring.datasource.driver-class-name=com.mysql.jdbc.Driver
   spring.datasource.url=jdbc:mysql://59.110.173.114:3306/pet_home(改为使用的数据库的database)
   spring.datasource.username=root(改为数据库登录名)
   spring.datasource.password=sixstar(改为数据库密码)

   spring.jpa.hibernate.ddl-auto=update(改为create)
   spring.jpa.show-sql=true
   ```

3. 运行程序，将自动生成数据库

### 4.数据库的数据载入

1. 将数据库表格导入生成的表中

2. 打开项目 src/main/resources/application.properties，将内容修改为

   ```properties
   spring.datasource.driver-class-name=com.mysql.jdbc.Driver
   spring.datasource.url=jdbc:mysql://59.110.173.114:3306/pet_home(改为使用的数据库的database)
   spring.datasource.username=root(改为数据库登录名)
   spring.datasource.password=sixstar(改为数据库密码)

   spring.jpa.hibernate.ddl-auto=update(改为update)
   spring.jpa.show-sql=true
   ```

3. 运行程序