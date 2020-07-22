package Problem1;
import java.io.*;

public class Grades {
	private int[] grades = new int[1000];
	private String[] names = new String[1000];
	private int a = 0, 
				max = 0, 
				min = Integer.MAX_VALUE, 
				average = 0;
		
	void marking () throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("scores.txt"));
		
		try {
		    String line = "";
		    while (true) {
		        line = br.readLine();
		        
		        if (line == null)
		        		break;
		        
		        String[] word = line.split(" ");
		        names[a] = word[0] + " " + word[1];
		        grades[a] = Integer.parseInt(word[2]);
		        
		        max = Math.max(max, grades[a]);
		        min = Math.min(min, grades[a]);
		        average += grades[a];
		        a++;
		    }
		} 
		
		finally {
		    br.close();
		}
	}
	
	String marking (int mark) {
		if (mark >= max - 10)
			return "A";
		if (mark >= max - 20)
			return "B";
		if (mark >= max - 30)
			return "C";
		if (mark >= max - 40)
			return "D";
		return "F";
	}
	
	void writing () throws IOException {	
		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("grades.txt")));
		
		for (int i = 0; i < a; i++) {
			pw.println(names[i] + " - " + "'" + marking(grades[i]) + "'");	
		}
		pw.println();
		pw.println("Average is " + average/a);
		pw.println("Maximum is " + max);
		pw.println("Minimum is " + min);
		pw.close();
	}
}
