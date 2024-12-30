# Ecom-SPRING-DOCKER-GITHUB_ACTIONS

## Description

Ecom-SPRING-DOCKER-GITHUB_ACTIONS est un projet de e-commerce construit avec **Spring Boot**, conteneurisé avec **Docker**, et automatisé avec **GitHub Actions**. Ce projet vise à fournir une plateforme de commerce électronique robuste, évolutive et bien intégrée avec des pipelines CI/CD.

---

## Fonctionnalités principales

- Gestion des produits et des catégories
- Authentification et autorisation via JWT
- API REST documentée avec Swagger
- Conteneurisation avec Docker
- Déploiement et tests automatisés avec GitHub Actions

---

## Technologies utilisées

- **Backend** : Spring Boot
- **Conteneurisation** : Docker
- **CI/CD** : GitHub Actions
- **Documentation** : Swagger
- **Base de données** : PostgreSQL

---

## Installation et démarrage

### Prérequis

- **Java 17+**
- **Maven**
- **Docker et Docker Compose**
- **Git**

### Étapes

1. Clonez le dépôt :
   ```bash
   git clone https://github.com/mohamed-tahiri/Ecom-SPRING-DOCKER-GITHUB_ACTIONS.git
   cd Ecom-SPRING-DOCKER-GITHUB_ACTIONS
   ```

2. Configurez les variables d'environnement dans un fichier .env :
   ```bash
   spring:
  	datasource:
    		url: jdbc:postgresql://localhost:5432/ecom
    		username: username
    		password: password
    		driver-class-name: org.postgresql.Driver
  	jpa:
    		hibernate:
      			ddl-auto: update
    		show-sql: false
    		properties:
      			hibernate:
      			format_sql: true
    		database: postgresql
    		database-platform: org.hibernate.dialect.PostgreSQLDialect
    server:
  	port: 8088
    ``
