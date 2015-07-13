package org.sa.composite.arithmetic;

/**
 * Created by shaiam on 7/13/2015.
 * This is a case of how to build a structure that represents an arithmetic expression and gets its result.
 * The main difference from IFileComponent does not enforce the implementation of add and remove methods,
 * therefore the implementation is more elegant.
 *
 */
public interface IArithmeticComponent
{
    public Number calculate();
    public void add(IArithmeticComponent component);
    public void remove(IArithmeticComponent component);
}
