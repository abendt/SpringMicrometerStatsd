Spring Boot / StatsD
--------------------

Start Docker Containers
```shell
$ docker-compose up
```

Start the application
```shell
$ ./gradlew :app:bootRun
```

Access Graphite WebUi: http://localhost:8000/

* there should be some Spring Boot specific metrics under the path "Metrics/Stats/jvm" and/or "Metrics/Stats/gauges"
* there should also be one custom metric under the path "Metrics/Stats/gauges/demo"

## external Links

* https://docs.spring.io/spring-boot/docs/2.0.x/reference/html/production-ready-metrics.html#production-ready-metrics-export-statsd
* https://github.com/statsd/statsd