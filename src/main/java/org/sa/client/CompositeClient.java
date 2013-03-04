package org.sa.client;

import org.sa.composite.Component;
import org.sa.composite.Composite;

/**
 * This is the client that demonstrate the use in the Composite design pattern.
 * 
 * @author Shai Amar
 *
 */
public class CompositeClient 
{
	
	public static void main(String[] args)
	{
		//	Initialize the command initial parameters...
		Component componentCreate = new Component("create");
		Component componentReview = new Component("review");
		Component componentFor = new Component("for=(shadow_SHAI)");
		Component componentFilt = new Component("with filters:");
		
		//	Init the filter parameters...
		Component componentFilt1 = new Component("filter1");
		Component componentFilt2 = new Component("filter2");
		Component componentFilt3 = new Component("filter3");
		
		//	Init the conditions parameters...
		Component componentCond = new Component("conditions:");
		Component componentCond1 = new Component("cond1");
		Component componentCond2 = new Component("cond2");
		Component componentCond3 = new Component("cond3");
		
		//	Init the composite objects...
		Composite compositeMain = new Composite();
		Composite compositeFilt = new Composite();
		Composite compositeCond = new Composite();
		
		compositeMain.add(componentCreate);
		compositeMain.add(componentReview);
		compositeMain.add(componentFor);
		
		//	Building the filters composite...
		compositeFilt.add(componentFilt1);
		compositeFilt.add(componentFilt2);
		compositeFilt.add(componentFilt3);
		
		compositeMain.add(componentFilt);
		compositeMain.add(compositeFilt);
		
		//	Building the conditions composite...
		compositeCond.add(componentCond1);
		compositeCond.add(componentCond2);
		compositeCond.add(componentCond3);
		
		compositeMain.add(componentCond);
		compositeMain.add(compositeCond);
		
		compositeMain.printCommand();
		
	}
	
}
