package org.sa.composite.arithmetic;

/**
 * Created by shaiam on 7/13/2015.
 */
public class Multiply implements IArithmeticComponent
{
    private Number leftNumber;
    private Number rightNumber;

    public Multiply(Number leftNumber, Number rightNumber)
    {
        this.leftNumber  = leftNumber;
        this.rightNumber = rightNumber;
    }

    @Override
    public Number calculate()
    {
        Number result = null;

        //  SHORT
        if((this.leftNumber instanceof Short) && (this.rightNumber instanceof Short))
        {
            result = this.leftNumber.shortValue() * this.rightNumber.shortValue();
        }   //  INT
        else if((this.leftNumber instanceof Integer) && (this.rightNumber instanceof Integer))
        {
            result = this.leftNumber.intValue() * this.rightNumber.intValue();
        }   //  LONG
        else if((this.leftNumber instanceof Long) && (this.rightNumber instanceof Long))
        {
            result = this.leftNumber.longValue() * this.rightNumber.longValue();
        }   //  FLOAT
        else if((this.leftNumber instanceof Float) && (this.rightNumber instanceof Float))
        {
            result = this.leftNumber.floatValue() * this.rightNumber.floatValue();
        }

        return result;
    }

    @Override
    public void add(IArithmeticComponent component)
    {
        //  DO NOTHING
    }

    @Override
    public void remove(IArithmeticComponent component)
    {
        //  DO NOTHING
    }
}
