# Task Management API

A Spring Boot-based REST API for managing tasks with features for creating, reading, updating, and deleting tasks.

## Features

- Create new tasks with title, description, status, and priority
- Retrieve all tasks or get a specific task by ID
- Update existing tasks
- Delete tasks
- Task prioritization system
- Status tracking

## Technology Stack

- Java 17
- Spring Boot
- Spring Data JPA
- Maven
- H2 Database (can be configured for other databases)

## Project Structure

```
src/main/java/com/featuring/tasks/firstProject/
├── controller/
│   └── TaskController.java
├── service/
│   ├── TaskService.java
│   └── impl/
│       └── TaskServiceImpl.java
├── entity/
│   └── TaskEntry.java
└── repository/
    └── TaskRepository.java
```

## API Endpoints

### Get All Tasks
```
GET /tasks/all
```

### Get Task by ID
```
GET /tasks/id/{id}
```

### Create Task
```
POST /tasks/create
Content-Type: application/json

{
    "title": "Sample Task",
    "description": "Task description",
    "status": "PENDING",
    "priority": "HIGH"
}
```

### Update Task
```
PUT /tasks/id/{id}
Content-Type: application/json

{
    "title": "Updated Task",
    "description": "Updated description",
    "status": "IN_PROGRESS",
    "priority": "MEDIUM"
}
```

### Delete Task
```
DELETE /tasks/id/{id}
```

## Setup Instructions

1. Clone the repository
2. Make sure you have Java 17 and Maven installed
3. Set up PostgreSQL database:
   - Create a database named `projects`
   - Create `application-local.properties` in `src/main/resources/` with your database credentials:
     ```properties
     spring.datasource.username=your_postgres_username
     spring.datasource.password=your_postgres_password
     ```
   Note: This file is gitignored and won't be committed to ensure security
4. Run the application:
   ```bash
   mvn spring-boot:run
   ```
5. The API will be available at `http://localhost:8080`

## Configuration

The application can be configured through:
1. `src/main/resources/application.properties` - Main configuration file
2. `src/main/resources/application-local.properties` - Local database credentials (not committed to Git)

For production deployment, set the following environment variables:
- `DB_URL` - Database URL (default: jdbc:postgresql://localhost:5432/projects)
- `DB_USERNAME` - Database username
- `DB_PASSWORD` - Database password

## Future Enhancements

- [ ] Implement custom exception handling
- [ ] Add input validation
- [ ] Implement pagination for task listing
- [ ] Add authentication and authorization
- [ ] Enhance documentation with Swagger/OpenAPI
- [ ] Add unit and integration tests
