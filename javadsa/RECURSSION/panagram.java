package RECURSSION;


public class panagram {
        private static boolean isPangramHelper(String sentence, char currentLetter) {
            if (currentLetter > 'z') {
                return true;
            }
            if (!sentence.contains(String.valueOf(currentLetter))) {
                return false;
            }
            return isPangramHelper(sentence, (char) (currentLetter + 1));
        }
        public static boolean isPangram(String sentence) {   
            sentence = sentence.toLowerCase();
            return isPangramHelper(sentence, 'a');
        }
        public static void main(String[] args) {
            String sentence = "the quick brown fox jumps over a lazy dog";
    
            if (isPangram(sentence)) {
                System.out.println("The sentence is a pangram.");
            } else {
                System.out.println("The sentence is not a pangram.");
            }
        }
    }
    

