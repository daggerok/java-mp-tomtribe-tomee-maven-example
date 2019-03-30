# Tomtribe TomEE MicroProfile
Tomtribe TomEE MicroProfile maven example

## TomEE 8 (default)

```bash
./mvnw package tomee:start
# or: 
# ./mvnw -P tomee-8 # or: ./mvnw -P tomee-8 tomee:exec
# java -jar target/java-mp-tomee-example-1.0-SNAPSHOT-exec.jar

http :8080/api/v1
http :8080/api/v1/hello

./mvnw tomee:stop
```

## TomEE 7

```bash
./mvnw -P tomee-7

java -jar target/java-mp-tomee-example-1.0-SNAPSHOT-exec.jar
# or: ./mvnw -P tomee-7 tomee:exec

http :8080/api/v1
http :8080/api/v1/hello
```

links:

* [Tomitribe](https://www.tomitribe.com/)
* [Tomitribe blog](https://www.tomitribe.com/blog/)
* [Tomitribe category](https://www.tomitribe.com/blog/category/tomitribe/)
* [JakartaEE category](https://www.tomitribe.com/blog/category/jakarta-ee/)
* [TomEE category](https://www.tomitribe.com/blog/category/apache-tomee/)
