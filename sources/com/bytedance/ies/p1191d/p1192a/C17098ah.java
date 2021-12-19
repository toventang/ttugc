package com.bytedance.ies.p1191d.p1192a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.bytedance.ies.d.a.ah */
public final class C17098ah<K, V> {

    /* renamed from: a */
    private final LinkedHashMap<K, V> f40690a;

    /* renamed from: b */
    private int f40691b;

    /* renamed from: c */
    private int f40692c;

    /* renamed from: d */
    private int f40693d;

    /* renamed from: e */
    private int f40694e;

    /* renamed from: f */
    private int f40695f;

    /* renamed from: g */
    private int f40696g;

    /* renamed from: h */
    private final AbstractC89183m<K, V, Boolean> f40697h;

    /* renamed from: i */
    private final AbstractC89183m<K, V, C89391z> f40698i;

    static {
        Covode.recordClassIndex(19555);
    }

    /* renamed from: a */
    public final synchronized Map<K, V> mo27004a() {
        LinkedHashMap linkedHashMap;
        MethodCollector.m26663i(6545);
        linkedHashMap = new LinkedHashMap(this.f40690a);
        MethodCollector.m26664o(6545);
        return linkedHashMap;
    }

    public final synchronized String toString() {
        int i;
        String str;
        MethodCollector.m26663i(6848);
        int i2 = this.f40694e;
        int i3 = this.f40695f + i2;
        if (i3 != 0) {
            i = (i2 * 100) / i3;
        } else {
            i = 0;
        }
        str = "LruCache[maxSize=" + this.f40696g + ",hits=" + this.f40694e + ",misses=" + this.f40695f + ",hitRate=" + i + "%%]";
        MethodCollector.m26664o(6848);
        return str;
    }

    /* renamed from: b */
    public final synchronized void mo27006b() {
        MethodCollector.m26663i(6697);
        C17130q.m31653a("Start trimming, entry count: " + this.f40690a.size() + '.');
        Iterator<Map.Entry<K, V>> it = this.f40690a.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (this.f40697h.invoke(next.getKey(), next.getValue()).booleanValue()) {
                it.remove();
                this.f40698i.invoke(next.getKey(), next.getValue());
                int i = this.f40691b;
                next.getKey();
                next.getValue();
                this.f40691b = i - 1;
                C17130q.m31653a("Entry removed: " + ((Object) next.getKey()) + '.');
            }
        }
        MethodCollector.m26664o(6697);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [T, V] */
    /* renamed from: a */
    public final V mo27002a(K k) {
        MethodCollector.m26663i(6242);
        C89233z.C89238e eVar = new C89233z.C89238e();
        synchronized (this) {
            try {
                eVar.element = this.f40690a.get(k);
                if (eVar.element != null) {
                    this.f40694e++;
                    return eVar.element;
                }
                this.f40695f++;
                MethodCollector.m26664o(6242);
                return null;
            } finally {
                MethodCollector.m26664o(6242);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [T, V] */
    /* renamed from: b */
    public final V mo27005b(K k) {
        MethodCollector.m26663i(6544);
        C89233z.C89238e eVar = new C89233z.C89238e();
        synchronized (this) {
            try {
                eVar.element = this.f40690a.remove(k);
                if (eVar.element != null) {
                    int i = this.f40691b;
                    if (eVar.element == null) {
                        C89219l.m154707a();
                    }
                    this.f40691b = i - 1;
                }
            } catch (Throwable th) {
                MethodCollector.m26664o(6544);
                throw th;
            }
        }
        if (eVar.element != null && eVar.element == null) {
            C89219l.m154707a();
        }
        T t = eVar.element;
        MethodCollector.m26664o(6544);
        return t;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v19, types: [T, V] */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00ba, code lost:
        throw r2;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final V mo27003a(K r8, V r9) {
        /*
        // Method dump skipped, instructions count: 199
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.p1191d.p1192a.C17098ah.mo27003a(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: h.f.a.m<? super K, ? super V, java.lang.Boolean> */
    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: h.f.a.m<? super K, ? super V, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public C17098ah(int i, AbstractC89183m<? super K, ? super V, Boolean> mVar, AbstractC89183m<? super K, ? super V, C89391z> mVar2) {
        C89219l.m154719c(mVar, "");
        C89219l.m154719c(mVar2, "");
        this.f40696g = i;
        this.f40697h = mVar;
        this.f40698i = mVar2;
        if (i > 0) {
            this.f40690a = new LinkedHashMap<>(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }
}
