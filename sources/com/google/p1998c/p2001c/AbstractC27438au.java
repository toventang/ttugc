package com.google.p1998c.p2001c;

import com.bytedance.covode.number.Covode;
import java.util.Collection;
import java.util.Set;

/* renamed from: com.google.c.c.au */
public interface AbstractC27438au<E> extends Collection<E> {

    /* renamed from: com.google.c.c.au$a */
    public interface AbstractC27439a<E> {
        static {
            Covode.recordClassIndex(33019);
        }

        /* renamed from: a */
        E mo45778a();

        /* renamed from: b */
        int mo45779b();
    }

    static {
        Covode.recordClassIndex(33018);
    }

    int add(E e, int i);

    boolean contains(Object obj);

    @Override // java.util.Collection
    boolean containsAll(Collection<?> collection);

    int count(Object obj);

    Set<E> elementSet();

    Set<AbstractC27439a<E>> entrySet();

    int remove(Object obj, int i);

    boolean remove(Object obj);

    int setCount(E e, int i);

    boolean setCount(E e, int i, int i2);

    int size();
}
