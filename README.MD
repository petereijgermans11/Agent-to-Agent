# A2A (Agent-to-Agent) Communication Demo Project

This repository contains a demonstration of Agent-to-Agent (A2A) communication using Java and various frameworks. The project showcases different approaches to implementing A2A patterns with LangChain4j and Quarkus.

## Project Structure

This repository is organized into three main directories, each representing a different component of the A2A communication ecosystem:

### 📁 `baavenger/`
**A2A Client Usage Example**
- **Technology**: Pure Java (Java 25) with Maven
- **Purpose**: Demonstrates client-side usage of A2A communication
- **Key Dependencies**:
  - LangChain4j Agentic framework (v1.7.1-beta14)
  - LangChain4j Ollama integration
  - LangChain4j A2A support
- **Description**: This module shows how to implement an A2A client that can communicate with other agents using the LangChain4j framework.

### 📁 `bruce-baaner/`
**Quarkus-based A2A Component**
- **Technology**: Quarkus Framework
- **Purpose**: Provides REST-based A2A communication services
- **Key Features**:
  - REST Jackson support for JSON serialization
  - A2A Java SDK integration (v0.3.0.Beta1)
  - Quarkus development mode with live reload
- **Description**: A Quarkus application that serves as an intermediary component in the A2A communication chain, providing RESTful endpoints for agent interactions.

### 📁 `ironram/`
**A2A Server Implementation**
- **Technology**: Quarkus Framework with LangChain4j
- **Purpose**: Server-side A2A communication hub
- **Key Features**:
  - LangChain4j Ollama integration
  - REST Jackson support
  - Native executable support
- **Description**: The main server component that handles A2A communication requests and orchestrates interactions between different agents.

## Getting Started

### Prerequisites
- Java 25 (for baavenger)
- Java 17+ (for Quarkus applications)
- Maven 3.8+
- Docker (optional, for containerized builds)

### Running the Applications

#### Baavenger (Client)
```bash
cd baavenger
mvn clean compile exec:java
```

#### Bruce-Baaner (Quarkus Component)
```bash
cd bruce-baaner
./mvnw quarkus:dev
```
Access the Dev UI at: http://localhost:8080/q/dev/

#### Ironram (A2A Server)
```bash
cd ironram
./mvnw quarkus:dev
```
Access the Dev UI at: http://localhost:8080/q/dev/

### Building for Production

Each Quarkus application can be packaged as:
- **JAR**: `./mvnw package`
- **Uber-JAR**: `./mvnw package -Dquarkus.package.jar.type=uber-jar`
- **Native executable**: `./mvnw package -Dnative`

## Architecture Overview

The project demonstrates a complete A2A communication flow:

1. **baavenger** acts as a client agent that initiates communication
2. **bruce-baaner** serves as a middleware component handling REST-based interactions
3. **ironram** functions as the central server managing agent communications

## Key Technologies

- **LangChain4j**: Framework for building AI applications with agent capabilities
- **Quarkus**: Supersonic Subatomic Java framework for cloud-native applications
- **Ollama**: Local LLM runtime integration
- **A2A SDK**: Specialized SDK for agent-to-agent communication patterns

## Development Notes

- The project uses preview features of Java (enable with `--enable-preview`)
- All Quarkus applications support hot reload in development mode
- Native compilation is supported for optimal performance in production
- Docker support is available for containerized deployments