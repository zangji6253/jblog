mvn clean install -DskipTests
scp target/jblog-0.0.1-SNAPSHOT.jar root@www.coderxx.com:/root/public
ps -aux | less
java -Xms128m -Xmx2048m -jar ./jblog-0.0.1-SNAPSHOT.jar --spring.profiles.active=prod 5 >./logs/"$now"_bidcheck.log &
