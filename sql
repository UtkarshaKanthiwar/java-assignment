mysql> use utkarsha;
Database changed
mysql> create table Student3(ID int(10) primary key, S_Name varchar(20) not null, S_Branch varchar(20) not null);
Query OK, 0 rows affected, 1 warning (0.05 sec)

mysql> insert into Student3 value(01, 'Ankita', 'Civil');
Query OK, 1 row affected (0.02 sec)

mysql> insert into Student3 value(02, 'Avinash', 'Electronic');
Query OK, 1 row affected (0.01 sec)

mysql> insert into Student3 value(03, 'Rutuja', 'Istrumentation');
Query OK, 1 row affected (0.01 sec)

mysql> alter table Student3 add Email_Id varchar(30);
Query OK, 0 rows affected (0.03 sec)
Records: 0  Duplicates: 0  Warnings: 0


mysql> update Student3 set Email_Id= 'ani@gmail.com' where id=01;
Query OK, 1 row affected (0.01 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> update Student3 set Email_Id= 'avi@gmail.com' where id=02;
Query OK, 1 row affected (0.01 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> update Student3 set Email_Id= 'rutu@gmail.com' where id=03;
Query OK, 1 row affected (0.01 sec)
Rows matched: 1  Changed: 1  Warnings: 0


mysql> select* from Student3;
+----+---------+----------------+----------------+
| ID | S_Name  | S_Branch       | Email_Id       |
+----+---------+----------------+----------------+
|  1 | Ankita  | Civil          | ani@gmail.com  |
|  2 | Avinash | Electronic     | avi@gmail.com  |
|  3 | Rutuja  | Istrumentation | rutu@gmail.com |
+----+---------+----------------+----------------+
3 rows in set (0.00 sec)

mysql> delete from Student3 where id=02;
Query OK, 1 row affected (0.04 sec)

mysql> select* from Student3;
+----+--------+----------------+----------------+
| ID | S_Name | S_Branch       | Email_Id       |
+----+--------+----------------+----------------+
|  1 | Ankita | Civil          | ani@gmail.com  |
|  3 | Rutuja | Istrumentation | rutu@gmail.com |
+----+--------+----------------+----------------+
2 rows in set (0.00 sec)


mysql> alter table student3 drop S_Branch;
Query OK, 0 rows affected (0.11 sec)
Records: 0  Duplicates: 0  Warnings: 0

mysql> select* from Student3;
+----+--------+----------------+
| ID | S_Name | Email_Id       |
+----+--------+----------------+
|  1 | Ankita | ani@gmail.com  |
|  3 | Rutuja | rutu@gmail.com |
+----+--------+----------------+
2 rows in set (0.00 sec)
