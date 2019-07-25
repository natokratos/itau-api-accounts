FROM centos:latest

RUN yum install java-1.8.0-openjdk.x86_64 -y

ADD itau-api*.jar /root/itau-api-accounts.jar

EXPOSE 9200

ENTRYPOINT [ "bash", "-c", "java -jar /root/itau-api-accounts.jar" ]