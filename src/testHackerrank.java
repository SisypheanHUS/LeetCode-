public class testHackerrank {
    public static String decryptMessage(String encryptedMessage) {
        String[] words = encryptedMessage.split(" ");
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            words[i] = convertNumbersToLetters(words[i]);
        }
        for (int i = words.length - 1; i >= 0; i--) {
            res.append(words[i]).append(" ");
        }
        return res.toString().trim();
    }
    public static String convertNumbersToLetters(String input) {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if (i + 1 < input.length() && Character.isDigit(input.charAt(i + 1))) {
                int num = Integer.parseInt(String.valueOf(input.charAt(i + 1)));
                while(num > 0){
                    output.append(input.charAt(i));
                    num--;
                }
                i++;
            } else {
                output.append(input.charAt(i));
            }
        }
        return output.toString();
    }

    public static void main(String[] args) {
    String encryptedMessage = "4A3 3B2 C1D";
        System.out.println(decryptMessage(encryptedMessage));
}
