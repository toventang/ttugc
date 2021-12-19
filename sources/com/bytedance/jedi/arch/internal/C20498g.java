package com.bytedance.jedi.arch.internal;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.jedi.arch.internal.g */
public final class C20498g {

    /* renamed from: a */
    static final Handler f48506a;

    /* renamed from: b */
    public static final C20495f f48507b;

    /* renamed from: a */
    public static final boolean m38698a() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(24021);
        Handler handler = new Handler(Looper.getMainLooper());
        f48506a = handler;
        f48507b = new C20495f(handler);
    }
}
