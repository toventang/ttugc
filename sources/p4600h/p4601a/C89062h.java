package p4600h.p4601a;

import com.bytedance.covode.number.Covode;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import p4519d.p4520a.p4530d.p4531a.C88041a;
import p4600h.p4601a.AbstractC89054d;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4619j.C89271h;

/* renamed from: h.a.h */
public final class C89062h<E> extends AbstractC89059e<E> {

    /* renamed from: d */
    public static final C89063a f202789d = new C89063a((byte) 0);

    /* renamed from: e */
    private static final Object[] f202790e = new Object[0];

    /* renamed from: a */
    public int f202791a;

    /* renamed from: b */
    public Object[] f202792b;

    /* renamed from: c */
    public int f202793c;

    /* renamed from: h.a.h$a */
    public static final class C89063a {
        static {
            Covode.recordClassIndex(105147);
        }

        private C89063a() {
        }

        public /* synthetic */ C89063a(byte b) {
            this();
        }
    }

    @Override // p4600h.p4601a.AbstractC89059e
    /* renamed from: a */
    public final int mo143432a() {
        return this.f202793c;
    }

    public C89062h() {
        this.f202792b = f202790e;
    }

    public final boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public final Object[] toArray() {
        return toArray(new Object[size()]);
    }

    static {
        Covode.recordClassIndex(105146);
    }

    public final void clear() {
        int c = m154454c(this.f202791a + size());
        int i = this.f202791a;
        if (i < c) {
            C89064i.m154466a(this.f202792b, i, c);
        } else if (!isEmpty()) {
            Object[] objArr = this.f202792b;
            C89064i.m154466a(objArr, this.f202791a, objArr.length);
            C89064i.m154466a(this.f202792b, 0, c);
        }
        this.f202791a = 0;
        this.f202793c = 0;
    }

    /* renamed from: b */
    public final E mo143487b() {
        if (!isEmpty()) {
            int i = this.f202791a;
            Object[] objArr = this.f202792b;
            E e = (E) objArr[i];
            objArr[i] = null;
            this.f202791a = m154456e(i);
            this.f202793c = size() - 1;
            return e;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    /* renamed from: c */
    private int m154454c(int i) {
        Object[] objArr = this.f202792b;
        if (i >= objArr.length) {
            return i - objArr.length;
        }
        return i;
    }

    /* renamed from: d */
    private int m154455d(int i) {
        if (i < 0) {
            return i + this.f202792b.length;
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection, java.util.AbstractList
    public final boolean add(E e) {
        m154453b(e);
        return true;
    }

    /* renamed from: e */
    private int m154456e(int i) {
        if (i == C89064i.m154507h(this.f202792b)) {
            return 0;
        }
        return i + 1;
    }

    /* renamed from: f */
    private final int m154457f(int i) {
        if (i == 0) {
            return C89064i.m154507h(this.f202792b);
        }
        return i - 1;
    }

    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override // java.util.List
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    public C89062h(int i) {
        Object[] objArr;
        if (i == 0) {
            objArr = f202790e;
        } else if (i > 0) {
            objArr = new Object[i];
        } else {
            throw new IllegalArgumentException("Illegal Capacity: ".concat(String.valueOf(i)));
        }
        this.f202792b = objArr;
    }

    /* renamed from: a */
    public final void mo143482a(E e) {
        m154452b(size() + 1);
        int f = m154457f(this.f202791a);
        this.f202791a = f;
        this.f202792b[f] = e;
        this.f202793c = size() + 1;
    }

    @Override // java.util.List, java.util.AbstractList
    public final E get(int i) {
        AbstractC89054d.C89055a.m154445a(i, size());
        return (E) this.f202792b[m154454c(this.f202791a + i)];
    }

    /* renamed from: b */
    private void m154453b(E e) {
        m154452b(size() + 1);
        this.f202792b[m154454c(this.f202791a + size())] = e;
        this.f202793c = size() + 1;
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends E> collection) {
        C89219l.m154721d(collection, "");
        if (collection.isEmpty()) {
            return false;
        }
        m154452b(size() + collection.size());
        m154451a(m154454c(this.f202791a + size()), collection);
        return true;
    }

    /* renamed from: b */
    private final void m154452b(int i) {
        if (i >= 0) {
            Object[] objArr = this.f202792b;
            if (i > objArr.length) {
                if (objArr == f202790e) {
                    this.f202792b = new Object[C89271h.m154769b(i, 10)];
                    return;
                }
                int length = objArr.length;
                int i2 = length + (length >> 1);
                if (i2 - i < 0) {
                    i2 = i;
                }
                if (i2 - C88041a.f199945c > 0) {
                    if (i > 2147483639) {
                        i2 = Integer.MAX_VALUE;
                    } else {
                        i2 = C88041a.f199945c;
                    }
                }
                Object[] objArr2 = new Object[i2];
                C89064i.m154470a(objArr, objArr2, 0, this.f202791a, objArr.length);
                Object[] objArr3 = this.f202792b;
                int length2 = objArr3.length;
                int i3 = this.f202791a;
                C89064i.m154470a(objArr3, objArr2, length2 - i3, 0, i3);
                this.f202791a = 0;
                this.f202792b = objArr2;
                return;
            }
            return;
        }
        throw new IllegalStateException("Deque is too big.");
    }

    public final int indexOf(Object obj) {
        int i;
        int c = m154454c(this.f202791a + size());
        int i2 = this.f202791a;
        if (i2 < c) {
            while (i2 < c) {
                if (C89219l.m154714a(obj, this.f202792b[i2])) {
                    i = this.f202791a;
                } else {
                    i2++;
                }
            }
            return -1;
        } else if (i2 < c) {
            return -1;
        } else {
            int length = this.f202792b.length;
            while (true) {
                if (i2 >= length) {
                    for (int i3 = 0; i3 < c; i3++) {
                        if (C89219l.m154714a(obj, this.f202792b[i3])) {
                            i2 = i3 + this.f202792b.length;
                            i = this.f202791a;
                        }
                    }
                    return -1;
                } else if (C89219l.m154714a(obj, this.f202792b[i2])) {
                    i = this.f202791a;
                    break;
                } else {
                    i2++;
                }
            }
        }
        return i2 - i;
    }

    public final int lastIndexOf(Object obj) {
        int h;
        int i;
        int c = m154454c(this.f202791a + size());
        int i2 = this.f202791a;
        if (i2 < c) {
            h = c - 1;
            if (h < i2) {
                return -1;
            }
            while (!C89219l.m154714a(obj, this.f202792b[h])) {
                if (h == i2) {
                    return -1;
                }
                h--;
            }
            i = this.f202791a;
        } else if (i2 <= c) {
            return -1;
        } else {
            int i3 = c - 1;
            while (true) {
                if (i3 < 0) {
                    h = C89064i.m154507h(this.f202792b);
                    int i4 = this.f202791a;
                    if (h < i4) {
                        return -1;
                    }
                    while (!C89219l.m154714a(obj, this.f202792b[h])) {
                        if (h == i4) {
                            return -1;
                        }
                        h--;
                    }
                    i = this.f202791a;
                } else if (C89219l.m154714a(obj, this.f202792b[i3])) {
                    h = i3 + this.f202792b.length;
                    i = this.f202791a;
                    break;
                } else {
                    i3--;
                }
            }
        }
        return h - i;
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        T[] tArr2 = tArr;
        C89219l.m154721d(tArr2, "");
        if (tArr2.length < size()) {
            int size = size();
            C89219l.m154721d(tArr2, "");
            Object newInstance = Array.newInstance(tArr2.getClass().getComponentType(), size);
            Objects.requireNonNull(newInstance, "null cannot be cast to non-null type kotlin.Array<T>");
            tArr2 = (T[]) ((Object[]) newInstance);
        }
        Objects.requireNonNull(tArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        int c = m154454c(this.f202791a + size());
        int i = this.f202791a;
        if (i < c) {
            C89064i.m154471a(this.f202792b, tArr2, 0, i, c, 2);
        } else if (!isEmpty()) {
            Object[] objArr = this.f202792b;
            C89064i.m154470a(objArr, tArr2, 0, this.f202791a, objArr.length);
            Object[] objArr2 = this.f202792b;
            C89064i.m154470a(objArr2, tArr2, objArr2.length - this.f202791a, 0, c);
        }
        if (tArr2.length > size()) {
            tArr2[size()] = null;
        }
        Objects.requireNonNull(tArr2, "null cannot be cast to non-null type kotlin.Array<T>");
        return tArr2;
    }

    @Override // p4600h.p4601a.AbstractC89059e
    /* renamed from: a */
    public final E mo143433a(int i) {
        AbstractC89054d.C89055a.m154445a(i, size());
        if (i == C89070n.m154517a((List) this)) {
            if (!isEmpty()) {
                int c = m154454c(this.f202791a + C89070n.m154517a((List) this));
                Object[] objArr = this.f202792b;
                E e = (E) objArr[c];
                objArr[c] = null;
                this.f202793c = size() - 1;
                return e;
            }
            throw new NoSuchElementException("ArrayDeque is empty.");
        } else if (i == 0) {
            return mo143487b();
        } else {
            int c2 = m154454c(this.f202791a + i);
            E e2 = (E) this.f202792b[c2];
            if (i < (size() >> 1)) {
                int i2 = this.f202791a;
                if (c2 >= i2) {
                    Object[] objArr2 = this.f202792b;
                    C89064i.m154470a(objArr2, objArr2, i2 + 1, i2, c2);
                } else {
                    Object[] objArr3 = this.f202792b;
                    C89064i.m154470a(objArr3, objArr3, 1, 0, c2);
                    Object[] objArr4 = this.f202792b;
                    objArr4[0] = objArr4[objArr4.length - 1];
                    int i3 = this.f202791a;
                    C89064i.m154470a(objArr4, objArr4, i3 + 1, i3, objArr4.length - 1);
                }
                Object[] objArr5 = this.f202792b;
                int i4 = this.f202791a;
                objArr5[i4] = null;
                this.f202791a = m154456e(i4);
            } else {
                int c3 = m154454c(this.f202791a + C89070n.m154517a((List) this));
                if (c2 <= c3) {
                    Object[] objArr6 = this.f202792b;
                    C89064i.m154470a(objArr6, objArr6, c2, c2 + 1, c3 + 1);
                } else {
                    Object[] objArr7 = this.f202792b;
                    C89064i.m154470a(objArr7, objArr7, c2, c2 + 1, objArr7.length);
                    Object[] objArr8 = this.f202792b;
                    objArr8[objArr8.length - 1] = objArr8[0];
                    C89064i.m154470a(objArr8, objArr8, 0, 1, c3 + 1);
                }
                this.f202792b[c3] = null;
            }
            this.f202793c = size() - 1;
            return e2;
        }
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection
    public final boolean removeAll(Collection<? extends Object> collection) {
        int i;
        C89219l.m154721d(collection, "");
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.f202792b.length != 0) {
            int c = m154454c(this.f202791a + size());
            int i2 = this.f202791a;
            if (i2 < c) {
                i = i2;
                while (i2 < c) {
                    Object obj = this.f202792b[i2];
                    if (!collection.contains(obj)) {
                        this.f202792b[i] = obj;
                        i++;
                    } else {
                        z = true;
                    }
                    i2++;
                }
                C89064i.m154466a(this.f202792b, i, c);
            } else {
                int length = this.f202792b.length;
                int i3 = i2;
                boolean z2 = false;
                while (i2 < length) {
                    Object[] objArr = this.f202792b;
                    Object obj2 = objArr[i2];
                    objArr[i2] = null;
                    if (!collection.contains(obj2)) {
                        this.f202792b[i3] = obj2;
                        i3++;
                    } else {
                        z2 = true;
                    }
                    i2++;
                }
                i = m154454c(i3);
                for (int i4 = 0; i4 < c; i4++) {
                    Object[] objArr2 = this.f202792b;
                    Object obj3 = objArr2[i4];
                    objArr2[i4] = null;
                    if (!collection.contains(obj3)) {
                        this.f202792b[i] = obj3;
                        i = m154456e(i);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                this.f202793c = m154455d(i - this.f202791a);
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection
    public final boolean retainAll(Collection<? extends Object> collection) {
        int i;
        C89219l.m154721d(collection, "");
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.f202792b.length != 0) {
            int c = m154454c(this.f202791a + size());
            int i2 = this.f202791a;
            if (i2 < c) {
                i = i2;
                while (i2 < c) {
                    Object obj = this.f202792b[i2];
                    if (collection.contains(obj)) {
                        this.f202792b[i] = obj;
                        i++;
                    } else {
                        z = true;
                    }
                    i2++;
                }
                C89064i.m154466a(this.f202792b, i, c);
            } else {
                int length = this.f202792b.length;
                int i3 = i2;
                boolean z2 = false;
                while (i2 < length) {
                    Object[] objArr = this.f202792b;
                    Object obj2 = objArr[i2];
                    objArr[i2] = null;
                    if (collection.contains(obj2)) {
                        this.f202792b[i3] = obj2;
                        i3++;
                    } else {
                        z2 = true;
                    }
                    i2++;
                }
                i = m154454c(i3);
                for (int i4 = 0; i4 < c; i4++) {
                    Object[] objArr2 = this.f202792b;
                    Object obj3 = objArr2[i4];
                    objArr2[i4] = null;
                    if (collection.contains(obj3)) {
                        this.f202792b[i] = obj3;
                        i = m154456e(i);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                this.f202793c = m154455d(i - this.f202791a);
            }
        }
        return z;
    }

    @Override // java.util.List, java.util.AbstractList
    public final E set(int i, E e) {
        AbstractC89054d.C89055a.m154445a(i, size());
        int c = m154454c(this.f202791a + i);
        Object[] objArr = this.f202792b;
        E e2 = (E) objArr[c];
        objArr[c] = e;
        return e2;
    }

    /* renamed from: a */
    private final void m154451a(int i, Collection<? extends E> collection) {
        Iterator<? extends E> it = collection.iterator();
        int length = this.f202792b.length;
        while (i < length && it.hasNext()) {
            this.f202792b[i] = it.next();
            i++;
        }
        int i2 = this.f202791a;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.f202792b[i3] = it.next();
        }
        this.f202793c = size() + collection.size();
    }

    @Override // java.util.List, java.util.AbstractList
    public final void add(int i, E e) {
        AbstractC89054d.C89055a.m154446b(i, size());
        if (i == size()) {
            m154453b(e);
        } else if (i == 0) {
            mo143482a(e);
        } else {
            m154452b(size() + 1);
            int c = m154454c(this.f202791a + i);
            if (i < ((size() + 1) >> 1)) {
                int f = m154457f(c);
                int f2 = m154457f(this.f202791a);
                int i2 = this.f202791a;
                if (f >= i2) {
                    Object[] objArr = this.f202792b;
                    objArr[f2] = objArr[i2];
                    C89064i.m154470a(objArr, objArr, i2, i2 + 1, f + 1);
                } else {
                    Object[] objArr2 = this.f202792b;
                    C89064i.m154470a(objArr2, objArr2, i2 - 1, i2, objArr2.length);
                    Object[] objArr3 = this.f202792b;
                    objArr3[objArr3.length - 1] = objArr3[0];
                    C89064i.m154470a(objArr3, objArr3, 0, 1, f + 1);
                }
                this.f202792b[f] = e;
                this.f202791a = f2;
            } else {
                int c2 = m154454c(this.f202791a + size());
                if (c < c2) {
                    Object[] objArr4 = this.f202792b;
                    C89064i.m154470a(objArr4, objArr4, c + 1, c, c2);
                } else {
                    Object[] objArr5 = this.f202792b;
                    C89064i.m154470a(objArr5, objArr5, 1, 0, c2);
                    Object[] objArr6 = this.f202792b;
                    objArr6[0] = objArr6[objArr6.length - 1];
                    C89064i.m154470a(objArr6, objArr6, c + 1, c, objArr6.length - 1);
                }
                this.f202792b[c] = e;
            }
            this.f202793c = size() + 1;
        }
    }

    @Override // java.util.List, java.util.AbstractList
    public final boolean addAll(int i, Collection<? extends E> collection) {
        C89219l.m154721d(collection, "");
        AbstractC89054d.C89055a.m154446b(i, size());
        if (collection.isEmpty()) {
            return false;
        }
        if (i == size()) {
            return addAll(collection);
        }
        m154452b(size() + collection.size());
        int c = m154454c(this.f202791a + size());
        int c2 = m154454c(this.f202791a + i);
        int size = collection.size();
        if (i < ((size() + 1) >> 1)) {
            int i2 = this.f202791a;
            int i3 = i2 - size;
            if (c2 < i2) {
                Object[] objArr = this.f202792b;
                C89064i.m154470a(objArr, objArr, i3, i2, objArr.length);
                if (size >= c2) {
                    Object[] objArr2 = this.f202792b;
                    C89064i.m154470a(objArr2, objArr2, objArr2.length - size, 0, c2);
                } else {
                    Object[] objArr3 = this.f202792b;
                    C89064i.m154470a(objArr3, objArr3, objArr3.length - size, 0, size);
                    Object[] objArr4 = this.f202792b;
                    C89064i.m154470a(objArr4, objArr4, 0, size, c2);
                }
            } else if (i3 >= 0) {
                Object[] objArr5 = this.f202792b;
                C89064i.m154470a(objArr5, objArr5, i3, i2, c2);
            } else {
                Object[] objArr6 = this.f202792b;
                i3 += objArr6.length;
                int i4 = c2 - i2;
                int length = objArr6.length - i3;
                if (length >= i4) {
                    C89064i.m154470a(objArr6, objArr6, i3, i2, c2);
                } else {
                    C89064i.m154470a(objArr6, objArr6, i3, i2, i2 + length);
                    Object[] objArr7 = this.f202792b;
                    C89064i.m154470a(objArr7, objArr7, 0, this.f202791a + length, c2);
                }
            }
            this.f202791a = i3;
            m154451a(m154455d(c2 - size), collection);
        } else {
            int i5 = c2 + size;
            if (c2 < c) {
                int i6 = size + c;
                Object[] objArr8 = this.f202792b;
                if (i6 <= objArr8.length) {
                    C89064i.m154470a(objArr8, objArr8, i5, c2, c);
                } else if (i5 >= objArr8.length) {
                    C89064i.m154470a(objArr8, objArr8, i5 - objArr8.length, c2, c);
                } else {
                    int length2 = c - (i6 - objArr8.length);
                    C89064i.m154470a(objArr8, objArr8, 0, length2, c);
                    Object[] objArr9 = this.f202792b;
                    C89064i.m154470a(objArr9, objArr9, i5, c2, length2);
                }
            } else {
                Object[] objArr10 = this.f202792b;
                C89064i.m154470a(objArr10, objArr10, size, 0, c);
                Object[] objArr11 = this.f202792b;
                if (i5 >= objArr11.length) {
                    C89064i.m154470a(objArr11, objArr11, i5 - objArr11.length, c2, objArr11.length);
                } else {
                    C89064i.m154470a(objArr11, objArr11, 0, objArr11.length - size, objArr11.length);
                    Object[] objArr12 = this.f202792b;
                    C89064i.m154470a(objArr12, objArr12, i5, c2, objArr12.length - size);
                }
            }
            m154451a(c2, collection);
        }
        return true;
    }
}
