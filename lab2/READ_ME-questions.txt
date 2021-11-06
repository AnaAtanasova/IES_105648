1.What are the responsibilities/services of a “servlet container”?
The basic service of a servlet container is using java to dynamically generate the web page on the server side. The servlet container is a part of a web server
that interacts with the servlets. It provides the servlet to easily access the properties(headers and parameters) of the HTTP request. Other services are: 
creating instance of the servlet and calls its init() method to initialize it, constructs a request object to pass to the servlet, it constructs a response object for the servlet,
it invokes the servlet service() method, it calls the destroy() method of the servlet to discard it when appropriate.

2.Explain, in brief, the “dynamics” of Model-View-Controller approach used in Spring Boot to serve web content. 
(You may exemplify with the context of the previous exercises.)

The Spring Web model-view-controller approach is designed around a DispatcherServlet that dispatches requests to handlers,
with configurable handler mappings, view resolution, locale and theme resolution as well as support for uploading files. The default handler
is based on the @Controller and @RequestMapping annotations, offering a wide range of flexible handling methods. With the introduction of Spring 3.0,
the @Controller mechanism also allows you to create RESTful Web sites and applications, through the @PathVariable annotation and other features.



3.Inspect the POM.xml for the previous SpringBoot projects. What is the role of the “starters” dependencies?

Spring Boot provides a number of starters that allow us to add jars in the classpath. Spring Boot built-in starters make development easier and rapid. 
Spring Boot Starters are the dependency descriptors.

In the previous SpringBoot projects in this lab work, I was using web starter, thymeleaf starter and test starter. 
Web starter in SpringBoot is used for developing the REST service; it provides easy use of libraries like Spring MVC, Tomcat and Jackson – a lot of dependencies for a single application.
Spring Boot starters can help to reduce the number of manually added dependencies just by adding one dependency.
The Test starter: For testing usually the following set of libraries are used: Spring Test, JUnit, Hamcrest, and Mockito. 
All those libraries can be included manually, but SpringBoot provide a starter that can automatically include these libraries.
Thymeleaf starter in SpringBoot is used to build MVC web applications using Thymeleaf views.



4.Which annotations are transitively included in the @SpringBootApplication?

Many Spring Boot developers like their apps to use auto-configuration, component scan and be able to define extra configuration on their "application class". 
A single @SpringBootApplication annotation can be used to enable those three features, that is:

@EnableAutoConfiguration: enable Spring Boot’s auto-configuration mechanism

@ComponentScan: enable @Component scan on the package where the application is located

@SpringBootConfiguration: enable registration of extra beans in the context or the import of additional configuration classes. An alternative to Spring’s standard @Configuration that aids configuration detection in your integration tests.


5.Search online for the topic “Best practices for REST APIdesign”. From what you could learn, select your “top 5”practices,and briefly explain them in you own words.
a)Use nouns instead of verbs in endpoint paths
Instead of using verbs as endpoint paths, we should use nouns that represent the entity of the endpoint that we’re retrieving or manipulating as the pathname.
This is because the HTTP request method already has the verb. Having verbs in our API endpoint paths isn’t useful and it makes it unnecessarily long since 
it doesn’t convey any new information. The chosen verbs could vary by the developer’s whim. For instance, some like ‘get’ and some like ‘retrieve’, 
so it’s just better to let the HTTP GET verb tell us what and endpoint does.

b)Handle errors gracefully and return standard error codes
To eliminate confusion for API users when an error occurs, we should handle errors gracefully and return HTTP response codes that indicate what kind of error occurred.
This gives maintainers of the API enough information to understand the problem that’s occurred. We don’t want errors to bring down our system, so we can leave them 
unhandled, which means that the API consumer has to handle them. So if the HTTP response tell what kind of error occurred, the user can see exactly what kind of problem 
is and can fix it.

c)Maintain good security practices
Most communication between client and server should be private since we often send and receive private information. Therefore, using SSL/TLS for security is a must.
A SSL certificate isn’t too difficult to load onto a server and the cost is free or very low. 
There’s no reason not to make our REST APIs communicate over secure channels instead of in the open.
People shouldn’t be able to access more information that they requested. For example, a normal user shouldn’t be able to access information of another user. 
They also shouldn’t be able to access data of admins. To enforce the principle of least privilege, we need to add role checks either for a single role, 
or have more granular roles for each user.

d)Versioning our APIs
We should have different versions of API if we’re making any changes to them that may break clients. 
The versioning can be done according to semantic version like most apps do nowadays.This way, we can gradually phase out old endpoints instead
of forcing everyone to move to the new API at the same time. The v1 endpoint can stay active for people who don’t want to change,
while the v2, with its shiny new features, can serve those who are ready to upgrade. This is especially important if our API is public. 
We should version them so that we won’t break third party apps that use our APIs.
Versioning is usually done with /v1/, /v2/, etc. added at the start of the API path.

e)Cache data to improve performance
We can add caching to return data from the local memory cache instead of querying the database to get the data every time we want to retrieve 
some data that users request. The good thing about caching is that users can get data faster. However, the data that users get may be outdated. 
This may also lead to issues when debugging in production environments when something goes wrong as we keep seeing old data.