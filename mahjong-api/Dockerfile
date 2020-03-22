FROM debian:9

RUN apt-get update && apt-get install -y default-jre && apt-get clean && rm -rf /var/lib/apt/lists/*

COPY ./target/ /etc/init.d/springboot/

ENV SPRINGBOOT_JAR_PATH mahjong-api-0.0.1-SNAPSHOT.jar

ENTRYPOINT java -jar /etc/init.d/springboot/${SPRINGBOOT_JAR_PATH}