package com.facebook.imagepipeline.p1879d;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.common.p1832d.C24091i;
import com.facebook.common.p1833e.C24099a;
import com.facebook.common.p1836h.C24117a;
import com.facebook.imagepipeline.p1885j.C24456e;
import com.facebook.p1826c.p1827a.AbstractC24026e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.imagepipeline.d.v */
public class C24404v {

    /* renamed from: a */
    private static final Class<?> f57860a = C24404v.class;

    /* renamed from: b */
    private Map<AbstractC24026e, C24456e> f57861b = new HashMap();

    static {
        Covode.recordClassIndex(28547);
    }

    C24404v() {
    }

    /* renamed from: b */
    private synchronized void m46488b() {
        MethodCollector.m26663i(6512);
        C24099a.m45635a(f57860a, "Count = %d", Integer.valueOf(this.f57861b.size()));
        MethodCollector.m26664o(6512);
    }

    /* renamed from: a */
    public final void mo40210a() {
        ArrayList arrayList;
        MethodCollector.m26663i(5765);
        synchronized (this) {
            try {
                arrayList = new ArrayList(this.f57861b.values());
                this.f57861b.clear();
            } finally {
                MethodCollector.m26664o(5765);
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            C24456e eVar = (C24456e) arrayList.get(i);
            if (eVar != null) {
                eVar.close();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0052, code lost:
        r3 = r0;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.facebook.imagepipeline.p1885j.C24456e mo40213b(com.facebook.p1826c.p1827a.AbstractC24026e r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            r6 = 6213(0x1845, float:8.706E-42)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r6)     // Catch:{ all -> 0x005f }
            com.facebook.common.p1832d.C24091i.m45617a(r8)     // Catch:{ all -> 0x005f }
            java.util.Map<com.facebook.c.a.e, com.facebook.imagepipeline.j.e> r0 = r7.f57861b     // Catch:{ all -> 0x005f }
            java.lang.Object r3 = r0.get(r8)     // Catch:{ all -> 0x005f }
            com.facebook.imagepipeline.j.e r3 = (com.facebook.imagepipeline.p1885j.C24456e) r3     // Catch:{ all -> 0x005f }
            if (r3 == 0) goto L_0x005a
            monitor-enter(r3)     // Catch:{ all -> 0x005f }
            boolean r0 = com.facebook.imagepipeline.p1885j.C24456e.m46682e(r3)     // Catch:{ all -> 0x0054 }
            if (r0 != 0) goto L_0x004d
            java.util.Map<com.facebook.c.a.e, com.facebook.imagepipeline.j.e> r0 = r7.f57861b     // Catch:{ all -> 0x0054 }
            r0.remove(r8)     // Catch:{ all -> 0x0054 }
            java.lang.Class<?> r5 = com.facebook.imagepipeline.p1879d.C24404v.f57860a     // Catch:{ all -> 0x0054 }
            java.lang.String r4 = "Found closed reference %d for key %s (%d)"
            r0 = 3
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ all -> 0x0054 }
            r1 = 0
            int r0 = java.lang.System.identityHashCode(r3)     // Catch:{ all -> 0x0054 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0054 }
            r2[r1] = r0     // Catch:{ all -> 0x0054 }
            r1 = 1
            java.lang.String r0 = r8.mo39543a()     // Catch:{ all -> 0x0054 }
            r2[r1] = r0     // Catch:{ all -> 0x0054 }
            r1 = 2
            int r0 = java.lang.System.identityHashCode(r8)     // Catch:{ all -> 0x0054 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0054 }
            r2[r1] = r0     // Catch:{ all -> 0x0054 }
            com.facebook.common.p1833e.C24099a.m45649b(r5, r4, r2)     // Catch:{ all -> 0x0054 }
            r0 = 0
            monitor-exit(r3)     // Catch:{ all -> 0x0054 }
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r6)
            monitor-exit(r7)
            return r0
        L_0x004d:
            com.facebook.imagepipeline.j.e r0 = com.facebook.imagepipeline.p1885j.C24456e.m46679a(r3)
            monitor-exit(r3)
            r3 = r0
            goto L_0x005a
        L_0x0054:
            r0 = move-exception
            monitor-exit(r3)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r6)
            throw r0
        L_0x005a:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r6)
            monitor-exit(r7)
            return r3
        L_0x005f:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.p1879d.C24404v.mo40213b(com.facebook.c.a.e):com.facebook.imagepipeline.j.e");
    }

    /* renamed from: c */
    public final synchronized boolean mo40215c(AbstractC24026e eVar) {
        MethodCollector.m26663i(6372);
        C24091i.m45617a(eVar);
        if (!this.f57861b.containsKey(eVar)) {
            MethodCollector.m26664o(6372);
            return false;
        }
        C24456e eVar2 = this.f57861b.get(eVar);
        synchronized (eVar2) {
            try {
                if (!C24456e.m46682e(eVar2)) {
                    this.f57861b.remove(eVar);
                    C24099a.m45649b(f57860a, "Found closed reference %d for key %s (%d)", Integer.valueOf(System.identityHashCode(eVar2)), eVar.mo39543a(), Integer.valueOf(System.identityHashCode(eVar)));
                    return false;
                }
                MethodCollector.m26664o(6372);
                return true;
            } finally {
                MethodCollector.m26664o(6372);
            }
        }
    }

    /* renamed from: a */
    public final boolean mo40212a(AbstractC24026e eVar) {
        C24456e remove;
        MethodCollector.m26663i(5912);
        C24091i.m45617a(eVar);
        synchronized (this) {
            try {
                remove = this.f57861b.remove(eVar);
            } catch (Throwable th) {
                MethodCollector.m26664o(5912);
                throw th;
            }
        }
        if (remove == null) {
            MethodCollector.m26664o(5912);
            return false;
        }
        try {
            return remove.mo40300a();
        } finally {
            remove.close();
            MethodCollector.m26664o(5912);
        }
    }

    /* renamed from: a */
    public final synchronized void mo40211a(AbstractC24026e eVar, C24456e eVar2) {
        MethodCollector.m26663i(5526);
        C24091i.m45617a(eVar);
        C24091i.m45620a(C24456e.m46682e(eVar2));
        C24456e.m46681d(this.f57861b.put(eVar, C24456e.m46679a(eVar2)));
        m46488b();
        MethodCollector.m26664o(5526);
    }

    /* renamed from: b */
    public final synchronized boolean mo40214b(AbstractC24026e eVar, C24456e eVar2) {
        MethodCollector.m26663i(6059);
        C24091i.m45617a(eVar);
        C24091i.m45617a(eVar2);
        C24091i.m45620a(C24456e.m46682e(eVar2));
        C24456e eVar3 = this.f57861b.get(eVar);
        if (eVar3 == null) {
            MethodCollector.m26664o(6059);
            return false;
        }
        C24117a b = C24117a.m45711b(eVar3.f58094a);
        C24117a b2 = C24117a.m45711b(eVar2.f58094a);
        if (!(b == null || b2 == null)) {
            try {
                if (b.mo39695a() == b2.mo39695a()) {
                    this.f57861b.remove(eVar);
                    C24117a.m45712c(b2);
                    C24117a.m45712c(b);
                    C24456e.m46681d(eVar3);
                    m46488b();
                    MethodCollector.m26664o(6059);
                    return true;
                }
            } catch (Throwable th) {
                C24117a.m45712c(b2);
                C24117a.m45712c(b);
                C24456e.m46681d(eVar3);
                MethodCollector.m26664o(6059);
                throw th;
            }
        }
        C24117a.m45712c(b2);
        C24117a.m45712c(b);
        C24456e.m46681d(eVar3);
        MethodCollector.m26664o(6059);
        return false;
    }
}
