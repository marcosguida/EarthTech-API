# EarthTech-API
![License: MIT](https://img.shields.io/github/license/mainvest/vue-simple-icons)

This API is part of the "EarthTech: Intelligent Platform for Small Crops" project (https://github.com/arthurpestana/earthtech-app.git) which aims to develop an Internet of Things (IoT) platform for intelligent agriculture. This API allows users to consult updated data from the Brazilian federal government's ZARC system to display mapping information regarding agricultural zoning in the Tocantins region. The main objective is to promote innovation for the progress of agriculture in the state of Tocantins, offering a simple, accessible and objective approach.

## ⚒️ Technologies

| Technology | Documentation / Download |
|------------|------------------------------|
| Java 17 | [Documentation](https://docs.oracle.com/en/java/javase/17/) |
| Spring Boot 3.2| [Documentation](https://docs.spring.io/spring-boot/installing.html) |
| Maven | [Download](https://maven.apache.org/download.cgi) |
| MySQL | [Download](https://dev.mysql.com/downloads/installer/) |
| Hibernate | [Documentation](https://hibernate.org/orm/documentation/getting-started/) |
| Lombok | [Setup](https://projectlombok.org/setup/) |
| Postman | [Download](https://www.postman.com/downloads/) |
| JUnit 5 | [Documentation](https://junit.org/junit5/) |


## Features
- Displays update data on agricultural zoning in the state of Tocantins, Brazil.
- CRUD for information on  ``"safra", "cultura" , "municipio" , "microrrregiao", "solo"``.


## Usages and URI

-- colocar como fazer o download  e como usar

#### Postman
Run the API in Postman: 

[![Run in Postman](https://run-beta.pstmn.io/button.svg)](https://app.getpostman.com/run-collection/11144369-e27366d6-7699-46f4-b58e-2b2b2e637be5-Szf6Z9B3)


## Documentation 📄

### Endpoint
| Endpoint | Description | Status | 
| ------ | ------ | ------- |
| /reddit/search/comment/ | xxxxxxxx | Active ✅ |

  <h3>Zoneamento Controller</h3>
  
    1. GET /api/zoneamento
    # Returns the details of the zoning resource.
    
    2. POST /api/zoneamento/{id}
    # create a new zoning resource on the server.

    3. DELETE /api/zoneamento/{id}
    # Remove the zoning resource identified by {id}.

    4. PUT /api/zoneamento/{id}
    # Updates replaces the zoning resource identified by {id}.

    # Can search by identifying the specific field: 
    Example: GET /safra/{safra}
    
## Response
After a successful request, the API returns the following fields in JSON format:

```js
{
  "id" : long,
  "safra" : string,
  "cultura" : string,
  "municipio" : string,
  "microrregiao" : string,
  "solo" : string
}
```

## License

API license under https://github.com/git/git-scm.com/blob/main/MIT-LICENSE.txt

## Author
Any contribution or suggestion send me a message
#### *Marcos Guida*
- Email: ribeiroguidam@gmail.com
  
    [![linkedln](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/marcos-ribeiro-guida?utm_source=share&utm_campaign=share_via&utm_content=profile&utm_medium=ios_app)
[![Instagram](https://img.shields.io/badge/Instagram-E4405F?style=for-the-badge&logo=instagram&logoColor=white)](https://www.instagram.com/marcosguidda?igsh=MWhvaDViZ3Jid2IyNw%3D%3D&utm_source=qr)



