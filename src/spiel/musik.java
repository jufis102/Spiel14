package spiel;

/**
 * Created by julia on 17.04.14.
 */
import javax.sound.sampled.*;
import java.io.File;


public class musik {

    public void PlayMusic() {
        try {

            File f = new File("src/spiel/0.wav");
            AudioInputStream audio = AudioSystem.getAudioInputStream(f);
            AudioFormat format;
            format = audio.getFormat();
            SourceDataLine auline;
            DataLine.Info info = new DataLine.Info(SourceDataLine.class, format);
            auline = (SourceDataLine) AudioSystem.getLine(info);
            auline.open(format);
            auline.start();
            int nBytesRead = 0;
            byte[] abData = new byte[524288];
            while (nBytesRead != -1) {
                nBytesRead = audio.read(abData, 0, abData.length);
                if (nBytesRead >= 0) {
                    auline.write(abData, 0, nBytesRead);
                }
            }
        } catch (Exception E) {
            System.out.println(E.getMessage());

        }
    }

}