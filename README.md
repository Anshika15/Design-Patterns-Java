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
