package com.google.p1998c.p2001c;

import com.bytedance.covode.number.Covode;
import com.google.p1998c.p1999a.AbstractC27246l;
import com.google.p1998c.p1999a.C27245k;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.c.c.am */
public final class C27394am {
    static {
        Covode.recordClassIndex(32974);
    }

    /* renamed from: b */
    static <E> Collection<E> m54796b(Iterable<E> iterable) {
        if (iterable instanceof Collection) {
            return (Collection) iterable;
        }
        return C27404ap.m54808a(iterable.iterator());
    }

    /* renamed from: c */
    public static <T> T m54797c(Iterable<? extends T> iterable) {
        return (T) C27397an.m54799a(iterable.iterator());
    }

    /* renamed from: a */
    static Object[] m54795a(Iterable<?> iterable) {
        return m54796b(iterable).toArray();
    }

    /* renamed from: a */
    public static <T> Iterable<T> m54792a(final Iterable<T> iterable, final AbstractC27246l<? super T> lVar) {
        C27245k.m54229a(iterable);
        C27245k.m54229a(lVar);
        return new AbstractC27530s<T>() {
            /* class com.google.p1998c.p2001c.C27394am.C273951 */

            static {
                Covode.recordClassIndex(32975);
            }

            @Override // java.lang.Iterable
            public final Iterator<T> iterator() {
                return C27397an.m54798a(iterable.iterator(), lVar);
            }
        };
    }

    /* renamed from: a */
    static <T> boolean m54794a(List<T> list, AbstractC27246l<? super T> lVar) {
        int i = 0;
        int i2 = 0;
        while (i < list.size()) {
            T t = list.get(i);
            if (!lVar.mo45331a(t)) {
                if (i > i2) {
                    try {
                        list.set(i2, t);
                    } catch (UnsupportedOperationException unused) {
                        m54793a(list, lVar, i2, i);
                        return true;
                    } catch (IllegalArgumentException unused2) {
                        m54793a(list, lVar, i2, i);
                        return true;
                    }
                }
                i2++;
            }
            i++;
        }
        list.subList(i2, list.size()).clear();
        if (i != i2) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static <T> void m54793a(List<T> list, AbstractC27246l<? super T> lVar, int i, int i2) {
        for (int size = list.size() - 1; size > i2; size--) {
            if (lVar.mo45331a(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            list.remove(i3);
        }
    }
}
