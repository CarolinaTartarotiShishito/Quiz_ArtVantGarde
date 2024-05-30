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
    String filePathField = "src\\main\\java\\wav\\Quiz.wav";
    boolean isPaused;
    
    public void playMusic() {
        
        try {
            // Localização do soundtrack
            File file = new File(filePathField);
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(file);
            
            clip = AudioSystem.getClip();
            clip.open(audioIn);
            
            clip.start();
            clip.loop(Clip.LOOP_CONTINUOUSLY);
            isPaused = false;
        }catch(Exception e){
            System.out.println("Problemas técnicos");
        }
        
    }
    
    public void pauseMusic(){
        try{
            if (clip != null && clip.isRunning() && isPaused == false) {            
            // Localização do soundtrack
            File file = new File(filePathField);
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(file);
            
            clip = AudioSystem.getClip();
            clip.open(audioIn);
            
            clip.stop();
            isPaused = true;
            }
        }catch(Exception e){
            System.out.println("Problemas técnicos");
        }
    }
}
