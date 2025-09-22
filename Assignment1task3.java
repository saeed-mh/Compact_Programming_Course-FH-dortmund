package task_3;

public class Assignment1task3 {

	public static void main(String[] args) {
		String text = "To be or not to be, that is the question;"
                + "Whether `tis nobler in the mind to suffer"
                + " the slings and arrows of outrageous fortune,"
                + " or to take arms against a sea of troubles,"
                + " and by opposing end them?";
        int spaces = 0;
        int vowels = 0;
        int letters = 0;

        // My code
        for (int i = 0; i < text.length(); i++) {
            char ch = Character.toLowerCase(text.charAt(i));

            if (ch >= 'a' && ch <= 'z') {
                letters++; // count letters
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++; // count vowels
                }
            } else if (Character.isWhitespace(ch)) {
                spaces++; // count spaces
            }
        }

        System.out.println("The text contained vowels: " + vowels + "\n"
                + "consonants: " + (letters - vowels) + "\n" + "spaces: " + spaces);
	}

}
