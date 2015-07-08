package org.sa.composite;

/**
 * Created with IntelliJ IDEA.
 * User: Shai Amar
 * Date: 6/28/15
 * Time: 2:22 PM
 * To change this template use File | Settings | File Templates.
 */
public class FileComponent implements IFileComponent
{
    private String fileName;

    public FileComponent(String fileName)
    {
        this.fileName = fileName;
    }


    /**
     * This method adds a file to the current file (that is in fact a directory)
     *
     * @param file
     */
    @Override
    public void add(IFileComponent file) {
        //  Nothing to add. In this case it is a file and not a directory
    }

    @Override
    public void remove(IFileComponent file) {
        //  Nothing to remove. In this case it is a file and not a directory
    }

    @Override
    public void printFileName()
    {
        System.out.println("  File:" + this.fileName);
    }

}
