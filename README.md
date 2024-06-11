# Contact Database Application - CRUD
![Screenshot](https://cdn.fastlane-israel.com/public/ContactApplicationFastLane.png)

## Description
This is a simple contact management application built with Java and Spring Boot. It allows users to perform CRUD operations on contacts using an SQLite database.


## Project Structure
```
📦 Contact-Database-Application-Java
├─ .gitattributes
├─ pom.xml
└─ src
   ├─ main
   │  ├─ java
   │  │  └─ com
   │  │     └─ fastlane
   │  │        └─ contact
   │  │           └─ app
   │  │              ├─ ContactsApplication.java
   │  │              ├─ controller
   │  │              │  └─ ContactController.java
   │  │              ├─ model
   │  │              │  └─ Contact.java
   │  │              ├─ repository
   │  │              │  └─ ContactRepository.java
   │  │              └─ service
   │  │                 └─ ContactService.java
   │  └─ resources
   │     ├─ application.properties
   │     ├─ schema.sql
   │     ├─ static
   │     │  └─ favicon.ico
   │     └─ templates
   │        ├─ index.html
   │        ├─ new_contact.html
   │        └─ update_contact.html
   └─ test
      ├─ java
      │  └─ com
      │     └─ fastlane
      │        └─ contact
      │           └─ app
      │              ├─ controller
      │              │  └─ ContactControllerTest.java
      │              ├─ model
      │              │  └─ ContactTest.java
      │              ├─ repository
      │              │  └─ ContactRepositoryTest.java
      │              └─ service
      │                 └─ ContactServiceTest.java
      └─ resources
         ├─ application.properties
         ├─ data.sql
         └─ schema.sql
```


## Getting Started


### Dependencies
- Java 11 or higher
- Maven

### Installing
1. Clone the repository: `git clone https://github.com/Fast-Lane-Labs/Contact-Database-Application-Java`
2. Navigate to the project directory: `cd fastlane-contact`
3. Install the dependencies: `mvn install`

### Executing program
1. Run the application: `mvn spring-boot:run`
2. Open your web browser and visit `http://localhost:80`
