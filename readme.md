
# Node Management API

This is a Spring Boot application that provides an API for managing nodes. It allows you to create and retrieve nodes using RESTful endpoints.

## Prerequisites

- Java Development Kit (JDK) 8 or higher
- PostgreSQL database

## Database Configuration

1. Create a new PostgreSQL database for the application.

2. Open the `src/main/resources/application.properties` file and update the following properties with your database credentials:

   ```properties
   spring.datasource.url=jdbc:postgresql://localhost:5432/your_database_name
   spring.datasource.username=your_username
   spring.datasource.password=your_password
   ```

Replace `your_database_name`, `your_username`, and `your_password` with your actual database details.

## Building the Application

1. Open a terminal or command prompt and navigate to the project's root directory.

2. Run the following command to build the application using the Gradle wrapper:

   ```bash
   ./gradlew build
   ```

   This command will download the required dependencies, compile the source code, and package the application into an executable JAR file.

## Running the Application

1. After the build process is complete, navigate to the `build/libs` directory:

   ```bash
   cd build/libs
   ```

2. Run the following command to start the application:

   ```bash
   java -jar apiservice-0.0.1-SNAPSHOT.jar
   ```

   Replace `apiservice-0.0.1-SNAPSHOT` with the actual name of the generated JAR file.

3. The application will start running on `http://localhost:8080`.

OR

1. Run the following command in the main folder.
 ```bash
   ./gradlew run
   ```


## API Endpoints

The following API endpoints are available:

- `POST /addNode`: Create a new node. Send a JSON payload in the request body with the node details.

- `GET /nodes`: Retrieve a list of all nodes.
- `GET /getNodeById/{Id} `: Retrieve a node by its Id.

## Example Usage

To create a new node, send a POST request to `http://localhost:8080/addNode` with the following JSON payload:

```json
{
  "nodeId": "T300_001",
  "nodeName": "Node 1",
  "description": "Sample text",
  "memo": "Sample text",
  "nodeType": "Transponder",
  "parentNodeGroupName": "Subgroup NE_1",
  "parentNodeGroupId": "Sample text",
}
```

To retrieve a list of all nodes, send a GET request to `http://localhost:8080/nodes`.

## Troubleshooting

If you encounter any issues during the build or execution process, please ensure that:

- You have the required prerequisites installed (JDK and PostgreSQL).
- The database configuration in the `application.properties` file is correct.
- The database server is running and accessible.
- The port `8080` is not being used by any other application.

If the problem persists, please check the application logs for any error messages or exceptions.