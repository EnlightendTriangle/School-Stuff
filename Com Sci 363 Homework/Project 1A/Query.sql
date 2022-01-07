select snum, ssn
from students
where name = "Becky";

select name, level 
from major
where snum in (select snum from students where ssn = 123097834);

select name
from courses
where department_code in (select code from departments where name = "Computer Science");

select name, level
from degrees
where department_code in (select code from departments where name = "Computer Science");

select name 
from students
where snum in (select snum from minor);

select count(*) total_students_with_minors
from students 
where snum in (select snum from minor);

select name, snum
from students
where snum in (select snum from register where course_number in (select number from courses where name = "Algorithm"));

select name, snum
from students
where dob 
order by dob asc
limit 1;

select name, snum
from students
where dob 
order by dob desc
limit 1;

select name, snum, ssn
from students
where name like '%n%'
and name like '%N%';

select name, snum, ssn
from students
where name not like '%n%'
and name not like '%N%';

select number, name
from courses
where number;

select name 
from students
where snum in (select snum from register where regtime = "Fall2020");

select number, name
from courses
where department_code in (select code from departments where name = "Computer Science");

select number, name
from courses
where department_code in (select code from departments where name = "Computer Science" or name = "Landscape Architect");




