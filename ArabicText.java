/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arabic.text;

/**
 *
 * @author FarisJakpau
 */
public class ArabicText {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String text ="Allaah ( سبحانه و تعالى ) said:\n" +
"\n" +
"﴿فَإِمَّا يَأْتِيَنَّكُمْ مِنِّي هُدًى فَمَنِ اتَّبَعَ هُدَايَ فَلَا يَضِلُّ وَلَا يَشْقَى وَمَنْ أَعْرَضَ عَن ذِكْرِي فَإِنَّ لَهُ مَعِيشَةً ضَنكًا وَنَحْشُرُهُ يَوْمَ الْقِيَامَةِ أَعْمَىٰ﴾\n" +
"\n" +
"Then if there comes to you guidance from Me, then whoever follows My Guidance shall neither go astray, nor fall into distress and misery. But whosoever turns away from My Reminder verily, for him is a life of hardship, and We shall raise him up blind on the Day of Resurrection.\n" +
"\n" +
"[Surah Taahaa 20: 123-124]\n" +
"\n" +
"Ibn `Abbaas رضي الله عنهما said:\n" +
"\n" +
"“Allaah (سبحانه و تعالى)has guaranteed - to the one who RECITES the Qur’aan and ACTS upon its teachings – that he will not go astray in this world nor will he fall into distress on the Day of Judgment and then he recited these verses.\n" +
"\n" +
"[Majmoo` al-Fataawa (3/127)]";
        isArabic(text);
      //  System.out.println(isArabic(text));
       
    }

   /* private static void isArabic(String text) {
      // String tt = "";
       String tn = text.trim().replaceAll(" ", "");
       StringBuilder stg = new StringBuilder();
       
       for(int i=0; i<tn.length();){
           int c = tn.codePointAt(i);
           
           if(c>= 0x0600 && c <= 0x06FF || (c>= 0xFE70 && c <= 0xFEFF)){
               stg.appendCodePoint(c);
           }
           else
               continue;
       }
        System.out.println(stg.toString());
    } */
    
    
     private static void isArabic(String text) {
         String tt = "";
         for(char cha : text.toCharArray()){
             if(Character.UnicodeBlock.of(cha) == Character.UnicodeBlock.ARABIC){
                 tt = tt + Character.toString(cha);
                // System.out.println(cha);
             }
         }
         System.out.println(tt);
     }
    
    

}
