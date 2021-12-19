package com.google.p1998c.p2001c;

import com.bytedance.covode.number.Covode;
import com.google.p1998c.p1999a.AbstractC27242j;
import com.google.p1998c.p1999a.AbstractC27246l;
import com.google.p1998c.p1999a.C27245k;
import java.util.Iterator;

/* renamed from: com.google.c.c.s */
public abstract class AbstractC27530s<E> implements Iterable<E> {

    /* renamed from: a */
    private final AbstractC27242j<Iterable<E>> f64900a;

    static {
        Covode.recordClassIndex(33110);
    }

    protected AbstractC27530s() {
        this.f64900a = AbstractC27242j.absent();
    }

    /* renamed from: a */
    public final Iterable<E> mo46061a() {
        return this.f64900a.mo45306or(this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        boolean z = true;
        for (E e : mo46061a()) {
            if (!z) {
                sb.append(", ");
            }
            z = false;
            sb.append((Object) e);
        }
        return sb.append(']').toString();
    }

    /* renamed from: a */
    public static <E> AbstractC27530s<E> m55037a(final Iterable<E> iterable) {
        if (iterable instanceof AbstractC27530s) {
            return (AbstractC27530s) iterable;
        }
        return new AbstractC27530s<E>(iterable) {
            /* class com.google.p1998c.p2001c.AbstractC27530s.C275311 */

            static {
                Covode.recordClassIndex(33111);
            }

            @Override // java.lang.Iterable
            public final Iterator<E> iterator() {
                return iterable.iterator();
            }
        };
    }

    AbstractC27530s(Iterable<E> iterable) {
        C27245k.m54229a(iterable);
        this.f64900a = AbstractC27242j.fromNullable(this == iterable ? null : iterable);
    }

    /* renamed from: a */
    public final AbstractC27530s<E> mo46060a(AbstractC27246l<? super E> lVar) {
        return m55037a(C27394am.m54792a(mo46061a(), lVar));
    }
}
