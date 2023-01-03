only one instance created
Guarantees control of a resource
Lazily Loaded
Ex-> Runtime, Logger, Spring Beans, Graphic Manager(Graphic API)


Design Consideration:
1. Class is responsible for lifecycle 
2. static in natures(static does not guarantee the thread safe)
3. Needs to be thread safe
4. private instance 
5. private constructor
6. No Parameters required for construction(if you have parameters then it will be the factory pattern which will violate singleton design pattern)

Drawback:
1.Since Singleton does not expose an interface and have private constructor as well as private memebr variables -> difficult to unit test