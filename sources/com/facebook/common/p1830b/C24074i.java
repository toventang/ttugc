package com.facebook.common.p1830b;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;

/* renamed from: com.facebook.common.b.i */
public final class C24074i extends C24070e {

    /* renamed from: a */
    private static C24074i f57012a;

    static {
        Covode.recordClassIndex(28201);
    }

    private C24074i() {
        super(new Handler(Looper.getMainLooper()));
    }

    /* renamed from: b */
    public static C24074i m45587b() {
        if (f57012a == null) {
            f57012a = new C24074i();
        }
        return f57012a;
    }

    @Override // com.facebook.common.p1830b.C24070e
    public final void execute(Runnable runnable) {
        if (mo39612a()) {
            runnable.run();
        } else {
            super.execute(runnable);
        }
    }
}
