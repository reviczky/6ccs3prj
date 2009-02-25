/*
 * Cube, an interactive text-based adventure game
 * Copyright (C) 2009  Adam Janos Reviczky
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

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
