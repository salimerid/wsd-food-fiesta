# Restaurant Management (FoodFiesta) System

Building a restaurant management system application for a FoodFiesta in Bangladesh. The goal is to create an application with exposed APIs for managing orders, sales, customers, and analyzing data.


**What's inside**

- Spring Boot 3.2.2
- Maven 3.9.5
- MySQL
- JPA
- Hibernate
- Flyway
- Zipkin
- Swagger



**Installation**

The project is created with Maven, so you just need to import it to your IDE and build the project to resolve the dependencies.

**Usage**

Run the project through the IDE and head out to `http://localhost:8080/swagger-ui/index.html`

or

Go on the project's root folder, run this command in the command line:

     $ mvn spring-boot:run

**Prerequisites**

- Java 17
- Maven 3.9.5
- Docker 25.0.2


**API Endpoints**

- `/api/orders/v1/current-day`: Get the list of orders for the current day.
- `/api/sales/v1/total-current-day`: Get the total sale amount for the current day.
- `/api/customers/v1/all`: Get all registered customers.
- `/api/customers/v1/{customerId}/orders`: Get all orders for a specific customer.
- `/api/sales/v1/max-sale-day?startDate={date}&endDate={date}`: Get the day with the highest sales within a time range.


**Log Tracing**

log tracing this project is using Zipkin `http://localhost:9411/zipkin/`

**API documentation (SwaggerUI)**

When you run our application, specification will be generated. You can check it here:

http://localhost:8080/swagger-ui/index.html

**Further Instructions**
- Add ELK stack for details log visualization tool.
- Implement unit and integration tests.
- Implement global error handling.
- Consider performance optimization techniques like caching and asynchronous processing.
- Implement appropriate security measures (authentication, authorization).
