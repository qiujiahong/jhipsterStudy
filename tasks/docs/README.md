# 创建第一个项目

本文介绍如何创建第一个angular和spring 混合的第一个项目


## 创建spring boot项目

* 使用spring in 创建一个java项目，选择的组件包括：

    * web 
    
* 组织ID ：com.threaldanvega
* 项目名称：tasks
    
* 创建包：
    * com.threaldanvega.tasks.controller
    * com.threaldanvega.tasks.domain
    * com.threaldanvega.tasks.repository
    * com.threaldanvega.tasks.repository
  
* 创建编写对应文件；  

## 创建font end 项目

* 更多参考见 http://cli.angular.io
 
* 创建新的项目：
    * ``cd src/main``
    * ``ng new fontend``
    * ``cd fontend``
    
* 新建组件component
    * ``ng g c tasks``
    * ``ng g c /tasks/tasks-add``
    * ``ng g c /tasks/tasks-list``
    
* 项目中加入bootstarp
    * ``npm install --save bootstrap@3.3.7``    // bootstrap@3.3.7
    
    
       