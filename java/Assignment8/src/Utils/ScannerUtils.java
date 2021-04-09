package Utils;

import java.util.Scanner;

public class ScannerUtils {

	public static String inputString(Scanner scanner, String errString) {
		while (true) {
			String input = scanner.nextLine().trim();
			if (!input.isEmpty()) {
				return input;
			} else {
				printErrString(errString);
			}
		}
	}


	private static void printErrString(String errString) {
		System.err.println(errString);
	}
		
	}
