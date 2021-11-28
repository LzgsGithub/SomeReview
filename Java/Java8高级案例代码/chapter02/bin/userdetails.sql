create table userdetails(
id number primary key,--主键id
username varchar2(50) not null,--用户名
password varchar2(50) not null,--密码
sex char(1) not null, --性别，1：男，0：女
hobby varchar2(200),--爱好
address varchar2(100),--地址
degree varchar2(50),--学历
remark varchar2(500)--备注
);
--添加测试数据
insert into userdetails(id,username,password,sex) values(1,'zhansan','zs123',1);
insert into userdetails(id,username,password,sex) values(2,'lisi','lisi123',1);
insert into userdetails(id,username,password,sex) values(3,'wangwu','ww123',1);
insert into userdetails(id,username,password,sex) values(4,'maliu','ml123',1);
insert into userdetails(id,username,password,sex) values(5,'linghc','lhc123',1);
insert into userdetails(id,username,password,sex) values(6,'zhaokl','zkl123',1);
