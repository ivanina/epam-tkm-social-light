#init.sql will be executed on the first run, feel free to customize

#build the image from docker file
docker build -t poc:poc_postgres .

#new image should be listed here
docker images

#run image exposing port to host machine
docker run --name postgres_container -e POSTGRES_PASSWORD=password -e POSTGRES_USER=docker -e POSTGRES_DB=postgres -d -p 5432:5432 poc:poc_postgres

#check it here, status should be "Up"
docker ps -a
