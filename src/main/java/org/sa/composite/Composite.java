package org.sa.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * The Composite class does the following:
 * <ol>
 * 	<li>represents a composite Component (component having children)</li>
 *  <li>implements methods to manipulate children</li>
 *  <li>implements all IComponent methods, generally by delegating them to its children</li>
 * </ol>
 * 
 * @author Shai Amar
 *
 */
public class Composite implements IComponent
{
	private List<IComponent> children;
	
	public Composite()
	{
		this.children = new ArrayList<IComponent>();
	}

	public void printCommand() 
	{
		for(IComponent component: this.children)
		{
			component.printCommand();
		}
	}
	
	public void add(IComponent component)
	{
		this.children.add(component);
	}
	
	public boolean remove(IComponent component)
	{
		boolean isRemoved = this.children.remove(component);
		
		return isRemoved;
	}
	
	
}
