package Pack2;

import java.util.regex.*;

class Pno {

	public static boolean isValid(String s)
	{

		// The given argument to compile() method
		// is regular expression. With the help of
		// regular expression we can validate mobile
		// number for which we create an object of
		// Pattern class

		Pattern p = Pattern.compile(
			"^(\\+\\d{1,3}( )?)?((\\(\\d{1,3}\\))|\\d{1,3})[- .]?\\d{3,4}[- .]?\\d{4}$");

		// Pattern class contains matcher() method
		// to find matching between given number
		// and regular expression by creating an object of
		// Matcher class
		Matcher m = p.matcher(s);

		// Returns boolean value
		return (m.matches());
	}

	public static void main(String[] args)
	{

		// Custom input strings
		String p1 = "+1 212 555-3458";
		String p2 = "212.456.7890";

		// Checking if the strings are valid or not
		if (isValid(p1))
			System.out.println("Valid Number");
		else

			System.out.println("Invalid Number");


		if (isValid(p2))

			System.out.println("Valid Number");
		else

			System.out.println("Invalid Number");
	}
}
