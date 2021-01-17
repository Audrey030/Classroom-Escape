/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author audre
 */
//public class Buttons {
    //public void GoToMainMenu()
    //{
        //this.setVisible(false);
        //MainMenu frame2 = new MainMenu();
        //frame2.setVisible(true);
    //}
//}
public class Buttons
{
    public String PlayerName;

    
    public Buttons(String player)
    {
        PlayerName=player;
    }
    
    public String getName()
    {
    
        return PlayerName;
    }
}