package org.sa.client;

import org.sa.composite.arithmetic.IArithmeticComponent;
import org.sa.composite.arithmetic.Multiply;
import org.sa.composite.arithmetic.PlusComponent;
import org.sa.composite.file.FileComponent;
import org.sa.composite.file.FileComposite;

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
//        new CompositeClient().runFileComposite();
        new CompositeClient().runCalculateComposite();
	}

    private void runFileComposite()
    {
        FileComposite fatherDir     = new FileComposite("Father");
        FileComposite sonShaiDir    = new FileComposite("SonShai");
        FileComposite sonRoi        = new FileComposite("SonRoi");

        FileComponent brotherAlmog  = new FileComponent("BrotherAlmog");
        FileComponent sisterShira   = new FileComponent("SisterShira");
        FileComponent brotherTal    = new FileComponent("BrotherTal");

        FileComponent gsMaya        = new FileComponent("GSMaya");
        FileComponent gsItai        = new FileComponent("GSItai");
        FileComponent gsNoa         = new FileComponent("GSNoa");
        FileComponent gsIlai        = new FileComponent("Ilai");
        FileComponent gsYovel       = new FileComponent("GSYovel");

        sonShaiDir.add(gsMaya);
        sonShaiDir.add(gsItai);
        sonShaiDir.add(gsNoa);

        sonRoi.add(gsIlai);
        sonRoi.add(gsYovel);

        fatherDir.add(sonShaiDir);
        fatherDir.add(sonRoi);
        fatherDir.add(sisterShira);
        fatherDir.add(brotherAlmog);
        fatherDir.add(brotherTal);

        fatherDir.printFileName();
    }

    private void runCalculateComposite()
    {
        IArithmeticComponent leftSection  = new PlusComponent(1,2);
        IArithmeticComponent rightSection = new PlusComponent(3,4);
        IArithmeticComponent rootSection  = new Multiply(leftSection.calculate(), rightSection.calculate());

        System.out.println(rootSection.calculate());
    }

	
}
