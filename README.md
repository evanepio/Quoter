# Quoter
Example Microservice configured by Spring Cloud Config

This assumes a Spring Cloud Config server running on port 8888, like this one using the defaults:

https://github.com/evanepio/ConfigThinger

If you use the defaults for the ConfigThinger server, it'll pull confurations from:

https://github.com/evanepio/example-scc-repo

A simple gradle command is all you need to run:

```
./gradlew bootRun
```

You can test what this service can do with the following curl command:

```
curl --request GET --url http://localhost:8027/quotes
```

And that's all it does.
