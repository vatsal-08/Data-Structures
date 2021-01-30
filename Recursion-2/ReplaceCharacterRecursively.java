
public class ReplaceCharacterRecursively {

	public static String replaceCharacter(String input, char c1, char c2) {
		 
        
        if(input.length()==0)
            return "";
        String ans = replaceCharacter(input.substring(1), c1, c2);
        if(input.charAt(0)==c1)
            ans = Character.toString(c2)+ans;
        else
            ans = Character.toString(input.charAt(0))+ans;
        return ans;
	}
}
