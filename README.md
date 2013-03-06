design-patterns
===============

This repo shows how to implement various design patterns 

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
Usually it uses Composite design pattern as the data structure that holds the data, and the <i>Interpreter</i> 
is actually an object that checks the validity of the data.<br/><br/>
The <i>Interpreter</i> example is in the package: **org.sa.interpreter** <br/><br/>
Here is an Interpreter class diagram example: <br/><br/>

![ScreenShot](https://raw.github.com/shai-amar/design-patterns/master/src/main/images/InterpreterClassDiagram.jpg)

<b>Context</b> - The context is the object that tells the Interpreter the order of the objects operations.<br/>


