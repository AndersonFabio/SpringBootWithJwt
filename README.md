# Spring Boot Jersey With JWT

* Spring Boot
* Spring Security
* Jersey
* Authenticate with JWT
* API Rest

# API

* http://localhost:8080/rest/teste
* Token Authenticate in header: eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsImV4cCI6MTUyMzk4MjAyOH0.slWE2zrGUZUl43BH_U7QpnY1i602tsB94z0yZybiIyuWoXrECLXiG9PVvEcaH0C5K7I1BPnk5K8qqfhFcrFiKg

* http://localhost:8080/home 
* No Token

# To get the token

* POST : http://localhost:8080/login
* with Body: {"username":"admin", "password":"password"}
* Receive the token in the header of response in field Authenticate

# To Run

* mvn package
* mvn spring-boot:run
