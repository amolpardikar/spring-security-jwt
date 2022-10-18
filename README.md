# spring-security-jwt
Spring boot REST API using JWT and Spring Security

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)

### How to secure your Spring Boot REST APIs using JSON Web Tokens (JWT) with Spring Security.

Source material -

https://www.danvega.dev/blog/2022/09/06/spring-security-jwt/

https://www.youtube.com/watch?v=KYNR5js2cXE


### Guides

# Generate new token
Post - http://localhost:8080/token
Authorization - Basic Auth username- amol, password - password

# Call secure serevice
Get - http://localhost:8080/secure
Authorization - Bearer token
