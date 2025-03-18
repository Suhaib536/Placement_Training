class LetterFrequency {
    public static void main(String[] args) {
        String text = "hello world";
        text = text.replaceAll("\\s", "");

        String[] letters = text.split("");
        String[] uniqueLetters = new String[letters.length];
        int[] frequency = new int[letters.length];
        int uniqueCount = 0;

        for (String letter : letters) {
            boolean found = false;
            for (int j = 0; j < uniqueCount; j++) {
                if (uniqueLetters[j].equals(letter)) {
                    frequency[j]++;
                    found = true;
                    break;
                }
            }
            if (!found) {
                uniqueLetters[uniqueCount] = letter;
                frequency[uniqueCount] = 1;
                uniqueCount++;
            }
        }

        for (int i = 0; i < uniqueCount; i++) {
            System.out.println(uniqueLetters[i] + ": " + frequency[i]);
        }
    }
}
