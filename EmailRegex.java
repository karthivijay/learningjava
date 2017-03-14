import org.testng.Assert;
import org.testng.annotations.Test;


import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Created by KV on 3/12/2017.
 */
public class EmailRegex {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        testEmailFormat(input);

    }


    public static Boolean testEmailFormat(String input) {

        String inp = input;

        Pattern pattern = Pattern.compile("[a-zA-Z0-9.]+@[a-z]+.?[a-z]+");

        return (pattern.matcher(inp).matches());

    }


    @Test
    public void positiveTest() {
        Assert.assertTrue(testEmailFormat("abc@gmail.com"));
        Assert.assertTrue(testEmailFormat("abc007@gmail.com"));
        Assert.assertTrue(testEmailFormat("a1@gmail.com"));
        Assert.assertTrue(testEmailFormat("123@gmail.com"));
        Assert.assertTrue(testEmailFormat("78bc@gmail.com"));
        Assert.assertTrue(testEmailFormat("78bc@gmail.in"));
        Assert.assertTrue(testEmailFormat("78bc@yahoo.com"));
        Assert.assertTrue(testEmailFormat("78bc@abc.com"));

    }

    @Test
    public void negativeTest() {
        Assert.assertTrue(testEmailFormat(" @gmail.com"));
        Assert.assertTrue(testEmailFormat("abc007@.com"));
        Assert.assertTrue(testEmailFormat("a1gmail.com"));
        Assert.assertTrue(testEmailFormat("123@gmailcom"));
        Assert.assertTrue(testEmailFormat("7@@gmail.com"));
        Assert.assertTrue(testEmailFormat("78bc3#@gmail.in"));
        Assert.assertTrue(testEmailFormat("78$bc@yahoo.com"));


    }


}
