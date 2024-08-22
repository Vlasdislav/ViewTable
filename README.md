# Веб-приложение на Java Spring Boot и React

## Описание

Это веб-приложение состоит из двух компонентов: бэкенда на Java с использованием Spring Boot и фронтенда на React с использованием TypeScript. Приложение упаковано в Docker-контейнеры и доступно по адресу `http://127.0.0.1:8085`.

## Структура проекта

- **frontend**: Исходный код React-приложения.
- **backend**: Исходный код Spring Boot приложения.
- **docker-compose.yml**: Скрипт для сборки и запуска контейнеров.

## Требования

- Docker
- Docker Compose

## Установка

1. Клонируйте репозиторий:
   ```bash
   git clone https://github.com/Vlasdislav/ViewTable.git
   cd ViewTable
   ```
2. Перейдите в папку с проектом и запустите:
    ```bash
    sudo docker-compose up --build
    ```
3. Откройте браузер и перейдите по адресу: `http://127.0.0.1:8085`

## Команды Docker
- `docker-compose up --build`: Собрать и запустить контейнеры.
- `docker-compose down`: Остановить и удалить контейнеры.
