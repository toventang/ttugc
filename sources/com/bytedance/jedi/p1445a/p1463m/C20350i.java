package com.bytedance.jedi.p1445a.p1463m;

import com.bytedance.covode.number.Covode;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.jedi.a.m.i */
public final class C20350i<T> {

    /* renamed from: a */
    public final ConcurrentHashMap<String, WeakReference<T>> f48224a = new ConcurrentHashMap<>();

    /* renamed from: b */
    public final ReferenceQueue<T> f48225b = new ReferenceQueue<>();

    static {
        Covode.recordClassIndex(23858);
    }
}
