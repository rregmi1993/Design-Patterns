Builder pattern is commonly used but hardly design by developer eg StringBuilder, DocumentBuilder, etc 
Pros:
1. You can construct objects step-by-step, defer construction steps or run steps recursively.
2. You can reuse the same construction code when building various representations of products.
3.Single Responsibility Principle. You can isolate complex construction code from the business logic of the product.

Cons:
1.The overall complexity of the code increases since the pattern requires creating multiple new classes.