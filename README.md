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
/**
command line client.
I connect to the bash into the running MySQL container:

$ docker exec -it container_mysql_name /bin/bash

-i is the shortcut for --interactive option. This options is used for keep STDIN open even if not attached

-t is the shortcut for --tty option, used to allocate a pseudo-TTY

I run MySQL client from bash MySQL container:

$ mysql -uroot -proot

-u is shortcut for --user=name option, used to define user for login if not current user.

-p is shortcut for -password[=name] option, used to define password to use when connecting to server. If password is not given it's asked from the tty.
**/

