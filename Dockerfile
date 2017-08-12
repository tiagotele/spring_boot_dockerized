FROM openjdk:8

VOLUME /home

WORKDIR /home

COPY target/demo-https-0.0.1-SNAPSHOT.jar /home/demo-https-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","/home/demo-https-0.0.1-SNAPSHOT.jar"]
