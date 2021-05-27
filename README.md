# StateInfo API

StateInfo API is a REST api for testing and integration.  
Many projects require or integrate with API's - StateInfo API provides a simple and easy way to test and develop.  
\
This API provides data for each US state.
\
Runs on port <b>8070</b> to avoid conflicts
## Setup
Build
```shell script
mvn clean install
```
Start
```shell script
java -jar StateInfoApi-1.0-SNAPSHOT-exec.jar
```
## Example End Points

```python
localhost:8070/status
localhost:8070/getAll
localhost:8070/getStateByName?stateName=North Carolina
localhost:8070/getStateByName?stateName=Arizona