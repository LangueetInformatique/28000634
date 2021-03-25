package essai;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import opennlp.tools.sentdetect.SentenceDetectorME;
import opennlp.tools.sentdetect.SentenceModel;
import opennlp.tools.util.InvalidFormatException;

public class OpenNlpSentenceSplitter {
	public static void SentenceDetect() throws InvalidFormatException,
	IOException {
String paragraph = "This is a sentence. I'm trying to see if OpenNLP can process it.";


InputStream is = new FileInputStream("en-sent.bin");
SentenceModel model = new SentenceModel(is);
SentenceDetectorME sdetector = new SentenceDetectorME(model);

String sentences[] = sdetector.sentDetect(paragraph);

System.out.println(sentences[0]);
System.out.println(sentences[1]);
is.close();
}	
}