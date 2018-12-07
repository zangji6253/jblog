mvn clean install -DskipTests
java -jar target/jblog-0.0.1-SNAPSHOT.jar --spring.profiles.active=prod
