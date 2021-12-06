public class ChallengeIntegerToRoman {

    public static void main(String[] args) {
        int value = 15;
        System.out.println(intToRoman(value));
    }

    public static String intToRoman(int num) {
         int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
         String[] symbol = {"M", "CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

         String ans = "";

         while (num>0){
             for (int i = 0; i < values.length; i++) {
                 if (num >= values[i]) {
                     num -= values[i];
                     ans += symbol[i];
                     i--;
                 }
             }
         }
         return ans;
     }
}
