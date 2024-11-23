FROM openjdk:23-jdk

ADD target/ticket-0.0.1.jar /app.jar
#ADD ./javaagent.jar /javaagent.jar

EXPOSE 8080
ENTRYPOINT java -jar /app.jar
#                -Dotel.traces.exporter=logging \
#                -Dotel.metrics.exporter=logging \
#                -Dotel.logs.exporter=logging \

