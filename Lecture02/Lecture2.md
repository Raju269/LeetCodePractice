
# Java Lecture 2 — JVM, JRE, JDK & Java Editions
🎯
<aside>
**Goal:** Understand JVM, JRE, JDK, Java SE/EE/ME, platform independence, and how Java code is compiled and executed. This page is designed for quick revision + interview preparation.

</aside>

## 1. JVM — Java Virtual Machine

**Definition:** JVM is the runtime engine that loads and executes Java bytecode.

### Main work of JVM

- Loads `.class` files
- Verifies bytecode
- Executes bytecode
- Manages memory
- Performs garbage collection
- Uses Interpreter and JIT compiler

<aside>
💡

**Interview line:** JVM is a virtual execution environment that loads, verifies and executes Java bytecode while also handling memory management and garbage collection.

</aside>

### Important trap

- Bytecode → platform independent
- JVM implementation → platform dependent

```
Windows → Windows JVM
Linux   → Linux JVM
macOS   → macOS JVM
```

## 2. JRE — Java Runtime Environment

**Definition:** JRE provides the environment required to run Java applications.

```
JRE
├── JVM
└── Java Runtime Libraries
```

**Easy memory:** JRE = Run Java

<aside>
🎤

**Interview answer:** JRE contains the JVM and supporting runtime libraries required to execute Java applications.

</aside>

## 3. JDK — Java Development Kit

**Definition:** JDK is the complete toolkit used to develop, compile, run and debug Java applications.

### Important JDK tools

- `javac` → Java compiler
- `java` → launches a Java program
- `jar` → packages classes/resources
- `javadoc` → generates documentation
- `jdb` → debugger

**Easy memory:** JDK = Develop Java

## 4. JVM vs JRE vs JDK

| Component | Full Form | Main Job | Key Point |
| --- | --- | --- | --- |
| JVM | Java Virtual Machine | Executes bytecode | Runtime execution engine |
| JRE | Java Runtime Environment | Runs Java apps | JVM + libraries |
| JDK | Java Development Kit | Develops Java apps | Tools + runtime |

<aside>
🧠

**Memory trick:** JVM = Execute • JRE = Run • JDK = Develop

</aside>

## 5. Java Editions

### Java SE — Standard Edition

Used for core Java and general-purpose applications.

Includes concepts/APIs such as:

- OOP
- Collections
- Exception handling
- Multithreading
- I/O
- Networking
- JDBC
- Generics

### Java EE — Enterprise Edition

Historically Java EE; now known as **Jakarta EE**.

Used for:

- Enterprise applications
- Server-side web applications
- Banking systems
- E-commerce systems
- REST APIs and web services

### Java ME — Micro Edition

Designed for resource-constrained and embedded devices.

**Memory trick:**

- SE = Standard
- EE = Enterprise
- ME = Micro

## 6. How Java Achieves Platform Independence

Java source code is compiled into platform-neutral bytecode. That bytecode runs on a compatible JVM for each operating system.

```
Main.java
   ↓
javac
   ↓
Main.class (Bytecode)
   ↓
Windows JVM / Linux JVM / macOS JVM
   ↓
Execution
```

<aside>
⭐

**Best interview answer:** Java achieves platform independence by compiling source code into platform-neutral bytecode, which is executed by a platform-specific JVM.

</aside>

## 7. First Java Program — Hello World

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}
```

### Output

```
Hello World
```

### Code meaning

- `public class Main` → declares class `Main`
- `main()` → common entry point of a Java application
- `System.out.println()` → prints output

## 8. Compile Java using javac

Suppose the file is `Main.java`.

```bash
javac Main.java
```

This creates:

```
Main.class
```

**Remember:**

```
.java → javac → .class
```

`Main.class` contains Java bytecode.

## 9. Run Java using JVM

Run the class with:

```bash
java Main
```

Do not normally write:

```bash
java Main.class
```

### Complete flow

```
Main.java
   ↓
javac
   ↓
Main.class
   ↓
Class Loader
   ↓
Bytecode Verifier
   ↓
JVM Execution Engine
   ↓
Interpreter / JIT
   ↓
Machine Code
   ↓
CPU
```

## 10. Class Loader, Verifier and JIT

### Class Loader

Loads required `.class` files into JVM memory.

### Bytecode Verifier

Checks bytecode for correctness and safety before execution.

### JIT Compiler

JIT = Just-In-Time Compiler.

It converts frequently executed bytecode into native machine code to improve performance.

## 11. Is Java Compiled or Interpreted?

**Answer:** Both concepts are involved.

```
.java
 ↓
javac compiler
 ↓
bytecode
 ↓
JVM
 ↓
Interpreter / JIT
 ↓
machine code
```

## 12. Interview Questions — Ready Answers

### Q1. What is JVM?

JVM stands for Java Virtual Machine. It loads, verifies and executes Java bytecode and also handles runtime services such as memory management and garbage collection.

### Q2. What is JRE?

JRE stands for Java Runtime Environment. It provides the JVM and runtime libraries required to run Java applications.

### Q3. What is JDK?

JDK stands for Java Development Kit. It provides development tools such as `javac`, `java`, `jar`, `javadoc` and the runtime needed to build and execute Java programs.

### Q4. What is the difference between JVM, JRE and JDK?

JVM executes bytecode, JRE provides the environment to run Java programs, and JDK provides tools to develop, compile and run Java applications.

### Q5. Which component executes Java bytecode?

**JVM.**

### Q6. Which component contains `javac`?

**JDK.**

### Q7. Is JVM platform independent?

No. JVM implementations are platform specific.

### Q8. Why is Java platform independent?

Because Java code is compiled into platform-neutral bytecode that can run on compatible JVM implementations.

### Q9. What does `javac` do?

It compiles `.java` source code into `.class` bytecode.

### Q10. What does the `java` command do?

It launches the JVM and runs the specified Java class.

### Q11. What is Java SE?

Java SE is the standard Java platform containing core Java APIs and language features.

### Q12. What is Java EE?

Java EE was the enterprise Java platform for server-side and enterprise applications; it is now known as Jakarta EE.

### Q13. What is Java ME?

Java ME is designed for embedded and resource-constrained devices.

### Q14. What does a `.class` file contain?

Java bytecode.

### Q15. Is Java compiled or interpreted?

Java source is compiled into bytecode, and the JVM executes that bytecode using interpretation and JIT compilation.

## 13. Interview Trap Questions

- **Is JVM same as JRE?** No.
- **Is JVM platform independent?** No.
- **Does JRE contain `javac`?** No, `javac` is a JDK development tool.
- **Is JDK only a compiler?** No, it contains multiple development tools and runtime components.
- **Should we run `java Main.class`?** No. Normally use `java Main`.

## 14. 30-Second Revision

| Topic | Remember |
| --- | --- |
| JVM | Executes bytecode |
| JRE | JVM + runtime libraries |
| JDK | Development tools + runtime |
| Java SE | Core Java |
| Java EE / Jakarta EE | Enterprise Java |
| Java ME | Embedded/small devices |
| `javac` | `.java` → `.class` |
| `java` | Launches/runs class |
| `.class` | Bytecode |
| Platform independence | Bytecode + platform-specific JVM |

<aside>
⚡

**One-line revision:** Write `Main.java` → compile with `javac Main.java` → get `Main.class` bytecode → run with `java Main` → JVM executes it.

</aside>

## 15. Self-Test Checklist

- [x]  I can explain JVM in 20 seconds.
- [x]  I can explain JRE in 20 seconds.
- [x]  I can explain JDK in 20 seconds.
- [x]  I know JVM vs JRE vs JDK.
- [x]  I know SE vs EE vs ME.
- [x]  I can explain platform independence.
- [x]  I can write Hello World without help.
- [x]  I remember `javac Main.java`.
- [x]  I remember `java Main`.
- [x]  I can answer the interview trap questions.

