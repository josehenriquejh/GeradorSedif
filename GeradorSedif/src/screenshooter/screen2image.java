package screenshooter;    

import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

import javax.imageio.ImageIO;

import org.opencv.core.Mat;
import org.opencv.core.MatOfByte;
//import org.opencv.highgui.Highgui;

//import java.text.SimpleDateFormat;
import org.opencv.imgcodecs.Imgcodecs;


public class screen2image
{
    //SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd hh mm ss a");
    static Mat tela;
    public void robo() throws Exception
    {
        //Calendar now = Calendar.getInstance();
        Robot robot = new Robot();
        BufferedImage screenShot = robot.createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
        //ImageIO.write(screenShot, "PNG", new File("F:\\Samples\\temp\\" + formatter.format(now.getTime())+ ".png"));
        //ImageIO.write(screenShot, "PNG", new File("F:\\Samples\\telaatual.png"));
        //System.out.println(formatter.format(now.getTime()));
        tela = BufferedImage2Mat(screenShot);
        screenShot = null;
    }

    public static BufferedImage Mat2BufferedImage(Mat matrix)throws Exception {
        MatOfByte mob=new MatOfByte();
        Imgcodecs.imencode(".png", matrix, mob);
        return ImageIO.read(new ByteArrayInputStream(mob.toArray()));
    }
    
    public static Mat BufferedImage2Mat(BufferedImage image) throws Exception {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ImageIO.write(image, "png", byteArrayOutputStream);
        byteArrayOutputStream.flush();
        return Imgcodecs.imdecode(new MatOfByte(byteArrayOutputStream.toByteArray()), Imgcodecs.IMREAD_UNCHANGED);
    }
        
    public static Mat getmat(){
    	
    	return tela;
    	
    }
    
    public static void main(String[] args) throws Exception
    {
        screen2image s2i = new screen2image();
        while(1==1)
        {
            s2i.robo();
            Thread.sleep(5000);
            
        }
    }
}
