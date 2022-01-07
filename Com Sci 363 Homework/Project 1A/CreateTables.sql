create table students (snum int, ssn int, name varchar(10), gender varchar(1), dob datetime, c_addr varchar(20), c_phone varchar(10), p_addr varchar(20), p_phone varchar(20));
alter table students add primary key (ssn);
alter table students add unique key (snum);

create table departments (code int, name varchar(50), phone varchar(10), college varchar(20));
alter table departments add primary key (code);
alter table departments add unique key (name);

create table degrees (name varchar(50), level varchar(5), department_code int);
alter table degrees add primary key (name, level);
alter table degrees add foreign key fk (department_code) references departments (code);

create table courses (number int, name varchar(50), description varchar(50), credithours int, level varchar(20), department_code int);
alter table courses add primary key (number);
alter table courses add unique key (name);
alter table courses add foreign key fk (department_code) references departments (code);

create table register (snum int, course_number int, regtime varchar(20), grade int);
alter table register add primary key (snum, course_number);
alter table register add foreign key fk (snum) references students (snum);
alter table register add foreign key f_k (course_number) references courses (number);

create table major (snum int, name varchar(50), level varchar(5));
alter table major add primary key (snum, name, level);
alter table major add foreign key fk (snum) references students (snum);
alter table major add foreign key f_k (name, level) references degrees (name, level);

create table minor (snum int, name varchar(50), level varchar(5));
alter table minor add primary key (snum, name, level);
alter table minor add foreign key fk (snum) references students (snum);
alter table minor add foreign key f_k (name, level) references degrees (name, level);



