
//Class containing methods to play sound effects
//The unlocked door sound effect will play when the locks are unlocked in the game
//The wrong sound effect will play when the wrong passwords are used


import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

/**
 *
 * @author audre
 */
public class Sound {
    public static void PlayUnlockSound()
    {
        try
        {
            File sound = new File("F:\\ClassroomEscape2\\Classroom-Escape\\ClassroomEscape\\src\\sound\\Sound_Door.wav");
            Clip c = AudioSystem.getClip();
            c.open(AudioSystem.getAudioInputStream(sound));
            c.start();
            
            //Thread.sleep(c.getMicrosecondLength()/1000);
        }
        catch(Exception e)
        {
            System.out.println("Unable to play sound file");
        }
    }  
    public static void PlayWrongSound()
    {
        try
        {
            File sound = new File("F:\\ClassroomEscape2\\Classroom-Escape\\ClassroomEscape\\src\\sound\\Sound_Wrong.wav");
            Clip c = AudioSystem.getClip();
            c.open(AudioSystem.getAudioInputStream(sound));
            c.start();
            
            //Thread.sleep(c.getMicrosecondLength()/1000);
        }
        catch(Exception e)
        {
            System.out.println("Unable to play sound file");
        }
    }  
}
