package com.google.p1998c.p1999a;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.google.c.a.j */
public abstract class AbstractC27242j<T> implements Serializable {
    private static final long serialVersionUID = 0;

    static {
        Covode.recordClassIndex(32822);
    }

    public abstract Set<T> asSet();

    public abstract boolean equals(Object obj);

    public abstract T get();

    public abstract int hashCode();

    public abstract boolean isPresent();

    /* renamed from: or */
    public abstract AbstractC27242j<T> mo45304or(AbstractC27242j<? extends T> jVar);

    /* renamed from: or */
    public abstract T mo45305or(AbstractC27255q<? extends T> qVar);

    /* renamed from: or */
    public abstract T mo45306or(T t);

    public abstract T orNull();

    public abstract String toString();

    public abstract <V> AbstractC27242j<V> transform(AbstractC27235f<? super T, V> fVar);

    AbstractC27242j() {
    }

    public static <T> AbstractC27242j<T> absent() {
        return C27226a.f64385a;
    }

    public static <T> AbstractC27242j<T> fromNullable(T t) {
        if (t == null) {
            return absent();
        }
        return new C27251n(t);
    }

    /* renamed from: of */
    public static <T> AbstractC27242j<T> m54223of(T t) {
        return new C27251n(C27245k.m54229a(t));
    }

    public static <T> Iterable<T> presentInstances(final Iterable<? extends AbstractC27242j<? extends T>> iterable) {
        C27245k.m54229a(iterable);
        return new Iterable<T>() {
            /* class com.google.p1998c.p1999a.AbstractC27242j.C272431 */

            static {
                Covode.recordClassIndex(32823);
            }

            @Override // java.lang.Iterable
            public final Iterator<T> iterator() {
                return new AbstractC27227b<T>() {
                    /* class com.google.p1998c.p1999a.AbstractC27242j.C272431.C272441 */

                    /* renamed from: b */
                    private final Iterator<? extends AbstractC27242j<? extends T>> f64408b;

                    static {
                        Covode.recordClassIndex(32824);
                    }

                    /* access modifiers changed from: protected */
                    @Override // com.google.p1998c.p1999a.AbstractC27227b
                    /* renamed from: a */
                    public final T mo45310a() {
                        while (this.f64408b.hasNext()) {
                            AbstractC27242j jVar = (AbstractC27242j) this.f64408b.next();
                            if (jVar.isPresent()) {
                                return (T) jVar.get();
                            }
                        }
                        return (T) mo45311b();
                    }

                    {
                        this.f64408b = (Iterator) C27245k.m54229a(iterable.iterator());
                    }
                };
            }
        };
    }
}
