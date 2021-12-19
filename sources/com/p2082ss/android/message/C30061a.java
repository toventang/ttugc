package com.p2082ss.android.message;

import android.app.Application;
import com.bytedance.common.p899b.C13498a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.message.p2159a.C30062a;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.ss.android.message.a */
public final class C30061a {

    /* renamed from: a */
    public static volatile Application f71748a;

    /* renamed from: b */
    private static final AtomicBoolean f71749b = new AtomicBoolean(false);

    static {
        Covode.recordClassIndex(36556);
    }

    /* renamed from: a */
    public static int m60798a() {
        return f71748a.getApplicationInfo().targetSdkVersion;
    }

    /* renamed from: a */
    public static void m60799a(Application application) {
        if (!f71749b.getAndSet(true)) {
            f71748a = application;
            if (C30062a.m60803a(application)) {
                f71748a.registerActivityLifecycleCallbacks(C13498a.m24278a());
            }
        }
    }
}
