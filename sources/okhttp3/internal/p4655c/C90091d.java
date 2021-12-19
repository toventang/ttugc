package okhttp3.internal.p4655c;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import okhttp3.internal.C90084c;

/* renamed from: okhttp3.internal.c.d */
public final class C90091d {

    /* renamed from: a */
    private static final ThreadLocal<DateFormat> f204470a = new ThreadLocal<DateFormat>() {
        /* class okhttp3.internal.p4655c.C90091d.C900921 */

        static {
            Covode.recordClassIndex(106264);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        public final /* synthetic */ DateFormat initialValue() {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
            simpleDateFormat.setLenient(false);
            simpleDateFormat.setTimeZone(C90084c.f204452g);
            return simpleDateFormat;
        }
    };

    /* renamed from: b */
    private static final String[] f204471b = {"EEE, dd MMM yyyy HH:mm:ss zzz", "EEEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z", "EEE MMM d yyyy HH:mm:ss z"};

    /* renamed from: c */
    private static final DateFormat[] f204472c = new DateFormat[15];

    static {
        Covode.recordClassIndex(106263);
    }

    /* renamed from: a */
    public static String m156438a(Date date) {
        return f204470a.get().format(date);
    }

    /* renamed from: a */
    public static Date m156439a(String str) {
        MethodCollector.m26663i(10295);
        if (str.length() == 0) {
            MethodCollector.m26664o(10295);
            return null;
        }
        ParsePosition parsePosition = new ParsePosition(0);
        Date parse = f204470a.get().parse(str, parsePosition);
        if (parsePosition.getIndex() == str.length()) {
            MethodCollector.m26664o(10295);
            return parse;
        }
        String[] strArr = f204471b;
        synchronized (strArr) {
            try {
                int length = strArr.length;
                for (int i = 0; i < length; i++) {
                    DateFormat[] dateFormatArr = f204472c;
                    DateFormat dateFormat = dateFormatArr[i];
                    if (dateFormat == null) {
                        dateFormat = new SimpleDateFormat(f204471b[i], Locale.US);
                        dateFormat.setTimeZone(C90084c.f204452g);
                        dateFormatArr[i] = dateFormat;
                    }
                    parsePosition.setIndex(0);
                    Date parse2 = dateFormat.parse(str, parsePosition);
                    if (parsePosition.getIndex() != 0) {
                        return parse2;
                    }
                }
                MethodCollector.m26664o(10295);
                return null;
            } finally {
                MethodCollector.m26664o(10295);
            }
        }
    }
}
