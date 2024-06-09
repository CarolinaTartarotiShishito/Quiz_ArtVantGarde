/**
 *
 * @author carol
 */
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Musica{
    private String filePathField = "src\\main\\java\\wav\\Quiz.wav";
    public Clip clip;
    public boolean isPaused;
    public boolean isLooping;
    
    public void playMusic() {
        
        isLooping = true;
        if (clip != null && clip.isRunning()){
            clip.stop();
        }
        try{
            File file = new File(filePathField);
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(file);
            
            clip = AudioSystem.getClip();
            clip.open(audioIn);
            
            if (isLooping){
                clip.loop(Clip.LOOP_CONTINUOUSLY);
            }
            clip.start();
            isPaused = false;
        }
        catch(Exception e){
            System.out.println(e);
        }
        
    }
    
    public void pauseMusic(){
        try{
            if (clip != null && clip.isRunning() && isPaused == false) {            
            // Localização do soundtrack
            clip.stop();
            isPaused = true;
            }
        }catch(Exception e){
            System.out.println("Problemas técnicos");
        }
    }
}
