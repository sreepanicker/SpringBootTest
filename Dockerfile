# Sample java Program
FROM sreepanicker/java:8
EXPOSE 8081
RUN mkdir /var/proj
COPY SpringBootFirst-1.0-SNAPSHOT.jar /var/proj
WORKDIR /var/proj
ENV SREE_VALUE=Hello
CMD java -jar SpringBootFirst-1.0-SNAPSHOT.jar $SREE_VALUE
