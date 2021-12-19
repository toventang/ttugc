package com.google.p1998c.p2001c;

import com.bytedance.covode.number.Covode;
import com.google.p1998c.p1999a.AbstractC27235f;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/* renamed from: com.google.c.c.az */
public abstract class AbstractC27450az<T> implements Comparator<T> {
    static {
        Covode.recordClassIndex(33030);
    }

    @Override // java.util.Comparator
    public abstract int compare(T t, T t2);

    /* renamed from: a */
    public <S extends T> AbstractC27450az<S> mo45799a() {
        return new C27467bh(this);
    }

    /* renamed from: a */
    public static <T> AbstractC27450az<T> m54883a(Comparator<T> comparator) {
        if (comparator instanceof AbstractC27450az) {
            return (AbstractC27450az) comparator;
        }
        return new C27527p(comparator);
    }

    /* renamed from: a */
    public final <F> AbstractC27450az<F> mo45813a(AbstractC27235f<F, ? extends T> fVar) {
        return new C27510j(fVar, this);
    }

    /* renamed from: a */
    public final <E extends T> List<E> mo45814a(Iterable<E> iterable) {
        Object[] a = C27394am.m54795a(iterable);
        Arrays.sort(a, this);
        return C27404ap.m54807a((Iterable) Arrays.asList(a));
    }
}
