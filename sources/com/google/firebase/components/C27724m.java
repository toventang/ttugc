package com.google.firebase.components;

import com.C1764a;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* access modifiers changed from: package-private */
/* renamed from: com.google.firebase.components.m */
public final class C27724m {
    static {
        Covode.recordClassIndex(33307);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.components.m$a */
    public static class C27725a {

        /* renamed from: a */
        public final C27710b<?> f65152a;

        /* renamed from: b */
        public final Set<C27725a> f65153b = new HashSet();

        /* renamed from: c */
        final Set<C27725a> f65154c = new HashSet();

        static {
            Covode.recordClassIndex(33308);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final boolean mo46362a() {
            return this.f65154c.isEmpty();
        }

        C27725a(C27710b<?> bVar) {
            this.f65152a = bVar;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.components.m$b */
    public static class C27726b {

        /* renamed from: a */
        public final boolean f65155a;

        /* renamed from: b */
        private final Class<?> f65156b;

        static {
            Covode.recordClassIndex(33309);
        }

        public final int hashCode() {
            return ((this.f65156b.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f65155a).hashCode();
        }

        public final boolean equals(Object obj) {
            if (obj instanceof C27726b) {
                C27726b bVar = (C27726b) obj;
                if (!bVar.f65156b.equals(this.f65156b) || bVar.f65155a != this.f65155a) {
                    return false;
                }
                return true;
            }
            return false;
        }

        private C27726b(Class<?> cls, boolean z) {
            this.f65156b = cls;
            this.f65155a = z;
        }

        /* synthetic */ C27726b(Class cls, boolean z, byte b) {
            this(cls, z);
        }
    }

    /* renamed from: a */
    private static Set<C27725a> m55439a(Set<C27725a> set) {
        HashSet hashSet = new HashSet();
        for (C27725a aVar : set) {
            if (aVar.mo46362a()) {
                hashSet.add(aVar);
            }
        }
        return hashSet;
    }

    /* renamed from: a */
    static void m55440a(List<C27710b<?>> list) {
        Set<C27725a> set;
        HashMap hashMap = new HashMap(list.size());
        Iterator<C27710b<?>> it = list.iterator();
        while (true) {
            int i = 0;
            if (it.hasNext()) {
                C27710b<?> next = it.next();
                C27725a aVar = new C27725a(next);
                Iterator<Class<? super T>> it2 = next.f65126a.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        Class<? super T> next2 = it2.next();
                        C27726b bVar = new C27726b(next2, !next.mo46352c(), (byte) 0);
                        if (!hashMap.containsKey(bVar)) {
                            hashMap.put(bVar, new HashSet());
                        }
                        Set set2 = (Set) hashMap.get(bVar);
                        if (set2.isEmpty() || bVar.f65155a) {
                            set2.add(aVar);
                        } else {
                            throw new IllegalArgumentException(C1764a.m5928a("Multiple components provide %s.", new Object[]{next2}));
                        }
                    }
                }
            } else {
                for (Set<C27725a> set3 : hashMap.values()) {
                    for (C27725a aVar2 : set3) {
                        for (C27727n nVar : aVar2.f65152a.f65127b) {
                            if (nVar.mo46366b() && (set = (Set) hashMap.get(new C27726b(nVar.f65157a, nVar.mo46365a(), (byte) 0))) != null) {
                                for (C27725a aVar3 : set) {
                                    aVar2.f65153b.add(aVar3);
                                    aVar3.f65154c.add(aVar2);
                                }
                            }
                        }
                    }
                }
                HashSet<C27725a> hashSet = new HashSet();
                for (Collection collection : hashMap.values()) {
                    hashSet.addAll(collection);
                }
                Set<C27725a> a = m55439a(hashSet);
                while (!a.isEmpty()) {
                    C27725a next3 = a.iterator().next();
                    a.remove(next3);
                    i++;
                    for (C27725a aVar4 : next3.f65153b) {
                        aVar4.f65154c.remove(next3);
                        if (aVar4.mo46362a()) {
                            a.add(aVar4);
                        }
                    }
                }
                if (i != list.size()) {
                    ArrayList arrayList = new ArrayList();
                    for (C27725a aVar5 : hashSet) {
                        if (!aVar5.mo46362a() && !aVar5.f65153b.isEmpty()) {
                            arrayList.add(aVar5.f65152a);
                        }
                    }
                    throw new C27728o(arrayList);
                }
                return;
            }
        }
    }
}
