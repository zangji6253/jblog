mvn clean install -DskipTests
scp target/jblog-0.0.1-SNAPSHOT.jar root@www.coderxx.com:/root/public
java -jar target/jblog-0.0.1-SNAPSHOT.jar --spring.profiles.active=prod
