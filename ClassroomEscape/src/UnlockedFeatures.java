//This class contains boolean attributes that say whether a part of a classroom has been unlocked or not.
//When it is unlocked, the program will know, so players won't have to keep entering passwords.

/**
 *
 * @author audre
 */
public class UnlockedFeatures 
{
    public static boolean power;
    public static boolean computerUnlocked;
    public static boolean drawer;
    
        
        public static void resetGame()//makes parts of the classroom locked
        {
            UnlockedFeatures.power=false;
            UnlockedFeatures.computerUnlocked=false;
            UnlockedFeatures.drawer=false;
            UnlockedFeatures computerAccessibility = new UnlockedFeatures();
        }
    
        public static void computerOn()//Called when the whiteboard question is correct so players can access the computer button
        {
            UnlockedFeatures.power=true;
            UnlockedFeatures computerAccessibility = new UnlockedFeatures();
 
        };
        public static void compUnlock()//Called when the computer password is correct
        {
            UnlockedFeatures.computerUnlocked=true;
            UnlockedFeatures loginSuccess = new UnlockedFeatures();
        }
        public static void openDrawer()//called when the drawer gets unlocked, so players can go back to the unlocked drawer
        {
            UnlockedFeatures.drawer=true;
            UnlockedFeatures openedDrawer = new UnlockedFeatures();
        }
}
