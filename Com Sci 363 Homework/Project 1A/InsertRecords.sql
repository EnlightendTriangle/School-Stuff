insert into students (snum, ssn, name, gender, dob, c_addr, c_phone, p_addr, p_phone) values (1001, 654651234, "Randy", "M", 20001201, "301 E Hall", 5152700988, "121 Main", 7083066321);
insert into students (snum, ssn, name, gender, dob, c_addr, c_phone, p_addr, p_phone) values (1002, 123097834, "Victor", "M", 20000506, "270 W Hall", 5151234578, "702 Walnut", 7080366333);  
insert into students (snum, ssn, name, gender, dob, c_addr, c_phone, p_addr, p_phone) values (1003, 978012431, "John", "M", 19990708, "201 W Hall", 5154132805, "888 University", 5152012011);
insert into students (snum, ssn, name, gender, dob, c_addr, c_phone, p_addr, p_phone) values (1004, 746897816, "Seth", "M", 19981230, "199 N Hall", 5158891504, "21 Green", 5154132907);
insert into students (snum, ssn, name, gender, dob, c_addr, c_phone, p_addr, p_phone) values (1005, 186032894, "Nicole", "F", 20010401, "178 S Hall", 5158891155, "13 Gray", 5157162071);
insert into students (snum, ssn, name, gender, dob, c_addr, c_phone, p_addr, p_phone) values (1006, 534218752, "Becky", "F", 20010516, "12 N Hall", 5157083698, "189 Clark", 2034367632);
insert into students (snum, ssn, name, gender, dob, c_addr, c_phone, p_addr, p_phone) values (1007, 432609519, "Kevin", "M", 20000812, "75 E Hall", 5157082497, "89 National", 7182340772);

insert into departments (code, name, phone, college) values row (401, "Computer Science", "5152982801", "LAS"), row (402, "Mathematics", "5152982802", "LAS"), row (403, "Chemical Engineering", "5152982803", "Engineering"), row (404, "Landscape Architect", "5152982804", "Design");

insert into degrees (name, level, department_code) values row ("Computer Science", "BS", 401), row ("Software Engineering", "BS", 401), row ("Computer Science", "MS", 401), row ("Computer Science", "PhD", 401), row ("Applied Mathematics", "MS", 402), row ("Chemical Engineering", "BS", 403), row ("Landscape Architect", "BS", 404);

insert into major (snum, name, level) values row (1001, "Computer Science", "BS"), row (1002, "Software Engineering", "BS"), row (1003, "Chemical Engineering", "BS"), row (1004, "Landscape Architect", "BS"), row (1005, "Computer Science", "MS"), row (1006, "Applied Mathematics", "MS"), row (1007, "Computer Science", "PhD");

insert into minor (snum, name, level) values row (1007, "Applied Mathematics", "MS"), row (1005, "Applied Mathematics", "MS"), row (1001, "Software Engineering", "BS");

insert into courses (number, name, description, credithours, level, department_code) values row (113, "Spreadsheet", "Microsoft Excel and Access", 3, "Undergraduate", 401), row (311, "Algorithm", "Design and Analysis", 3, "Undergraduate", 401), row (531, "Theory of Computation", "Theorem and Probability", 3, "Graduate", 401), row (363, "Database", "Design Principle", 3, "Undergraduate", 401), row (412, "Water Management", "Water Management", 3, "Undergraduate", 404), row (228, "Special Topics", "Interesting Topics about CE", 3, "Undergraduate", 403), row (101, "Calculus", "Limit and Derivative", 4, "Undergraduate", 402);

insert into register (snum, course_number, regtime, grade) values row (1001, 363, "Fall2020",3), row (1002, 311, "Fall2020", 4), row (1003, 228, "Fall2020", 4), row (1004, 363, "Spring2021", 3), row (1005, 531, "Spring2021", 4), row (1006, 363, "Fall2020", 3), row (1007, 531, "Spring2021", 4);
