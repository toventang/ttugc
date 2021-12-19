package com.p2082ss.android.p2092ad.splash.p2109f;

import android.util.Base64;
import com.bytedance.covode.number.Covode;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* renamed from: com.ss.android.ad.splash.f.n */
public final class C29659n {

    /* renamed from: a */
    private static ThreadLocal<SimpleDateFormat> f70736a = new ThreadLocal<SimpleDateFormat>() {
        /* class com.p2082ss.android.p2092ad.splash.p2109f.C29659n.C296601 */

        static {
            Covode.recordClassIndex(36056);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        public final /* synthetic */ SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.getDefault());
        }
    };

    static {
        Covode.recordClassIndex(36055);
    }

    /* renamed from: a */
    public static String m59765a(long j) {
        SimpleDateFormat simpleDateFormat = f70736a.get();
        if (simpleDateFormat != null) {
            return simpleDateFormat.format(Long.valueOf(j));
        }
        return String.valueOf(j);
    }

    /* renamed from: a */
    public static String m59766a(String str) {
        if (!C29657l.m59760a(str)) {
            try {
                return new String(Base64.decode(str, 0), "utf-8");
            } catch (Throwable unused) {
                C29644g.m59686a("error decoding video url");
            }
        }
        return "";
    }
}
