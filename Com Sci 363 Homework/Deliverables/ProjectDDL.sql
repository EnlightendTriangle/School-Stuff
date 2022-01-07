
drop table if exists users;
create table users(
screen_name varchar(100) UNIQUE NOT NULL,
name varchar(100),
sub_category varchar(200) CHECK(sub_category IN('GOP', 'Democrat', 'na',null)),
category varchar(200) CHECK (category IN('senate_group', 'presidential_candidate', 'reporter', 'Senator', 'General',null)),
state varchar(20) default 'na',
numFollowers bigint,
numFollowing int,
primary key(screen_name)
);


drop table if exists tweets;
create table tweets(
tid bigint NOT NULL,
textbody varchar(300) NOT NULL,
retweet_count int,
retweeted int,
posted date NOT NULL,
posting_user varchar(50) NOT NULL,
primary key(tid),
foreign key(posting_user) references users(screen_name) ON DELETE CASCADE
);

drop table if exists hashtags;
create table hashtags(
tid bigint NOT NULL,
hashtagname varchar(40) NOT NULL,
foreign key(tid) references tweets(tid)
);

drop table if exists url;
create table url(
tid bigint NOT NULL,
url varchar(500) NOT NULL,
foreign key(tid) references tweets(tid)
);


drop table if exists userTweets;
create table userTweets(
tid bigint NOT NULL,
screen_name varchar(100) NOT NULL, 				
foreign key(tid) references tweets(tid) ON DELETE CASCADE,
foreign key(screen_name) references users(screen_name)
ON DELETE CASCADE
);

