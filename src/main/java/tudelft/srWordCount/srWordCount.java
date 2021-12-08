package tudelft.srWordCount;

public class srWordCount {
    public int count(String str){
        int words = 0;
        char last = ' ';

        int length = str.length();

        for (int i = 0; i < length; i++){
            //checks if character is a symbol and the previous letter is an r or s
            if (!Character.isLetter(str.charAt(i)) &&
                    (last == 'r' || last == 's')) {
                words++;
                last = str.charAt(i);
                System.out.println("FIRST IF - i: "+i+" last: "+last+" words: "+words);
            }

            last = str.charAt(i);

            System.out.println("OUTSIDE FIRST IF - i: "+i+" last: "+last+" words: "+words);

        }
        if (last == 'r' || last == 's') {
            words++;
            System.out.println("SECOND IF - last: "+last+" words: "+words);
        }
        return words;
    }
}
