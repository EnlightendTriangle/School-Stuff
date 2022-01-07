SET FOREIGN_KEY_CHECKS=0;
LOAD DATA INFILE 'C:/ProgramData/MySQL/MySQL Server 8.0/Uploads/tweets.txt' INTO table tweets FIELDS TERMINATED BY ';' optionally enclosed by '"' lines terminated by '\n' ignore 1 lines;

LOAD DATA INFILE 'C:/ProgramData/MySQL/MySQL Server 8.0/Uploads/user.txt' INTO table users FIELDS TERMINATED BY ';' optionally enclosed by '"' lines terminated by '\n' ignore 1 lines;

LOAD DATA INFILE 'C:/ProgramData/MySQL/MySQL Server 8.0/Uploads/urlused.txt' INTO table url FIELDS TERMINATED BY ';' optionally enclosed by '"' lines terminated by '\n' ignore 1 lines;

LOAD DATA INFILE 'C:/ProgramData/MySQL/MySQL Server 8.0/Uploads/tagged.txt' INTO table hashtags FIELDS TERMINATED BY ';' optionally enclosed by '"' lines terminated by '\n' ignore 1 lines;

LOAD DATA INFILE 'C:/ProgramData/MySQL/MySQL Server 8.0/Uploads/mentioned.txt' INTO table usertweets FIELDS TERMINATED BY ';' optionally enclosed by '"' lines terminated by '\n' ignore 1 lines;