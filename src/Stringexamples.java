import java.util.Locale;

public class Stringexamples {
    public static void main(String[] args) {
        String text1 = "This is text example";
        String text2 = text1.intern();
        System.out.println(text2);

        //concatenation of strings
        String input1 = "This is ";
        String input2 = "input text. ";

        String inputCombined = input1.concat(input2);
        System.out.println(inputCombined);

        //comparing strings

        String val1 = "Test";
        String val2 = "Test";
        System.out.println(val1.equals(val2));
        System.out.println(val2.equals(val1));
        System.out.println(val1.equals("Test"));
        //compares text, case sensitive, space sensitive, can compare 2 values, true or false
        //String class methods
        String inputText="This is my text";
        //length
        System.out.println(inputText.length());
        //To upper case
        System.out.println(inputText.toUpperCase());
        System.out.println(inputText);
        //to lowercase
        System.out.println(inputText.toLowerCase());

        //string clas methods indexof()
        String speakingText = "This is test value";
        System.out.println(speakingText.indexOf('e'));
        System.out.println(speakingText.indexOf("is"));

        //replaceall()
        //sudas

        String textForTV = "This phone is compleate sudas.And this case also is sudas.";
        System.out.println(textForTV.replaceAll("sudas", "bip bip"));
        //Character index
        System.out.println(textForTV.charAt(textForTV.length()-1));
        //substring
        System.out.println(textForTV.substring(5));
        System.out.println(textForTV.substring(5,12));

        //parcing
        //converting string to primitive data type

        String intValue = "165";
        String floatValue = "2.0";
        String doubleValue = "2.4545345345";
        String boolValue = "true";
        String longValue = "10000000000";

        System.out.println(Integer.parseInt(intValue));
    }
}
