<a name="readme-top"></a>

<div align="center">
  <h1 align="center">🧮 Add2Num</h1>
  <p align="center">
    Ứng dụng web cộng hai số lớn bằng Java Spring Boot (Multi-module Maven)
    <br />
    <a href="https://github.com/vuhung2204/add2num"><strong>→ Xem mã nguồn trên GitHub</strong></a>
    <br />
    <br />
    <a href="#about">Giới thiệu</a> ·
    <a href="#install">Cài đặt</a> ·
    <a href="#usage">Sử dụng</a> ·
    <a href="#test">Chạy Unit Test</a> ·
    <a href="#roadmap">Phát triển thêm</a> ·
    <a href="#license">Giấy phép</a>
  </p>
</div>

---

## 🧩 About <a name="about"></a>

**Add2Num** là ứng dụng web mô phỏng phép cộng hai số có độ dài bất kỳ (vượt quá giới hạn `int` hoặc `long` trong Java).  
Dự án gồm hai module độc lập:

- 🧠 **core/** — chứa class `MyBigNumber`, xử lý logic cộng chuỗi & sinh log từng bước.  
- 🌐 **web/** — ứng dụng Spring Boot + Thymeleaf hiển thị giao diện nhập số và kết quả.

---

## ⚙️ Công nghệ sử dụng

| Loại | Công nghệ |
|------|------------|
| Ngôn ngữ | Java 17+ |
| Framework | Spring Boot 3.2.5 |
| Build Tool | Maven |
| Template Engine | Thymeleaf |
| Unit Test | JUnit 5 |

---

## 📁 Cấu trúc thư mục

add2num/ <br />
├── pom.xml  <br />
├── core/ <br />
│   ├── pom.xml <br />
│   ├── src/main/java/com/example/core/MyBigNumber.java <br />
│   └── src/test/java/com/example/core/MyBigNumberTest.java <br />
└── web/ <br />
    ├── pom.xml <br />
    ├── src/main/java/com/example/web/Add2NumApplication.java <br />
    ├── src/main/java/com/example/web/Add2NumController.java <br />
    └── src/main/resources/templates/index.html <br />


1️⃣ Clone project
git clone https://github.com/vuhung2204/add2num.git
<br />
cd add2num

2️⃣ Build toàn bộ project
mvn clean install

3️⃣ Chạy module web
mvn spring-boot:run -pl web

Truy cập tại: http://localhost:8080

Kiểm thử (Unit Test) <a name="test"></a>
Chạy toàn bộ test của module core: <br />
mvn test -pl core

Kết quả mong đợi: <br />
Tests run: 3, Failures: 0, Errors: 0, Skipped: 0
