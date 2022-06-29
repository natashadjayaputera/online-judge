class ReverseString {

    String reverse(String inputString) {
        // TITLE: Traditional approach
        String outputString = "";
        for (int i = inputString.length()-1; i >= 0; i--) {
            outputString = outputString + inputString.charAt(i);
        }
        return outputString;

        // TITLE: StringBuilder approach
        // return new StringBuilder(inputString).reverse().toString();
    }
}
