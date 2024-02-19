
# CRUD Application

[![wakatime](https://wakatime.com/badge/user/018ccb12-9467-4e68-9840-5044c971aca3/project/018dbdca-eb3d-415b-af9b-205e744c0fa3.svg)](https://wakatime.com/badge/user/018ccb12-9467-4e68-9840-5044c971aca3/project/018dbdca-eb3d-415b-af9b-205e744c0fa3)

This is a Java project using Spring to create, read, update and delete data (CRUD). The chosen database is MariaDB. The code is organized and modular, facilitating maintenance and scalability.

## Technologies

[![Java](https://img.shields.io/badge/Java-orange)](https://www.oracle.com/java/)
[![Spring](https://img.shields.io/badge/Spring-brightgreen)](https://spring.io/)
[![Maven](https://img.shields.io/badge/Maven-blue)](https://maven.apache.org/)
[![MariaDB](https://img.shields.io/badge/MariaDB-yellow)](https://mariadb.org/)


## API Documentation

#### Returns all items

```http
  GET /products
```

#### Returns one items

```http
  GET /products/{id}
```

#### Add new items

```http
  POST /products
```

- POST format:
```JSON
  {
    "name": "t-shirt",
    "price": 12
  }
```

#### Modify an existing item
```http
  PUT /products
```

- PUT format:
```JSON
{
    "id": 1,
    "name": "sweater"
}
```
With put you can modify the name, the price or both at the same time.
The only mandatory prerequisite is the ID.

#### Delete an item
```http
  DELETE /product
```
- DELETE format:
```JSON
{
    "id": 1
}
```

## Demonstration



<table>
  <tr>
    <td>Method</td>
    <td width="750px">Example</td>
  </tr>
  <tr>
    <td>GET</td>
    <td><img src="https://github.com/Ismael-Moreira-Kt/CRUD-Application/assets/154206380/55fbfe98-6fd6-4ae1-8b11-1addbaf370d1"></td>
  </tr>
  <tr>
    <td>GET By ID</td>
    <td><img src="https://github.com/Ismael-Moreira-Kt/CRUD-Application/assets/154206380/4cd3f0b2-8a70-482f-9076-580ac28fec2e"></td>
  </tr>
  <tr>
    <td>POST</td>
    <td><img src="https://github.com/Ismael-Moreira-Kt/CRUD-Application/assets/154206380/fe857829-34fb-4626-9830-02eb96e06c21"></td>
  </tr>
  <tr>
    <td>Put</td>
    <td><img src="https://github.com/Ismael-Moreira-Kt/CRUD-Application/assets/154206380/d396ebfc-796d-4d16-87e9-37c822162557"></td>
  </tr>
  <tr>
    <td>Delete</td>
    <td><img src="https://github.com/Ismael-Moreira-Kt/CRUD-Application/assets/154206380/1f573b88-486e-4c68-88d7-b04ea39e8baa"></td>
  </tr>
</table>
