package com.bytedance.android.live.liveinteract.cohost.p263a.p268e;

import com.C1764a;
import com.bytedance.covode.number.Covode;
import java.util.Locale;

/* renamed from: com.bytedance.android.live.liveinteract.cohost.a.e.c */
public final class C4596c {
    static {
        Covode.recordClassIndex(5172);
    }

    /* renamed from: a */
    public static String m10706a(long j) {
        return C1764a.m5929a(Locale.US, "%02d", new Object[]{Long.valueOf(j / 60)});
    }

    /* renamed from: b */
    public static String m10707b(long j) {
        return C1764a.m5929a(Locale.US, "%02d", new Object[]{Long.valueOf(j % 60)});
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.a.e.c$a */
    public static class C4597a {

        /* renamed from: a */
        public int f12231a;

        /* renamed from: b */
        public int f12232b;

        static {
            Covode.recordClassIndex(5173);
        }

        public C4597a(int i, int i2) {
            this.f12231a = i;
            this.f12232b = i2;
        }
    }
}
