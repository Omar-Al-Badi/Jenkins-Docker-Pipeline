# Use an official nginx runtime as a parent image
FROM nginx:alpine

# Set the working directory to /usr/share/nginx/html
WORKDIR /usr/share/nginx/html

# Copy the contents of the Webpage folder into the container at /usr/share/nginx/html
COPY ./Webpage/ .
