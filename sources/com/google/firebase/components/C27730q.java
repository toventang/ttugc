package com.google.firebase.components;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.firebase.p2010b.AbstractC27700b;
import com.google.firebase.p2010b.AbstractC27701c;
import com.google.firebase.p2010b.AbstractC27702d;
import com.google.firebase.p2010b.C27699a;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* access modifiers changed from: package-private */
/* renamed from: com.google.firebase.components.q */
public class C27730q implements AbstractC27701c, AbstractC27702d {

    /* renamed from: a */
    private final Map<Class<?>, ConcurrentHashMap<AbstractC27700b<Object>, Executor>> f65161a = new HashMap();

    /* renamed from: b */
    private Queue<C27699a<?>> f65162b = new ArrayDeque();

    /* renamed from: c */
    private final Executor f65163c;

    static {
        Covode.recordClassIndex(33313);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo46371a() {
        Queue<C27699a<?>> queue;
        MethodCollector.m26663i(8792);
        synchronized (this) {
            try {
                queue = this.f65162b;
                if (queue != null) {
                    this.f65162b = null;
                } else {
                    queue = null;
                }
            } finally {
                MethodCollector.m26664o(8792);
            }
        }
        if (queue != null) {
            for (C27699a<?> aVar : queue) {
                m55445a(aVar);
            }
        }
    }

    C27730q(Executor executor) {
        this.f65163c = executor;
    }

    /* renamed from: b */
    private synchronized Set<Map.Entry<AbstractC27700b<Object>, Executor>> m55446b(C27699a<?> aVar) {
        MethodCollector.m26663i(8635);
        ConcurrentHashMap<AbstractC27700b<Object>, Executor> concurrentHashMap = this.f65161a.get(aVar.f65116a);
        if (concurrentHashMap == null) {
            Set<Map.Entry<AbstractC27700b<Object>, Executor>> emptySet = Collections.emptySet();
            MethodCollector.m26664o(8635);
            return emptySet;
        }
        Set<Map.Entry<AbstractC27700b<Object>, Executor>> entrySet = concurrentHashMap.entrySet();
        MethodCollector.m26664o(8635);
        return entrySet;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0016, code lost:
        r3 = m55446b(r6).iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
        if (r3.hasNext() == false) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0024, code lost:
        r2 = r3.next();
        r2.getValue().execute(new com.google.firebase.components.RunnableC27731r(r2, r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0039, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(8485);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003c, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m55445a(com.google.firebase.p2010b.C27699a<?> r6) {
        /*
            r5 = this;
            r4 = 8485(0x2125, float:1.189E-41)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r4)
            com.google.firebase.components.C27734u.m55451a(r6)
            monitor-enter(r5)
            java.util.Queue<com.google.firebase.b.a<?>> r0 = r5.f65162b     // Catch:{ all -> 0x003d }
            if (r0 == 0) goto L_0x0015
            r0.add(r6)     // Catch:{ all -> 0x003d }
            monitor-exit(r5)     // Catch:{ all -> 0x003d }
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r4)
            return
        L_0x0015:
            monitor-exit(r5)
            java.util.Set r0 = r5.m55446b(r6)
            java.util.Iterator r3 = r0.iterator()
        L_0x001e:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0039
            java.lang.Object r2 = r3.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r1 = r2.getValue()
            java.util.concurrent.Executor r1 = (java.util.concurrent.Executor) r1
            com.google.firebase.components.r r0 = new com.google.firebase.components.r
            r0.<init>(r2, r6)
            r1.execute(r0)
            goto L_0x001e
        L_0x0039:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r4)
            return
        L_0x003d:
            r0 = move-exception
            monitor-exit(r5)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.components.C27730q.m55445a(com.google.firebase.b.a):void");
    }

    @Override // com.google.firebase.p2010b.AbstractC27702d
    /* renamed from: a */
    public final <T> void mo46339a(Class<T> cls, AbstractC27700b<? super T> bVar) {
        mo46340a(cls, this.f65163c, bVar);
    }

    @Override // com.google.firebase.p2010b.AbstractC27702d
    /* renamed from: a */
    public final synchronized <T> void mo46340a(Class<T> cls, Executor executor, AbstractC27700b<? super T> bVar) {
        MethodCollector.m26663i(8637);
        C27734u.m55451a(cls);
        C27734u.m55451a(bVar);
        C27734u.m55451a(executor);
        if (!this.f65161a.containsKey(cls)) {
            this.f65161a.put(cls, new ConcurrentHashMap<>());
        }
        this.f65161a.get(cls).put(bVar, executor);
        MethodCollector.m26664o(8637);
    }
}
