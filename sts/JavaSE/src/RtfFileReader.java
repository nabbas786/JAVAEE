import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class RtfFileReader {

	public static void main(String[] args) {

		
		try(FileInputStream fio=new FileInputStream(new File("./data/abc.rtf"));) {
			
			System.out.println(fio.read());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
