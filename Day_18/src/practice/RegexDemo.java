package practice;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {
    public static void main(String[] args) {
        String str = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        Pattern emailPattern = Pattern.compile(str);

        String[] emails = {"demo@demo.com", "demo.demo@com", "demo@demo"};

        for (String email : emails) {
            Matcher matcher = emailPattern.matcher(email);
            System.out.println(email + " --> " + matcher.matches());
        }
        String text1="Hello World";
    	String regex2="hello";
    	Pattern pattern2=Pattern.compile(regex2,Pattern.CASE_INSENSITIVE);
    	Matcher matcher2=pattern2.matcher(text1);
    	if(matcher2.find()){
    		System.out.println("Found: "+ matcher2.group());
    	}
    	else{
    		System.out.println("No Match");
    	}
    }
}
