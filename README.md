### 1. create application from here 
https://start.spring.io/

### 2. installation in kali linux
```cmd
apt install gradle
```
### 3. extension in vs code install "spring boot tools"
vs code extesion installation for requried tool and dependency file

### 4. download file from this link according to your self required project

quick starting
```cmd
https://spring.io/quickstart
```
### 5. start run server
```cmd
┌──(root㉿ankit)-[/home/ankit/Downloads/21 java gradle 3.3/demo]
└─# ./gradlew bootRun
```
```cmd
./mvnw spring-boot:run
```

### 6. create in controller file location from "spring_framework/demo/src/main/java/com/example/demo/Controller.java"
```java
package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController 
public class Controller {
    
    @GetMapping("/get")
    public String doGet() {
        return "Hey, this is my new application in java spring framework";
    }
    
}
```
