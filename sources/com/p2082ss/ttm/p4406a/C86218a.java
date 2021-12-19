package com.p2082ss.ttm.p4406a;

import android.content.Context;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import java.util.Locale;

/* renamed from: com.ss.ttm.a.a */
public final class C86218a {

    /* renamed from: a */
    public static StringBuilder f192434a;

    static {
        Covode.recordClassIndex(101363);
    }

    /* renamed from: a */
    public static final void m148181a(Context context, StringBuilder sb) {
        String[] a = C86223f.m148197a();
        if (a != null) {
            sb.append(C1764a.m5928a("version:%s,%s,%s\r\n", new Object[]{a[0], a[1], a[2]})).append("\r\n");
        }
        long[] a2 = C86221d.m148194a();
        if (a2 != null) {
            sb.append(C1764a.m5929a(Locale.US, "rom memory totle:%d,availe:%d\r\n", new Object[]{Long.valueOf(a2[0]), Long.valueOf(a2[1])})).append("\r\n");
        }
        long a3 = C86221d.m148192a(context);
        long b = C86221d.m148195b();
        sb.append(C1764a.m5929a(Locale.US, "ram memory totle:%d,availe:%d\r\n", new Object[]{Long.valueOf(b), Long.valueOf(a3)})).append("\r\n");
        long[] a4 = C86220c.m148186a(context);
        sb.append(C1764a.m5929a(Locale.US, "sdcard totle:%d,availe:%d\r\n", new Object[]{Long.valueOf(a4[0]), Long.valueOf(a4[1])})).append("\r\n");
    }
}
