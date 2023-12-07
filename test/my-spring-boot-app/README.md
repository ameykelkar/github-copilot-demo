# My Spring Boot Application

This is a simple Spring Boot application that includes a REST controller which returns a "Hello World" message.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites

- Java 8 or higher
- Maven

### Installing

1. Clone the repository
```
git clone https://github.com/yourusername/my-spring-boot-app.git
```

2. Navigate to the project directory
```
cd my-spring-boot-app
```

3. Use Maven to build and run the project
```
./mvnw spring-boot:run
```

The application will start and listen on `http://localhost:8080`.

## Usage

Once the application is running, you can access the following endpoint in your web browser or using a tool like curl:

- `http://localhost:8080/hello`: Returns a "Hello World" message.

## Running the tests

To run the unit tests, use the following Maven command:

```
./mvnw test
```

## Built With

- [Spring Boot](https://spring.io/projects/spring-boot) - The framework used
- [Maven](https://maven.apache.org/) - Dependency Management

## Authors

- Your Name

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details.