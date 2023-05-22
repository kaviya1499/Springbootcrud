# Springbootcrud
This is a basic guide to create a CRUD (Create, Read, Update, Delete) application using Spring Boot and MySQL as the database, deployed on Clever Cloud.
The application allows you to perform CRUD operations on a specific entity.

# Prerequisites
Before you begin, ensure you have the following:

1. Java Development Kit (JDK) installed on your machine
2. MySQL installed and running
3. Clever Cloud account

# Tools and Technologies
 1. Tool: Spring Tool Suite.
 2. Technologies: HTML, Java, Springboot, MYSQL(Clever Cloud).
 3. API Tool: Postman

# Setup
Create a new Spring Boot project:

Use your preferred IDE or the Spring Initializr website (https://start.spring.io) to generate a new Spring Boot project with the required dependencies, including Spring Web, Spring Data JPA, and MySQL driver.
Configure MySQL connection:

Update the application.properties file in the project to specify the MySQL connection details, such as database URL, username, and password.
1. Create the entity class:
Create a Java class to represent the entity you want to store in the database.
Annotate the class with @Entity and specify the table name using @Table.
Define properties and annotate them with @Id for the primary key, @Column for column mapping, etc.

2. Create a repository interface:
Create an interface that extends JPARepository provided by Spring Data JPA.
This interface will provide basic CRUD operations for the entity.

3. Implement service layer:
Create a service class that acts as an intermediary between the controller and the repository.
Implement methods in the service class to perform CRUD operations using the repository methods.

4. Create RESTful endpoints:
Create a controller class and annotate it with @RestController.
Define endpoints using @RequestMapping or more specific annotations like @GetMapping, @PostMapping, etc.
Map these endpoints to the corresponding service methods to perform CRUD operations.

5. Deploy on Clever Cloud:
Sign in to your Clever Cloud account (https://www.clever-cloud.com).
Create a new application and choose the appropriate runtime for your Spring Boot application.
Configure your MySQL database on Clever Cloud and obtain the connection details.
Update your application configuration to use the Clever Cloud database credentials.

# Credentials
1. host: bze8v4m229isx42fw69l-mysql.services.clever-cloud.com
2. Database Name: bze8v4m229isx42fw69l
3. User: uclpc8pna26x0nwy
4. Password: kbjw2Aomf22PZm0fyoPU
5. Port: 3306
6. Connection URI: mysql://uclpc8pna26x0nwy:kbjw2Aomf22PZm0fyoPU@bze8v4m229isx42fw69l-mysql.services.clever-cloud.com:3306/bze8v4m229isx42fw69l

# Usage
Once the application is deployed, you can interact with it using HTTP requests. Here are the common endpoints for CRUD operations:

1. Create: POST /entity - Create a new entity by sending a JSON payload with the required data.
2. Read: GET /entity/{id} - Retrieve an entity by its unique identifier.
3. Update: PUT /entity/{id} - Update an existing entity by its identifier, sending a JSON payload with the updated data.
4. Delete: DELETE /entity/{id} - Delete an entity by its identifier.
5. Replace /entity with the appropriate path defined in your controller.
