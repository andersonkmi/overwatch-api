# Overwatch very simple API

This API is a very simple version of the real Overwatch API for fun purposes.

## History

0.0.1 - Initial version 

## Available Endpoints

The following endpoints are available:

- /api/heros - Lists all heros
- /api/heros/{hero_id} - retrieves hero data
- /api/heros/{hero_id}/abilities - Lists a hero abilities
- /api/abilities/ - List all abilities
- /api/abilities/{ability_id} - Retrieves an ability data

## Building and running

In order to build the application, just run the following command:
```
mvn clean package
```

This will clean and perform a full build of the application. In order to run it:
```
cd target
java -jar owapp-0.0.1.jar
```

## URL

Once the application is up and running in your machine, it can be accessed using the 
address:
```
http://localhost:8080
``` 
and then concatenate the endpoint you wish to use.

## Observations and improvements
- Due to time restrictions to execute this test, the calls to Overwatch API is not
handling pagination of the results.
