# EarthTech-API
![License: MIT](https://img.shields.io/github/license/mainvest/vue-simple-icons)

EarthTechAPI aims to integrate agricultural zoning data with Smart Platforms for agricultural crops. This API allows users to consult updated data from the Brazilian federal government's ZARC system to display mapping information relating to agricultural zoning in the Tocantins region. The main objective is to promote innovation for the progress of agriculture in the state of Tocantins, offering a simple, accessible and objective approach.

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
- CRUD for endpoints.


## Usages and URI

#### URI

https://earthtechapi.up.railway.app/api/zoneamento

#### Postman
Run the API in Postman: 

[![Run in Postman](https://run.pstmn.io/button.svg)](https://app.getpostman.com/run-collection/8d1d44a5e2b448ff3d6f)

## Documentation 📄

### Endpoints
  
| Method | Endpoint                  | Description                                                  |
|--------|---------------------------|--------------------------------------------------------------|
| ``GET``    | /api/zoneamento           | Returns the details of the zoning resource.                 |
| ``POST``   | /api/zoneamento/{id}     | Create a new zoning resource on the server.                 |
| ``DELETE`` | /api/zoneamento/{id}     | Remove the zoning resource identified by {id}.              |
| ``PUT``    | /api/zoneamento/{id}     | Updates or replaces the zoning resource identified by {id}.  |
| Example    | /safra/{safra}           | Can search by identifying the specific field. Example: GET /safra/{safra}. |

    
## Response
After a successful request, the API returns the following fields in JSON format:

```js
{
  "id": Long,
  "safra": String,
  "cultura": String,
  "uf": String,
  "municipio": String,
  "grupo": String,
  "solo": String,
  "risk1": Long,
  "risk2": Long,
  "risk3": Long,
  "risk4": Long,
  "risk5": Long,
  "risk6": Long,
  "risk7": Long,
  "risk8": Long,
  "risk9": Long,
  "risk10": Long,
  "risk11": Long,
  "risk12": Long,
  "risk13": Long,
  "risk14": Long,
  "risk15": Long,
  "risk16": Long,
  "risk17": Long,
  "risk18": Long,
  "risk19": Long,
  "risk20": Long,
  "risk21": Long,
  "risk22": Long,
  "risk23": Long,
  "risk24": Long,
  "risk25": Long,
  "risk26": Long,
  "risk27": Long,
  "risk28": Long,
  "risk29": Long,
  "risk30": Long,
  "risk31": Long,
  "risk32": Long,
  "risk33": Long,
  "risk34": Long,
  "risk35": Long,
  "risk36": Long

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



