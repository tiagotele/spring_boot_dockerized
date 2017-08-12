# Sample Spring Boot with Docker

Sample application done for study and learn about Docker.

1. Build the project:
`mvn clean install`

2. Build a docker image

`docker build -t <IMAGE_NAME> .`

3. Then execute a Docker run

`docker run -it -p 8080:8080 <IMAGE_NAME>`

4. Check the result of /hello endpoint:
`curl localhost:8080/hello`

It should return a message with "Hello world Spring"

That's all! 