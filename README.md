# java-registration

### Setting
1. Run containers with:
    ```sh
   docker compose up -d
   ```
2. Enter postgres:
    ```sh
   docker exec -it db psql -U postgres
   ```
3. Create database in psql repl:
    ```sql
   CREATE DATABASE registration;
   ```

### Usage
- Register 
    ```sh
    curl --request POST \
    --url http://localhost:8080/api/v1/registration \
    --header 'Content-Type: application/json' \
    --data '{
    "firstName": "Aldo",
    "lastName": "Testino",
    "email": "aldo.testino@libero.it",
    "password": "super_secret_password"
    }'
  ```
- Confirm email from maildev UI at `http://localhost:1080` or:
  ```sh
    curl --request GET \
  --url 'http://localhost:8080/api/v1/registration/confirm?token=<token>'
    ```

[Spring configuration here](https://start.spring.io/#!type=maven-project&language=java&platformVersion=2.7.3&packaging=jar&jvmVersion=18&groupId=com.example&artifactId=demo&name=demo&description=Demo%20project%20for%20Spring%20Boot&packageName=com.example.demo&dependencies=lombok,web,security,postgresql,data-jpa,mail)
