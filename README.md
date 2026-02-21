
---

# 📦 Full-Stack E-Commerce Application

A secure and scalable **Full-Stack E-Commerce Backend System** developed using **Spring Boot** with **JWT Authentication**, exposing RESTful APIs for user management, product catalog, cart operations, and order processing. The backend is designed using layered architecture and integrates seamlessly with a React frontend.

---

## 🚀 Project Overview

This project simulates a real-world e-commerce platform backend with authentication, product management, cart workflow, and order processing. It follows industry-standard architecture and security practices to build a production-ready REST API system.

---

## 🧰 Tech Stack

### 🔹 Backend

* Java 17
* Spring Boot
* Spring Security
* Hibernate / JPA
* RESTful APIs
* JWT Authentication
* Maven

### 🔹 Database

* MySQL

### 🔹 Frontend (Integrated / Planned)

* React.js (Vite)
* Axios
* React Router

### 🔹 Tools & Technologies

* Postman (API Testing)
* Git & GitHub
* VS Code / Eclipse
* JSON

---

## ⭐ Key Features

* ✅ User Registration & Authentication using JWT
* ✅ Secure API access with Spring Security
* ✅ Product Management APIs (CRUD operations)
* ✅ Cart creation and cart management workflow
* ✅ Order processing simulation
* ✅ Layered Architecture (Controller → Service → Repository)
* ✅ MySQL relational database integration
* ✅ REST API testing using Postman

---

## 🏗️ Architecture

```
Client (React Frontend)
        ↓
REST APIs (Spring Boot)
        ↓
Controller Layer
        ↓
Service Layer
        ↓
Repository Layer (JPA)
        ↓
MySQL Database
```

---

## 🔐 Authentication Flow (JWT)

1. User logs in using credentials
2. Server generates JWT token
3. Token sent in response
4. Client sends token in Authorization header
5. Protected APIs validate token

```
Authorization: Bearer <JWT_TOKEN>
```

---

## 📂 Project Structure

```
full-stack-ecommerce-application
│
├── backend/
│   ├── src/
│   ├── pom.xml
│
├── frontend/
│   ├── src/
│   ├── package.json
│
└── README.md
```

---

## ⚙️ Backend Setup

### 1️⃣ Clone Repository

```bash
git clone https://github.com/aakashpuri12/full-stack-ecommerce-application.git
```

### 2️⃣ Navigate to Backend

```bash
cd backend
```

### 3️⃣ Configure Database (`application.properties`)

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/ecommerce_db
spring.datasource.username=root
spring.datasource.password=yourpassword
```

### 4️⃣ Run Application

```bash
mvn spring-boot:run
```

Backend runs at:

```
http://localhost:8080
```

---

## 🧪 API Testing (Postman)

Example APIs:

| Method | Endpoint             | Description  |
| ------ | -------------------- | ------------ |
| POST   | `/api/auth/login`    | User Login   |
| POST   | `/api/products`      | Add Product  |
| GET    | `/api/products`      | Get Products |
| POST   | `/api/cart/{userId}` | Create Cart  |

---

## 🌐 Frontend Setup (React + Vite)

```bash
cd frontend
npm install
npm run dev
```

Frontend runs at:

```
http://localhost:5173
```

---

## 📈 Future Enhancements

* Payment Gateway Integration
* Order History
* Admin Dashboard
* Product Image Upload
* Deployment (Docker + Cloud)

---

## 👨‍💻 Author

**Aakash Puri**
Computer Science & Business Systems
Java Full Stack Developer (Fresher)

---

## ⭐ Contribution

Contributions and suggestions are welcome!

---

Agar chaho next me de sakta hoon 🔥
👉 **README badges + screenshots + API documentation section** (GitHub ko ⭐ attract karne wala version).
