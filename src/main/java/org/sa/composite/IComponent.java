package org.sa.composite;

/**
 * IComponent is:
 * <ol>
 *   <li>the abstraction for all components, including composite ones</li>
 *   <li>declares the interface for objects in the composition</li>
 *   <li>(optional) defines an interface for accessing a component's parent in the 
 *       recursive structure, and implements it if that's appropriate</li>
 * </ol>
 * 
 * @author Shai Amar 
 *
 */
public interface IComponent 
{
	//	The method that executes whatever you want as a basic operation 
	public void printCommand();
}
