package org.sa.composite.arithmetic;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Shai Amar on 7/23/2015.
 */
public class ArithmeticDivideComposite implements IArithmeticComponent
{
    private List<IArithmeticComponent> componentList;

    public ArithmeticDivideComposite() {    this.componentList = new ArrayList<IArithmeticComponent>(); }

    public Number calculate()
    {
        Number result = 0;

        for(int i=0;i<this.componentList.size();i++)
        {
            IArithmeticComponent component =  this.componentList.get(i);

            if(i == 0) {    result =  component.calculate(); }
            else
            {

                if(component.calculate() instanceof Byte)
                {
                    result = result.byteValue() / component.calculate().byteValue();
                }
                else if(component.calculate() instanceof Double)
                {
                    result = result.doubleValue() / component.calculate().doubleValue();
                }
                else if(component.calculate() instanceof Float)
                {
                    result = result.floatValue() / component.calculate().floatValue();
                }
                else if(component.calculate() instanceof Integer)
                {
                    result = result.intValue() / component.calculate().intValue();
                }
                else if (component.calculate() instanceof Long)
                {
                    result = result.longValue() / component.calculate().longValue();
                }
                else if (component.calculate() instanceof Short)
                {
                    result = result.shortValue() / component.calculate().shortValue();
                }
                else
                {
                    throw new RuntimeException("Unsupported number type!");
                }
            }
        }

        return result;
    }

    public void add(IArithmeticComponent component)
    {
        this.componentList.add(component);
    }

    public void remove(IArithmeticComponent component)
    {
        this.componentList.remove(component);
    }
}
