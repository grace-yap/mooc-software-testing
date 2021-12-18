package tudelft.mirror;

public class Mirror {

    public String mirrorEnds(String string) {
        String mirror = "";

        //handle null value
        if (string == null) {
            return ("null");
        }

        int begin = 0;
        int end = string.length() - 1;
        for (; begin < end; begin++, end--) {
            if (string.charAt(begin) == string.charAt(end)) {
                mirror += String.valueOf(string.charAt(end));
            }
            else {
                break;
            }
        }

        return begin == end ? string : mirror;
        /*if (begin == end) {
            System.out.println("begin: "+begin+", end: "+end+", string: "+string+", mirror: "+mirror);
            return string;
        }
        else {
            System.out.println("begin: "+begin+", end: "+end+", string:"+string+", mirror: "+mirror);
            return mirror;
        }*/
    }
}
