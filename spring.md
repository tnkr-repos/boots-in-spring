- To create a Spring project use Spring Initializr - start.spring.io
    - Released versions of Spring are the one without any suffix (such as
    SNAPSHOT or RC1)
    - While creating a project Group ID is required - which is analogous to
    Package Name; and a Artifact ID - which is analogous to Class name
    - Maven is the Java Dependency Management Tool (for downloading
    dependencies such as Spring into our project)

- Project Structure:   
    - src/main/java - Contains source files
    - src/main/resources - Contains all configuration files
    - src/test/java - Contains all test code

- `var` allows for Type Inference. It allows the compiler to infer the type of
the variable based on the type of the value assigned. This is used to improve
code readability by reducing boilerplate code

- Coupling - The amount of change we have to make to make something work. If we
want to run different games run, we would like to just pass the game to be run
as a parameter to the `run` function (loosely coupled) instead of having it
written in the constructor and hard coded (tightly coupled). This would prevent
us from having to change the GameRunner class everytime when we want to run a 
different game
    - Tight coupling - When one class is heavily dependent on another class,
    which makes it difficult to change one class without making changes to the
    other. It makes the objects hard to 

- Interface represents the set of common actions that can be performed by a set
of classes (or objects thereof). By introducing a GamingConsole interface, we
are removing the tight coupling of GameRunner class with the particular game
that we are playing, and so if we want to change the game we don't have to make
changes to the GameRunner class anymore. We can now say that the GameRunner
class is loosely coupled with the games

- We are creating a game object (object for the GamingConsole interface), a
gameRunner object (object for the GameRunner class) and passing the game object
as a dependency to gameRunner object (dependency injection / wiring of
dependencies). Currently we are doing this manually, but Spring can handle this
for us (which becomes crucial when we are dealing with lots of dependencies)

- We want to create a Spring context, and configure the beans that we want
Spring to manage. We can define a Spring Configuration class using the
@Configuration annotation, and anything we want Spring to manage should be
defined in this class (all the Beans). This Configuration class will declare
one or more bean methods (methods to handle Spring beans), and Beans themselves
(the objects that Spring will manage). We would like to launch an Application
context with a particular Configuration using AnnotationConfigApplicationContext
The methods that would manipulate Spring Beans have to have @Bean annotation
above them