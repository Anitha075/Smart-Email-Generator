# 📧 Smart Email Generator (Spring Boot + Gemini API)

## 🚀 Overview

The **Smart Email Generator** is a Spring Boot application that uses **Google Gemini AI API** to generate smart and professional email replies.

It takes user email content as input and returns an AI-generated response with an optional tone setting.

---

## ✨ Features

- 🤖 AI-powered email reply generation using Gemini API  
- 🎯 Tone customization (formal, friendly, professional, etc.)  
- ⚡ Fast backend using Spring Boot  
- 🌐 REST API architecture  
- 🔧 Easy configuration using environment variables  
- 🧠 Smart prompt engineering for better responses  

---

## 🛠️ Tech Stack

- Java 17+
- Spring Boot
- Spring Web
- Spring WebFlux (WebClient)
- Maven
- Google Gemini API
- Jackson (JSON parsing)

---

## ⚙️ Setup Instructions

 1️⃣ Clone the repository
```bash
git clone https://github.com/your-username/email-ai-generator.git
cd email-ai-generator
2️⃣ Add Environment Variables
GEMINI_URL=https://generativelanguage.googleapis.com/v1beta/models/gemini-flash-latest:generateContent
GEMINI_KEY=YOUR_API_KEY
3️⃣ Configure application.properties
gemini.api.url=${GEMINI_URL}
gemini.api.key=${GEMINI_KEY}
4️⃣ Run the Application
      mvn spring-boot:run
🚀 Future Improvements
✉️ Email subject generation
🔐 Authentication system
💾 Save email history
🎨 UI improvements
🤖 Multiple AI model support
👨‍💻 Author

Built as a full-stack AI project demonstrating integration of Spring Boot + Google Gemini API + React frontend.

⭐ Support

If you like this project, please give it a ⭐ on GitHub!
