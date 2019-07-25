package entry;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class entrada  {
	int size = 0;
   
    public char[] stringtochar(String str){
    	char[]c = new char[str.length()];
    	for (int i = 0; i < str.length(); i++){
    		c[i] = str.charAt(i);
    		
    	}
    size = str.length();
    	
    	return c;
    }
    
    public void movermouse(int mousex,int mousey){

        try {
            Robot robot = new Robot();
            robot.mouseMove(mousex,mousey);
        } catch (AWTException ex) {
            Logger.getLogger(entrada.class.getName()).log(Level.SEVERE, null, ex);
        }
 
    }
    public void digitar (String s){
    	char[]c = stringtochar(s);
    	
    	
    	
    	try
    	{
    	Robot robot = new Robot();
    	for (int i = 0; i < size; i++){
    		if (c[i] == 'A'){ 
    		robot.keyPress(KeyEvent.VK_SHIFT);robot.keyPress(KeyEvent.VK_A);robot.keyRelease(KeyEvent.VK_A);
            robot.keyRelease(KeyEvent.VK_SHIFT);}if (c[i] == 'B'){robot.keyPress(KeyEvent.VK_SHIFT);robot.keyPress(KeyEvent.VK_B);
            robot.keyRelease(KeyEvent.VK_B);robot.keyRelease(KeyEvent.VK_SHIFT);}
    		if (c[i] == 'C'){robot.keyPress(KeyEvent.VK_SHIFT);robot.keyPress(KeyEvent.VK_C);
            robot.keyRelease(KeyEvent.VK_C);robot.keyRelease(KeyEvent.VK_SHIFT);}
    		if (c[i] == 'D'){robot.keyPress(KeyEvent.VK_SHIFT);robot.keyPress(KeyEvent.VK_D);
            robot.keyRelease(KeyEvent.VK_D);robot.keyRelease(KeyEvent.VK_SHIFT);}
    		if (c[i] == 'E'){robot.keyPress(KeyEvent.VK_SHIFT);robot.keyPress(KeyEvent.VK_E);
            robot.keyRelease(KeyEvent.VK_E);robot.keyRelease(KeyEvent.VK_SHIFT);}
    		if (c[i] == 'F'){robot.keyPress(KeyEvent.VK_SHIFT);robot.keyPress(KeyEvent.VK_F);
            robot.keyRelease(KeyEvent.VK_F);robot.keyRelease(KeyEvent.VK_SHIFT);}
    		if (c[i] == 'G'){robot.keyPress(KeyEvent.VK_SHIFT);robot.keyPress(KeyEvent.VK_G);
            robot.keyRelease(KeyEvent.VK_G);robot.keyRelease(KeyEvent.VK_SHIFT);}
    		if (c[i] == 'H'){robot.keyPress(KeyEvent.VK_SHIFT);robot.keyPress(KeyEvent.VK_H);
            robot.keyRelease(KeyEvent.VK_H);robot.keyRelease(KeyEvent.VK_SHIFT);}
    		if (c[i] == 'I'){robot.keyPress(KeyEvent.VK_SHIFT);robot.keyPress(KeyEvent.VK_I);
            robot.keyRelease(KeyEvent.VK_I);robot.keyRelease(KeyEvent.VK_SHIFT);}
    		if (c[i] == 'J'){robot.keyPress(KeyEvent.VK_SHIFT);robot.keyPress(KeyEvent.VK_J);
            robot.keyRelease(KeyEvent.VK_J);robot.keyRelease(KeyEvent.VK_SHIFT);}
    		if (c[i] == 'K'){robot.keyPress(KeyEvent.VK_SHIFT);robot.keyPress(KeyEvent.VK_K);
            robot.keyRelease(KeyEvent.VK_K);robot.keyRelease(KeyEvent.VK_SHIFT);}
    		if (c[i] == 'L'){robot.keyPress(KeyEvent.VK_SHIFT);robot.keyPress(KeyEvent.VK_L);
            robot.keyRelease(KeyEvent.VK_L);robot.keyRelease(KeyEvent.VK_SHIFT);}
    		if (c[i] == 'M'){robot.keyPress(KeyEvent.VK_SHIFT);robot.keyPress(KeyEvent.VK_M);
            robot.keyRelease(KeyEvent.VK_M);robot.keyRelease(KeyEvent.VK_SHIFT);}
    		if (c[i] == 'N'){robot.keyPress(KeyEvent.VK_SHIFT);robot.keyPress(KeyEvent.VK_N);
            robot.keyRelease(KeyEvent.VK_N);robot.keyRelease(KeyEvent.VK_SHIFT);}
    		if (c[i] == 'O'){robot.keyPress(KeyEvent.VK_SHIFT);robot.keyPress(KeyEvent.VK_O);
            robot.keyRelease(KeyEvent.VK_O);robot.keyRelease(KeyEvent.VK_SHIFT);}
    		if (c[i] == 'P'){robot.keyPress(KeyEvent.VK_SHIFT);robot.keyPress(KeyEvent.VK_P);
            robot.keyRelease(KeyEvent.VK_P);robot.keyRelease(KeyEvent.VK_SHIFT);}
    		if (c[i] == 'Q'){robot.keyPress(KeyEvent.VK_SHIFT);robot.keyPress(KeyEvent.VK_Q);
            robot.keyRelease(KeyEvent.VK_Q);robot.keyRelease(KeyEvent.VK_SHIFT);}
    		if (c[i] == 'R'){robot.keyPress(KeyEvent.VK_SHIFT);robot.keyPress(KeyEvent.VK_R);
            robot.keyRelease(KeyEvent.VK_R);robot.keyRelease(KeyEvent.VK_SHIFT);}
    		if (c[i] == 'S'){robot.keyPress(KeyEvent.VK_SHIFT);robot.keyPress(KeyEvent.VK_S);
            robot.keyRelease(KeyEvent.VK_S);robot.keyRelease(KeyEvent.VK_SHIFT);}
    		if (c[i] == 'T'){robot.keyPress(KeyEvent.VK_SHIFT);robot.keyPress(KeyEvent.VK_T);
            robot.keyRelease(KeyEvent.VK_T);robot.keyRelease(KeyEvent.VK_SHIFT);}
    		if (c[i] == 'U'){robot.keyPress(KeyEvent.VK_SHIFT);robot.keyPress(KeyEvent.VK_U);
            robot.keyRelease(KeyEvent.VK_U);robot.keyRelease(KeyEvent.VK_SHIFT);}
    		if (c[i] == 'V'){robot.keyPress(KeyEvent.VK_SHIFT);robot.keyPress(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_V);robot.keyRelease(KeyEvent.VK_SHIFT);}
    		if (c[i] == 'W'){robot.keyPress(KeyEvent.VK_SHIFT);robot.keyPress(KeyEvent.VK_W);
            robot.keyRelease(KeyEvent.VK_W);robot.keyRelease(KeyEvent.VK_SHIFT);}
    		if (c[i] == 'X'){robot.keyPress(KeyEvent.VK_SHIFT);robot.keyPress(KeyEvent.VK_X);
            robot.keyRelease(KeyEvent.VK_X);robot.keyRelease(KeyEvent.VK_SHIFT);}
    		if (c[i] == 'Y'){robot.keyPress(KeyEvent.VK_SHIFT);robot.keyPress(KeyEvent.VK_Y);
            robot.keyRelease(KeyEvent.VK_Y);robot.keyRelease(KeyEvent.VK_SHIFT);}
    		if (c[i] == 'Z'){robot.keyPress(KeyEvent.VK_SHIFT);robot.keyPress(KeyEvent.VK_Z);
            robot.keyRelease(KeyEvent.VK_Z);robot.keyRelease(KeyEvent.VK_SHIFT);}
    		if (c[i] == ' '){robot.keyPress(KeyEvent.VK_SPACE);
            robot.keyRelease(KeyEvent.VK_SPACE);}
    		if (c[i] == '1'){robot.keyPress(KeyEvent.VK_1);
            robot.keyRelease(KeyEvent.VK_1);}
    		if (c[i] == '2'){robot.keyPress(KeyEvent.VK_2);
            robot.keyRelease(KeyEvent.VK_2);}
    		if (c[i] == '3'){robot.keyPress(KeyEvent.VK_3);
            robot.keyRelease(KeyEvent.VK_3);}
    		if (c[i] == '4'){robot.keyPress(KeyEvent.VK_4);
            robot.keyRelease(KeyEvent.VK_4);}
    		if (c[i] == '5'){robot.keyPress(KeyEvent.VK_5);
            robot.keyRelease(KeyEvent.VK_5);}
    		if (c[i] == '6'){robot.keyPress(KeyEvent.VK_6);
            robot.keyRelease(KeyEvent.VK_6);}
    		if (c[i] == '7'){robot.keyPress(KeyEvent.VK_7);
            robot.keyRelease(KeyEvent.VK_7);}
    		if (c[i] == '8'){robot.keyPress(KeyEvent.VK_8);
            robot.keyRelease(KeyEvent.VK_8);}
    		if (c[i] == '9'){robot.keyPress(KeyEvent.VK_9);
            robot.keyRelease(KeyEvent.VK_9);}
    		if (c[i] == '0'){robot.keyPress(KeyEvent.VK_0);
            robot.keyRelease(KeyEvent.VK_0);}    		
    		if (c[i] == '-'){robot.keyPress(KeyEvent.VK_MINUS);
            robot.keyRelease(KeyEvent.VK_MINUS);}
    		if (c[i] == 'a'){robot.keyPress(KeyEvent.VK_A);
            robot.keyRelease(KeyEvent.VK_A);}
       		if (c[i] == 'b'){robot.keyPress(KeyEvent.VK_B);
            robot.keyRelease(KeyEvent.VK_B);}
       		if (c[i] == 'c'){robot.keyPress(KeyEvent.VK_C);
            robot.keyRelease(KeyEvent.VK_C);}
       		if (c[i] == 'd'){robot.keyPress(KeyEvent.VK_D);
            robot.keyRelease(KeyEvent.VK_D);}
       		if (c[i] == 'e'){robot.keyPress(KeyEvent.VK_E);
            robot.keyRelease(KeyEvent.VK_E);}
       		if (c[i] == 'f'){robot.keyPress(KeyEvent.VK_F);
            robot.keyRelease(KeyEvent.VK_F);}
       		if (c[i] == 'g'){robot.keyPress(KeyEvent.VK_G);
            robot.keyRelease(KeyEvent.VK_G);}
       		if (c[i] == 'h'){robot.keyPress(KeyEvent.VK_H);
            robot.keyRelease(KeyEvent.VK_H);}
       		if (c[i] == 'i'){robot.keyPress(KeyEvent.VK_I);
            robot.keyRelease(KeyEvent.VK_I);}
       		if (c[i] == 'j'){robot.keyPress(KeyEvent.VK_J);
            robot.keyRelease(KeyEvent.VK_J);}
       		if (c[i] == 'k'){robot.keyPress(KeyEvent.VK_K);
            robot.keyRelease(KeyEvent.VK_K);}
       		if (c[i] == 'l'){robot.keyPress(KeyEvent.VK_L);
            robot.keyRelease(KeyEvent.VK_L);}
       		if (c[i] == 'm'){robot.keyPress(KeyEvent.VK_M);
            robot.keyRelease(KeyEvent.VK_M);}
       		if (c[i] == 'n'){robot.keyPress(KeyEvent.VK_N);
            robot.keyRelease(KeyEvent.VK_N);}
       		if (c[i] == 'o'){robot.keyPress(KeyEvent.VK_O);
            robot.keyRelease(KeyEvent.VK_O);}
       		if (c[i] == 'p'){robot.keyPress(KeyEvent.VK_P);
            robot.keyRelease(KeyEvent.VK_P);}
       		if (c[i] == 'q'){robot.keyPress(KeyEvent.VK_Q);
            robot.keyRelease(KeyEvent.VK_Q);}
       		if (c[i] == 'r'){robot.keyPress(KeyEvent.VK_R);
            robot.keyRelease(KeyEvent.VK_R);}
       		if (c[i] == 's'){robot.keyPress(KeyEvent.VK_S);
            robot.keyRelease(KeyEvent.VK_S);}
       		if (c[i] == 't'){robot.keyPress(KeyEvent.VK_T);
            robot.keyRelease(KeyEvent.VK_T);}
       		if (c[i] == 'u'){robot.keyPress(KeyEvent.VK_U);
            robot.keyRelease(KeyEvent.VK_U);}
       		if (c[i] == 'v'){robot.keyPress(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_V);}
       		if (c[i] == 'w'){robot.keyPress(KeyEvent.VK_W);
            robot.keyRelease(KeyEvent.VK_W);}
       		if (c[i] == 'x'){robot.keyPress(KeyEvent.VK_X);
            robot.keyRelease(KeyEvent.VK_X);}
       		if (c[i] == 'y'){robot.keyPress(KeyEvent.VK_Y);
            robot.keyRelease(KeyEvent.VK_Y);}
       		if (c[i] == 'z'){robot.keyPress(KeyEvent.VK_Z);
            robot.keyRelease(KeyEvent.VK_Z);}
       		if (c[i] == '%') {robot.keyPress(KeyEvent.VK_DOWN);
       		robot.keyRelease(KeyEvent.VK_DOWN);}
       		if (c[i] == '$') {robot.keyPress(KeyEvent.VK_ENTER);
       		robot.keyRelease(KeyEvent.VK_ENTER);}
       		if (c[i] == '#') {robot.keyPress(KeyEvent.VK_TAB);
       		robot.keyRelease(KeyEvent.VK_TAB);}
       		if (c[i] == '.') {robot.keyPress(46);
       		robot.keyRelease(46);}
       		if (c[i] == '&') {robot.keyPress(KeyEvent.VK_SHIFT);robot.keyPress(KeyEvent.VK_7);
            robot.keyRelease(KeyEvent.VK_7);robot.keyRelease(KeyEvent.VK_SHIFT);}
       		if (c[i] == '*') {robot.keyPress(KeyEvent.VK_ASTERISK);
       		robot.keyRelease(KeyEvent.VK_ASTERISK);}
       		if (c[i] == '=') {robot.keyPress(KeyEvent.VK_EQUALS);
       		robot.keyRelease(KeyEvent.VK_EQUALS);}
       		if (c[i] == ':') {robot.keyPress(KeyEvent.VK_COLON);
       		robot.keyRelease(KeyEvent.VK_COLON);}
       		if (c[i] == ';') {robot.keyPress(KeyEvent.VK_SEMICOLON);
       		robot.keyRelease(KeyEvent.VK_SEMICOLON);}
    	}
        //
    	} catch (AWTException ex){
    		Logger.getLogger(entrada.class.getName()).log(Level.SEVERE, null, ex);
    		    	}
    
    }
    public void mouseclick(){
    try {
            Robot robot = new Robot();
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
    } catch (AWTException ex) {
            Logger.getLogger(entrada.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void arrasta(int xinicial, int yinicial, int xfinal, int yfinal){
    	try {Robot robot = new Robot();
    		robot.mouseMove(xinicial, yinicial);
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            robot.mouseMove(xfinal, yfinal);
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
    } catch (AWTException ex) {
            Logger.getLogger(entrada.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void mousesegura(int milis) throws Exception{
        try {
                Robot robot = new Robot();
                robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                Thread.sleep(milis);
                robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        } catch (AWTException ex) {
                Logger.getLogger(entrada.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    
    }
