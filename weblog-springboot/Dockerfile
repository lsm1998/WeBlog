FROM openjdk:8

RUN mkdir -p /app/blog

WORKDIR /app/blog

ADD weblog-web/target/weblog-web-0.0.1-SNAPSHOT.jar weblog-web.jar

ADD weblog-web/src/main/resources/ip2region.xdb ip2region.xdb

EXPOSE 8080

ENTRYPOINT ["java","-jar","weblog-web.jar"]