# 📧 Smart-Email-Assistant
---

# 📌 Project Overview

## Project Title

**Smart-Email-Assistant**

## Project Type

Chrome Extension + Spring Boot Backend + AI Integration(Gemini ai)

## Objective

The Email Writer Assistant project is AI-powered Chrome extension that helps users generate professional email replies directly inside Gmail using Artificial Intelligence.

The extension detects the Gmail compose window and inserts an **AI Reply** button into the toolbar. When clicked, the extension sends the email content to a backend API built using Spring Boot. The backend processes the request using AI and returns a professional reply which is automatically inserted into the compose box.

---

# 🎯 Problem Statement

Writing professional email replies can:

* Take time
* Require proper tone and formatting
* Become repetitive for daily communication
* Be difficult for beginners

This project solves the problem by generating:

* Professional replies
* Fast responses
* AI-generated email suggestions
* Better productivity

---

# 🚀 Features

## ✅ Chrome Extension Integration

* Works directly inside Gmail
* Automatically detects compose windows
* Injects AI Reply button dynamically

## ✅ AI Email Generation

* Sends email content to backend API
* Generates professional responses
* Inserts generated reply automatically

## ✅ Dynamic Gmail UI Handling

* Uses MutationObserver
* Detects newly opened compose windows
* Works without page refresh

## ✅ User Friendly Interface

* Clean modern AI Reply button
* Hover effects
* Gmail integrated design

## ✅ Backend API Support

* Spring Boot backend
* REST API communication
* JSON request/response handling

---

# 🛠️ Technologies Used

## Frontend

* HTML
* CSS
* JavaScript
* Chrome Extension APIs

## Backend

* Java
* Spring Boot
* REST APIs

## Tools & Platforms

* Visual Studio Code
* Chrome Browser
* Postman
* Git & GitHub
* Postgresql

---

# 🏗️ System Architecture

```text
Gmail UI
   ↓
Chrome Extension
(content.js)
   ↓
Fetch API Request
   ↓
Spring Boot Backend
(localhost:8080)
   ↓
AI Response Generation
   ↓
Generated Reply
   ↓
Inserted into Gmail Compose Box
```

---

# 📂 Project Structure

```text
email-writer-extension/
│
├── manifest.json
├── content.js
├── content.css
├── icons/
│
└── backend/
    ├── src/
    ├── pom.xml
    └── application.properties
```

---

# 📄 Manifest File Explanation

## Purpose

The `manifest.json` file is the configuration file for the Chrome extension.

## Important Sections

### Permissions

```json
"permissions": ["activeTab", "storage"]
```

### Host Permissions

```json
"host_permissions": [
  "http://localhost:8080/*",
  "*://mail.google.com/*"
]
```

### Content Scripts

```json
"content_scripts": [
  {
    "js": ["content.js"],
    "matches": ["*://mail.google.com/*"],
    "css": ["content.css"],
    "run_at": "document_end"
  }
]
```

---

# 📄 content.js Explanation

## Main Responsibilities

### Detect Gmail Compose Window

Uses MutationObserver to detect when the compose dialog appears.

### Inject AI Reply Button

Creates and inserts a custom AI Reply button into Gmail toolbar.

### Extract Email Content

Reads email text from Gmail message area.

### API Communication

Uses Fetch API to send email content to backend.

### Insert Generated Reply

Automatically inserts AI-generated response into compose textbox.

---

# 📄 content.css Explanation

## Purpose

Provides styling for:

* AI Reply button
* Hover effects
* Gmail toolbar integration
* Professional UI appearance

---

# 🔄 Workflow

## Step 1

User opens Gmail compose window.

## Step 2

Extension detects compose toolbar.

## Step 3

AI Reply button is injected.

## Step 4

User clicks AI Reply button.

## Step 5

Email content is extracted.

## Step 6

Content is sent to Spring Boot backend.

## Step 7

Backend generates professional reply.

## Step 8

Generated reply is inserted into compose box.

---

# 🌐 API Integration

## Endpoint

```text
http://localhost:8080/api/email/generate
```

## Request Method

```text
POST
```

## Sample Request Body

```json
{
  "emailContent": "Meeting request email",
  "tone": "professional"
}
```

## Sample Response

```text
Thank you for your email. I would be happy to attend the meeting.
```

---

# 🔧 Chrome Extension Setup

## Step 1

Open Chrome browser.

## Step 2

Navigate to:

```text
chrome://extensions
```

## Step 3

Enable:

```text
Developer Mode
```

## Step 4

Click:

```text
Load Unpacked
```

## Step 5

Select project folder.

## Step 6

Reload Gmail.

---

# ⚙️ Backend Setup

## Step 1

Open backend project.

## Step 2

Run Spring Boot application.

### Maven Command

```bash
mvn spring-boot:run
```

OR

```bash
mvnw.cmd spring-boot:run
```

## Step 3

Verify backend is running:

```text
http://localhost:8080
```

---

# 🔐 CORS Configuration

To allow Chrome extension API access:

```java
@CrossOrigin(origins = "*")
```

OR

```java
@Configuration
public class CorsConfig {
    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**")
                        .allowedOrigins("*")
                        .allowedMethods("*");
            }
        };
    }
}
```

---

# 🧪 Testing

## Functional Testing

* Compose window detection
* Button injection
* API request testing
* Reply insertion testing

## UI Testing

* Button styling
* Hover effects
* Toolbar alignment

## Backend Testing

* API endpoint testing
* JSON request validation
* Response generation

---

# 🐞 Challenges Faced

## Gmail Dynamic DOM

Gmail changes HTML dynamically.

### Solution

Used MutationObserver for detecting compose windows.

---

## Toolbar Alignment Issues

Button initially broke Gmail layout.

### Solution

Used proper toolbar insertion and CSS styling.

---

## CORS Errors

Chrome extension requests were blocked.

### Solution

Added CORS configuration in Spring Boot.

---

## Selector Issues

Gmail selectors changed frequently.

### Solution

Used multiple fallback selectors.

---

# 📈 Future Enhancements

* Multiple reply tones
* Grammar correction
* Multilingual support
* AI summarization
* Smart email suggestions
* Dark mode support
* Outlook integration
* Yahoo Mail integration
* Reply templates
* User authentication

---

# 🎓 Learning Outcomes

Through this project, the following concepts were learned:

* Chrome Extension Development
* DOM Manipulation
* MutationObserver
* Gmail UI Integration
* REST API Communication
* Spring Boot Backend Development
* Fetch API
* JSON Handling
* CSS Styling
* Debugging & Testing

---

# 📚 README

---

# 📧 Email Writer Assistant

An AI-powered Chrome Extension that generates professional email replies directly inside Gmail using a Spring Boot backend.

---

# 🚀 Features

* AI-generated professional email replies
* Gmail compose window integration
* Dynamic AI Reply button injection
* Automatic reply insertion
* Spring Boot REST API backend
* Clean and responsive UI

---

# 🛠️ Technologies Used

## Frontend

* JavaScript
* HTML
* CSS
* Chrome Extension APIs

## Backend

* Java
* Spring Boot

---

# 📂 Repository Structure

```text
email-writer-extension/
│
├── manifest.json
├── content.js
├── content.css
├── icons/
│
└── backend/
    ├── src/
    ├── pom.xml
    └── application.properties
```

---

# ⚙️ Installation & Setup

## 1️⃣ Clone Repository

```bash
git clone <repository-url>
```

---

## 2️⃣ Start Backend

Navigate to backend folder:

```bash
cd backend
```

Run Spring Boot server:

```bash
mvn spring-boot:run
```

Backend will run on:

```text
http://localhost:8080
```

---

## 3️⃣ Load Chrome Extension

Open Chrome:

```text
chrome://extensions
```

Steps:

* Enable Developer Mode
* Click Load Unpacked
* Select extension folder

---

## 4️⃣ Open Gmail

Visit:

```text
https://mail.google.com
```

Open Compose window.

You will see:

```text
AI REPLY Button
```

---

# 🌐 API Endpoint

## Generate Email Reply

```text
POST /api/email/generate
```

### Request Body

```json
{
  "emailContent": "Project discussion mail",
  "tone": "professional"
}
```

### Response

```text
Generated AI reply text
```

---

# 🎯 How It Works

1. User opens Gmail compose window
2. Extension injects AI Reply button
3. User clicks button
4. Email content is extracted
5. Request sent to backend
6. AI generates professional reply
7. Reply inserted automatically

---

# 🐞 Common Issues

## Button Not Appearing

### Solution

* Reload extension
* Refresh Gmail
* Check console logs

---

## Failed to Fetch

### Solution

* Ensure backend is running
* Check localhost:8080
* Verify CORS configuration

---

## Gmail Layout Breaking

### Solution

* Use proper toolbar insertion
* Add CSS styling correctly

---

# 📈 Future Improvements

* Tone selection
* Multi-language replies
* Outlook support
* AI email summarization
* Smart templates

---

# 👨‍💻 Author

Developed as an AI-powered productivity project using Chrome Extension and Spring Boot.

---

# ⭐ Support

If you found this project useful:

* Star the repository
* Share feedback
* Suggest improvements

---
