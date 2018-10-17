## 高校毕业生离校系统
### 可行性分析
#### 1.引言
##### 1.1  报告撰写目的
 高校毕业生离校系统是针对高校相关部门以及毕业生的需求而设计，是可以便于高校管理毕业生离校信息，毕业生查询离校流程进度的系统。
 此可行性研究报告，是为实现在最短的时间内以最小的代价确定设计高校毕业生离校系统的问题是否可以解决，从而确定进一步对系统进行开发的流程步骤。
##### 1.2 项目背景
 原版本高校毕业生离校系统存在以下问题
* 发布时间较早，技术与当今主流技术不匹配.
* 在毕业生离校高峰期，由高并发导致的系统崩溃，产生了系统管理员高昂的维护代价,极大降低了用户体验.
* 系统存在未知BUG,在管理员导入数据时出现错误而没有显示详细的错误信息，不利于数据的处理
* 不能满足移动端的需求。
为解决以上问题，重新开发高校毕业生离校系统

#### 2.可行性分析
##### 2.1系统基本要求
######  2.1.1采用架构
 本项目采用浏览器/服务器（B/S）架构：
 * 浏览器可用IE8.0或其他等同浏览器.
 * 服务器端使用Tomcat8.0，
 * 关系型数据库采用MySQL5.5。
 * Redis作为缓存
 * MongoDB作为文件数据库
 * 基于SpringBoot使用SSM框架

###### 2.1.2主要功能需求
  主要分为以下模块
 * 普通用户访问：在微信小程序中 ,查看当前用户离校进度，阅读管理员发布的信息。
 * 系统用户管理： 在Web浏览器中，导入当前毕业生信息，发布公告，制定离校流程，审核学生离校信息，管理证书发放，按照本科生，硕士研究生，博士研究生进行统计查询,生成离校单并整理归档。控制访问权限。

###### 2.1.3 系统运行环境
服务器使用docker容器部署在Linux操作系统
浏览器端使用装有基本浏览器的电脑(手机)操作系统或者装有微信的手机操作系统。

##### 2.2 系统开发要求
###### 2.2.1系统实现
开发周期:
* 文档编写3周，代码编写6周，软件测试2周。

###### 2.2.2环境搭建
 服务器端采用云服务提供商的云主机，安装Ubutun16.04、docker、Tomcat、MySQL搭建网站系统环境。

###### 2.2.3费用开支与效益分析
* 租用阿里云主机10元/月，环境搭建采用开源免费软件。
* 代码开发，所需开发与维护人员为4

 综上，各项费用开支为10元/月，高校毕业生离校系统为非盈利的网站，纯经济效益为0。

##### 2.3其他各因素的可行性分析

###### 2.3.1可用性方面分析
 搭建符合高校用户需求的系统，由于开发人员技术水平有限，因此可用性较差。

###### 2.3.2法律方面分析
 法律方面的问题较多，主要涉及到著作权、专利权等方面法律问题，需要求助专业人士。

#### 3 可行性分析总结
 上述可行性分析，参考现有开发资料、文档等资源，高校毕业生离校系统的体系结构比较完善，开发要求相比于复杂的系统较低，具备进一步进行需求分析与后续开发的条件。


## 需求分析
### 1 项目功能需求
#### 1.1 基本需求分析

 基于高校毕业生离校系统的特点，本系统实现毕业生离校的主要功能

| 模块名称    |     最高管理员|   部门/学院管理员   | 学生用户 | 额外描述 |
| :--------- | --------:| :------: | :------: | :------: |
| 当前账号管理  | √ |  √ |  √| 显示当前账号信息，提供注销、修改密码等基本功能 |
| 首页  | √ |  √ |  × | 显示总体公告，待办事项，离校统计动态 |
| 系统管理 | √ |  × |  × | 具有系统设置、权限管理、基础信息维护、基本信息子模块 |
| 离校管理 | √ |  × |  × | 具有操作流程导航图、离校环节管理、环节权限管理、离校单管理子模块 |
| 离校办理 | √ | √ |  × | 具有离校办理审核、离校依赖数据、证书发放子模块 |
| 统计查询 | √ | √ |  × | 具有离校查询、离校统计子模块 |

#### 1.2 系统设计方法
仅为学生用户提供微信小程序界面，对各级管理员及学生提供Web访问支持
采用基于角色的权限访问控制（Role-Based Access Control）模型作为权限管理模块,实现权限的细粒度管理



#### 1.3 功能性分析
##### 统计查询模块

 |权限名称     |  增|删|查|改| 权限描述   |
| :-------- | --------:| :------: | :-------- | --------:| :------: |
| 离校信息查询    |   × |×|√|×| 根据过滤条件，及相关访问权限（本科生、硕士研究生、博士研究生）->（学院）->(专业)->班级等进行条件查询|
| 离校信息统计   |   × |×|√|×| 根据本科生、硕士研究生、博士研究生的离校情况，分别生成UI友好的图形统计界面，以及根据有关字段生成统计报表及快照。针对学校/部门/学院角色进行权限控制、也要对（本科生、硕士研究生、博士研究生）进行权限控制，并将根据权限生成UI友好的图形统计界面，显示在首页|

##### 首页模块

 |权限名称     |  增|删|查|改| 权限描述   |
| :-------- | --------:| :------: | :-------- | --------:| :------: |
| 显示首页新闻   |   × |×|√|×| 由最高管理员发布的，可以被所有用户查看的信息|
| 显示代办事项   |   × |×|√|×| 根据相关权限，（按照，本科生、硕士研究生、博士研究生）显示待审核的信息，做一个链接，跳转到待处理界面|
| 离校信息统计   |   × |×|√|×| 引用统计查询模块信息|

##### 当前账号管理模块

|权限名称     |  增|删|查|改| 权限描述   |
| :-------- | --------:| :------: | :-------- | --------:| :------: |
| 修改密码   |   × |×|×|√| 修改当前用户密码,由于密码加密存放在数据库，不支持明文查看密码|
|注销/退出登录   |   × |×|×|×|退出当前用户，并返回首页|

##### 系统管理模块
###### 系统设置子模块

 |权限名称     |  增|删|查|改| 权限描述   |
| :-------- | --------:| :------: | :-------- | --------:| :------: |
| 参数设置  |   × |×|√|√| 设置高校名称、高校lOGO、学生离校单名称、默认离校年度|
| 新闻管理 |   √|√|√|√|发布新闻公告，显示在首页|
| 日志管理 |   ×|√|√|√|根据操作时间、操作人、操作类型、业务模块进行查询，删除|

###### 权限管理子模块

 |权限名称     |  增|删|查|改| 权限描述   |
| :-------- | --------:| :------: | :-------- | --------:| :------: |
| 角色管理 |   √|√|√|√| 设置角色名称、添加角色权限|
| 用户管理 |   √|√|√|√|授予所属用户角色,设置用户密码|

###### 基础数据维护子模块

|权限名称     |  增|删|查|改| 权限描述   |
| :-------- | --------:| :------: | :-------- | --------:| :------: |
| 导入当学生信息 |   √|√|√|√|导入当年需毕业的学生信息 |
| 学院专业班级维护 |   √|√|√|√|维护学院专业班级代码  |
| 部门信息维护 |   √|√|√|√|维护部门代码  |

##### 离校管理模块
###### 基本信息子模块

|权限名称     |  增|删|查|改| 权限描述   |
| :-------- | --------:| :------: | :-------- | --------:| :------: |
| 修改学生密码  |   × |×|×|√| 修改所属学生密码|
| 学生信息|   × |×|√|√|查看学生、修改学生信息|



###### 离校环节管理子模块

 |权限名称     |  增|删|查|改| 权限描述   |
| :-------- | --------:| :------: | :-------- | --------:| :------: |
| 离校环节维护 |   √|√|√|√| 设置离校环节信息|
| 离校流程管理|   √|√|√|√|根据抽取离校环节，设置离校流程、设置离校学生|
| 离校项目设置 |   √|√|√|√| 对添加的离校流程进行设置办理说明、设置办理图标|


###### 环节权限设置 子模块

 |权限名称     |  增|删|查|改| 权限描述   |
| :-------- | --------:| :------: | :-------- | --------:| :------: |
| 添加角色权限 |   √|√|√|√|对离校流程添加审核角色 |



##### 离校办理模块
###### 离校办理审核子模块


 |权限名称     |  增|删|查|改| 权限描述   |
| :-------- | --------:| :------: | :-------- | --------:| :------: |
|离校单查看  |  ×|×|√|×|查看所属角色的离校单 |
| 离校单审核  |   × |×|√|√| 可根据输入学生信息或者添加硬件（比如身份证扫描器进行单人审核）|
| 离校单批量审核|   × |×|√|√|根据EXCEL表格批量审核|

###### 证书发放子模块


 |权限名称     |  增|删|查|改| 权限描述   |
| :-------- | --------:| :------: | :-------- | --------:| :------: |
| 发放证书 |   × |×|√|√| 选取相应角色发放证书 |
| 证书类型 |   × |×|√|√| 添加证书类型 |

### 2开发环境、硬件以及软件的需求
#### 开发工具

| 工具名称    |    版本 |   描述   |
| :-------- | --------:| :------: |
| IntelijIdea  |    |    |
| MarkDown |    |    |
| Redis |    |   作为缓存工具缓存在一定时间访问频率高德数据 |
|MongoDB |    |作为文件数据库，存储学生图片、导出的离校单    |
|  RedisStudio |    |Redis图形化管理界面    |
| MySql |    |    |
| NavicatMysql |    |    |
| Thymeleaf |    |    |
#### 使用框架

| 框架名称    |    版本 |   描述   |
| :-------- | --------:| :------: |
| SpringBoot  |    |    |
| Spring |    |    |
| SpringMVC |    |    |


#### 客户端系统

| 名称    |    版本 |   描述   |
| :-------- | --------:| :------: |
| Windows操作系统  |    |Win10    |
|微信客户端  |    |    |

#### 服务端系统

| 名称    |    版本 |   描述   |
| :-------- | --------:| :------: |
|Linux操作系统  |    |Ubutun16.04    |
|docker  |    |  使用docker容器  |


### 系统的结构化功能建模、分层流程图
#### 顶层数据流图
![image](https://github.com/fushang000/studentGraduation/blob/master/graduation.doc/topdata.jpg)

### 系统数据建模、E-R模型图、关系模式表示
![image](https://github.com/fushang000/studentGraduation/blob/master/graduation.doc/RBAC.png)

![image](https://github.com/fushang000/studentGraduation/blob/master/graduation.doc/databasedef.jpg)





### 参考资料
* 一个开箱即用的框架https://github.com/wj596/jsets-shiro-spring-boot-starter
* demo https://github.com/wj596/jsets-shiro-demo
[参考开发文档](https://blog.csdn.net/Ya_da/article/details/52836287)

### 目标
使用SpringBoot2.x重构 jsets-shiro-spring-boot-starter

### 可能存在的问题
由于作者没有maven坐标需要手动安装jar
* mvn install:install-file -Dfile=E:\jsets-shiro-spring-boot-starter.jar   -DgroupId=org.jsets  -DartifactId=jsets-shiro-spring-boot-starter -Dversion=0.0.1  -Dpackaging=jar

