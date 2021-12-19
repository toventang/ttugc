package kotlinx.coroutines.internal;

import com.bytedance.covode.number.Covode;
import java.lang.Comparable;
import kotlinx.coroutines.C89527ar;
import kotlinx.coroutines.internal.AbstractC89627ab;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: kotlinx.coroutines.internal.aa */
public class C89626aa<T extends AbstractC89627ab & Comparable<? super T>> {
    public volatile int _size;

    /* renamed from: b */
    public T[] f203361b;

    static {
        Covode.recordClassIndex(105719);
    }

    /* renamed from: a */
    public final boolean mo144167a() {
        if (this._size == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final T mo144169b() {
        T d;
        synchronized (this) {
            d = mo144172d();
        }
        return d;
    }

    /* renamed from: d */
    public final T mo144172d() {
        T[] tArr = this.f203361b;
        if (tArr != null) {
            return tArr[0];
        }
        return null;
    }

    /* renamed from: c */
    public final T mo144171c() {
        T t;
        synchronized (this) {
            if (this._size > 0) {
                t = mo144166a(0);
            } else {
                t = null;
            }
        }
        return t;
    }

    /* renamed from: a */
    public final boolean mo144168a(T t) {
        boolean z;
        synchronized (this) {
            z = true;
            if (t.mo143978b() == null) {
                z = false;
            } else {
                int c = t.mo143979c();
                if (C89527ar.f203243a) {
                    if (c < 0) {
                        throw new AssertionError();
                    }
                }
                mo144166a(c);
            }
        }
        return z;
    }

    /* renamed from: b */
    public final void mo144170b(int i) {
        while (i > 0) {
            T[] tArr = this.f203361b;
            if (tArr == null) {
                C89219l.m154707a();
            }
            int i2 = (i - 1) / 2;
            T t = tArr[i2];
            if (t == null) {
                C89219l.m154707a();
            }
            Comparable comparable = (Comparable) t;
            T t2 = tArr[i];
            if (t2 == null) {
                C89219l.m154707a();
            }
            if (comparable.compareTo(t2) > 0) {
                m155558a(i, i2);
                i = i2;
            } else {
                return;
            }
        }
    }

    /* renamed from: c */
    private final void m155559c(int i) {
        while (true) {
            int i2 = (i * 2) + 1;
            if (i2 < this._size) {
                T[] tArr = this.f203361b;
                if (tArr == null) {
                    C89219l.m154707a();
                }
                int i3 = i2 + 1;
                if (i3 < this._size) {
                    T t = tArr[i3];
                    if (t == null) {
                        C89219l.m154707a();
                    }
                    Comparable comparable = (Comparable) t;
                    T t2 = tArr[i2];
                    if (t2 == null) {
                        C89219l.m154707a();
                    }
                    if (comparable.compareTo(t2) < 0) {
                        i2 = i3;
                    }
                }
                T t3 = tArr[i];
                if (t3 == null) {
                    C89219l.m154707a();
                }
                Comparable comparable2 = (Comparable) t3;
                T t4 = tArr[i2];
                if (t4 == null) {
                    C89219l.m154707a();
                }
                if (comparable2.compareTo(t4) > 0) {
                    m155558a(i, i2);
                    i = i2;
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public final T mo144166a(int i) {
        if (!C89527ar.f203243a || this._size > 0) {
            T[] tArr = this.f203361b;
            if (tArr == null) {
                C89219l.m154707a();
            }
            this._size--;
            if (i < this._size) {
                m155558a(i, this._size);
                int i2 = (i - 1) / 2;
                if (i > 0) {
                    T t = tArr[i];
                    if (t == null) {
                        C89219l.m154707a();
                    }
                    Comparable comparable = (Comparable) t;
                    T t2 = tArr[i2];
                    if (t2 == null) {
                        C89219l.m154707a();
                    }
                    if (comparable.compareTo(t2) < 0) {
                        m155558a(i, i2);
                        mo144170b(i2);
                    }
                }
                m155559c(i);
            }
            T t3 = tArr[this._size];
            if (t3 == null) {
                C89219l.m154707a();
            }
            if (!C89527ar.f203243a || t3.mo143978b() == this) {
                t3.mo143977a(null);
                t3.mo143976a(-1);
                tArr[this._size] = null;
                return t3;
            }
            throw new AssertionError();
        }
        throw new AssertionError();
    }

    /* renamed from: a */
    private final void m155558a(int i, int i2) {
        T[] tArr = this.f203361b;
        if (tArr == null) {
            C89219l.m154707a();
        }
        T t = tArr[i2];
        if (t == null) {
            C89219l.m154707a();
        }
        T t2 = tArr[i];
        if (t2 == null) {
            C89219l.m154707a();
        }
        tArr[i] = t;
        tArr[i2] = t2;
        t.mo143976a(i);
        t2.mo143976a(i2);
    }
}
