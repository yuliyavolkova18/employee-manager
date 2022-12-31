# employee-manager

**About**

Java applet completed in July of 2021 in Apache Netbeans 12.4 to practice SQL queries and basic UI development. 

The functions include registration and login in of users; adding, editing, and deleting employees; adding or removing employee absences; viewing total employee absences monthly; printing absence reports for chosen month with total salary deduction calculation. 

User and employee information is stored on a local host instance in MAMP in SQL database employee_manager with tables login_details, employee_table, and absent_table.

UI made with Java AWT and Swing Toolkit.

**Requirements**

 - JDK 16
 - Apache Netbeans 12.4
 - MAMP 

**Libraries**

 - mysql-connector-java-8.0.25.jar
 - rs2xml.jar
 - DateChooser.jar

**Tables in phpmyadmin in MAMP created in employee_management database**

login_details
| # | Name | Type | Null |
|--|--|--|--|
| 1 | user_id | int(11) | no
| 2 | username | varchar(50) | no
| 3 | password | varchar(50) | no

employee_table
| # | Name | Type | Null |
|--|--|--|--|
| 1 | id | int(11) | no
| 2 | first_name | text | no
| 3 | last_name | text | no
| 4 | position | varchar(100) | no
| 5 | base_salary | decimal(5,0) | no

absent_table
| # | Name | Type | Null |
|--|--|--|--|
| 1 | id | int(11) | no
| 2 | date | date | no
