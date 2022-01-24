import java.util.ArrayList;
import java.util.List;

public class StringReversal {

    @Deprecated
    /*public static String reverse(String s) {
        List<String> tempArray = new ArrayList<String>(s.length());
        for (int i = 0; i < s.length(); i++) {
            tempArray.add(s.substring(i, i+1));
        }
        StringBuilder reversedString = new StringBuilder(s.length());
        for (int i = tempArray.size() -1; i >= 0; i--) {
            reversedString.append(tempArray.get(i));
        }
        return reversedString.toString();
    }*/

    /**
     * Refactored version
     */
    public static String reverse(String s) {
        StringBuilder builder = new StringBuilder(s.length());
        for(int count=s.length()-1; count>=0; count--){
            builder.append(s.charAt(count));
        }
        return builder.toString();
    }
}
