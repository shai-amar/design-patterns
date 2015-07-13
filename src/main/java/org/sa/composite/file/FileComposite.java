package org.sa.composite.file;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Shai Amar
 * Date: 6/28/15
 * Time: 2:22 PM
 * The Composite class does the following:
 * <ol>
 * 	<li>represents a composite Component (component having children)</li>
 *  <li>implements methods to manipulate children</li>
 *  <li>implements all IComponent methods, generally by delegating them to its children</li>
 * </ol>
 *
 */
public class FileComposite implements IFileComponent
{
    private List<IFileComponent> children;
    private String directoryName;

    public FileComposite(String directoryName)
    {
        this.children = new ArrayList<IFileComponent>();
        this.directoryName = directoryName;
    }


    @Override
    public void printFileName()
    {
        System.out.println("Folder:" + this.directoryName);

        for(IFileComponent fileComponent: this.children)
        {
            fileComponent.printFileName();
        }
    }

    public void add(IFileComponent component)
    {
        this.children.add(component);
    }

    @Override
    public void remove(IFileComponent file) {
        this.children.remove(file);
    }

}
