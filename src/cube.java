import java.io.*;
import java.util.regex.Pattern;

class cube {
    public static void main(String[] args) {
    	try {
    		System.out.print("proto> ");
    		String input = "";
    		BufferedReader ir = new BufferedReader(new InputStreamReader(System.in));
    		input = ir.readLine();

    		Pattern p = Pattern.compile("[,\\s]");
    		String[] word;
    		word = p.split(input);

        	while (!input.contentEquals("exit")) {
        		if (input.contentEquals("inventory")) {
        			System.out.println("Hello World!");
        		}
        		if (input.contentEquals("look")) {
        			System.out.println("room1");
        		}
        		if (input.contentEquals("go")) {
        			System.out.println("go somewhere");
        		}
        		if (input.contentEquals("help")) {
        			System.out.println("commands: help");
        		}
        		System.out.print("proto> ");
        		input = ir.readLine();
        	}
    		System.exit(0);
    	} catch (IOException ioe) {
    		System.out.println("IOException: " + ioe.getMessage());
    	}
    }
}
