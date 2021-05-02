package qrcodeDemo;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.NotFoundException;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;

public class GenerateQRCode {
	//static function that creates QR Code  
	public static void generateQRcode(String data, String path, String charset, Map map, int h, int w) throws WriterException, IOException  
	{  
		//the BitMatrix class represents the 2D matrix of bits  
		//MultiFormatWriter is a factory class that finds the appropriate Writer subclass for the BarcodeFormat requested and encodes the barcode with the supplied contents.  
		BitMatrix matrix = new MultiFormatWriter().encode(new String(data.getBytes(charset), charset), BarcodeFormat.QR_CODE, w, h);  
		MatrixToImageWriter.writeToFile(matrix, path.substring(path.lastIndexOf('.') + 1), new File(path));  
	}  
	public static void main(String args[]) throws WriterException, IOException, NotFoundException  
	{  
		String str= "I am Java Developer and i want to Make something amazing";  
		String path = "F:\\QRCODE\\Quote.png";  
		String charset = "UTF-8";  
		Map<EncodeHintType, ErrorCorrectionLevel> hashMap = new HashMap<EncodeHintType, ErrorCorrectionLevel>();  
		hashMap.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.L);  
		generateQRcode(str, path, charset, hashMap, 200, 200);//increase or decrease height and width accodingly   
		System.out.println("QR Code created successfully.");  
	}  
}
