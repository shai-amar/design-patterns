<h1>design-patterns</h1>


Design patterns are solutions to software design problems you find again and again in real-world application development. Patterns are about reusable designs and interactions of objects..

The 23 Gang of Four (GoF) patterns are generally considered the foundation for all other patterns. They are categorized in three groups: Creational, Structural, and Behavioral
This repo shows how to implement various design patterns.

<h2>Creational patterns</h2>

<h3>Singleton design pattern</h3>


Ensure a class has only one instance and provide a global point of access to it.

There are 2 kinds of Singleton implementation:
1. Eager instanciation - instanciate the Singleton at Class creation
2. Lazy instanciation  - instanciate the Singleton only when the client start uses the Singleton

<h4>Singleton Eager Instanciation</h4>
Instanciate the Singleton at Class creation. Can be used when the singleton does not need to instanciate parameters in the Constructor

<b>Singleton Eager instanciation class diagram</b>

The <i>Singleton</i> example is in the package: **org.sa.singleton.eager** <br/><br/>

![ScreenShot](https://raw.github.com/shai-amar/design-patterns/master/src/main/images/eagerSingleton.PNG)
<br/><br/>

<h4>Singleton Lazy Instanciation</h4>
Instanciate the Singleton only when the client start uses the Singleton. Can be used when the singleton needs to instanciate parameters in the Constructor.</br>
There is the problem of instanciate 2 instances of a singleton with 2 Threads simultaniously, which has tried to solve unsucsessfully with double locking mechanism.</br>
This solution is an elegant solution that solves this specific issue and insures that the first client (doesn't matter from which thread) instanciates the Singleton.</br>


<b>Singleton Lazy instanciation class diagram</b>

The <i>Singleton</i> example is in the package: **org.sa.singleton.lazy** <br/><br/>

![ScreenShot](https://raw.github.com/shai-amar/design-patterns/master/src/main/images/lazySingleton.png)
<br/><br/>

<h2>Structural patterns</h2>

<h3>Composite design pattern</h3>

Compose objects into tree structures to represent part-whole hierarchies. 
Composite lets clients treat individual objects and compositions of objects uniformly.<br/>

The <i>Composite</i> example is in the package: **org.sa.composite** <br/><br/>

This example is a case of how to build a file system. The main difference in this example is that the **IFileComponent** interface enforce its implementations to implement **add** and **remove** methods.<br /><br />
**Pros:** Allow the user to implement the same operations for a tree leaf and tree node.<br /><br/>
**Cons:** The tree leaf implements empty **add** and **remove** methods.<br/><br/>

<b>Composite UML class diagram</b> <br/><br/> 
![ScreenShot](https://raw.github.com/shai-amar/design-patterns/master/src/main/images/compositeFile.png)

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

<h2>Behavioral patterns</h2>

<h3>Command design pattern</h3>

Encapsulate a request as an object, thereby letting you parameterize clients 
with different requests, queue or log requests, and support undoable operations.<br/>

The <i>Command</i> example is in the package: **org.sa.command** <br/><br/>

<b>Command UML class diagram</b> <br/><br/> 
![ScreenShot](https://raw.github.com/shai-amar/design-patterns/master/src/main/images/CompositeClassDiagram.jpg)

<br/><br/>







