package com.p2082ss.android.ugc.aweme.report;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.experiment.C46801cr;
import java.util.Random;

/* renamed from: com.ss.android.ugc.aweme.report.d */
public final class C67107d {

    /* renamed from: a */
    public static String f150495a = "null";

    /* renamed from: b */
    public static String f150496b = "null";

    /* renamed from: c */
    public static String f150497c = "null";

    /* renamed from: e */
    public static boolean f150498e;

    /* renamed from: f */
    public static boolean f150499f = true;

    /* renamed from: d */
    public boolean f150500d;

    /* renamed from: g */
    private final long[] f150501g = new long[EnumC67106c.values().length];

    /* renamed from: h */
    private final long[] f150502h = new long[EnumC67106c.values().length];

    /* renamed from: com.ss.android.ugc.aweme.report.d$a */
    public static class C67108a {

        /* renamed from: a */
        public static final C67107d f150503a = new C67107d();

        static {
            Covode.recordClassIndex(78690);
        }
    }

    static {
        Covode.recordClassIndex(78689);
    }

    /* renamed from: c */
    private static boolean m118764c() {
        if (!C46801cr.f109032a || new Random().nextFloat() >= 0.005f) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo105934a() {
        this.f150502h[EnumC67106c.PAGE_SELECT_TOTAL.ordinal()] = 0;
        this.f150502h[EnumC67106c.PAGE_SELECT_BEFORE.ordinal()] = 0;
        this.f150502h[EnumC67106c.PAGE_SELECT_INVOKE_SELECT.ordinal()] = 0;
        this.f150502h[EnumC67106c.PAGE_SELECT_PLAYER.ordinal()] = 0;
        this.f150502h[EnumC67106c.PAGE_SELECT_AFTER.ordinal()] = 0;
        this.f150502h[EnumC67106c.PLAYER_PAUSE.ordinal()] = 0;
        this.f150502h[EnumC67106c.PLAYER_PREPARE.ordinal()] = 0;
        this.f150502h[EnumC67106c.PLAYER_STOP.ordinal()] = 0;
        this.f150502h[EnumC67106c.PLAYER_RENDER_READY.ordinal()] = 0;
        this.f150502h[EnumC67106c.PLAYER_RENDER_FIRST.ordinal()] = 0;
        this.f150502h[EnumC67106c.PLAYER_RENDER_FIRST_DELAY.ordinal()] = 0;
    }

    /* renamed from: b */
    public final void mo105936b() {
        int i = 0;
        if (f150499f) {
            f150499f = false;
            this.f150500d = m118764c();
        } else if (this.f150500d && f150498e) {
            long[] jArr = new long[EnumC67106c.values().length];
            String str = f150495a;
            String str2 = f150496b;
            String str3 = f150497c;
            while (true) {
                long[] jArr2 = this.f150502h;
                if (i < jArr2.length) {
                    jArr[i] = jArr2[i];
                    i++;
                } else {
                    C39162r.m79452a().execute(new RunnableC67109e(jArr, str, str3, str2));
                    return;
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo105937b(EnumC67106c cVar) {
        if (this.f150500d) {
            m118763b(cVar, SystemClock.uptimeMillis());
        }
    }

    /* renamed from: a */
    public final void mo105935a(EnumC67106c cVar) {
        if (this.f150500d) {
            m118762a(cVar, SystemClock.uptimeMillis());
        }
    }

    /* renamed from: a */
    private void m118762a(EnumC67106c cVar, long j) {
        if (this.f150500d) {
            this.f150501g[cVar.ordinal()] = j;
        }
    }

    /* renamed from: b */
    private void m118763b(EnumC67106c cVar, long j) {
        if (this.f150500d) {
            Long valueOf = Long.valueOf(this.f150501g[cVar.ordinal()]);
            if (valueOf == null) {
                this.f150501g[cVar.ordinal()] = 0;
                this.f150502h[cVar.ordinal()] = 0;
                return;
            }
            long longValue = j - valueOf.longValue();
            this.f150501g[cVar.ordinal()] = longValue;
            this.f150502h[cVar.ordinal()] = longValue;
        }
    }
}
