package org.sa.client;

import org.sa.composite.FileComponent;
import org.sa.composite.FileComposite;

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
        new CompositeClient().runFileComposite();
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
	
}
