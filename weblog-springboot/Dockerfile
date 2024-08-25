FROM openjdk:8

ADD weblog-web/target/weblog-web-0.0.1-SNAPSHOT.jar weblog-web.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","weblog-web.jar"]