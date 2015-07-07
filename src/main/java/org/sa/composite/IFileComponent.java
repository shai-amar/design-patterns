package org.sa.composite;

/**
 * Created with IntelliJ IDEA.
 * User: shaiam
 * Date: 6/28/15
 * Time: 2:20 PM
 * To change this template use File | Settings | File Templates.
 */
public interface IFileComponent
{
    /**
     * This method adds a file to the current file (that is in fact a directory)
     * @param file
     */
    public void add(IFileComponent file);
    public void remove(IFileComponent file);
    public void printFileName();
}
