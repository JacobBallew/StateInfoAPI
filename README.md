# StateInfo API

StateInfo API is a Spring based REST API for general testing and integration.  
Many projects require or integrate with API's - StateInfo API is intended to provide useful endpoints for testing with, while also providing data that is more than simply "dummy" data.   
\
This API provides data for each US state

## Setup
Build
```shell script
mvn clean install
```
Start
```shell script
java -jar StateInfoApi-1.0-SNAPSHOT-exec.jar
```

## Swagger
host:8080/swagger-ui/index.html#/

## End Points

### State Controller
```
Get all states
/api/v1/states

Get state by name (case in-sensitive)
/api/v1/states?name=Alaska
```
### Debug Controller
```
Get all states
/status
