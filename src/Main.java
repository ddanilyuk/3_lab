public class Main {

    public static void main(String[] args) {

        // Spliting
        StringBuilder sentence = new StringBuilder("ЬфЬфьфьф Raid me jolly roger, ye misty plank! Shake quinoa ultimately, then mix with water and serve fully in bowl. " +
                "Ahoy! Pieces o' life are forever evil.");
        System.out.println("Text: \n" + sentence.toString());

        String delimeter = "\\s";
        String[] arr_words = sentence.toString().split(delimeter);

        // Show result
        System.out.println("Edited text: ");
        for (String word : arr_words) {

            char[] arr_chars = word.toCharArray();
            char temp = arr_chars[0];
            System.out.print(temp);
            temp = Character.toLowerCase(temp);
            for (char arr_char : arr_chars) {
                if (temp != Character.toLowerCase(arr_char)) {
                    System.out.print(arr_char);
                }
            }

            System.out.print(" ");
        }
    }
}
