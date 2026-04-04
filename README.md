# REST API Employee CRUD

## Cara Menjalankan
 
### Prerequisite
 
- Docker & Docker Compose terinstall
 
### Langkah
 
1. Clone repository
 
```bash
git clone https://github.com/shanahandnlf/juke-test.git
cd juke-test
```
 
2. Jalankan dengan Docker Compose
 
```bash
docker-compose up --build
```
 
3. Aplikasi berjalan di `http://localhost:8080`
 
4. Swagger UI tersedia di `http://localhost:8080/swagger-ui/index.html`

## Struktur Projek
 
```
├── controller/
│   └── EmployeeController.java
├── service/
│   └── EmployeeService.java
├── repository/
│   └── EmployeeRepository.java
├── model/
│   └── Employee.java
├── exception/
│   ├── GlobalExceptionHandler.java
│   └── ResourceNotFoundException.java
└── JukeApplication.java
```

## Validasi & Error Handling
 
API memiliki validasi input dan global exception handling:
 
- `name`, `email`, `position` wajib diisi
- `email` harus format email yang valid dan unik
- `salary` harus lebih dari 0