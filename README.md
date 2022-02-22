# Distributed Tracing System (Spring Cloud Sleuth + Zipkin)

Start Zipkin: 
```
docker run -d -p 9411:9411 openzipkin/zipkin
```

Run services
```
./gradlew user-service:bootRun 
./gradlew bonus-service:bootRun 
./gradlew notification-service:bootRun 
```

Make a request
```
curl -L -X POST 'http://localhost:8080/user/register' \
-H 'Content-Type: application/json' \
--data-raw '{}'
```

Open http://localhost:9411