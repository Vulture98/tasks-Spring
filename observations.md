

# learn
wts jpa

to connect to db u need jpa & postgre/mysql dependedncy

# db
Options are:
none: Do nothing
update: Create/update tables (safe for development)
create: Drop and create tables each time (dangerous in production!)
validate: Only verify tables match entities

For development, it's convenient to use ddl-auto=update. For production, typically use none or validate and manage database changes with migration tools like Flyway or Liquibase.

# PostgreSQL DB
## no uri unlike in mongoBD
use url, user, pwd


## PostgreSQL requires password authentication (SCRAM-based)

SCRAM (Salted Challenge Response Authentication Mechanism):
It's a modern, secure way PostgreSQL uses to verify passwords
Instead of sending the actual password over the network:
Server sends a challenge
Client responds with a hash
More secure than plain password authentication
It's the default in newer PostgreSQL versions


# logging
logging.level.root=ERROR 
    in app.prop
        this reduces amount of shit in op

TRACE  (Most detailed)
DEBUG  (Detailed debugging)
INFO   (Default - General information)
WARN   (Warnings)
ERROR  (Errors)
FATAL  (Critical errors)
OFF    (No logs)


# gpt:
ask ur ai agent to recp/summarise wt uve learned so far just to get a quick overview


# dependencies
diff bw <scope>provided</scope> and <optional>true</optional> in Maven dependencies:


# prohibits:
```java1
    // DON'T do this - might throw exception
    Optional<TaskEntry> task = taskRepository.findById(id);
    task.get()  // BOOM! If task doesn't exist

    // DO this - safe, handles empty case
    taskRepository.findById(id).orElse(null)  // Returns null if task doesn't exist
    That's why the Java docs recommend:
```


❌ Never use get() directly
✅ Use orElse(), orElseGet(), or orElseThrow()
✅ Use map() or flatMap() for transformations





# Java Maps and map() function

## 1. Map Collection Types
```java
// Most common Map types:
Map<String, Integer> hash = new HashMap<>();        // Unordered, fast
Map<String, Integer> tree = new TreeMap<>();        // Sorted by keys
Map<String, Integer> linked = new LinkedHashMap<>(); // Keeps insertion order
Map<String, Integer> concurrent = new ConcurrentHashMap<>();  // Thread-safe
```

## 2. Basic Map Operations
```java
// Create and add
Map<String, Integer> scores = new HashMap<>();
scores.put("John", 90);
scores.put("Alice", 95);

// Get values
int score1 = scores.get("John");                    // 90 or null if not found
int score2 = scores.getOrDefault("Unknown", 0);     // 0 if not found

// Check
boolean hasJohn = scores.containsKey("John");       // true
boolean has90 = scores.containsValue(90);           // true
```

## 3. Looping Through Maps
```java
// Traditional way
for (Map.Entry<String, Integer> entry : scores.entrySet()) {
    System.out.println(entry.getKey() + ": " + entry.getValue());
}

// Modern way (Java 8+)
scores.forEach((name, score) -> {
    System.out.println(name + ": " + score);
});
```

## 4. Advanced Map Operations
```java
// Only put if key doesn't exist
scores.putIfAbsent("John", 80);  

// Calculate value if key missing
scores.computeIfAbsent("John", name -> calculateScore(name));

// Update or insert
scores.merge("John", 10, (old, value) -> old + value);  // Add 10 to score
```

## 5. map() Function (Different from Map collection!)
```java
// 1. Optional map - transform if present
Optional<TaskEntry> taskOptional = taskRepository.findById(id);
Optional<String> titleOptional = taskOptional.map(task -> task.getTitle());

// 2. Stream map - transform each element
List<TaskEntry> tasks = taskRepository.findAll();
List<String> titles = tasks.stream()
    .map(task -> task.getTitle())
    .collect(Collectors.toList());

// 3. Real example from our code
return taskRepository.findById(id)
    .map(task -> {
        task.setTitle("New Title");
        taskRepository.save(task);
        return "updated";
    })
    .orElse("not found");
```