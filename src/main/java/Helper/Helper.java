/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Helper;

/**
 *
 * @author qa
 */
public class Helper {
    
    public static int getRandomInteger() {
        return (int) (Math.random() * 10000);
    }
    public static String getRandomText() {
        return "category-sasa-" + getRandomInteger();
    }
    
}
