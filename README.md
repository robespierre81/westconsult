Smallest Divisible Number API
This project is a Spring Boot application that provides a REST API to calculate the smallest positive number evenly divisible by all numbers from 1 to a specified upper limit. In this case, the upper limit is set to 25.

Table of Contents
Installation
Usage
Testing
Endpoints
Dependencies
License
Installation
Prerequisites
Java 17 or later
Maven 3.6.0 or later
Clone the Repository


bash
Copy code
git clone <repository-url>
cd <repository-directory>
Build the Application
Use Maven to build the application:

bash
Copy code
mvn clean install
This command will compile the code, run the tests, and package the application into an executable JAR file.

Usage
Running the Application
To run the application, use the following Maven command:

bash
Copy code
mvn spring-boot:run
Alternatively, you can execute the packaged JAR file:

bash
Copy code
java -jar target/<your-application-jar>.jar
Replace <your-application-jar> with the name of the JAR file generated in the target directory.

Accessing the API
Once the application is running, you can access the API endpoint at:

bash
Copy code
http://localhost:8080/api/smallest-divisible
This endpoint will return the smallest positive number that is evenly divisible by all of the numbers from 1 to 25.

Testing
To run the unit tests, use the following Maven command:

bash
Copy code
mvn test
This will execute all the tests in the project, including tests for the API functionality and logic.

Endpoints
GET /api/smallest-divisible
Returns the smallest positive number that is evenly divisible by all numbers from 1 to 25.

URL: /api/smallest-divisible
Method: GET
Response: A plain text response containing the calculated number, e.g., 26771144400.
Dependencies
Spring Boot: 3.3.2
Spring Web: Part of the Spring Boot Starter Web
JUnit 5: For testing
Jakarta Servlet API: 5.0.0 (provided scope)
License
This project is licensed under the MIT License. See the LICENSE file for details.