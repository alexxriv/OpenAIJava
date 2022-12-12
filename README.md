OpenAIJava: Java OpenAI API
==================================


OpenAIJava is a lightweight, highly modular, reactive, type safe Java and
Spring Library for working with [OpenAI API](https://beta.openai.com/docs/api-reference). 

This allows you to work with the OpenAI models, without the additional overhead of having to write your own
integration code for the platform.


Features
--------

-   Complete Implementation of the 20 OpenAI endpoints
-   Implementation of request objects to easily create requests without interacting with JSON objects at all
-   Implementation of response objects to easily interact with API responses.
-   Comprehensive integration tests demonstrating a number of the above scenarios

Pending
--------
- Utils library with some frequent used constant variables. For example, the list of available models
- CreateImageEditRequest and CreateImageVariationRequest contains parameter `response_format` which should be renamed to match Java standards. (JsonProperty won't work since POJO isn't sent as json)


It has four runtime dependencies:


-   [OpenFeign](https://spring.io/projects/spring-cloud-openfeign) for its
    reactive-functional API
-   [OKHttp](https://square.github.io/okhttp/)
    for HTTP connections
-   [Jackson Core](https://github.com/FasterXML/jackson-core) for fast
    JSON serialisation/deserialization
-   [Lombok](https://projectlombok.org/) for automatation of methods and logging

It also uses
[JUnit](https://junit.org/junit5/) and [Spring-test-starter](https://docs.spring.io/spring-boot/docs/1.5.7.RELEASE/reference/html/boot-features-testing.html) (Only test scope)


QuickStart
---------

Use our [Maven](https://github.com/web3j/web3j-maven-plugin) 
plugin that will provide the OpenAIClient object.

Maven
-----

Java:

```xml
<dependency>
  <groupId>org.web3j</groupId>
  <artifactId>core</artifactId>
  <version>4.8.7</version>
</dependency>
```

Use the @EnableOpenAIAPI annotation in your main class

```java
@EnableOpenAIApiClient
@SpringApplication
public class SomeApplication{
    
    public static void main(String[] args){
        SpringApplication.run(SomeApplication.class, args)
    }
}
```

Autowire an OpenAIClient object

```java
@Autowired
OpenAIClient openAIClient;
```

Create a method calling an endpoint
```java
void listModels(){
    ListModelsResponse response = openAIClient.listModels();
    log.info(response);
}
```

License
------
Apache 2.0