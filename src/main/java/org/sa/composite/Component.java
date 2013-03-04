package org.sa.composite;

/**
 * The Component class does the following:
 * <ol>
 *   <li>represents the Component objects in the composition .</li>
 *   <li>implements all the IComponent methods</li>
 * </ol>
 * 
 * @author Shai Amar
 *
 */
public class Component implements IComponent
{
	private String name;
	
	public Component(String name)
	{
		this.name = name;
	}
	
	
	public void printCommand() 
	{
		System.out.print(this.name + " ");
	}

}
