package backend;

import java.awt.Image;
import java.io.File;

public class Picture {
	Image imageFile;
	Integer noTypos;
	
	//constructor class for image
	public Picture(String url) {
		//file naming convention: noOfTypos_image_imageNo
		//3_image_1
		noTypos = Integer.parseInt(Character.toString(url.charAt(0)));
		//TODO: Finish generating imageFile
	}
	public int getNoTypos(){ 
		return noTypos;
	}
}


