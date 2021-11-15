# demo-customer
demo-customer

This is a mini RESTful CRUD service in Spring Boot to perform CRUD operations on a database resource by using Spring Data JPA and Hibernate.
The service allows clients to add new customers, find customers, and modify or delete any existing customers. On the backend we will use an H2 database to store customers' information. 

1.	Preloaded into DB with 2 customers: customer id=1 and customer id=2
2.	Test with Curl in windows CMD as below:
[GET]
curl -X GET localhost:8080/customers
[POST]
curl -i -H "Content-Type: application/json" -X POST -d "{\"name\": \"Wu\", \"email\": \"123@example.com\"}" http://localhost:8080/customers
[PUT]
curl -i -H "Content-Type: application/json" -X PUT -d "{\"name\": \"Wu\", \"email\":\"put@example.com\"}" http://localhost:8080/customers/1

[DELETE]
curl -X DELETE localhost:8080/customers/3

Thank you for your time!
