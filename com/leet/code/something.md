1.truncate table
2.delete table
3.select count(*)   select count(1)  select count(column)
4.select * from user where exists (select name from emplyoee where id =100)
5.内连接--select * from user1 u1 inner join user2 u2 on u1.id=u2.id;
6.create table 'user'(
'id' int(11) not null auto_increment,
'title' char(255) character not null,
 primary key('id'),
 [unique|fulltext] index index_name(title(length))
)