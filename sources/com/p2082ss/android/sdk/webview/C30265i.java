package com.p2082ss.android.sdk.webview;

import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.sdk.webview.C30262h;
import com.p2082ss.android.ugc.aweme.web.p4238b.AbstractC81535a;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: com.ss.android.sdk.webview.i */
public class C30265i implements C30262h.AbstractC30264a {

    /* renamed from: a */
    private static volatile C30265i f72200a;

    /* renamed from: b */
    private Set<C30262h.AbstractC30264a> f72201b = new LinkedHashSet();

    static {
        Covode.recordClassIndex(36777);
    }

    private C30265i() {
    }

    /* renamed from: a */
    public static C30265i m61248a() {
        MethodCollector.m26663i(5830);
        if (f72200a == null) {
            synchronized (C30265i.class) {
                try {
                    if (f72200a == null) {
                        f72200a = new C30265i();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(5830);
                    throw th;
                }
            }
        }
        C30265i iVar = f72200a;
        MethodCollector.m26664o(5830);
        return iVar;
    }

    /* renamed from: b */
    public final void mo53721b() {
        if (!C13603b.m24435a((Collection) this.f72201b)) {
            Iterator<C30262h.AbstractC30264a> it = this.f72201b.iterator();
            while (it.hasNext()) {
                C30262h.AbstractC30264a next = it.next();
                if ((next instanceof AbstractC81535a) && ((AbstractC81535a) next).f182331o) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo53720a(C30262h.AbstractC30264a aVar) {
        MethodCollector.m26663i(5970);
        synchronized (this) {
            try {
                this.f72201b.add(aVar);
            } finally {
                MethodCollector.m26664o(5970);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0026  */
    @Override // com.p2082ss.android.sdk.webview.C30262h.AbstractC30264a
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.webkit.WebResourceResponse mo53719a(java.lang.String r5) {
        /*
            r4 = this;
            r3 = 5969(0x1751, float:8.364E-42)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r3)
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            monitor-enter(r4)
            java.util.Set<com.ss.android.sdk.webview.h$a> r0 = r4.f72201b     // Catch:{ all -> 0x0036 }
            r1.addAll(r0)     // Catch:{ all -> 0x0036 }
            monitor-exit(r4)     // Catch:{ all -> 0x0036 }
            boolean r0 = r1.isEmpty()
            r2 = 0
            if (r0 == 0) goto L_0x001c
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r3)
            return r2
        L_0x001c:
            java.util.Iterator r1 = r1.iterator()
        L_0x0020:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0032
            java.lang.Object r0 = r1.next()
            com.ss.android.sdk.webview.h$a r0 = (com.p2082ss.android.sdk.webview.C30262h.AbstractC30264a) r0
            android.webkit.WebResourceResponse r2 = r0.mo53719a(r5)
            if (r2 == 0) goto L_0x0020
        L_0x0032:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r3)
            return r2
        L_0x0036:
            r0 = move-exception
            monitor-exit(r4)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.sdk.webview.C30265i.mo53719a(java.lang.String):android.webkit.WebResourceResponse");
    }
}
