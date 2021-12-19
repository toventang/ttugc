package com.squareup.p2075a.p2076a.p2078b;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: com.squareup.a.a.b.g */
public final class C29168g {

    /* renamed from: a */
    public static final TimeZone f69060a = TimeZone.getTimeZone("GMT");

    /* renamed from: b */
    private static final ThreadLocal<DateFormat> f69061b = new ThreadLocal<DateFormat>() {
        /* class com.squareup.p2075a.p2076a.p2078b.C29168g.C291691 */

        static {
            Covode.recordClassIndex(35518);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        public final /* synthetic */ DateFormat initialValue() {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
            simpleDateFormat.setLenient(false);
            simpleDateFormat.setTimeZone(C29168g.f69060a);
            return simpleDateFormat;
        }
    };

    /* renamed from: c */
    private static final String[] f69062c = {"EEE, dd MMM yyyy HH:mm:ss zzz", "EEEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z", "EEE MMM d yyyy HH:mm:ss z"};

    /* renamed from: d */
    private static final DateFormat[] f69063d = new DateFormat[15];

    static {
        Covode.recordClassIndex(35517);
    }

    /* renamed from: a */
    public static Date m58296a(String str) {
        MethodCollector.m26663i(3276);
        if (str.length() == 0) {
            MethodCollector.m26664o(3276);
            return null;
        }
        ParsePosition parsePosition = new ParsePosition(0);
        Date parse = f69061b.get().parse(str, parsePosition);
        if (parsePosition.getIndex() == str.length()) {
            MethodCollector.m26664o(3276);
            return parse;
        }
        String[] strArr = f69062c;
        synchronized (strArr) {
            try {
                int length = strArr.length;
                for (int i = 0; i < length; i++) {
                    DateFormat[] dateFormatArr = f69063d;
                    DateFormat dateFormat = dateFormatArr[i];
                    if (dateFormat == null) {
                        dateFormat = new SimpleDateFormat(f69062c[i], Locale.US);
                        dateFormat.setTimeZone(f69060a);
                        dateFormatArr[i] = dateFormat;
                    }
                    parsePosition.setIndex(0);
                    Date parse2 = dateFormat.parse(str, parsePosition);
                    if (parsePosition.getIndex() != 0) {
                        return parse2;
                    }
                }
                MethodCollector.m26664o(3276);
                return null;
            } finally {
                MethodCollector.m26664o(3276);
            }
        }
    }
}
