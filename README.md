#  Application overview

Folder 'application':

	Should contain a Spring Boot application that auto registers all beans (in this case only the
	content of spring-hibernate-mysql) and configures the MySQL connection.

	MySQL connection configuration should have two (or more in the future) connections to two MySQL
	servers. Configuration should contain timeout settings etc. and also connection pooling should
	be configured.



Folder 'spring-hibernate-mysql':

	Contains:
		- entities representing each table in the MySQL database.
		- interfaces representing DAO objects for each entity.
		- implementations for each DAO object to have CRUD operations on MySQL database/tables.



Folder 'MySQL':

	Contains MySQL 5.5 Workbench model that can be used for setting up database initially.



======
 TODO
======

STEP 1
------
a) Create one or more ASCII text files containing SQL commands to initially create database and tables.
   You might need to have one for creating the database and tables, and one for setting up the references
   between tables since it might not be possible to create it since a circular reference is present.
b) Create a Linux script (/bin/bash) with MySQL CLI commands to create the desired database based on the
   SQL commands from a)

STEP 2
------
c) Change Java project 'application' to be a Spring Boot application.
d) Update Java project 'application' to load 'spring-hibernate-mysql' as a bean.
e) Update Java project 'application' to have MySQL connections based on what is described under
   "Application overview" above.

STEP 3
------
f) Update Java project 'application' to connect to a (working/connected) MySQL instance and do the
   following:
       - Show examples of inserting content into table 'SoftwareMatrix' + 'SystemRelease' (these because
         they have all types of fields; fx. int, varchar, timestamp and tinyint)
g) Update Java project 'spring-hibernate-mysql' so that it uses Hibernate+JPA annotations and so that
   it is possible to represent the references between tables from the database model.
h) Update Java project 'application' to:
       - Show examples of creating a SoftwareMatrix with all references for all entities in memory and
         then save to MySQL, then read from MySQL, update data and save back. Lastly, search in MySQL,
         load and then delete all data based on a SoftwareMatrixId.
