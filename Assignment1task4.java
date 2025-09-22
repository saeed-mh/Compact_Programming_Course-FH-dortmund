package assignment1Problem4;

public class Assignment1task4{
	public static void main(String[] args) {
        String text = "To be or not to be, that is the question;"
                + "Whether `tis nobler in the mind to suffer"
                + " the slings and arrows of outrageous fortune,"
                + " or to take arms against a sea of troubles,"
                + " and by opposing end them?";

        text = text.replaceAll("[^a-zA-Z ]", "").toLowerCase();
        String[] words = text.split("\\s+");

        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i < words.length - 1; i++) {
                if (words[i].compareTo(words[i + 1]) > 0) {
                    String temp = words[i];
                    words[i] = words[i + 1];
                    words[i + 1] = temp;
                    swapped = true;
                }
            }
        } while (swapped);

        System.out.println("Words in alphabetical order:");
        for (String word : words) {
            System.out.println(word);
        }
    }

}
