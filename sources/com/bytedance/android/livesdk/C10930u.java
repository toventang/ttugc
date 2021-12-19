package com.bytedance.android.livesdk;

import com.bytedance.android.livesdkapi.host.AbstractC11817l;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.bytedance.android.livesdk.u */
public final class C10930u {

    /* renamed from: a */
    public static AbstractC11817l f26256a = new C10931a();

    /* renamed from: b */
    public static final C10930u f26257b = new C10930u();

    /* renamed from: c */
    private static int f26258c;

    /* renamed from: com.bytedance.android.livesdk.u$a */
    public static final class C10931a implements AbstractC11817l {
        static {
            Covode.recordClassIndex(12541);
        }

        @Override // com.bytedance.android.livesdkapi.host.AbstractC11817l
        /* renamed from: a */
        public final boolean mo17783a() {
            return false;
        }

        C10931a() {
        }
    }

    private C10930u() {
    }

    static {
        Covode.recordClassIndex(12540);
    }

    /* renamed from: a */
    public final synchronized boolean mo17782a() {
        MethodCollector.m26663i(10996);
        int i = f26258c;
        boolean z = false;
        if (i > 0) {
            MethodCollector.m26664o(10996);
            return false;
        }
        try {
            f26258c = i + 1;
            boolean a = f26256a.mo17783a();
            f26258c = 0;
            z = a;
        } catch (Exception unused) {
            f26258c = 0;
        } catch (Throwable th) {
            f26258c = 0;
            MethodCollector.m26664o(10996);
            throw th;
        }
        MethodCollector.m26664o(10996);
        return z;
    }
}
