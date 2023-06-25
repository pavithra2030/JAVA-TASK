import java.io.*;
public class ReadDirectory{
	public static void main(String args[]){
		String dir = "C:/Users/Muthulakshmi.R/Desktop";
		File f = new File(dir);
		if(f.isDirectory()){
			System.out.println("Welcome to Directory of "+dir);
			String s[] = f.list();
		for(int i=0;i<s.length;i++){
			File f1 = new File(dir + "/" +s[i]);
		if(f1.isDirectory()){
			System.out.println(s[i] + "is directory");
		}else{
			System.out.println(s[i] + "is file");
		}
		}
		}else{
			System.out.println(dir + "is not a Directory");
		}
	}
}