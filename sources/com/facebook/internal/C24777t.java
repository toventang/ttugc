package com.facebook.internal;

import com.bytedance.covode.number.Covode;
import com.facebook.C24872m;
import com.facebook.internal.p1894a.p1896b.C24677a;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;

/* renamed from: com.facebook.internal.t */
public class C24777t {

    /* renamed from: com.facebook.internal.t$a */
    public interface AbstractC24779a {
        static {
            Covode.recordClassIndex(28932);
        }

        /* renamed from: a */
        void mo39464a(String str);
    }

    static {
        Covode.recordClassIndex(28930);
    }

    private C24777t() {
    }

    /* renamed from: a */
    public static boolean m47435a() {
        if (C24677a.m47209a(C24777t.class)) {
            return false;
        }
        try {
            C24699ae.m47299a();
            return C34822d.m71158a(C24872m.f59047g, "com.facebook.sdk.appEventPreferences", 0).getBoolean("is_referrer_updated", false);
        } catch (Throwable th) {
            C24677a.m47208a(th, C24777t.class);
            return false;
        }
    }

    /* renamed from: b */
    static /* synthetic */ void m47436b() {
        if (!C24677a.m47209a(C24777t.class)) {
            try {
                if (!C24677a.m47209a(C24777t.class)) {
                    try {
                        C24699ae.m47299a();
                        C34822d.m71158a(C24872m.f59047g, "com.facebook.sdk.appEventPreferences", 0).edit().putBoolean("is_referrer_updated", true).apply();
                    } catch (Throwable th) {
                        C24677a.m47208a(th, C24777t.class);
                    }
                }
            } catch (Throwable th2) {
                C24677a.m47208a(th2, C24777t.class);
            }
        }
    }
}
