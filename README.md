<h1 align="center" style="font-weight: bold;"> EarthTech API</h1>

[![GitHub license](https://badgen.net/github/license/Naereen/Strapdown.js)](https://github.com/Naereen/StrapDown.js/blob/master/LICENSE)

EarthTechAPI aims to integrate agricultural zoning data with Smart Platforms for agricultural crops. This API allows users to consult updated data from the Brazilian federal government's ZARC system and the PronaSolos System (EMBRAPA) to display mapping information related to agricultural zoning in the Tocantins region and physical and chemical attributes of soil classes and soil drainage classes. The main objective is to promote innovation for the progress of agriculture in the state of Tocantins, offering a simple, accessible and objective approach.

## ⚒️ Technologies

| Technology | Documentation / Download |
|------------|------------------------------|
| Java 17 | [Documentation](https://docs.oracle.com/en/java/javase/17/) |
| Spring Boot 3.2 | [Documentation](https://docs.spring.io/spring-boot/installing.html) |
| Maven | [Download](https://maven.apache.org/download.cgi) |
| MySQL | [Download](https://dev.mysql.com/downloads/installer/) |
| Hibernate | [Documentation](https://hibernate.org/orm/documentation/getting-started/) |
| Lombok | [Setup](https://projectlombok.org/setup/) |
| JUnit 5 | [Documentation](https://junit.org/junit5/) |
| Postman | [Download](https://www.postman.com/downloads/) |


## Features

- Display updated data on agricultural zoning in the state of Tocantins, Brazil;
- Presents data from the Risk Table for the main agricultural crops in the state of Tocantins, Brazil;
- Display of chemical and physical attribute resources for soil and drainage classes categorized by the Brazilian System of Sistema Brasileiro de Classificação de Solos (Classification under the responsibility of EMBRAPA);
- CRUD operations for specific crop endpoints.

## URI

🔗	https://earthtechapi.up.railway.app

## Documentation 📄

<h3>📍 API Endpoints</h3>

| Method | Endpoint                  | Description                                                  |
|--------|-------------------------------------|--------------------------------------------------------------|
| ``GET``    | /api/{cultura ou classe}/{id}  | Returns the details of the crop resource or average physical-chemical attributes by soil class.                 |
| ``POST``   | /api/{cultura ou classe}/{id}  | Creates a new zoning resource and average physicochemical attributes on the server.                 |
| ``DELETE`` | /api/{cultura ou classe}/{id}  | Remove the zoning and average physicochemical attributes resource identified by {id}.              |
| ``PUT``    | /api/{cultura ou classe}/{id}  | Updates or replaces the zoning and average physicochemical attributes resource identified by {id}.  |

<h4> 🌱 Classes of physical-chemical attributes </h4>

<details>
<summary> Drenagem (drainage) </summary>

### /api/medias/drenagem

🔗 https://earthtechapi.up.railway.app/api/medias/drenagem

| Method | Route                  | 
|--------|---------------------------|
| ``GET``    | /api/medias/drenagem         | 
| ``POST``   | /api/medias/drenagem/{id}     | 
| ``DELETE`` | /api/medias/drenagem/{id}     | 
| ``PUT``    | /api/medias/drenagem/{id}     | 

</details>

<details>
<summary> Solos (soils) </summary>

### /api/medias/solos

🔗 https://earthtechapi.up.railway.app/api/medias/solos

| Method | Route                  | 
|--------|---------------------------|
| ``GET``    | /api/medias/solos          | 
| ``POST``   | /api/medias/solos/{id}     | 
| ``DELETE`` | /api/medias/solos/{id}     | 
| ``PUT``    | /api/medias/solos/{id}     | 

</details>

</details>

<h4> 🌱 Culturas (crops) </h4>

<details>
<summary> Algodao (cotton) </summary>

### /api/algodao 

🔗 https://earthtechapi.up.railway.app/api/algodao

| Method | Route                  | 
|--------|---------------------------|
| ``GET``    | /api/algodao          | 
| ``POST``   | /api/algodao/{id}     | 
| ``DELETE`` | /api/algodao/{id}     | 
| ``PUT``    | /api/algodao/{id}     | 

</details>

<details>
<summary> Arroz (rice) </summary>

### /api/arroz 

🔗 https://earthtechapi.up.railway.app/api/arroz

| Method | Route                  | 
|--------|---------------------------|
| ``GET``    | /api/arroz          | 
| ``POST``   | /api/arroz/{id}     | 
| ``DELETE`` | /api/arroz/{id}     | 
| ``PUT``    | /api/arroz/{id}     | 

</details>

<details>
<summary> Cafe (coffee) </summary>

### /api/cafe 

🔗 https://earthtechapi.up.railway.app/api/cafe

| Method | Route                  | 
|--------|---------------------------|
| ``GET``    | /api/cafe          | 
| ``POST``   | /api/cafe/{id}     | 
| ``DELETE`` | /api/cafe/{id}     | 
| ``PUT``    | /api/cafe/{id}     | 
</details>

<details>
<summary> Feijao (bean) </summary>

### /api/feijao 

🔗 https://earthtechapi.up.railway.app/api/feijao

| Method | Route                  | 
|--------|---------------------------|
| ``GET``    | /api/feijao          | 
| ``POST``   | /api/feijao/{id}     | 
| ``DELETE`` | /api/feijao/{id}     | 
| ``PUT``    | /api/feijao/{id}     | 

</details>

<details>
<summary> Milho (corn) </summary>

### /api/milho  

🔗 https://earthtechapi.up.railway.app/api/milho

| Method | Route                  | 
|--------|---------------------------|
| ``GET``    | /api/milho          | 
| ``POST``   | /api/milho/{id}     | 
| ``DELETE`` | /api/milho/{id}     | 
| ``PUT``    | /api/milho/{id}     | 

</details>

<details>
<summary> Soja (soy) </summary>

### /api/soja  

🔗 https://earthtechapi.up.railway.app/api/soja

| Method | Route                  | 
|--------|---------------------------|
| ``GET``    | /api/soja          | 
| ``POST``   | /api/soja/{id}     | 
| ``DELETE`` | /api/soja/{id}     | 
| ``PUT``    | /api/soja/{id}     | 

</details>
<hr> </hr>
<h4> 🔺 POST, PUT and DELETE </h4>

- Endpoint: ``/api/{cultura ou classe}/{id}``

**REQUEST**

``` js
{
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

## Response
After a successful request, the API returns the following fields in JSON format for each endpoint:

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
