curl -v -i -XPUT -H "Content-Type:text/uri-list" -d "http://localhost:8080/employee/1" http://localhost:8080/job/1/employee
curl -v -i -XPUT -H "Content-Type:text/uri-list" -d "http://localhost:8080/employee/2" http://localhost:8080/job/1/employee

curl -i -X POST -H "Content-Type:application/json" -d "{  \"jobTitle\" : \"first\" }"  http://localhost:8080/job
curl -i -X POST -H "Content-Type:application/json" -d "{  \"jobTitle\" : \"second\" }"  http://localhost:8080/job

curl -i -X POST -H "Content-Type:application/json" -d "{  \"firstName\" : \"Igor\",  \"lastName\" : \"Akulov\" }"  http://localhost:8080/employee
curl -i -X POST -H "Content-Type:application/json" -d "{  \"firstName\" : \"Daria\",  \"lastName\" : \"Akulova\" }"  http://localhost:8080/employee
curl -i -X POST -H "Content-Type:application/json" -d "{  \"departmentName\" : \"first\" }"  http://localhost:8080/department
curl -i -X POST -H "Content-Type:application/json" -d "{  \"departmentName\" : \"second\" }"  http://localhost:8080/department

curl -v -i -XPUT -H "Content-Type:text/uri-list" -d "http://localhost:8080/employee/1" http://localhost:8080/job/1/employee
curl -v -i -XPUT -H "Content-Type:text/uri-list" -d "http://localhost:8080/employee/2" http://localhost:8080/job/1/employee
curl -i -XPUT -H "Content-Type:text/uri-list" -d "http://localhost:8080/department/1" http://localhost:8080/employee/2/department