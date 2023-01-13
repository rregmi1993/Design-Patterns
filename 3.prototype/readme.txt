-Prototype pattern refers to creating duplicate object while keeping performance in mind. This type of design pattern comes under creational pattern as 
this pattern provides one of the best ways to create an object.

-This pattern involves implementing a prototype interface which tells to create a clone of the current object. This pattern is used when creation of object directly 
is costly. 
	For example - an object is to be created after a costly database operation. We can cache the object, returns its clone on next request and update the database as and when needed thus reducing database calls.
		   - java.lang.object#clone()

- avoids the subclassing abd typically does not use the 'new' keyword instead its cloned form orginal object.

- usually implemented with the Registery 

-In shallow copy, new memory allocation never happens for the other entities, and the only reference is copied to the other entities. 
-In the deep copy, a new memory allocation happens for the other entities, and reference is not copied to the other entities. Each entity has its own independent reference.


