# 📝 Java Notes App

A simple **Java CLI-based Notes Application** demonstrating File I/O operations in Java using `FileWriter` and `BufferedReader`.

---

## 📌 Task Overview

**Task 4: Java File I/O – Notes App**

- **Objective:** Create a text-based notes manager with file read/write functionality.
- **Tools Used:** Java, VS Code / IntelliJ, Terminal
- **Key Concepts:** File I/O, Exception Handling, try-with-resources

---

## 📂 File Structure

```
📁 NotesApp
└── NotesApp.java   // Main program file
└── README.md       // Documentation file
```

---

## 💡 Features

- ✅ Write a new note (overwrite existing content)
- ✅ Append a note
- ✅ View notes from file
- ✅ File I/O using `FileWriter` and `BufferedReader`
- ✅ Safe resource handling with try-with-resources
- ✅ Exception handling for I/O errors

---

## 🚀 How to Run

### Prerequisites
- Install Java JDK
- Use Terminal or any Java IDE (VS Code / IntelliJ)

### Steps

1. Save the file as `NotesApp.java`
2. Open terminal in the directory containing the file
3. Compile:
   ```bash
   javac NotesApp.java
   ```
4. Run:
   ```bash
   java NotesApp
   ```

---

## 🔍 Code Overview

### ✏️ Writing Notes
- Option to overwrite or append existing notes
- `FileWriter` for writing data
- Type `END` to finish note entry

### 📖 Reading Notes
- Uses `BufferedReader` with `FileReader`
- Displays file contents line-by-line
- Handles case when no file exists

---

## 🎯 Learning Outcomes

- File writing in append/overwrite mode
- Reading files using BufferedReader
- Implementing exception handling
- Resource management with try-with-resources

---

## 👨‍💻 Author

**Kshitij Jha**  
Java Developer Intern | Elevate Labs
