package com.google.p1998c.p2001c;

import com.bytedance.covode.number.Covode;
import com.google.p1998c.p1999a.C27245k;
import java.util.Comparator;
import java.util.SortedSet;

/* access modifiers changed from: package-private */
/* renamed from: com.google.c.c.bn */
public final class C27475bn {
    static {
        Covode.recordClassIndex(33055);
    }

    /* renamed from: a */
    public static <E> Comparator<? super E> m54936a(SortedSet<E> sortedSet) {
        Comparator<? super E> comparator = sortedSet.comparator();
        if (comparator == null) {
            return C27446aw.f64746a;
        }
        return comparator;
    }

    /* renamed from: a */
    public static boolean m54937a(Comparator<?> comparator, Iterable<?> iterable) {
        Comparator comparator2;
        C27245k.m54229a(comparator);
        C27245k.m54229a(iterable);
        if (iterable instanceof SortedSet) {
            comparator2 = m54936a((SortedSet) iterable);
        } else if (!(iterable instanceof AbstractC27474bm)) {
            return false;
        } else {
            comparator2 = ((AbstractC27474bm) iterable).comparator();
        }
        return comparator.equals(comparator2);
    }
}
