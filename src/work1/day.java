//請由程式算出256559秒為多少天、多少小時、多少分與多少秒
package work1;

public class day {
    public static void main(String[] args) {
        int i = 256559; 
        int day = i / 86400; 
        int hour = (i % 86400) / 3600; 
        int minute = (i % 3600) / 60; 
        int second = i % 60; 

        System.out.println(day +    "天 "  );
        System.out.println(hour +   "小時 ");
        System.out.println(minute + "分 "  );
        System.out.println(second + "秒"   );
    }
}

