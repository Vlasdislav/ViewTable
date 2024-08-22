# Use Node.js image to build the React app
FROM node:18 AS build

WORKDIR /app

# Install dependencies
COPY package*.json ./
RUN npm install

# Copy the rest of the application code
COPY . .

# Build the React app for production
RUN npm run build

# Use NGINX to serve the React app
FROM nginx:alpine
COPY --from=build /app/build /usr/share/nginx/html

# Expose port 8085
EXPOSE 8085

# Start NGINX server
CMD ["nginx", "-g", "daemon off;"]
