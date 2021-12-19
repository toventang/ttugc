package com.google.p1998c.p2001c;

import com.bytedance.covode.number.Covode;
import com.google.p1998c.p1999a.C27245k;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.c.c.bk */
public final class C27471bk {
    static {
        Covode.recordClassIndex(33051);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.c.c.bk$a */
    public static abstract class AbstractC27472a<E> extends AbstractSet<E> {
        static {
            Covode.recordClassIndex(33052);
        }

        AbstractC27472a() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            return super.retainAll((Collection) C27245k.m54229a(collection));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.AbstractSet, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            C27245k.m54229a(collection);
            if (collection instanceof AbstractC27438au) {
                collection = ((AbstractC27438au) collection).elementSet();
            }
            if (!(collection instanceof Set) || collection.size() <= size()) {
                return C27471bk.m54931a((Set<?>) this, collection.iterator());
            }
            Iterator<E> it = iterator();
            C27245k.m54229a(collection);
            boolean z = false;
            while (it.hasNext()) {
                if (collection.contains(it.next())) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }
    }

    /* renamed from: a */
    public static <E> Set<E> m54929a() {
        return Collections.newSetFromMap(new ConcurrentHashMap());
    }

    /* renamed from: a */
    static int m54928a(Set<?> set) {
        int i;
        int i2 = 0;
        for (Object obj : set) {
            if (obj != null) {
                i = obj.hashCode();
            } else {
                i = 0;
            }
            i2 = ((i2 + i) ^ -1) ^ -1;
        }
        return i2;
    }

    /* renamed from: a */
    static boolean m54930a(Set<?> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() != set2.size() || !set.containsAll(set2)) {
                    return false;
                }
                return true;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    /* renamed from: a */
    static boolean m54931a(Set<?> set, Iterator<?> it) {
        boolean z = false;
        while (it.hasNext()) {
            z |= set.remove(it.next());
        }
        return z;
    }
}
