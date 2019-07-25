package templatem;

import org.opencv.core.*;
import org.opencv.core.Point;
//import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;

import screenshooter.screen2image;



import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.opencv.imgcodecs.Imgcodecs;




public class templatematch {
    boolean use_mask = false;
    Point matchLoc;
    int match_method;
    
    
    
    
    public void run(String []args){
    
  
       
    
}
    public Image toBufferedImage(Mat m) {
        int type = BufferedImage.TYPE_BYTE_GRAY;
        if ( m.channels() > 1 ) {
            type = BufferedImage.TYPE_3BYTE_BGR;
        }
        int bufferSize = m.channels()*m.cols()*m.rows();
        byte [] b = new byte[bufferSize];
        m.get(0,0,b); // get all the pixels
        BufferedImage image = new BufferedImage(m.cols(),m.rows(), type);
        final byte[] targetPixels = ((DataBufferByte) image.getRaster().getDataBuffer()).getData();
        System.arraycopy(b, 0, targetPixels, 0, b.length);
        return image;
    }

    
    public void templatematch1(String infile1, String infile2){
        
    	Mat tela = screen2image.getmat();
       
        System.out.println("\nRunning Template Matching");
       
         //Mat tela = Highgui.imread(infile1,Highgui.CV_LOAD_IMAGE_COLOR);
         
         Mat templ = Imgcodecs.imread(infile2,Imgcodecs.IMREAD_ANYCOLOR);
    
        // / Create the result matrix
        int result_cols = tela.cols() - templ.cols() + 1;
        int result_rows = tela.rows() - templ.rows() + 1;
        Mat result = new Mat(result_rows, result_cols, CvType.CV_32FC1);

        // / Do the Matching and Normalize
        Imgproc.matchTemplate(tela, templ, result, match_method);
        Core.normalize(result, result, 0, 1, Core.NORM_MINMAX, -1, new Mat());

        // / Localizing the best match with minMaxLoc
        Core.MinMaxLocResult mmr = Core.minMaxLoc(result);

        
        if (match_method == Imgproc.TM_SQDIFF || match_method == Imgproc.TM_SQDIFF_NORMED) {
            matchLoc = mmr.minLoc;
        } else {
            matchLoc = mmr.maxLoc;
        }
        // / Show me what you got
        Imgproc.rectangle(tela, matchLoc, new Point(matchLoc.x + templ.cols(),
                matchLoc.y + templ.rows()), new Scalar(0, 255, 0));
        
        
        System.out.println(matchLoc);
        
        // Save the visualized detection.
        //System.out.println("Writing "+ "F:\\Samples\\Match.png");
        DateFormat dateFormat = new SimpleDateFormat("ddMMyyyy HHmmSss");
        Date date = new Date();
        String dat = dateFormat.format(date);
        Imgcodecs.imwrite("F:\\Samples\\temp\\Match"+dat+" "+ getmatchLocX().toString() + " = X, " + getmatchLocY().toString() + " = Y, "  + ".png", tela);
        Imgcodecs.imwrite("F:\\Samples\\Match.png", tela);
        //Imgcodecs.imwrite("F:\\Samples\\Match.png", tela);
        
        }
    
    	public void templatematch1(String infile2){
        
    	Mat tela = screen2image.getmat();
       
    	System.out.println("\nRunning Template Matching");
       
         //Mat tela = Highgui.imread(infile1,Highgui.CV_LOAD_IMAGE_COLOR);
         
         Mat templ = Imgcodecs.imread(infile2,Imgcodecs.IMREAD_ANYCOLOR);
    
        // / Create the result matrix
        int result_cols = tela.cols() - templ.cols() + 1;
        int result_rows = tela.rows() - templ.rows() + 1;
        Mat result = new Mat(result_rows, result_cols, CvType.CV_32FC1);

        // / Do the Matching and Normalize
        Imgproc.matchTemplate(tela, templ, result, match_method);
        Core.normalize(result, result, 0, 1, Core.NORM_MINMAX, -1, new Mat());

        // / Localizing the best match with minMaxLoc
        Core.MinMaxLocResult mmr = Core.minMaxLoc(result);

        
        if (match_method == Imgproc.TM_SQDIFF || match_method == Imgproc.TM_SQDIFF_NORMED) {
            matchLoc = mmr.minLoc;
        } else {
            matchLoc = mmr.maxLoc;
        }
        
        //int resox = tela.cols();
        //int resoy = tela.rows();
        //System.out.println("Resolucao: " +resox+"x"+resoy);
        
        //  Show me what you got
        Imgproc.rectangle(tela, matchLoc, new Point(matchLoc.x + templ.cols(),
               matchLoc.y + templ.rows()), new Scalar(0, 255, 0));
        
        
        
		
        
      
        System.out.println(matchLoc);
        
        
        // Save the visualized detection.
        //System.out.println("Writing "+ "F:\\Samples\\Match.png");
        
        
        String comparado = infile2.replace("/","-").replace("\\","-").replace("."," ").replace(":", "");
        DateFormat dateFormat = new SimpleDateFormat("ddMMyyyy HHmmSss");
        Date date = new Date();
        String dat = dateFormat.format(date);
        Imgcodecs.imwrite("F:\\Samples\\temp\\Match"+dat+" "+ " ,X = "+ getmatchLocX().toString()  +" ,Y = " + getmatchLocY().toString() + " "+ comparado + ".png", tela);
        Imgcodecs.imwrite("F:\\Samples\\Match.png", tela);
        
        
        }
    
    
    public Point getmatchLoc(){
    	Point matchLoc1 = this.matchLoc;
    	
    	return matchLoc1;
    }
    public Integer getmatchLocX(){
    	return (int) Math.round(matchLoc.x);
    }
    
    public Integer getmatchLocY(){
    	return (int) Math.round(matchLoc.y);
    }
    
    }
    
    

