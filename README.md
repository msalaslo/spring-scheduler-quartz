# The Spring-scheduler-quartz Project

## Spring Quartz

This module contains an example with Spring and Quartz  

## #Scheduling in Spring with Quartz Example Project
This is the first example where we configure a basic scheduler.

##### Spring boot application, Main class


`com.msl.spring.springscheduler.SpringQuartzApp`

##### Configuration in *application.properties*

  - Default: configures scheduler using Spring convenience classes:

    `using.spring.schedulerFactory=true`
   
  - To configure scheduler using Quartz API: 
  
    `using.spring.schedulerFactory=false`

## Technical Stack:

- Java 11+
- Maven 3.6+
- Spring boot 2.2.5.RELEASE
    - Spring Boot Actuator for exposing management endopoints
- Spring cloud Hoxton.SR3
    - Spring Cloud Sleuth for distributed tracing
- Lombok abstraction
- Mapstruct for bean mapping
- Open API documentation (available at /swagger-ui.html)
- REST API model validation 
- Cucumber and Spring Boot test for test
- Logback for logging
    - Log patterns for local and cloud SPRING profiles includes Sleuth headers

## Installation
This application is configured with two SPRING profiles:
- "local": For local dev environments.
- "cloud": For dockerized environments, where application properties are set by ENV variables.

Test on the browser via SWAGGER
-------------------

```sh
http://localhost:8080/swagger-ui.html
```
