# Spring Boot with Jersey Rest Api, Mybatis, and SQLite DB

Project to play around with Spring Boot and override its auto-magic default stuff.
I'm not a fan of the "It just works" mentality.
 
 -use Jersey with Gson instead of default Spring json with Jackson   
 
 -use MyBatis with mybatis-spring instead of JPA Hibernate. Gives more control of the SQL that runs and keep the SQL code in seperate xml config files
 
 -use SQLite instead of default. Its similar to a DBMS with JDBC
 
 -config with application.yml instead of application.properties
 
 -Setup Log4j2 instead of the default
 
 -Integration tests setup
 
 -remove dependency on spring boot parent pom.  

Build and start on localhost:8080/people  

```
mvn clean verify spring-boot:run
```