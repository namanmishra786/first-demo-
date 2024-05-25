/**
 * Main
 */
public class Main {

    public static void main (String[] args) {
        System.out.println("naman");
        int vowel = 0;
        int consonat= 0;
        String vr = "naman";
        char [] ch = vr.toCharArray();
        for(char c : ch){
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
            vowel++;
        }else{
            consonat++;
        }
    }
            
            
        System.out.println(vowel +" "+ consonat);

            

        

    }
}