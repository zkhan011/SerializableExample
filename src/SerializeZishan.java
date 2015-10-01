import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class SerializeZishan {

	public static void main(String[] args) {
		 {
		      Employee e = new Employee();
		      e.setName("zishan khan");
		      e.setAddress("sandiego");
		      e.setSSN("xxx-xx-xxxx");
		      e.setNumber(41586759);
		      
		      try
		      {
		         FileOutputStream fileOut =
		         new FileOutputStream("D:/employee.ser.txt");
		         ObjectOutputStream out = new ObjectOutputStream(fileOut);
		         out.writeObject(e);
		         out.close();
		         fileOut.close();
		         System.out.printf("Serialized data is saved in D:/employee.ser.txt");
		      }catch(IOException i)
		      {
		          i.printStackTrace();
		      }
		   }
		}
	}


