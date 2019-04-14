# code-your-trail-task
## Requirements

For building and running the application you need:

- [JDK 1.8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
- [Maven 3](https://maven.apache.org)

## Run the application locally

 you can use the [Spring Boot Maven plugin](https://docs.spring.io/spring-boot/docs/current/reference/html/build-tool-plugins-maven-plugin.html)

```shell
mvn clean install
```

```shell
mvn spring-boot:run
```

## Calling Rest Api
Once Spring boot application is up and running you can follow any one of the below methods.

# Swagger
We use swagger for all microservices for better documentation of APi's.

```shell
http://localhost:8090/swagger-ui.html#
```
# Postman
Open postman select get request and copy the below url and run it.

```shell
http://localhost:8090/movie/title/Spiderman
```
# Directly open the following link
```shell
http://localhost:8090/movie/title/Spiderman
```
