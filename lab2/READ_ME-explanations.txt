Key concepts of LAB2


2.1 
Definitions:
Servlet is a generic interface and the HttpServletis an extension of that interface(the most used type of Servlets).
Servlet Container is a part of the usual set of services that we can find in Java Application Server.

Work:
First we decide what application server will be used during this lab work. We will be using Apache Tomcat v9.
After downloading it, the startup scripts that id inside the bin folder, should be opened in order for server to start runing.
To be sure that the server is running correctly, we are giving command with specified port in it, and after, going to browser 
and opening localhost:port_number that we have indicated.

The Tomcat installation includes Manager app, which use is to control the server. In order to use it we need to 
register at least one role.

Next thing is creating maven-based web application that will be deployed into Tomcat. So we open our IDE, go to 
create new maven project and add archetype.
archetypeGroupId=org.codehaus.mojo.archetypes
archetypeArtifactId=webapp-javaee7
archetypeVersion=1.1
After running the project the war file should be produced. Then we go to manager app and deploy the war file.
Now the app should be listed and if we go to the specified port it shoud print Hello World.

Next thing to do is to add basic servlet to the project that I am creating. The name of the user should be passed
as parameter in the HTTP request and should print a message. In order to do that I am using the link indicaded in the lab
work paper. I am using @WebServlet Annotation without making any entry in web.xml. Container will automatically register my servlet
in runtime. After that I am doing some changes in the code, such as adding my pesonal message that will print "Hello, Ana. Welcome".
This message will be the response that will be passed throug the printwriter. 

2.2
In this step I will work with embedded jetty server.Jetty can be used in standalone mode, 
but the main purpose behind building jetty was so that it could be used inside an application instead of deploying an application on jetty server.

Generally you write a web application and build that in a WAR file and deploy WAR 
file on jetty server. In Embedded Jetty, you write a web application and instantiate
jetty server in the same code base.

To start, first step is creating new maven project, modify some dependencies, and then creating new java class named EmbeddedJettyExcample, 
where the code will be writen. This will run on port 8680.

2.3
Working with spring boot.

Definitions:
Spring Bootis a rapid application development platform built on top of the popular Spring Framework.
SpringBoot is a convention-over-configuration addition to the Spring platform,useful to get started with minimum effort and create stand-alone, production-grade applications.
The Maven Wrapper is an excellent choice for projects that need a specific version of Maven (or for users that don't want to install Maven at all). Instead of installing many 
versions of it in the operating system, we can just use the project-specific wrapper script.
@EnableAutoConfiguration: enable Spring Boot’s auto-configuration mechanism

@ComponentScan: enable @Component scan on the package where the application is located

@SpringBootConfiguration: enable registration of extra beans in the context or the import of additional configuration classes. An alternative to Spring’s standard @Configuration that aids configuration detection in your integration tests.
Web starter in SpringBoot is used for developing the REST service; it provides easy use of libraries like Spring MVC, Tomcat and Jackson – a lot of dependencies for a single application.
Spring Boot starters can help to reduce the number of manually added dependencies just by adding one dependency.
The Test starter: For testing usually the following set of libraries are used: Spring Test, JUnit, Hamcrest, and Mockito. 
All those libraries can be included manually, but SpringBoot provide a starter that can automatically include these libraries.
Thymeleaf starter in SpringBoot is used to build MVC web applications using Thymeleaf views.

Using Spring Initializer we will make three different projects. First one is downloading demo project. It will work on port different than 8080 because that one is already used.
After running the project it will shoe white lebel error.
Second project is to build a simple app to serve web content. In this project Thymeleaf starter should be included as dependencie. The purpose is to do controllers and to understand 
how its working.

The last project in this step is to create Rest endpoint which will listen to HTTP request, and answer with JSON result. Here we will use @RestCOntroller.

2.4
This step is creating project that will implement everything used in previous steps. It will be done with spring initializer. As a result it shoud generate random quotes.
In QuoteGreetings class, I am having @RestController. Here are defined quotes and the movies from which the quotes are. With getMapping it will connect to server and it will
show up random quote using /api/quote. If we use /api/shows it will show up the shows.
In quote class, I am diffining the quotes and the shows. 