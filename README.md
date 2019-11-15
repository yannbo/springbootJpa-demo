# user table
``
create table user
(
    id          varchar(255) null,
    create_date timestamp    null,
    update_date timestamp    null,
    name        varchar(255) null,
    age         int          null
);
 ``

# 启动访问测试  
保存数据(post):   
http://localhost:8080/user/add?name=老王&age=25  
查询数据列表:   
http://localhost:8080/user/list  