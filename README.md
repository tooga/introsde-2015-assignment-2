## Assignment 2 for Introduction to Service Design and Engineering -course of UNITN

### General info of the assignment
In the assignment I worked alone.
The server for my assignment is running in [https://introsde-assignment2.herokuapp.com/sdelab](https://introsde-assignment2.herokuapp.com/sdelab)

### Supported REST endpoints
#### **GET**
/person
- Get all persons

/person/{id}
- Get a person with its id

/person/{id}/{measureType}
- Get all the specified measures from a person specified with id

/person/{id}/{measureType}/{mid}
- Get a single measure specified with measure id, measure type and person id

/person?measureType={measureType}&min={min}&max={max}
- Return all persons that have measure that match [min,max] values

/person/{id}/{measureType}?before={beforeDate}&after={afterDate}
- Return all measures of person specified by id that match the given before and after dates
- date format: YYYY-MM-DD

/measureTypes
- Get all the measure types that are supported

#### **POST**
/person
- Create a new person

/person/{id}/{measureType}
- Create a new measure for person specified by id

#### **PUT**
/person/{id}
- Update a person specified by id

/person/{id}/{measureType}/{mid}
- Update a measure specified by measure id, measure type and person id

#### **DELETE**
/person/{id}
- Delete a person specified by id


### What this is about?
This assignment is about RESTful services. In the assignment I have created a REST service that is running on Heroku and a client that is making requests to the server.

### Folder and file structure
The root folder contains mainly setup and configuration files and the database file. The src-package consist of all the needed java files for the program in addition with the persistence.xml-file. WebContent-folder contains files for server setup, such as web.xml.

### What do each file do?
The ivy.xml and build.xml files in root folder are for installing all the dependencies and running the program. The lifecoach.sqlite is the database file and app.json and Procfile in root folder contains setups for Heroku. Log-files contains logs from client-server requests.

The src-package contains all the java files. The introsde.rest.ehealth-package contains server configuration files, introsde.rest.ehealt.client contains the client, introsde.rest.ehealth.dao contains file for interacting with database, introsde.rest.ehealt.model contains the model files and introsde.rest.ehealth.resources contains the resource-handling -files for the uri paths.

### How to run the program?
The program uses ant build-tool for running the program. To execute the program, please open the terminal and run the following command in the root directory of the program:

	ant execute.client

The command installs all dependencies and executes the client. The client sends requests to the remote server running on Heroku and prints the results to the terminal and also saves them to logs in the root folder.	
