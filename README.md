# EventScheduler - Team Collaboration Project

## Project Overview
A Java-based event scheduling system being built collaboratively by team members. Each team member will contribute specific components to demonstrate object-oriented programming concepts.

## Java Concepts To Be Demonstrated
- **Interface**: EventDAO, Reportable interfaces (Team Member 1)
- **Abstraction**: BaseEntity abstract class, service layer (Team Members 1, 4)
- **Inheritance**: Entity inheritance, UI component inheritance (Team Members 1, 5)
- **Polymorphism**: DAO implementations, event handling (Team Members 2, 3, 5)
- **Exception Handling**: Custom exceptions throughout (Team Members 1, 3)
- **File Handling**: CSV operations, logging (Team Member 2)

## Project Structure (To Be Built)
```
src/com/event/
├── CLILauncher.java          # Command-line entry point (Team 5)
├── GUILauncher.java          # GUI entry point (Team 5)
├── model/                    # Data model and persistence (Teams 1, 2, 3)
├── service/                  # Business logic layer (Team 4)
├── ui/                       # User interface components (Team 5)
├── util/                     # Utility classes (Teams 2, 3)
└── exception/                # Custom exceptions (Teams 1, 3)
```

## Team Collaboration Workflow

### Team Member Assignments
1. **Team Member 1 - Core Model**: Foundation classes and interfaces
2. **Team Member 2 - File Persistence**: CSV storage and logging
3. **Team Member 3 - Database**: SQL persistence and utilities
4. **Team Member 4 - Services**: Business logic layer
5. **Team Member 5 - UI**: User interface components

### Contribution Process
1. Clone this repository
2. Create feature branch: `feature/[area]-[your-name]`
3. Add your assigned files
4. Commit with descriptive message
5. Push branch and create pull request

### Branch Naming Convention
- `feature/core-model-[name]`
- `feature/file-persistence-[name]`
- `feature/database-[name]`
- `feature/services-[name]`
- `feature/ui-[name]`

## Compilation and Execution (After All Contributions)

### Compile (Once all team members have contributed)
```bash
javac -d bin -cp src src/com/event/**/*.java
```

### Run CLI Version (After Team 5 contributes launchers)
```bash
java -cp "bin;src" com.event.CLILauncher
```

### Run GUI Version (After Team 5 contributes launchers)
```bash
java -cp "bin;src" com.event.GUILauncher
```

### Using Batch File
```bash
run.bat
```

## Individual Contributions

Each team member will contribute specific files that demonstrate different Java concepts:

- **Interfaces & Abstraction**: Core model foundation
- **File Handling**: CSV operations and logging
- **Database Operations**: SQL persistence
- **Business Logic**: Service layer implementation
- **User Interface**: GUI and CLI components

## Academic Requirements Satisfied
✅ Interface implementation  
✅ Abstract classes  
✅ Inheritance hierarchy  
✅ Polymorphic behavior  
✅ Exception handling  
✅ File operations  
✅ Team collaboration  
✅ Individual contributions  

## Getting Started
1. Each team member should check their assigned folder for specific instructions
2. Follow the GitHub workflow outlined above
3. Ensure your contributions compile successfully
4. Test integration with other team members' work

This project demonstrates professional software development practices while satisfying academic requirements for team collaboration and Java programming concepts.
