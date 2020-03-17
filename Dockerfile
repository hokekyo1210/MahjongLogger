FROM debian:9

RUN apt-get update && apt-get install -y default-jre && apt-get clean && rm -rf /var/lib/apt/lists/*

COPY ./bin/ /etc/init.d/springboot/

ENV SPRINGBOOT_JAR_PATH /etc/init.d/springboot/demo-0.0.1-SNAPSHOT.jar

ENTRYPOINT java -jar ${SPRINGBOOT_JAR_PATH}