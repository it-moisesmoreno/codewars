/*
An isogram is a word that has no repeating letters, consecutive or non-consecutive. Implement a function that determines whether a string that contains only letters is an isogram. Assume the empty string is an isogram. Ignore letter case.

Example: (Input --> Output)

"Dermatoglyphics" --> true "aba" --> false "moOse" --> false (ignore letter case)

isIsogram "Dermatoglyphics" = true
isIsogram "moose" = false
isIsogram "aba" = false
*/

// My solution
public class isogram {
    public static boolean  isIsogram(String str) {
      str = str.toLowerCase();

        if(str == null)
          return true;
      
        for(int i = 0; i < str.length(); i++){
          for(int j = 0; j < str.length(); j++){
            if(j!=i){
              int comparedCharacters = Character.compare(str.charAt(i), str.charAt(j));  
              if (comparedCharacters == 0) {  
                return false;
              }  
            }
              
          }   
        }
        return true;
    } 
}