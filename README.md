design-patterns
===============

This repo shows how to implement various design patterns 

Singleton design pattern
------------------------
<i>Singleton</i> is an object that has one and only one instance in the system.<br/>
It has various uses such as an instance that holds library structure, dao to the database, etc...<br/>
The <i>Singleton</i> example is in the package: **org.sa.singleton** <br/><br/>

Here is a Composite class diagram example: <br/><br/> 
![ScreenShot](https://raw.github.com/shai-amar/design-patterns/master/src/main/images/CompositeClassDiagram.jpg)

<br/><br/>

Composite design pattern
------------------------
<i>Composite</i> design pattern is known as a ***structural*** pattern and is design to contain a complex data structure 
(N-Tree) in a user friendly objects structure.<br/>
The <i>Composite</i> example is in the package: **org.sa.composite** <br/><br/>

Here is a Composite class diagram example: <br/><br/> 
![ScreenShot](https://raw.github.com/shai-amar/design-patterns/master/src/main/images/CompositeClassDiagram.jpg)

<br/><br/>

Interpreter design pattern
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

<br/><br/>

Command design pattern
----------------------



