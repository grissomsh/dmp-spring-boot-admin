FROM airdock/oracle-jdk:latest

MAINTAINER Grissom Wang <grissom.wang@daocloud.io>

ENV TIME_ZONE Asia/Shanghai

RUN echo "$TIME_ZONE" > /etc/timezone

WORKDIR /app

RUN apt-get update

COPY target/system-admin-service-0.0.1-SNAPSHOT.jar /app/system-admin-service.jar

EXPOSE 8080

CMD [ "java", "-jar", "system-admin-service.jar" ]