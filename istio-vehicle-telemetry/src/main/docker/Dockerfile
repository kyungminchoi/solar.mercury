FROM maven:3.5-jdk-8 as BUILD

ENV HOME=/home/usr/app

RUN mkdir -p $HOME

WORKDIR $HOME

ADD pom.xml $HOME

RUN mvn verify clean --fail-never

ADD . $HOME

RUN mvn package -DskipTests

FROM openjdk:8u131-jdk-alpine

EXPOSE 8080

WORKDIR /usr/local/bin/

COPY --from=BUILD /home/usr/app/target/telemetry-0.0.1-SNAPSHOT.jar webapp.jar

CMD ["java", "-Xmx50m", "-jar","webapp.jar"]
