/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author Alvin
 */
import java.lang.Exception;

public class Dog {

    private String name, color;
    private int number;

    public Dog(String dogName, int colorNum, int packSize) throws Exception {
        name = dogName;
        number = (int) Math.random();
        switch (colorNum) {
            case 1:
                color = "red";
                break;
            case 2:
                color = "blue";
                break;
            case 3:
                color = "green";
                break;
            case 4:
                color = "silver";
                break;
            case 5:
                color = "brown";
                break;
            case 6:
                color = "yellow";
                break;
            case 7:
                color = "";
                break;
            default:
                throw new Exception("NumOutOfColorBounds");
        }
    }
}
