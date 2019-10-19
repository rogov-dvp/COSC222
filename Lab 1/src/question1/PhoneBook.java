package question1;

public class PhoneBook {
	public static void main(String[] args) {

		String nameWrong = "Invalid Name";
		String phoneWrong = "Invalid Phone Number";
		String bothCorrect = "Valid Name and Phone Number";
		String bothWrong = "Invalid Name and Phone Number";

		String input = "<name>Big_Show</name><phone>250-899-6192</phone><name>John+Doe</name><phone>250-899-7525</phone><name>Big_Show</name><phone>+8801612300990</phone><name>$Jane_Doe</name><phone>250 899 7525</phone><name>John_Doe</name><phone>+1250 899 7525</phone>";

		int startString = 0;
		int endString = 0;
		int lengthSubstring = 0;

		try {
			do { 																	// When there are no more contacts, it will go into -1 via catch function
				startString = input.indexOf("<name>");								//Searches for the next "<name> and puts an index right after
				endString = input.indexOf("</phone>") + 8;							//Search for the next "</phone>" and put an index right after it
				String subString = input.substring(startString, endString);			//Takes the one person's contact info
				boolean nameCondition = nameCheck(subString);						//Checks if name is valid
				boolean phoneCondition = phoneCheck(subString);						//Checks if phone is valid
				System.out.println(subString);										//prints substring

				if (nameCondition == true && phoneCondition == true) // name and phone correct; statement
					System.out.println(bothCorrect + "\n");
				else if (nameCondition == false && phoneCondition == false) // name and phone wrong; statement
					System.out.println(bothWrong + "\n");
				else if (nameCondition == true && phoneCondition == false) // phone wrong; statement
					System.out.println(phoneWrong + "\n");
				else														 // name wrong; statement
					System.out.println(nameWrong + "\n");

				input = input.substring(endString, input.length());			// updates input string from the end of the first substring to the end of the original string

			} while (startString != -1);									//When there are no more substrings, the start of new string will be -1
		} catch (IndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			System.out.println("Parsing Complete");
		}
	}

	public static boolean nameCheck(String name) {
		boolean valid = true;
		int startString = 0;
		int endString = 0;

		startString = name.indexOf("<name>") + 6; // +6 because we begin counting the letters after "<name>...."
		endString = name.indexOf("</name>");

		for (int i = startString; i < endString; i++) { // <name>.....searches......</name>
			int c = name.charAt(i); // compares every character between the two tags against the "if" condition
									// below

			// not between a-z, nor A-Z, OR '_' at start of name, NOR '_' later in the name.
			// 97='a', 122='z', 65='A', 90='Z', 95='_'
			if (!((c >= 97 && c <= 122) || (c >= 65 && c <= 90) || (c == 95 && i == startString)
					|| (c == 95 && i > startString))) {
				valid = false;
				break;
			}
		}
		return valid;
	}

	public static boolean phoneCheck(String phone) {
		boolean valid = true;
		int startString = 0;
		int endString = 0;

		startString = phone.indexOf("<phone>") + 7;
		endString = phone.indexOf("</phone>");
		int length = endString - startString;

		for (int i = startString; i < endString; i++) { // <phone>.....searches......</phone>
			char character = phone.charAt(i); // Used for '+' and '-'
			int c = 0; // initializing c, used for numbers in phone number

			// trust me, it works ;)
			if (length == 14) {						//if phone number has a +, it will have a length of 14
				if (!((character == '+' && i == startString) || ((c >= 0 || c <= 9) && (i == startString + 1
						|| i == startString + 3 || i == startString + 4 || i == startString + 5 || i == startString + 7
						|| i == startString + 8 || i == startString + 9 || i == startString + 11
						|| i == startString + 12 || i == startString + 13 || i == startString + 14))
						&& (character == '-'
								&& (i == startString + 2 || i == startString + 6 || i == startString + 10)))) {
					valid = false;
					break;
				}
			} else if (length == 12) {				// if phone number doesn't have a +, it will have the length of 12
				if (((character == '+') && (i == startString)) || !((c >= 0 || c <= 9)
						&& (i == startString || i == startString + 1 || i == startString + 2 || i == startString + 4
								|| i == startString + 5 || i == startString + 6 || i == startString + 8
								|| i == startString + 9 || i == startString + 10 || i == startString + 11))
						&& (!(character == '-' && (i == startString + 3 || i == startString + 7)))) {
					valid = false;
					break;
				}
			} else {								// if it doesn't match those lengths then it's automatically wrong
				valid = false;
				break;
			}

		}
		return valid;
	}

}
