create table userdetails(
id number primary key,--����id
username varchar2(50) not null,--�û���
password varchar2(50) not null,--����
sex char(1) not null, --�Ա�1���У�0��Ů
hobby varchar2(200),--����
address varchar2(100),--��ַ
degree varchar2(50),--ѧ��
remark varchar2(500)--��ע
);
--��Ӳ�������
insert into userdetails(id,username,password,sex) values(1,'zhansan','zs123',1);
insert into userdetails(id,username,password,sex) values(2,'lisi','lisi123',1);
insert into userdetails(id,username,password,sex) values(3,'wangwu','ww123',1);
insert into userdetails(id,username,password,sex) values(4,'maliu','ml123',1);
insert into userdetails(id,username,password,sex) values(5,'linghc','lhc123',1);
insert into userdetails(id,username,password,sex) values(6,'zhaokl','zkl123',1);
