package com.bytedance.android.livesdkapi.p702ws;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.lang.ref.WeakReference;

/* renamed from: com.bytedance.android.livesdkapi.ws.c */
public class C11886c {

    /* renamed from: c */
    private static volatile C11886c f28445c;

    /* renamed from: a */
    public WeakReference<AbstractC11884a> f28446a;

    /* renamed from: b */
    public WeakReference<Object> f28447b;

    static {
        Covode.recordClassIndex(13609);
    }

    private C11886c() {
    }

    /* renamed from: a */
    public static C11886c m20979a() {
        MethodCollector.m26663i(6922);
        if (f28445c == null) {
            synchronized (C11886c.class) {
                try {
                    f28445c = new C11886c();
                } catch (Throwable th) {
                    MethodCollector.m26664o(6922);
                    throw th;
                }
            }
        }
        C11886c cVar = f28445c;
        MethodCollector.m26664o(6922);
        return cVar;
    }

    /* renamed from: b */
    public final void mo19047b() {
        WeakReference<AbstractC11884a> weakReference = this.f28446a;
        if (weakReference != null) {
            AbstractC11884a aVar = weakReference.get();
            if (aVar != null) {
                aVar.mo19044b();
            }
            WeakReference<Object> weakReference2 = this.f28447b;
            if (!(weakReference2 == null || weakReference2.get() == null)) {
                this.f28447b.get();
            }
            this.f28446a = null;
        }
    }
}
