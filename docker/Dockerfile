# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.
FROM java:8
COPY demo-0.0.1-SNAPSHOT.jar  demo
ADD demo-0.0.1-SNAPSHOT.jar hello-world-app.jar
EXPOSE 8080
 
ENTRYPOINT  ["java","-jar","/hello-world-app.jar"]

