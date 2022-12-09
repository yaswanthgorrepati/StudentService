# StudentService

#API
HealthAPI:
http://localhost:8080/student/healthCheck
Response:
    {
        "health": "Healthy",
        "appVersion": "1.0"
    }

Docker Commands:
1.docker pull mysql
2.docker run --name mysql-db -e MYSQL_ROOT_PASSWORD=root -e MYSQL_DATABASE=studentdb -e MYSQL_USER=studentdb_user -e MYSQL_PASSWORD=secretdbpass -p 3308:3306 -d mysql
3.docker logs mysql-db
4.docker exec -it mysql-db bash

