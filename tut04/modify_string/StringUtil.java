package tut04.modify_string;

public class StringUtil {
    public static String ModifyString(String inp) throws Exception {
        if (inp == null || inp.isEmpty())
            throw new Exception("Input string is empty");

        if (!Character.isLetter(inp.charAt(0)))
            throw new Exception("First character is not a letter!");

        inp = inp.replaceAll("\\s", "");
        return Character.toUpperCase(inp.charAt(0)) + inp.substring(1);
    }
}
