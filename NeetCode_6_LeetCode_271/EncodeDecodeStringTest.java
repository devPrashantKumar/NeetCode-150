package NeetCode_6_LeetCode_271;

import java.util.*;

class SolutionEncodeDecodeStringTest {
    public String encode(List<String> strs) {
        String encodedString = "";
        for (int i = 0; i < strs.size(); i++) {
            encodedString = encodedString + strs.get(i).length()+"#"+ strs.get(i);
        }
        return encodedString;
    }

    public List<String> decode(String str) {
        List<String> stringList = new ArrayList<>();
        int index = 0;
        while(index<str.length()){
            int stringLength = Integer.parseInt(str.substring(index, str.indexOf('#', index)));
            
            System.out.print(stringLength);
            String current = str.substring(index+1, index+1+stringLength);
            stringList.add(current);
            index = (index+stringLength+1); 
        }
        return stringList;
    }
}

public class EncodeDecodeStringTest {
    public static void main(String[] args) {
        SolutionEncodeDecodeStringTest solution = new SolutionEncodeDecodeStringTest();
        // List<String> input1 = List.of( "neet", "code", "love", "you" );
        // String encodedString = solution.encode(input1);
        // System.out.println("Encoded String : " + encodedString);
        // List<String> decodedString = solution.decode(encodedString);
        // System.out.println("Decoded String : " + decodedString);
        System.out.println("----------------------------------------------------------------");
        List<String> input2 = List.of("we","say",":","yes","!@#$%^&*()");
        String encodedString2 = solution.encode(input2);
        System.out.println("Encoded String : " + encodedString2);
        // List<String> decodedString2 = solution.decode(encodedString2);
        // System.out.println("Decoded String : " + decodedString2);
    }

}
