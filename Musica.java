/**
 *
 * @author carol
 */
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Musica{
 
    private Clip clip;
    
    public void playMusic() {
        
        String filePathField = "src\\main\\java\\wav\\Quiz.wav";
        boolean isLooping = true;
        
        if (clip != null && clip.isRunning()) 
        {
            clip.stop();
        }
        
        try 
        {
            File file = new File(filePathField);
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(file);
            
            clip = AudioSystem.getClip();
            clip.open(audioIn);
            
            if (isLooping) 
            {
                clip.loop(Clip.LOOP_CONTINUOUSLY);
            }
            
            clip.start();
 
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
    }
}
