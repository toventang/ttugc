package com.bytedance.crash.util;

import com.bytedance.covode.number.Covode;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* renamed from: com.bytedance.crash.util.d */
public final class C14047d {

    /* renamed from: a */
    public static DateFormat f34224a;

    /* renamed from: b */
    private static DateFormat f34225b;

    static {
        Covode.recordClassIndex(16114);
    }

    /* renamed from: a */
    public static DateFormat m25529a() {
        if (f34225b == null) {
            f34225b = new SimpleDateFormat("yyyy-MM-dd@HH-mm-ss", Locale.getDefault());
        }
        return f34225b;
    }
}
