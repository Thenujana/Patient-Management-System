#  Patient Management System – Backend (Spring Boot)

A modern and efficient **Patient Management System backend** built with **Spring Boot**, **Java**, using IntelliJ and **MySQL**. This API allows users to **add, view, update, delete, and search patient records**. It is designed to work seamlessly with a frontend application (React, Angular, or Vue) and can be tested via **Postman**
I have tested all the endpoints through the postman.

---

##  Features / Endpoints

| HTTP Method | Endpoint                               | Description                         |
|------------|----------------------------------------|-------------------------------------|
| POST       | `/api/patients/add`                    | Add a new patient                   |
| GET        | `/api/patients/get-all`                | Get all patients                    |
| GET        | `/api/patients/get/{id}`               | Get a patient by ID                 |
| GET        | `/api/patients/search-name/{name}`     | Search patient by full name         |
| GET        | `/api/patients/search-email/{email}`   | Search patient by email             |
| PUT        | `/api/patients/update/{id}`            | Update patient details              |
| DELETE     | `/api/patients/delete/{id}`            | Delete a patient by ID              |

---

##  Tech Stack

- Java 
- Spring Boot 
- Spring Data JPA  
- MySQL  
- Lombok  
- ModelMapper  
- Postman for API testing  




