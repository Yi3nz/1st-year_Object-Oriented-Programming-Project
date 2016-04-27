/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.Serializable;
/**
 *
 * @author Renalyn
 */
public class plantJava implements Serializable {
    private String name;
    private String question1;
    private String question2;
    
    public plantJava() {
        name = new String();
        question1 = new String();
        question2 = new String();
    }
    
   // get method
    public String getName() {
        return name;
    }
     public String getQuestion1() {
        return question1;
    }
      public String getQuestion2() {
        return question2;
    }
    
     //set method
    public void setName(String name) {
        this.name = name;
    }
    public void setQuestion1(String question1) {
        this.question1 = question1;
    }
    public void setQuestion2(String question2) {
        this.question2 = question2;
    }
    
}
