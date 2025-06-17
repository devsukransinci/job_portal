# 💼 Job Portal – Spring Boot Web Application

This is a simple Job Portal web application built with **Spring Boot**, following the MVC architecture. It provides basic user registration and type management functionalities, useful for expanding into a full-fledged job application platform.

---

## 📁 Project Structure

```
src/
└── main/
├── java/com/devsukran/jobportal/
│ ├── controller/
│ │ ├── HomeController.java
│ │ └── UsersController.java
│ ├── entity/
│ │ ├── Users.java
│ │ └── UsersType.java
│ ├── repository/
│ │ ├── UsersRepository.java
│ │ └── UsersTypeRepository.java
│ ├── services/
│ │ └── UsersTypeService.java
│ └── JobportalApplication.java
└── resources/
├── static/
│ ├── assets/
│ ├── css/
│ ├── fonts/
│ └── js/
├── templates/
│ ├── index.html
│ └── register.html
└── application.properties
```

---

## ⚙️ Technologies Used

- Java 17+
- Spring Boot
- Spring MVC
- Spring Data JPA
- Thymeleaf
- HTML/CSS/JS
- H2 / MySQL (configurable)
  
---

## 🚀 Features

- 🧑‍💻 User Registration System
- 🗂️ User Types (Entity & Management)
- 🌐 Web UI using Thymeleaf Templates
- 🧩 Modular Structure (Controller, Service, Repository, Entity)

