package org.sa.composite.arithmetic;

/**
 * Created by Shai Amar on 7/13/2015.
 */
public class ArithmeticComposite implements IArithmeticComponent
{

    private Number leftNumber;
    private Number rightNumber;


    public ArithmeticComposite(Number leftNumber, Number rightNumber)
    {
        this.leftNumber  = leftNumber;
        this.rightNumber = rightNumber;
    }





    @Override
    public Number calculate()
    {
        return null;
    }

    @Override
    public void add(IArithmeticComponent component)
    {

    }

    @Override
    public void remove(IArithmeticComponent component)
    {

    }
}
