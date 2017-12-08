FROM anapsix/alpine-java
COPY target/springboot-0.0.1-SNAPSHOT.jar ./springboot.jar
EXPOSE 8080
ENTRYPOINT java -jar springboot.jar 
