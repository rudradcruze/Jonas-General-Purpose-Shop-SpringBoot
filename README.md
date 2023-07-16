![Header](/Admin/src/main/resources/static/images/ex/JGPS-Git-Banner.gif)
# E-Commerce Using Java Spring Boot

![ GitHub followers ](https://img.shields.io/github/followers/rudradcruze?style=social) ![ GitHub Repo stars ](https://img.shields.io/github/stars/rudradcruze/Jonas-General-Purpose-Shop-SpringBoot?style=social) ![ GitHub repo size ](https://img.shields.io/github/repo-size/rudradcruze/Jonas-General-Purpose-Shop-SpringBoot) ![ YouTube Channel Subscribers ](https://img.shields.io/youtube/channel/subscribers/UCTZN1mzW0AwackW7axf7-OQ?style=social)  [![MIT License](https://img.shields.io/badge/License-MIT-green.svg)](/LICENSE)

[Detailed Video on YouTube](https://youtu.be/F4-iNaaumek)

Welcome to the world of Mr. Jonas Kahnwald. Mr. Kahnwald has envisioned a General-Purpose Store that revolutionizes the way people shop in his town. With the aim of providing a seamless shopping experience, he plans to develop an application that allows customers to order products online or purchase them directly from the store. This application will offer a wide range of product categories, including Grocery Items, Electronic Items, Sports Items, Cosmetics, and a Miscellaneous category for unique items.

In this scenario, we will explore the theoretical aspects and practical implementation of Mr. Kahnwald's vision. We will delve into the world of object-oriented concepts, logical class identification, relationships among classes, and the application of the Model-View-Controller (MVC) pattern to develop the system.

### System Actors/Roles

This system has three actors:
* Admin
* Customer
* Global User

#### Admin
We all known that admin is the most powerful actor in every system. Similarly in this system admin is the most powerful actor. Admin is responsible for all of the action which are mention below:
* Add Category
* Delete Category
* Edit Category
* Add Product
* Modify Product
* Delete Product
* Accept Order
* Red Complaint
* View Customer
* Update Customer Status

#### Customer
The customer is a lead actor. Customer’s Action are mention below:
* Register
* Login
* Place Order
* View Product
* View Category
* View Filtered Data
* Submit Complaint
* Payment
* Cancel Order

### Global User
A person who can submit complaint without registering into the system.
## Tech Stack

**Client:** HTML, CSS, Bootstrap, JavaScript

**Server:** Java, Spring Boot (2.6.3)
* **Dependency:**
    * Spring Data JPA
    * Security
    * Thymeleaf
    * Validation
    * Spring Web
    * Dev Tool
    * MySQL Connector
    * MySQL Driver
    * Lombok
* Build Tool: **Maven**

**System Used**
* **Processor:** Intel(R) Core (TM) i3-8145U CPU @ 2.10GHz 2.30 GHz
* **Ram:** 8 GB, DDR 4, 2400MHz
* **Graphics:** Integrated Graphics (UHD 620)## Objectives
* To develop a general-purpose store application that allows customers to buy products online and directly from the store.
* To provide customers with a variety of categories of products to choose from, including grocery items, electronic items, sports items, cosmetics, and miscellaneous.
* To allow customers to register and login to the application, and to choose items from the cart and order them.
* To provide customers with discounts depending on the amount of their purchase.
* To provide customers with a complain box where they can send messages to the authority if they have any dissatisfaction about any service.
* To make the application easy to use and navigate.
* To ensure that the application is secure and that customer data is protected.
* To make the application scalable so that it can handle a large number of users.
* To make the application available on a variety of devices, including computers, smartphones, and tablets.
## Admin / User Guide

[View the step by step guide in pdf](https://drive.google.com/file/d/1gz9LYJAXcK1JYG3m9jF-0pOOGw2tVcYn/view?usp=sharing)
## Installation

* **Editor:** IntelliJ IDEA / Eclipse / NetBeans
* **MySQL** - 8.0.32
## Clone and Run

[Detailed Video on YouTube](https://youtu.be/F4-iNaaumek)

* **Step 1:** Open Terminal And Run Below Command
```bash
  git clone https://github.com/rudradcruze/Jonas-General-Purpose-Shop-SpringBoot.git
```
* **Step 2: ** Open MySQL Command Promte and Run The Below Query
```sql
    INSERT INTO `jgps_rudra`.`roles` (`name`) VALUES ('ADMIN');
    INSERT INTO `jgps_rudra`.`roles` (`name`) VALUES ('CUSTOMER');
```
* **Step 3:**
Import the project in your IDE and run the both module (admin and customer). Then
For Admin Module: `http://localhost:8087/`
For Customer Module: `http://localhost:8020/` 


## Screenshots

![Customer View](/Admin/src/main/resources/static/images/ex/customer-view.png)

![Admin View product List](/Admin/src/main/resources/static/images/ex/admin-view.png)
## 🚀 About Me
Tech-savvy designer/programmer pushing boundaries of online tech. Passionate about new tools, seeking challenges to advance skills.
## 🔗 Social Links
![Name](https://img.shields.io/badge/Name-Francis%20Rudra%20D%20Cruze-yellowgreen?style=for-the-badge)
[![linkedin](https://img.shields.io/badge/linkedin-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/rudradcruze)
[![twitter](https://img.shields.io/badge/twitter-1DA1F2?style=for-the-badge&logo=twitter&logoColor=white)](https://twitter.com/rudradcruze)
[![Facebook](https://img.shields.io/badge/facebook-4267B2?style=for-the-badge&logo=facebook&logoColor=white)](https://facebook.com/rudradcruze)
[![francisrudra@gmail.com](https://img.shields.io/badge/gmail-4267B2?style=for-the-badge&logo=gmail&logoColor=white)](mailto:francisrudra@gmail.com)
## License
[MIT License](/LICENSE)