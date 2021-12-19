package com.google.firebase.components;

import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.google.firebase.p2010b.AbstractC27701c;
import com.google.firebase.p2010b.AbstractC27702d;
import com.google.firebase.p2012d.AbstractC27738a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: com.google.firebase.components.i */
public final class C27720i extends AbstractC27709a {

    /* renamed from: a */
    private static final AbstractC27738a<Set<Object>> f65143a = C27723l.f65151a;

    /* renamed from: b */
    private final Map<C27710b<?>, C27732s<?>> f65144b = new HashMap();

    /* renamed from: c */
    private final Map<Class<?>, C27732s<?>> f65145c = new HashMap();

    /* renamed from: d */
    private final Map<Class<?>, C27732s<Set<?>>> f65146d = new HashMap();

    /* renamed from: e */
    private final C27730q f65147e;

    static {
        Covode.recordClassIndex(33303);
    }

    /* renamed from: a */
    private void m55429a() {
        for (Map.Entry<C27710b<?>, C27732s<?>> entry : this.f65144b.entrySet()) {
            C27710b<?> key = entry.getKey();
            if (key.mo46352c()) {
                C27732s<?> value = entry.getValue();
                for (Class<? super T> cls : key.f65126a) {
                    this.f65145c.put(cls, value);
                }
            }
        }
        for (C27710b<?> bVar : this.f65144b.keySet()) {
            Iterator<C27727n> it = bVar.f65127b.iterator();
            while (true) {
                if (it.hasNext()) {
                    C27727n next = it.next();
                    if (next.f65158b == 1 && !this.f65145c.containsKey(next.f65157a)) {
                        throw new C27733t(C1764a.m5928a("Unsatisfied dependency for component %s: %s", new Object[]{bVar, next.f65157a}));
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.Map<java.lang.Class<?>, com.google.firebase.components.s<java.util.Set<?>>> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    private void m55430b() {
        HashMap hashMap = new HashMap();
        for (Map.Entry<C27710b<?>, C27732s<?>> entry : this.f65144b.entrySet()) {
            C27710b<?> key = entry.getKey();
            if (!key.mo46352c()) {
                C27732s<?> value = entry.getValue();
                for (Class<? super T> cls : key.f65126a) {
                    if (!hashMap.containsKey(cls)) {
                        hashMap.put(cls, new HashSet());
                    }
                    ((Set) hashMap.get(cls)).add(value);
                }
            }
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            this.f65146d.put(entry2.getKey(), new C27732s(new C27722k((Set) entry2.getValue())));
        }
    }

    @Override // com.google.firebase.components.AbstractC27714e, com.google.firebase.components.AbstractC27709a
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo46348a(Class cls) {
        return super.mo46348a(cls);
    }

    @Override // com.google.firebase.components.AbstractC27714e, com.google.firebase.components.AbstractC27709a
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Set mo46349b(Class cls) {
        return super.mo46349b(cls);
    }

    @Override // com.google.firebase.components.AbstractC27714e
    /* renamed from: c */
    public final <T> AbstractC27738a<T> mo46358c(Class<T> cls) {
        C27734u.m55452a(cls, "Null interface requested.");
        return this.f65145c.get(cls);
    }

    @Override // com.google.firebase.components.AbstractC27714e
    /* renamed from: d */
    public final <T> AbstractC27738a<Set<T>> mo46359d(Class<T> cls) {
        C27732s<Set<?>> sVar = this.f65146d.get(cls);
        return sVar != null ? sVar : (AbstractC27738a<Set<T>>) f65143a;
    }

    /* renamed from: a */
    public final void mo46361a(boolean z) {
        for (Map.Entry<C27710b<?>, C27732s<?>> entry : this.f65144b.entrySet()) {
            C27710b<?> key = entry.getKey();
            C27732s<?> value = entry.getValue();
            if (key.mo46350a() || (key.mo46351b() && z)) {
                value.mo46341a();
            }
        }
        this.f65147e.mo46371a();
    }

    public C27720i(Executor executor, Iterable<AbstractC27719h> iterable, C27710b<?>... bVarArr) {
        C27730q qVar = new C27730q(executor);
        this.f65147e = qVar;
        ArrayList<C27710b<?>> arrayList = new ArrayList();
        int i = 0;
        arrayList.add(C27710b.m55407a(qVar, C27730q.class, AbstractC27702d.class, AbstractC27701c.class));
        for (AbstractC27719h hVar : iterable) {
            arrayList.addAll(hVar.getComponents());
        }
        do {
            C27710b<?> bVar = bVarArr[i];
            if (bVar != null) {
                arrayList.add(bVar);
            }
            i++;
        } while (i < 8);
        C27724m.m55440a(arrayList);
        for (C27710b<?> bVar2 : arrayList) {
            this.f65144b.put(bVar2, new C27732s<>(new C27721j(this, bVar2)));
        }
        m55429a();
        m55430b();
    }
}
