# Kafka Sample Project

[![Java](https://img.shields.io/badge/Java-21-blue.svg)](https://www.oracle.com/java/)  
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.1.0-green.svg)](https://spring.io/projects/spring-boot)  

A hands‑on Spring Boot sample demonstrating end‑to‑end Apache Kafka integration: topics, brokers, producers, consumers, plus Swagger for API documentation.

## Table of Contents

- [Features](#features)  
- [Prerequisites](#prerequisites)  
- [Getting Started](#getting-started)  
- [Configuration](#configuration)  
- [Running the Application](#running-the-application)  
- [Using the APIs](#using-the-apis)  
- [Swagger UI](#swagger-ui)  
- [Project Structure](#project-structure)  
- [Contributing](#contributing)  
- [Author](#author)  

## Features

- **Kafka Broker & Topics** – configure and connect to a local or remote Kafka broker  
- **Producers** – REST endpoints that send messages to Kafka topics  
- **Consumers** – background listeners that consume and log topic messages  
- **Swagger UI** – interactive API docs for all REST endpoints  
- **Configurable** – externalize broker address, topic names, consumer groups  

## Prerequisites

- **Java 17+**  
- **Gradle ** (or Maven 3.6+ if you prefer)  
- **Apache Kafka 3.x** (broker + ZooKeeper)  
- **Git**  

## Getting Started

1. **Clone the repo**  
   ```bash
   git clone https://github.com/Rishabhgoyal0183/kafka-project.git
   cd kafka-sample-project
