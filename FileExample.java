import java.io.*;
public class FileExample{
	public static void main(String args[])throws IOException{
	DataInputStream dis = new DataInputStream(new FileInputStream("C:\\Users\\Muthulakshmi.R\\Desktop\\text.txt"));
	DataOutputStream dos = new DataOutputStream(new FileOutputStream("C:\\Users\\Muthulakshmi.R\\Desktop\\copytext.txt"));
	String count;
	while((count = dis.readLine()) != null){
		String data = count.toUpperCase();
		System.out.println(data);
		dos.writeBytes(data+",");
	}
	dis.close();
	dos.close();
	}
}