package com.bytedance.assem.jedi_vm.p798a;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.assem.jedi_vm.a.d */
public final class C12865d {

    /* renamed from: a */
    public static final Handler f31306a;

    /* renamed from: b */
    public static final C12862c f31307b;

    /* renamed from: a */
    public static final boolean m23117a() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(14697);
        Handler handler = new Handler(Looper.getMainLooper());
        f31306a = handler;
        f31307b = new C12862c(handler);
    }
}
