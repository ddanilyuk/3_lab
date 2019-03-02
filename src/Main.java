public class Main {
    public static void main(String[] args) {
        /*
             8208
            /2 = 0
            /3 = 0
            /5 = 3
            /7 = 4
            /11 = 2
            /17 = 14
         */


        String text= "Hello my dad. I wanna be successful! And it is very hard.";
        System.out.println("Text: \n" + text);


        // Spliting
        StringBuilder sentence = new StringBuilder(text);
        String delimeter = "\\s";
        String[] arr_words = sentence.toString().split(delimeter);


        // Show result
        System.out.println("Edited text: ");
        for (String word : arr_words) {

            char[] arr_chars = word.toCharArray();
            for (int k = 0; k < arr_chars.length; k++) {
                char temp = arr_chars[0];
                if (k == 0) {
                    System.out.print(arr_chars[k]);
                }
                if (temp != arr_chars[k]) {
                    System.out.print(arr_chars[k]);
                }
            }

            System.out.print(" ");
        }
    }
}
