package tttt;

public class enova {
    public static void main(String[] args) {
        String str = "e should be the most common vowel in this sentence";
        str =str.toLowerCase();

        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'e') {

                count ++;
            }
        }
    }
}





