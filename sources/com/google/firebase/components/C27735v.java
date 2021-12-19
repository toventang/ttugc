package com.google.firebase.components;

import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.google.firebase.p2010b.AbstractC27701c;
import com.google.firebase.p2012d.AbstractC27738a;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.firebase.components.v */
final class C27735v extends AbstractC27709a {

    /* renamed from: a */
    private final Set<Class<?>> f65169a;

    /* renamed from: b */
    private final Set<Class<?>> f65170b;

    /* renamed from: c */
    private final Set<Class<?>> f65171c;

    /* renamed from: d */
    private final Set<Class<?>> f65172d;

    /* renamed from: e */
    private final Set<Class<?>> f65173e;

    /* renamed from: f */
    private final AbstractC27714e f65174f;

    static {
        Covode.recordClassIndex(33318);
    }

    @Override // com.google.firebase.components.AbstractC27714e, com.google.firebase.components.AbstractC27709a
    /* renamed from: a */
    public final <T> T mo46348a(Class<T> cls) {
        if (this.f65169a.contains(cls)) {
            T t = (T) this.f65174f.mo46348a(cls);
            return !cls.equals(AbstractC27701c.class) ? t : (T) new C27736a(this.f65173e, t);
        }
        throw new IllegalArgumentException(C1764a.m5928a("Attempting to request an undeclared dependency %s.", new Object[]{cls}));
    }

    @Override // com.google.firebase.components.AbstractC27714e, com.google.firebase.components.AbstractC27709a
    /* renamed from: b */
    public final <T> Set<T> mo46349b(Class<T> cls) {
        if (this.f65171c.contains(cls)) {
            return this.f65174f.mo46349b(cls);
        }
        throw new IllegalArgumentException(C1764a.m5928a("Attempting to request an undeclared dependency Set<%s>.", new Object[]{cls}));
    }

    @Override // com.google.firebase.components.AbstractC27714e
    /* renamed from: c */
    public final <T> AbstractC27738a<T> mo46358c(Class<T> cls) {
        if (this.f65170b.contains(cls)) {
            return this.f65174f.mo46358c(cls);
        }
        throw new IllegalArgumentException(C1764a.m5928a("Attempting to request an undeclared dependency Provider<%s>.", new Object[]{cls}));
    }

    @Override // com.google.firebase.components.AbstractC27714e
    /* renamed from: d */
    public final <T> AbstractC27738a<Set<T>> mo46359d(Class<T> cls) {
        if (this.f65172d.contains(cls)) {
            return this.f65174f.mo46359d(cls);
        }
        throw new IllegalArgumentException(C1764a.m5928a("Attempting to request an undeclared dependency Provider<Set<%s>>.", new Object[]{cls}));
    }

    /* renamed from: com.google.firebase.components.v$a */
    static class C27736a implements AbstractC27701c {

        /* renamed from: a */
        private final Set<Class<?>> f65175a;

        /* renamed from: b */
        private final AbstractC27701c f65176b;

        static {
            Covode.recordClassIndex(33319);
        }

        public C27736a(Set<Class<?>> set, AbstractC27701c cVar) {
            this.f65175a = set;
            this.f65176b = cVar;
        }
    }

    C27735v(C27710b<?> bVar, AbstractC27714e eVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        for (C27727n nVar : bVar.f65127b) {
            if (nVar.mo46366b()) {
                if (nVar.mo46365a()) {
                    hashSet3.add(nVar.f65157a);
                } else {
                    hashSet.add(nVar.f65157a);
                }
            } else if (nVar.mo46365a()) {
                hashSet4.add(nVar.f65157a);
            } else {
                hashSet2.add(nVar.f65157a);
            }
        }
        if (!bVar.f65129d.isEmpty()) {
            hashSet.add(AbstractC27701c.class);
        }
        this.f65169a = Collections.unmodifiableSet(hashSet);
        this.f65170b = Collections.unmodifiableSet(hashSet2);
        this.f65171c = Collections.unmodifiableSet(hashSet3);
        this.f65172d = Collections.unmodifiableSet(hashSet4);
        this.f65173e = bVar.f65129d;
        this.f65174f = eVar;
    }
}
