## Singleton Pattern



## Factory Pattern
In this pattern, we define an interface or abstract class for creating an object and let the subclasses decide which class to instantiate. This design pattern can be applied in a situation where you have a set of component classes but don't know exactly which one you need to instantiate until runtime.

It promotes loose-coupling and makes easy for testing, and helps on scaling.

### Usage of Factory Design pattern
 1. When a class depends on an external source(class) but does not know which one yet.
 2.   

Real world examples:

App-1: [A sample app for calculating electric bill](http://www.javatpoint.com/factory-method-design-pattern).


Case-1: Let's assume a drawing app dealing with different kind of geometric shapes (rectangle, circle, triangle and so on).


## Strategy Pattern
If we have a situation where we need to change algorithm at run time, we need strategy pattern. In this pattern, we define a family of algorithms, encapsulate each one and make them interchangeable. This pattern lets the algorithms vary independently from clients that use it.

[Real world examples](http://alvinalexander.com/java/java-strategy-design-pattern-in-java):

  -- Saving files in different formats: Word, ODT, RTF, HTML plain text, Excel, CSV, HTML.

  -- Compress files using different compression algorithms.

  -- Capture video using different video compression algorithms.

  -- Plot the same data using different formats (points, line chart, bar chart, etc.)

  -- Display calendars, with different holidays for different countries. (Strategy classes are USAHoliday, CanadaHoliday, etc.)

  -- A store may have various pricing strategies (10% off everything, $10 off when the total exceeds $200, etc.), and these strategies may be used at different times.
