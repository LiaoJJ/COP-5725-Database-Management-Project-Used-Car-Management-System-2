






#FROM openjdk:8-jre-alpine
#
##ADD jdk-8u271-linux-x64.tar.gz /usr/local
#COPY target/boot-0.0.1-SNAPSHOT.jar /app.jar
#COPY ["start.sh", "/start.sh"]
#RUN ["chmod", "+x", "/start.sh"]
#
##ENV JAVA_HOME /usr/local/jdk1.8.0_271
##ENV PATH $PATH:$JAVA_HOME/bin
#
#RUN apk update && apk add bash
#
#
#
#EXPOSE 8181
#
##CMD ["mysqld", "&&", "/start.sh"]
##CMD ["mysqld"]
##CMD ["sh", "-c", "mysqld && java -jar /app.jar"]
#
##CMD ["java", "-jar", "/app.jar"]
#
#CMD ["/start.sh"]












#FROM mysql:5.7
#
#ADD jdk-8u271-linux-x64.tar.gz /usr/local
#COPY target/boot-0.0.1-SNAPSHOT.jar /app.jar
#COPY /archive/start.sh /docker-entrypoint-initdb.d/
##COPY /abc.sh /
#RUN ["chmod", "+x", "/docker-entrypoint-initdb.d/start.sh"]
##RUN ["chmod", "+x", "/abc.sh"]
#RUN ["chmod", "+x", "/app.jar"]
#
#ENV JAVA_HOME /usr/local/jdk1.8.0_271
#ENV PATH $PATH:$JAVA_HOME/bin
#ENV MYSQL_ROOT_PASSWORD 12345678
#ENV MYSQL_DATABASE Mybatis
#
##ENV HEROKU_PORT "${PORT:8181}"
#RUN echo -e '#!/bin/sh \n sleep 3 \n java -jar /app.jar --server.port=${PORT:8181}' > /abc.sh
#RUN ["chmod", "+x", "/abc.sh"]
#
#COPY /archive/my.cnf /etc/mysql/my.cnf
#
#EXPOSE 3306
#EXPOSE 8181
#
#CMD ["mysqld"]





FROM openjdk:8-jre-alpine

COPY target/boot-0.0.1-SNAPSHOT.jar /app.jar

EXPOSE $PORT

CMD ["java", "-Xss512k", "-Xmx256m","-jar", "/app.jar", "--server.port=${PORT:8181}"]