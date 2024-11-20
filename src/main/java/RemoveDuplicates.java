public class RemoveDuplicates {

    public static String removeDuplicates(String s) {
        StringBuilder result = new StringBuilder();
        char[] charArray = s.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            if (result.length() != 0 && (charArray[i] == result.charAt(result.length() - 1))) {
                result.deleteCharAt(result.length() - 1);
            } else {
                result.append(charArray[i]);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String input = "abbca";
        String result = removeDuplicates(input);
        System.out.println(result);
    }
}
