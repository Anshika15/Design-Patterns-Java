# Design Patterns in Java

### 1. Creational Patterns:-
      - used to solve common problems when creating objects.
      - simplify the creation of complex objects.
      - Improve overall readability of code.
      
      Types of Creational Patterns:- 
      
      i) Builder Pattern:- 
                       When to use:- - when dealing a complex object that requires alot of parameters.
                                     - when trying to prevent mistakes from creating a complex object.
                                     - when trying to avoid unreadable, big constructors that are sometimes required for complex creation.
                       
      ii) Factory Pattern:- 
                      Advantages:- - Hides the internal logic of creating objects.
                                   - Enables the programmer to add new different objects of the same type.
                      Disadvantages:- - The complexity of this pattern tends to be high.
                          - Cannot be refractored into.
                          
      iii) Abstract Factory Pattern:- It contains a super factory which creates object factories.
      
      iv) Singleton Pattern:- - Prevents the instantiation of a class more than once.
                              - provides single access to an object.
                              use cases:- logger, thread pool, cache, Report.
                             
      v) Prototype Pattern:- It is used whenever object is very expensive to create.
                            - creating new objects with clone(), not new()
                            - Makes use of an interface.
                            - shallow cloning, deep cloning (Shallow cloning copies only instance variables of an object whereas Deep cloning copies the other object references as well)
                            - objects are still unique even if they are copied.
                     Disadvantages:- - usually comes with other design patterns.
                                     - Increases complexity for creating a deep copy.
      vi) Object Pool Pattern:- The pool will allocate a predefined number of objects and the client will use these objects.
                    Advantages:- - Objects are cached.
                                 - Enforces objects reusability.
                    Disadvantages:- - Complexity is high
                                    - Tends to rely on other patterns.
                                    - Low popularity.

### 2. Structural Patterns:- 
      It provides a common solution to common issues realted to object structures and features of those factors is that they rely on concepts of inheritance, polymorphism
      
      Types of Structural Patterns:-
      
      i) Adapter Pattern:- This pattern is generally used when there is a need to combine the capabilities of the interface.
            use cases:- - In case of legacy applications.
                        - In case of converting an interface into another.
                        - in case of translating a client's requests for a website.

            examples of usage in Java API:-
                        - Arrays.asList();
                        - I/O streams
                     
      ii) Bridge pattern:- It aims to separate a large structure of classes into two heirarchy.
            use cases:- - when having a complex structure of classes with similar implementations.
                        - when want to impose the same implementation for multiple objects.
                        - when providing a map b/w orthogonal class hierarchies.

      iii) Filter pattern:- It enables us to define filters for our objects.
      
      iv) Composite pattern:- 
             features:- - Designed on tree structure.
                        - Root level is the Component.
                        - Leaf objects implement the Component.
                        - Composite perform the same operations as the leafs.
                        - Composite knows about the child objects.
                        
       v) Decorator pattern:-
             features:- - Decorates a base object with multiple features.
                        - Adheres to the single responsibility principle.
                        - uses OOP principles.
                        
       vi) Facade pattern:- The pattern is used for providing an interface to the client while hiding all the complexities of a system.
       
       vii) Flyweight pattern:- It is used for memory optimization purposes. The design pattern is usually chosen whenever there is a need to reduce the number of created objects.
                              - It has capability to optimize object structure.
                           
       viii) Proxy pattern:- It is basically a class that serves as an interface between a client application and another object.
                  usage:- - when creating a wrapper to cover main's object complexity.
                          - when creating a security layer for preventing unauthorized access.
                  weakness:- - It can  have a single proxy.
                             - creates complexity.
             
