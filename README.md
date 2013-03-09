design-patterns
===============

Design patterns are solutions to software design problems you find again and again in real-world application development. Patterns are about reusable designs and interactions of objects..

The 23 Gang of Four (GoF) patterns are generally considered the foundation for all other patterns. They are categorized in three groups: Creational, Structural, and Behavioral
This repo shows how to implement various design patterns.

Singleton design pattern
------------------------

Ensure a class has only one instance and provide a global point of access to it.

The <i>Singleton</i> example is in the package: **org.sa.singleton** <br/><br/>

<b>Singleton UML class diagram</b> <br/><br/> 
![ScreenShot](https://raw.github.com/shai-amar/design-patterns/master/src/main/images/SingletonClassDiagram.jpg)

<br/><br/>

Composite design pattern
------------------------

Compose objects into tree structures to represent part-whole hierarchies. 
Composite lets clients treat individual objects and compositions of objects uniformly.<br/>

The <i>Composite</i> example is in the package: **org.sa.composite** <br/><br/>

<b>Composite UML class diagram</b> <br/><br/> 
![ScreenShot](https://raw.github.com/shai-amar/design-patterns/master/src/main/images/CompositeClassDiagram.jpg)

<br/><br/>

<!--Interpreter design pattern
--------------------------
The Interpreter design pattern objective is to convert one data structure to another data structure.<br/>
Usually it uses the <i>Composite</i> design pattern as the data structure that holds the data, and the <i>Interpreter</i> 
is actually an object that performs the checks that the user wants to do on every object in the data structure.<br/><br/>
The <i>Interpreter</i> example is in the package: **org.sa.interpreter** <br/><br/>

Here is an Interpreter class diagram example: <br/><br/>
<b>Context</b> - The context is the object that tells the Interpreter the order of the objects operations.<br/>
<b>Client</b> - The client that uses the interpreter<br/>
<b>IComponent</b> - The interface that defines the interpret operation in the <i>Composite</i> design pattern.<br/>
<b>Component</b> - The Leaf in the <i>Composite</i> design pattern. <br/>
<b>Composite</b> - The actual composite object.

![ScreenShot](https://raw.github.com/shai-amar/design-patterns/master/src/main/images/InterpreterClassDiagram.jpg)

<br/><br/> -->

Command design pattern
----------------------



