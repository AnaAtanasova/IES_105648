A)Explain the differences between the RestController and Controller components used in different parts of this lab.

The @Controller is a common annotation that is used to mark a class as Spring MVC Controller. It creates a map of the model
objects and finding a view.
@RestController is a special controller used in RESTFul web services and the equivalent of @Controller + @ResponseBody. It
returns the object and its data is directly written into HTTP response.
The @Controller annotation indicates that the class is a "Controller" like a web controller while @RestController annotation 
indicates that the class is a controller where @RequestMapping methods assume @ResponseBody semantics by default i.e. servicing REST API.
The @Controller is a specialization of @Component annotation while @RestController is a specialization of @Controller annotation.
When you mark a class as @RestController then every method is written a domain object instead of a view. This is not a case with @Controller.
Also if you use @RestController, you dont need to use @ResponseBody on every handler method.

C)Explain the annotations @Table, @Colum, @Id founding the Employee entity.

@Table- every entity class maps a database table with the same name in the database, but you can customize that by using the @Table annotation through
using the name, schema and catalog attributes. The name will allow you to change the name of the database table, the schema specifies the name of the database
schema in which the table is located, while the catalog descriebes the name of the database catalog that stores the metadata informarion of the table.

@Column- this annotation enables us to customize the mapping between the entity attribute and the databse column. It has few attributes such as name, updatable and insertable.

@Id- this annotation is used for specifing the primary key attribute for each entity.

D)Explain the use of the annotation @AutoWired (in the Rest Controller class).
The @Autowired annotation provides more fine-grained control over where and how autowiring should be accomplished. The @Autowired annotation can be 
used to autowire bean on the setter method just like @Required annotation, constructor, a property or methods with arbitrary names and/or multiple arguments.



