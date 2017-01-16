import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class IOExam01 {

	public static void main(String[] args) {
		FileOutputStream fout = null;
		try {
			fout = new FileOutputStream("data.txt");
			InputStream in = System.in;
			int data;

			while ((data = in.read()) != -1) {
				fout.write(data);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fout != null)
					fout.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
