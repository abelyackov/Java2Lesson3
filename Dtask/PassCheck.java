package Dtask;

import java.io.*;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PassCheck {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String pass = bufferedReader.readLine();
        System.out.println(checkPass(pass));
    }

    public static boolean checkPass(String pass){
        Pattern pattern = Pattern.compile("(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&+=])(?=\\S+$).{8,}");
        Matcher matcher = pattern.matcher(pass);
        return matcher.matches();
    }


}
