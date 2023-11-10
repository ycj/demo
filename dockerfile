FROM amazoncorretto:17.0.8-alpine

ENV TZ Asia/Shanghai

WORKDIR /opt

ADD ./build/libs/sok-0.0.1-SNAPSHOT.jar  /opt

EXPOSE 8080

ENTRYPOINT java -jar sok-0.0.1-SNAPSHOT.jar
