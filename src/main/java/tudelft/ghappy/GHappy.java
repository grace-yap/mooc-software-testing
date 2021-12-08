package tudelft.ghappy;

public class GHappy {

    public boolean gHappy(String str) {
        assert str!=null;

        //checks if string has no g
        if(str.indexOf('g') < 0)
            return false;

        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'g') {
                //added separate checking for i = 0
                if (i == 0 && str.charAt(i+1) == 'g') { continue; }
                if (i > 0 && str.charAt(i-1) == 'g') { continue; }      //changed i >= 0 to i > 0
                if (i+1 < str.length() && str.charAt(i+1) == 'g') { continue; }
                return false;
            }
        }

        return true;

    }
}
