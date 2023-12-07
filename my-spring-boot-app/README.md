# My Spring Boot Application

This is a simple Spring Boot application that serves a "Hello, World!" message at the "/hello" route.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites

- Java 8 or higher
- Maven

### Building the Project

1. Navigate to the project directory in your terminal.
2. Run `./mvnw clean install` to build the project.

### Running the Application

1. After building the project, navigate to the `target` directory in your terminal.
2. Run `java -jar my-spring-boot-app-0.0.1-SNAPSHOT.jar` to start the application.
3. Open your web browser and visit `http://localhost:8080/hello`. You should see a "Hello, World!" message.

### Running the Tests

1. Navigate to the project directory in your terminal.
2. Run `./mvnw test` to execute the tests.

## Built With

- [Spring Boot](https://spring.io/projects/spring-boot) - The framework used
- [Maven](https://maven.apache.org/) - Dependency Management

## Authors

- Your Name

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details

## Acknowledgments

- Hat tip to anyone whose code was used
- Inspiration
- etc.