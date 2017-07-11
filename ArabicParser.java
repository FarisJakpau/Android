package arabicparser;
import java.util.ArrayList;
public class ArabicParser {
    public static void main(String[] args) {        // TODO code application logic here
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
        String[] arabicOnly = text.split("[\\P{InArabic}+]");
            System.out.println("\nBefore processed : ");
            System.out.println(text);
            System.out.println("\nAfter processed : ");
            ArrayList<String> arab = new ArrayList<>();
            boolean nextArab = false;
            
        for(String a:arabicOnly){
            if(isArabic(a)){
            arab.add(a);
            nextArab=true;
            }else{
                if(nextArab){
                    arab.add("");
                    nextArab=false;
                }
            }
        }
        for(int i=0;i<arab.size();i++){
            if(arab.get(i).equals(""))
                System.out.println("");
            else
            System.out.print(arab.get(i)+" ");
        }
//        System.out.println("Arabic text -> "+arab.toString());
            
    }
    
    public static boolean isArabic(String s) {
    for (int i = 0; i < s.length();) {
        int c = s.codePointAt(i);
        if (c >= 0x0600 && c <= 0x06E0)
            return true;
        i += Character.charCount(c);            
    }
    return false;
    }
}
