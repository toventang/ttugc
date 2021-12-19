package com.p2082ss.android.ugc.aweme.account.apiguard;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;

/* renamed from: com.ss.android.ugc.aweme.account.apiguard.a */
public final class C31574a {

    /* renamed from: a */
    public static final boolean f75521a = false;

    /* renamed from: b */
    public static final C31574a f75522b = new C31574a();

    /* renamed from: c */
    private static final boolean f75523c = true;

    private C31574a() {
    }

    /* renamed from: a */
    public static final boolean m65858a() {
        boolean z = f75521a;
        try {
            return C16048b.m29633a().mo25421a(true, "enable_apiguard_android", false);
        } catch (Throwable unused) {
            return z;
        }
    }

    static {
        Covode.recordClassIndex(38299);
    }
}
