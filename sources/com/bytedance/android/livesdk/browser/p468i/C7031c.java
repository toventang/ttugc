package com.bytedance.android.livesdk.browser.p468i;

import android.content.Context;
import android.util.SparseArray;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.bytedance.android.livesdk.browser.i.c */
public class C7031c implements AbstractC7029a {

    /* renamed from: a */
    private static volatile C7031c f17632a;

    /* renamed from: b */
    private SparseArray<C7030b> f17633b = new SparseArray<>();

    static {
        Covode.recordClassIndex(7770);
    }

    private C7031c() {
    }

    /* renamed from: a */
    public static AbstractC7029a m14987a() {
        MethodCollector.m26663i(9016);
        if (f17632a == null) {
            synchronized (C7031c.class) {
                try {
                    if (f17632a == null) {
                        f17632a = new C7031c();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(9016);
                    throw th;
                }
            }
        }
        C7031c cVar = f17632a;
        MethodCollector.m26664o(9016);
        return cVar;
    }

    @Override // com.bytedance.android.livesdk.browser.p468i.AbstractC7029a
    /* renamed from: a */
    public final void mo13331a(Context context) {
        this.f17633b.remove(context.hashCode());
    }
}
