import java.text.SimpleDateFormat;
import java.util.Date;

public class DateMain {
    public static void main(String[] args) {
        final Date now = new Date( );
        final SimpleDateFormat format =
                new SimpleDateFormat ("yyyy년 MM월 dd일");
        System.out.println(format.format(now));
        final Date now1 = new Date( );
        final SimpleDateFormat format1 =
                new SimpleDateFormat ("yyyy-MM-dd HH:mm:ss");
        System.out.println(format1.format(now1));
        final Date now2 = new Date( );
        final SimpleDateFormat format2 =
                new SimpleDateFormat ("오늘은 이 달의 F번째 E요일 입니다.");
        System.out.println(format2.format(now2));
    }
}
