import java.lang.StringBuilder;

class Solution{

  static String toCamelCase(String s){
    String result = "";
    for(int i=0; i<s.length(); i++){
      if(s.charAt(i) == '_' || s.charAt(i) == '-'){
        result += Character.toUpperCase(s.charAt(i+1));
        i++;
      }
      else
        result += s.charAt(i);
    }
    return result;
  }
}

// Using StringBuilder and Regular Expressions
class Solution1{

  static String toCamelCase(String s){
    String[] words = s.split("[_-]");
    StringBuilder stringbuilder = new StringBuilder(words[0]);
    for(int i=1; i<words.length; i++)
      stringbuilder.append(words[i].substring(0,1).toUpperCase()+words[i].substring(1));
    return stringbuilder.toString();
  }
}