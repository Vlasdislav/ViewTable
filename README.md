# ViewTable Web Application

## Описание решения

Данное веб-приложение представляет собой систему для отображения данных в виде таблицы с постраничной навигацией. Основная цель приложения — обеспечить удобную работу с большими объемами данных, позволяя пользователю просматривать информацию без перезагрузки страницы.

Приложение состоит из двух основных частей:
1. **Backend**: Серверная часть, реализованная на Java с использованием Spring Boot. Backend обеспечивает RESTful API для взаимодействия с фронтендом, включая загрузку данных таблицы и управление постраничной навигацией.
2. **Frontend**: Клиентская часть, разработанная с использованием React.js. Она отвечает за отображение данных таблицы и взаимодействие пользователя с приложением.

## Основные технологии

- **Backend**:
  - Java 17
  - Spring Boot
  - JPA/Hibernate
  - H2 (встроенная база данных)
  - Gradle

- **Frontend**:
  - React.js
  - TypeScript
  - Axios (для взаимодействия с API)
  - html/css

- **Docker**:
  - Используются два контейнера: один для фронтенда и один для бэкенда.
  - NGINX используется для сервировки фронтенда.
  - OpenJDK используется для запуска Spring Boot приложения.

## Архитектура приложения

### Backend

Backend предоставляет RESTful API для работы с данными. Таблица загружается из базы данных и передается фронтенду через API в формате JSON. API поддерживает постраничную навигацию, что позволяет загружать только необходимые данные для отображения конкретной страницы.

### Frontend

Frontend реализует интерфейс пользователя, который взаимодействует с API бэкенда для получения данных. React используется для рендеринга таблицы и управления состоянием приложения. В приложении реализована постраничная навигация, которая позволяет пользователю перемещаться между страницами данных.

### Общение с сервером

Взаимодействие между клиентской и серверной частями осуществляется с использованием RESTful API. Axios используется для выполнения HTTP-запросов к серверу. Данные передаются в формате JSON.

### Постраничная навигация

Для оптимизации работы с большими объемами данных, реализована поддержка постраничной навигации. Сервер обрабатывает запросы клиента, формируя ответ только с необходимым объемом данных, соответствующим текущей странице.

## Установка и запуск

### Требования

- Docker
- Docker Compose

### Инструкции по сборке и запуску

1. Клонируйте репозиторий:
   ```bash
   git clone https://github.com/Vlasdislav/ViewTable.git
   cd ViewTable
   ```
2. Соберите и запустите контейнеры с использованием Docker Compose:
    ```bash
    sudo docker-compose up --build
    ```
3. После успешного запуска приложение будет доступно по адресу: <a href="http://127.0.0.1:8085">`http://127.0.0.1:8085`</a>

### Команды Docker

- `docker-compose up --build`: Собрать и запустить контейнеры.
- `docker-compose down`: Остановить и удалить контейнеры.

### Структура проекта

- `/backend`: Содержит серверную часть на Java Spring Boot.
- `/frontend`: Содержит клиентскую часть на React.js.
- `docker-compose.yml`: Файл конфигурации Docker Compose.
- `Dockerfile`: Файлы для сборки Docker образов для frontend и backend.
