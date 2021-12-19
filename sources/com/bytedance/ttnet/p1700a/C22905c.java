package com.bytedance.ttnet.p1700a;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.common.utility.C13624l;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;

/* renamed from: com.bytedance.ttnet.a.c */
public final class C22905c {

    /* renamed from: a */
    public static volatile C22905c f54101a;

    /* renamed from: f */
    private static final Object f54102f = new Object();

    /* renamed from: h */
    private static volatile SharedPreferences f54103h;

    /* renamed from: b */
    public volatile int f54104b;

    /* renamed from: c */
    volatile long f54105c;

    /* renamed from: d */
    public volatile int f54106d;

    /* renamed from: e */
    public volatile int f54107e;

    /* renamed from: g */
    private volatile Context f54108g;

    static {
        Covode.recordClassIndex(26813);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final SharedPreferences mo37243a() {
        if (f54103h == null) {
            f54103h = C34822d.m71158a(this.f54108g, "image_opt_table", 0);
        }
        return f54103h;
    }

    /* renamed from: b */
    public final C13624l.EnumC13625a mo37244b() {
        Context context = this.f54108g;
        if (C58029j.f132251c == C13624l.EnumC13625a.UNKNOWN || !C58029j.m104846b() || C58029j.m104847c()) {
            C58029j.f132251c = C13624l.m24488d(context);
        }
        return C58029j.f132251c;
    }

    private C22905c(Context context) {
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            if (C58003a.f132201c && applicationContext == null) {
                applicationContext = C58003a.f132199a;
            }
            this.f54108g = applicationContext;
        }
        try {
            SharedPreferences a = mo37243a();
            this.f54104b = a.getInt("image_opt_switch", 0);
            this.f54105c = a.getLong("image_opt_black_interval", 0);
            this.f54106d = a.getInt("image_opt_failed_times", 0);
            this.f54107e = a.getInt("image_opt_limit_count", 0);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static C22905c m43176a(Context context) {
        MethodCollector.m26663i(5225);
        if (f54101a == null) {
            synchronized (f54102f) {
                try {
                    if (f54101a == null) {
                        f54101a = new C22905c(context);
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(5225);
                    throw th;
                }
            }
        }
        C22905c cVar = f54101a;
        MethodCollector.m26664o(5225);
        return cVar;
    }
}
