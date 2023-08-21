FROM openjdk:17-alpine

EXPOSE 8080

ADD target/Kursovoy-perevod-deneg-0.0.1-SNAPSHOT.jar-0.0.1-SNAPSHOT.jar moneyapp.jar

CMD ["java", "-jar" ,"moneyapp.jar"]