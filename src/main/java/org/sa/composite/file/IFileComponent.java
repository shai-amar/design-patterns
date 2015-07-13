package org.sa.composite.file;

/**
 * Created with IntelliJ IDEA.
 * User: shaiam
 * Date: 6/28/15
 * Time: 2:20 PM
 * This example is a case of how to build a file system. The main difference in this example
 * is that the IFileComponent interface enforce its implementations to implement add and
 * remove methods. <br/>
 * <b>Pros:</b> Allow the user to implement the same operations for a tree leaf and tree node.<br/>
 * <b>Cons:</b> The tree leaf implements empty add and remove methods.<br/>
 */
public interface IFileComponent
{
    /**
     * This method adds a file to the current file (that is in fact a directory)
     * @param file
     */
    public void add(IFileComponent file);

    /**
     * This method removes a file/directory from the file structure represented be a <i>FileComposite<i/> object
     * @param file
     */
    public void remove(IFileComponent file);

    /**
     * This method prints the file name and represents the operation on the <i>IFileComponent</i> object.
     */
    public void printFileName();
}
