public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        // System.out.println(contains("happy", "unhappy")); // false
        // System.out.println(contains("historical", "story")); // false
        // System.out.println(contains("psychology", "psycho")); // true
        // System.out.println(contains("personality", "son")); // true
        // System.out.println(contains("personality", "dad")); // false
        // System.out.println(contains("resignation", "sign")); // true
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
        // Replace the following statement with your code
        str = str.toLowerCase();
        return str;
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
        // Replace the following statement with your code
    
        boolean isContains = false;
        // int lastIndex = 0;
        // int smaller = Math.min(str1.length(), str2.length());
        // int bigger = Math.max(str1.length(), str2.length());
        if(str1.length() < str2.length()){
            return false;
        }
        if (str2.length() == 0){
            return true;
        }
        int lastIndex = str1.length() - str2.length() ;

        for ( int i = 0 ; i < lastIndex && !isContains ; i ++){
            // isContains = true;
            if(str2.charAt(0) == str1.charAt(i)){
                isContains = true;

                for(int j = 0 ; j < str2.length() && isContains ; j++){
                    if(str2.charAt(j) != str1.charAt(i + j)){
                        isContains = false;
                    }
                }
            }
        }
        return isContains;
    }
}
