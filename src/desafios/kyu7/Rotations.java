package desafios.kyu7;

import java.util.List;

/*
Input:

a string strng
an array of strings arr
Output of function contain_all_rots(strng, arr) (or containAllRots or contain-all-rots):

a boolean true if all rotations of strng are included in arr
false otherwise
Examples:
contain_all_rots(
  "bsjq", ["bsjq", "qbsj", "sjqb", "twZNsslC", "jqbs"]) -> true

contain_all_rots(
  "Ajylvpy", ["Ajylvpy", "ylvpyAj", "jylvpyA", "lvpyAjy", "pyAjylv", "vpyAjyl", "ipywee"]) -> false)
Note:
Though not correct in a mathematical sense

we will consider that there are no rotations of strng == ""
and for any array arr: contain_all_rots("", arr) --> true

 */


public class Rotations {

    public static boolean containAllRots(String strng, List<String> arr) {
        if(strng == "") return true;

        StringBuilder sb = new StringBuilder(strng);
        for (int i = 0; i < strng.length(); i++) {
            sb.append(sb.charAt(0));
            sb.deleteCharAt(0);
            if(!arr.contains(sb.toString())) return false;
        }

     return true;
    }
}
