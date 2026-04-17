# Jenkins Calculator Demo

A simple demonstration project showcasing a basic Java Calculator application integrated with Jenkins CI/CD pipeline.

## Project Overview

This project demonstrates a complete CI/CD workflow using Jenkins with a minimal Java application. It includes:
- A simple **Calculator** class that performs addition
- **Unit tests** using JUnit
- **Maven** build automation
- **Jenkins** continuous integration pipeline

## Project Structure

```
.
├── Jenkinsfile          # Jenkins pipeline configuration
├── pom.xml              # Maven project configuration
├── main/
│   └── Calculator.java  # Calculator application source code
└── test/
    └── CalculatorTest.java  # Unit tests
```

## Prerequisites

- **Java 8** or higher
- **Maven 3.6** or higher
- **Jenkins** (for CI/CD pipeline execution)
- **Git** (for version control)

## Building the Project

To build the project locally:

```bash
mvn clean compile
```

This command:
- Cleans any previous build artifacts
- Compiles the source code in the `main/` directory

## Running Tests

To run the unit tests:

```bash
mvn test
```

The test suite verifies that the `Calculator.add()` method correctly adds two integers.

## Calculator Functionality

The `Calculator` class provides basic arithmetic operations:

### `add(int a, int b)`
Returns the sum of two integers.

**Example:**
```java
Calculator c = new Calculator();
int result = c.add(2, 2);  // Returns 4
```

## Jenkins Pipeline

The Jenkins pipeline automates the build, test, and deploy process:

### Pipeline Stages

1. **Build Stage**
   - Cleans the project and compiles the source code
   - Command: `mvn clean compile`

2. **Test Stage**
   - Runs all unit tests
   - Command: `mvn test`
   - Ensures code quality and correctness

3. **Deploy Stage**
   - Simulates deployment
   - Currently prints success message

### Running the Pipeline

The pipeline can be triggered in two ways:

#### Automatic Trigger (Git Push)
When you push code to the repository, Jenkins automatically starts a build. This requires:
1. **GitHub Webhook Configuration** - Point GitHub to your Jenkins server
   - Go to repository Settings → Webhooks
   - Add webhook: `http://<jenkins-server>/github-webhook/`
   - Select "Push events" as trigger
2. **Jenkins GitHub Plugin** - Must be installed and configured
3. **Job Configuration** - Enable "GitHub hook trigger for GITScm polling"

Then, simply push your changes:
```bash
git push origin main
```

Jenkins will automatically detect the push and start the build pipeline.

#### Manual Trigger
To manually start a build:
1. Open Jenkins dashboard
2. Select this job
3. Click **"Build Now"**

## Dependencies

- **JUnit 4.13.2** - Testing framework (test scope)

## Technologies Used

- **Language:** Java
- **Build Tool:** Maven
- **Testing:** JUnit
- **CI/CD:** Jenkins
- **Version Control:** Git

## Getting Started

1. Clone the repository
2. Navigate to the project directory: `cd jenkins`
3. Build the project: `mvn clean compile`
4. Run tests: `mvn test`
5. Push to Git to trigger Jenkins pipeline

## License

This is a demonstration project for educational purposes.
