import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Morse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text;
		Scanner scan = new Scanner(System.in);
		PrintWriter out;
		try {
			out = new PrintWriter("Morse.ino");
			out.println("void setup()");
			out.println("{");
			out.println(" pinMode(13, OUTPUT);");
			out.println("}");
			out.println();
			System.out.println("Please enter the message: ");
			text = scan.nextLine();
			char[] ctext = text.toCharArray();

			out.println("void loop()");
			out.println("{");
			MorseTranslate(ctext,out);
			out.println(" delay(8500);");
			out.println("}");
			out.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	private static void MorseTranslate(char[] c, PrintWriter o)
	{
		for(int i = 0; i<c.length;++i)
		{
			switch(c[i])
			{
				case 'A':
					o.println(" digitalWrite(13, HIGH); //A");
					o.println(" delay(500);");
					o.println(" digitalWrite(13, LOW);");
					o.println(" delay(500);");
					o.println(" digitalWrite(13, HIGH);");
					o.println(" delay(1500);");
					o.println(" digitalWrite(13, LOW);");
					o.println(" delay(1500);");
					break;
				case 'B':
					o.println(" digitalWrite(13, HIGH); //B");
					o.println(" delay(1500);");
					o.println(" digitalWrite(13, LOW);");
					o.println(" delay(500);");
					o.println(" digitalWrite(13, HIGH);");
					o.println(" delay(500);");
					o.println(" digitalWrite(13, LOW);");
					o.println(" delay(500);");
					o.println(" digitalWrite(13, HIGH);");
					o.println(" delay(500);");
					o.println(" digitalWrite(13, LOW);");
					o.println(" delay(500);");
					o.println(" digitalWrite(13, HIGH);");
					o.println(" delay(500);");
					o.println(" digitalWrite(13, LOW);");
					o.println(" delay(1500);");
					break;
				case 'C':
					o.println(" digitalWrite(13, HIGH); //C");
					o.println(" delay(1500);");
					o.println(" digitalWrite(13, LOW);");
					o.println(" delay(500);");
					o.println(" digitalWrite(13, HIGH);");
					o.println(" delay(500);");
					o.println(" digitalWrite(13, HIGH);");
					o.println(" delay(1500);");
					o.println(" digitalWrite(13, LOW);");
					o.println(" delay(500);");
					o.println(" digitalWrite(13, HIGH);");
					o.println(" delay(500);");
					o.println(" digitalWrite(13, LOW);");
					o.println(" delay(1500);");
					break;
				case 'D':
					o.println(" digitalWrite(13, HIGH); //D");
					o.println(" delay(1500);");
					o.println(" digitalWrite(13, LOW);");
					o.println(" delay(500);");
					o.println(" digitalWrite(13, HIGH);");
					o.println(" delay(500);");
					o.println(" digitalWrite(13, LOW);");
					o.println(" delay(500);");
					o.println(" digitalWrite(13, HIGH);");
					o.println(" delay(500);");
					o.println(" digitalWrite(13, LOW);");
					o.println(" delay(1500);");
					break;
				case 'E':
					o.println(" digitalWrite(13, HIGH); //E");
					o.println(" delay(500);");
					o.println(" digitalWrite(13, LOW);");
					o.println(" delay(1500);");
					break;
				case 'F':
					o.println(" digitalWrite(13, HIGH); //F");
					o.println(" delay(500);");
					o.println(" digitalWrite(13, LOW);");
					o.println(" delay(500);");
					o.println(" digitalWrite(13, HIGH);");
					o.println(" delay(500);");
					o.println(" digitalWrite(13, LOW);");
					o.println(" delay(500);");
					o.println(" digitalWrite(13, HIGH);");
					o.println(" delay(1500);");
					o.println(" digitalWrite(13, LOW);");
					o.println(" delay(500);");
					o.println(" digitalWrite(13, HIGH);");
					o.println(" delay(500);");
					o.println(" digitalWrite(13, LOW);");
					o.println(" delay(1500);");
					break;
				case 'G':
					o.println(" digitalWrite(13, HIGH); //G");
					o.println(" delay(1500);");
					o.println(" digitalWrite(13, LOW);");
					o.println(" delay(500);");
					o.println(" digitalWrite(13, HIGH);");
					o.println(" delay(1500);");
					o.println(" digitalWrite(13, LOW);");
					o.println(" delay(500);");
					o.println(" digitalWrite(13, HIGH);");
					o.println(" delay(500);");
					o.println(" digitalWrite(13, LOW);");
					o.println(" delay(1500);");
					break;
				case 'H':
					o.println(" digitalWrite(13, HIGH); //H");
					o.println(" delay(500);");
					o.println(" digitalWrite(13, LOW);");
					o.println(" delay(500);");
					o.println(" digitalWrite(13, HIGH);");
					o.println(" delay(500);");
					o.println(" digitalWrite(13, LOW);");
					o.println(" delay(500);");
					o.println(" digitalWrite(13, HIGH);");
					o.println(" delay(500);");
					o.println(" digitalWrite(13, LOW);");
					o.println(" delay(500);");
					o.println(" digitalWrite(13, HIGH);");
					o.println(" delay(500);");
					o.println(" digitalWrite(13, LOW);");
					o.println(" delay(1500);");
					break;
				case 'I':
					o.println(" digitalWrite(13, HIGH); //I");
					o.println(" delay(500);");
					o.println(" digitalWrite(13, LOW);");
					o.println(" delay(500);");
					o.println(" digitalWrite(13, HIGH);");
					o.println(" delay(500);");
					o.println(" digitalWrite(13, LOW);");
					o.println(" delay(1500);");
					break;
				case 'J':
					o.println(" digitalWrite(13, HIGH); //J");
					o.println(" delay(500);");
					o.println(" digitalWrite(13, LOW);");
					o.println(" delay(500);");
					o.println(" digitalWrite(13, HIGH);");
					o.println(" delay(1500);");
					o.println(" digitalWrite(13, LOW);");
					o.println(" delay(500);");
					o.println(" digitalWrite(13, HIGH);");
					o.println(" delay(1500);");
					o.println(" digitalWrite(13, LOW);");
					o.println(" delay(500);");
					o.println(" digitalWrite(13, HIGH);");
					o.println(" delay(1500);");
					o.println(" digitalWrite(13, LOW);");
					o.println(" delay(1500);");
					break;
				case 'K':
					o.println(" digitalWrite(13, HIGH); //K");
					o.println(" delay(1500);");
					o.println(" digitalWrite(13, LOW);");
					o.println(" delay(500);");
					o.println(" digitalWrite(13, HIGH); ");
					o.println(" delay(500);");
					o.println(" digitalWrite(13, LOW);");
					o.println(" delay(500);");
					o.println(" digitalWrite(13, HIGH);");
					o.println(" delay(1500);");
					o.println(" digitalWrite(13, LOW);");
					o.println(" delay(1500);");
					break;
				case 'L':
					o.println(" digitalWrite(13, HIGH); //L");
					o.println(" delay(500);");
					o.println(" digitalWrite(13, LOW);");
					o.println(" delay(500);");
					o.println(" digitalWrite(13, HIGH);");
					o.println(" delay(1500);");
					o.println(" digitalWrite(13, LOW);");
					o.println(" delay(500);");
					o.println(" digitalWrite(13, HIGH);");
					o.println(" delay(1500);");
					o.println(" digitalWrite(13, LOW);");
					o.println(" delay(500);");
					o.println(" digitalWrite(13, HIGH);");
					o.println(" delay(1500);");
					o.println(" digitalWrite(13, LOW);");
					o.println(" delay(1500);");
					break;
				case 'M':
					o.println(" digitalWrite(13, HIGH); //M");
					o.println(" delay(1500);");
					o.println(" digitalWrite(13, LOW);");
					o.println(" delay(500);");
					o.println(" digitalWrite(13, HIGH);");
					o.println(" delay(1500);");
					o.println(" digitalWrite(13, LOW);");
					o.println(" delay(1500);");
					break;
				case 'N':
					o.println(" digitalWrite(13, HIGH); //N");
					o.println(" delay(1500);");
					o.println(" digitalWrite(13, LOW);");
					o.println(" delay(500);");
					o.println(" digitalWrite(13, HIGH);");
					o.println(" delay(500);");
					o.println(" digitalWrite(13, LOW);");
					o.println(" delay(1500);");
					break;
				case 'O':
					o.println(" digitalWrite(13, HIGH); //O");
					o.println(" delay(1500);");
					o.println(" digitalWrite(13, LOW);");
					o.println(" delay(500);");
					o.println(" digitalWrite(13, HIGH);");
					o.println(" delay(1500);");
					o.println(" digitalWrite(13, LOW);");
					o.println(" delay(500);");
					o.println(" digitalWrite(13, HIGH);");
					o.println(" delay(1500);");
					o.println(" digitalWrite(13, LOW);");
					o.println(" delay(1500);");
					break;
				case 'P':
					o.println(" digitalWrite(13, HIGH); //P");
					o.println(" delay(500);");
					o.println(" digitalWrite(13, LOW);");
					o.println(" delay(500);");
					o.println(" digitalWrite(13, HIGH);");
					o.println(" delay(1500);");
					o.println(" digitalWrite(13, LOW);");
					o.println(" delay(500);");
					o.println(" digitalWrite(13, HIGH);");
					o.println(" delay(1500);");
					o.println(" digitalWrite(13, LOW);");
					o.println(" delay(500);");
					o.println(" digitalWrite(13, HIGH);");
					o.println(" delay(500);");
					o.println(" digitalWrite(13, LOW);");
					o.println(" delay(1500);");
					break;
				case 'Q':
					o.println(" digitalWrite(13, HIGH); //Q");
					o.println(" delay(1500);");
					o.println(" digitalWrite(13, LOW);");
					o.println(" delay(500);");
					o.println(" digitalWrite(13, HIGH);");
					o.println(" delay(1500);");
					o.println(" digitalWrite(13, LOW);");
					o.println(" delay(500);");
					o.println(" digitalWrite(13, HIGH);");
					o.println(" delay(500);");
					o.println(" digitalWrite(13, LOW);");
					o.println(" delay(500);");
					o.println(" digitalWrite(13, HIGH); //G");
					o.println(" delay(1500);");
					o.println(" digitalWrite(13, LOW);");
					o.println(" delay(1500);");
					break;
				case 'R':
					o.println(" digitalWrite(13, HIGH); //R");
					o.println(" delay(500);");
					o.println(" digitalWrite(13, LOW);");
					o.println(" delay(500);");
					o.println(" digitalWrite(13, HIGH);");
					o.println(" delay(1500);");
					o.println(" digitalWrite(13, LOW);");
					o.println(" delay(500);");
					o.println(" digitalWrite(13, HIGH);");
					o.println(" delay(500);");
					o.println(" digitalWrite(13, LOW);");
					o.println(" delay(1500);");
					break;
				case 'S':
					o.println(" digitalWrite(13, HIGH); //S");
					o.println(" delay(500);");
					o.println(" digitalWrite(13, LOW);");
					o.println(" delay(500);");
					o.println(" digitalWrite(13, HIGH);");
					o.println(" delay(500);");
					o.println(" digitalWrite(13, LOW);");
					o.println(" delay(500);");
					o.println(" digitalWrite(13, HIGH);");
					o.println(" delay(500);");
					o.println(" digitalWrite(13, LOW);");
					o.println(" delay(1500);");
					break;
				case 'T':
					o.println(" digitalWrite(13, HIGH); //T");
					o.println(" delay(1500);");
					o.println(" digitalWrite(13, LOW);");
					o.println(" delay(1500);");
					break;
				case 'U':
					o.println(" digitalWrite(13, HIGH); //U");
					o.println(" delay(500);");
					o.println(" digitalWrite(13, LOW);");
					o.println(" delay(500);");
					o.println(" digitalWrite(13, HIGH);");
					o.println(" delay(500);");
					o.println(" digitalWrite(13, LOW);");
					o.println(" delay(500);");
					o.println(" digitalWrite(13, HIGH);");
					o.println(" delay(1500);");
					o.println(" digitalWrite(13, LOW);");
					o.println(" delay(1500);");
					break;
				case 'V':
					o.println(" digitalWrite(13, HIGH); //V");
					o.println(" delay(500);");
					o.println(" digitalWrite(13, LOW);");
					o.println(" delay(500);");
					o.println(" digitalWrite(13, HIGH);");
					o.println(" delay(500);");
					o.println(" digitalWrite(13, LOW);");
					o.println(" delay(500);");
					o.println(" digitalWrite(13, HIGH);");
					o.println(" delay(500);");
					o.println(" digitalWrite(13, LOW);");
					o.println(" delay(500);");
					o.println(" digitalWrite(13, HIGH);");
					o.println(" delay(1500);");
					o.println(" digitalWrite(13, LOW);");
					o.println(" delay(1500);");
					break;
				case 'W':
					o.println(" digitalWrite(13, HIGH); //W");
					o.println(" delay(500);");
					o.println(" digitalWrite(13, LOW);");
					o.println(" delay(500);");
					o.println(" digitalWrite(13, HIGH);");
					o.println(" delay(1500);");
					o.println(" digitalWrite(13, LOW);");
					o.println(" delay(500);");
					o.println(" digitalWrite(13, HIGH);");
					o.println(" delay(1500);");
					o.println(" digitalWrite(13, LOW);");
					o.println(" delay(1500);");
					break;
				case 'X':
					o.println(" digitalWrite(13, HIGH); //X");
					o.println(" delay(1500);");
					o.println(" digitalWrite(13, LOW);");
					o.println(" delay(500);");
					o.println(" digitalWrite(13, HIGH);");
					o.println(" delay(500);");
					o.println(" digitalWrite(13, LOW);");
					o.println(" delay(500);");
					o.println(" digitalWrite(13, HIGH);");
					o.println(" delay(500);");
					o.println(" digitalWrite(13, LOW);");
					o.println(" delay(500);");
					o.println(" digitalWrite(13, HIGH);");
					o.println(" delay(1500);");
					o.println(" digitalWrite(13, LOW);");
					o.println(" delay(1500);");
					break;
				case 'Y':
					o.println(" digitalWrite(13, HIGH); //Y");
					o.println(" delay(1500);");
					o.println(" digitalWrite(13, LOW);");
					o.println(" delay(500);");
					o.println(" digitalWrite(13, HIGH);");
					o.println(" delay(500);");
					o.println(" digitalWrite(13, LOW);");
					o.println(" delay(500);");
					o.println(" digitalWrite(13, HIGH);");
					o.println(" delay(1500);");
					o.println(" digitalWrite(13, LOW);");
					o.println(" delay(500);");
					o.println(" digitalWrite(13, HIGH);");
					o.println(" delay(1500);");
					o.println(" digitalWrite(13, LOW);");
					o.println(" delay(1500);");
					break;
				case 'Z':
					o.println(" digitalWrite(13, HIGH); //Z");
					o.println(" delay(1500);");
					o.println(" digitalWrite(13, LOW);");
					o.println(" delay(500);");
					o.println(" digitalWrite(13, HIGH);");
					o.println(" delay(1500);");
					o.println(" digitalWrite(13, LOW);");
					o.println(" delay(500);");
					o.println(" digitalWrite(13, HIGH);");
					o.println(" delay(500);");
					o.println(" digitalWrite(13, LOW);");
					o.println(" delay(500);");
					o.println(" digitalWrite(13, HIGH);");
					o.println(" delay(500);");
					o.println(" digitalWrite(13, LOW);");
					o.println(" delay(1500);");
					break;
				default:
					o.println(" delay(2000);");
				
			}
		}
	}
	
	//out.println(" digitalWrite(13, HIGH);");
	//out.println(" delay(250);");
	//out.println(" digitalWrite(13, LOW);");
	//out.println(" delay(250);");

}
