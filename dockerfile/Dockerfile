# Use an official Nginx runtime as a parent image
FROM nginx:latest

# Copy the custom configuration file
COPY nginx.conf /etc/nginx/nginx.conf

# Copy the static files
COPY /static /usr/share/nginx/html

# Expose port 80
EXPOSE 80

# Set the default command to start Nginx
CMD ["nginx", "-g", "daemon off;"]
