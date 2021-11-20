3.1 

The Java Persistence API(JPA) defines a standard interface to manage data over relational databases; there are several frameworks that implement the JPA specification, 
such as the Hibernate framework. JPA offers a specification for ORM (object-relational mapping).
Following the guide.
b)
-The methods are signupform(), adduser(), updateuser(), deleteuser() and all of the methods are defined in usercontroller class.
-in a databse with spring data jpa and extending the crud repository
-rule about notempty is defined in the user class.


3.2

$ docker run --name mysql5 -e MYSQL_ROOT_PASSWORD=secret1-e MYSQL_DATABASE=demo-e MYSQL_USER=demo-e MYSQL_PASSWORD=secret2-p 33060:3306-d mysql/mysql-server:5.7
using this command to create docker container.
-adding dependencies when configuring the project in this case Spring Web, Spring Data JPA, MySQL driver, DevTools and Validation.
-creating packages:
	-package for model- employee entity
	-package for repositories- employee repository
	-package for controllers-  employee controler
	-package for exception- error details, global exception handler, resource not found exception

After writting the code, with curl command I did testing of the application. The screenshots of the working application can be found in screenshots folder in lab3
-GET
-PUT
-PUSH
-DELETE


