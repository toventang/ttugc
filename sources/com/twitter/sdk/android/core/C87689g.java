package com.twitter.sdk.android.core;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.twitter.sdk.android.core.C87691i;
import com.twitter.sdk.android.core.internal.p4499b.AbstractC87720b;
import com.twitter.sdk.android.core.internal.p4499b.AbstractC87723e;
import com.twitter.sdk.android.core.internal.p4499b.C87722d;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.twitter.sdk.android.core.g */
public final class C87689g<T extends C87691i> implements AbstractC87793j<T> {

    /* renamed from: a */
    private final AbstractC87720b f199182a;

    /* renamed from: b */
    private final AbstractC87723e<T> f199183b;

    /* renamed from: c */
    private final ConcurrentHashMap<Long, T> f199184c;

    /* renamed from: d */
    private final ConcurrentHashMap<Long, C87722d<T>> f199185d;

    /* renamed from: e */
    private final C87722d<T> f199186e;

    /* renamed from: f */
    private final AtomicReference<T> f199187f;

    /* renamed from: g */
    private final String f199188g;

    /* renamed from: h */
    private volatile boolean f199189h;

    static {
        Covode.recordClassIndex(103676);
    }

    /* renamed from: d */
    private void m152607d() {
        if (this.f199189h) {
            m152608e();
        }
    }

    @Override // com.twitter.sdk.android.core.AbstractC87793j
    /* renamed from: a */
    public final T mo142121a() {
        m152607d();
        return this.f199187f.get();
    }

    @Override // com.twitter.sdk.android.core.AbstractC87793j
    /* renamed from: b */
    public final Map<Long, T> mo142124b() {
        m152607d();
        return Collections.unmodifiableMap(this.f199184c);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: com.twitter.sdk.android.core.g<T extends com.twitter.sdk.android.core.i> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: e */
    private synchronized void m152608e() {
        T a;
        MethodCollector.m26663i(6492);
        if (this.f199189h) {
            C87722d<T> dVar = this.f199186e;
            T a2 = dVar.f199239b.mo142117a(dVar.f199238a.mo142166a().getString(dVar.f199240c, null));
            if (a2 != null) {
                m152605a(a2.f199193b, a2, false);
            }
            for (Map.Entry<String, ?> entry : this.f199182a.mo142166a().getAll().entrySet()) {
                if (entry.getKey().startsWith(this.f199188g) && (a = this.f199183b.mo142117a((String) entry.getValue())) != null) {
                    m152605a(a.f199193b, a, false);
                }
            }
            this.f199189h = false;
        }
        MethodCollector.m26664o(6492);
    }

    @Override // com.twitter.sdk.android.core.AbstractC87793j
    /* renamed from: c */
    public final void mo142125c() {
        MethodCollector.m26663i(4413);
        m152607d();
        if (this.f199187f.get() != null && this.f199187f.get().f199193b == 0) {
            synchronized (this) {
                try {
                    this.f199187f.set(null);
                    this.f199186e.mo142169a();
                } catch (Throwable th) {
                    MethodCollector.m26664o(4413);
                    throw th;
                }
            }
        }
        this.f199184c.remove(0L);
        C87722d<T> remove = this.f199185d.remove(0L);
        if (remove != null) {
            remove.mo142169a();
        }
        MethodCollector.m26664o(4413);
    }

    /* renamed from: b */
    private String m152606b(long j) {
        return this.f199188g + "_" + j;
    }

    @Override // com.twitter.sdk.android.core.AbstractC87793j
    /* renamed from: a */
    public final T mo142122a(long j) {
        m152607d();
        return this.f199184c.get(Long.valueOf(j));
    }

    @Override // com.twitter.sdk.android.core.AbstractC87793j
    /* renamed from: a */
    public final void mo142123a(T t) {
        if (t != null) {
            m152607d();
            m152605a(t.f199193b, t, true);
            return;
        }
        throw new IllegalArgumentException("Session must not be null!");
    }

    /* renamed from: a */
    private void m152605a(long j, T t, boolean z) {
        MethodCollector.m26663i(4378);
        this.f199184c.put(Long.valueOf(j), t);
        C87722d<T> dVar = this.f199185d.get(Long.valueOf(j));
        if (dVar == null) {
            dVar = new C87722d<>(this.f199182a, this.f199183b, m152606b(j));
            this.f199185d.putIfAbsent(Long.valueOf(j), dVar);
        }
        dVar.mo142170a(t);
        T t2 = this.f199187f.get();
        if (t2 == null || t2.f199193b == j || z) {
            synchronized (this) {
                try {
                    this.f199187f.compareAndSet(t2, t);
                    this.f199186e.mo142170a(t);
                } finally {
                    MethodCollector.m26664o(4378);
                }
            }
            return;
        }
        MethodCollector.m26664o(4378);
    }

    public C87689g(AbstractC87720b bVar, AbstractC87723e<T> eVar, String str, String str2) {
        this(bVar, eVar, new ConcurrentHashMap(1), new ConcurrentHashMap(1), new C87722d(bVar, eVar, str), str2);
    }

    private C87689g(AbstractC87720b bVar, AbstractC87723e<T> eVar, ConcurrentHashMap<Long, T> concurrentHashMap, ConcurrentHashMap<Long, C87722d<T>> concurrentHashMap2, C87722d<T> dVar, String str) {
        this.f199189h = true;
        this.f199182a = bVar;
        this.f199183b = eVar;
        this.f199184c = concurrentHashMap;
        this.f199185d = concurrentHashMap2;
        this.f199186e = dVar;
        this.f199187f = new AtomicReference<>();
        this.f199188g = str;
    }
}
