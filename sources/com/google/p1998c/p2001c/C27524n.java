package com.google.p1998c.p2001c;

import com.bytedance.covode.number.Covode;
import com.google.p1998c.p1999a.C27241i;
import com.google.p1998c.p1999a.C27245k;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* access modifiers changed from: package-private */
/* renamed from: com.google.c.c.n */
public final class C27524n<E> extends AbstractSet<E> implements Serializable {

    /* renamed from: a */
    public transient long[] f64882a;

    /* renamed from: b */
    transient Object[] f64883b;

    /* renamed from: c */
    transient float f64884c;

    /* renamed from: d */
    transient int f64885d;

    /* renamed from: e */
    transient int f64886e;

    /* renamed from: f */
    private transient int[] f64887f;

    /* renamed from: g */
    private transient int f64888g;

    static {
        Covode.recordClassIndex(33104);
    }

    /* renamed from: a */
    private static long m55019a(long j, int i) {
        return (j & -4294967296L) | (((long) i) & 4294967295L);
    }

    public final int size() {
        return this.f64886e;
    }

    C27524n() {
        m55020a();
    }

    public final boolean isEmpty() {
        if (this.f64886e == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set, java.lang.Iterable
    public final Iterator<E> iterator() {
        return new Iterator<E>() {
            /* class com.google.p1998c.p2001c.C27524n.C275251 */

            /* renamed from: a */
            int f64889a;

            /* renamed from: b */
            int f64890b;

            /* renamed from: c */
            int f64891c;

            static {
                Covode.recordClassIndex(33105);
            }

            public final boolean hasNext() {
                if (this.f64890b >= 0) {
                    return true;
                }
                return false;
            }

            /* renamed from: a */
            private void m55026a() {
                if (C27524n.this.f64885d != this.f64889a) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.Iterator
            public final E next() {
                m55026a();
                if (hasNext()) {
                    this.f64891c = this.f64890b;
                    Object[] objArr = C27524n.this.f64883b;
                    int i = this.f64890b;
                    E e = (E) objArr[i];
                    int i2 = i + 1;
                    if (i2 >= C27524n.this.f64886e) {
                        i2 = -1;
                    }
                    this.f64890b = i2;
                    return e;
                }
                throw new NoSuchElementException();
            }

            public final void remove() {
                boolean z;
                m55026a();
                if (this.f64891c >= 0) {
                    z = true;
                } else {
                    z = false;
                }
                C27245k.m54244b(z, "no calls to next() since the last call to remove()");
                this.f64889a++;
                C27524n nVar = C27524n.this;
                nVar.mo46044a(nVar.f64883b[this.f64891c], (int) (C27524n.this.f64882a[this.f64891c] >>> 32));
                this.f64890b--;
                this.f64891c = -1;
            }

            {
                int i;
                this.f64889a = C27524n.this.f64885d;
                if (C27524n.this.isEmpty()) {
                    i = -1;
                } else {
                    i = 0;
                }
                this.f64890b = i;
                this.f64891c = -1;
            }
        };
    }

    /* renamed from: b */
    private static long[] m55023b() {
        long[] jArr = new long[3];
        Arrays.fill(jArr, -1L);
        return jArr;
    }

    public final Object[] toArray() {
        return Arrays.copyOf(this.f64883b, this.f64886e);
    }

    public final void clear() {
        this.f64885d++;
        Arrays.fill(this.f64883b, 0, this.f64886e, (Object) null);
        Arrays.fill(this.f64887f, -1);
        Arrays.fill(this.f64882a, -1L);
        this.f64886e = 0;
    }

    /* renamed from: a */
    private void m55020a() {
        C27245k.m54236a(true, (Object) "Initial capacity must be non-negative");
        C27245k.m54236a(true, (Object) "Illegal load factor");
        int a = C27535w.m55047a(3, 1.0d);
        this.f64887f = m55021a(a);
        this.f64884c = 1.0f;
        this.f64883b = new Object[3];
        this.f64882a = m55023b();
        this.f64888g = Math.max(1, (int) (((float) a) * 1.0f));
    }

    /* renamed from: a */
    private static int[] m55021a(int i) {
        int[] iArr = new int[i];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    public final boolean remove(Object obj) {
        return mo46044a(obj, C27535w.m55048a(obj));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.google.c.c.n<E> */
    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        m55020a();
        int readInt = objectInputStream.readInt();
        while (true) {
            readInt--;
            if (readInt >= 0) {
                add(objectInputStream.readObject());
            } else {
                return;
            }
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(this.f64886e);
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            objectOutputStream.writeObject(it.next());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final <T> T[] toArray(T[] tArr) {
        Object[] objArr = this.f64883b;
        int i = this.f64886e;
        C27245k.m54234a(0, i + 0, objArr.length);
        if (tArr.length < i) {
            tArr = (T[]) C27454ba.m54889a(tArr, i);
        } else if (tArr.length > i) {
            tArr[i] = null;
        }
        System.arraycopy(objArr, 0, tArr, 0, i);
        return tArr;
    }

    public final boolean contains(Object obj) {
        int a = C27535w.m55048a(obj);
        int[] iArr = this.f64887f;
        int i = iArr[(iArr.length - 1) & a];
        while (i != -1) {
            long j = this.f64882a[i];
            if (((int) (j >>> 32)) == a && C27241i.m54222a(obj, this.f64883b[i])) {
                return true;
            }
            i = (int) j;
        }
        return false;
    }

    /* renamed from: b */
    private void m55022b(int i) {
        if (this.f64887f.length >= 1073741824) {
            this.f64888g = Integer.MAX_VALUE;
            return;
        }
        int i2 = ((int) (((float) i) * this.f64884c)) + 1;
        int[] a = m55021a(i);
        long[] jArr = this.f64882a;
        int length = a.length - 1;
        for (int i3 = 0; i3 < this.f64886e; i3++) {
            int i4 = (int) (jArr[i3] >>> 32);
            int i5 = i4 & length;
            int i6 = a[i5];
            a[i5] = i3;
            jArr[i3] = (((long) i4) << 32) | (((long) i6) & 4294967295L);
        }
        this.f64888g = i2;
        this.f64887f = a;
    }

    /* renamed from: c */
    private void m55024c(int i) {
        int size = size() - 1;
        if (i < size) {
            Object[] objArr = this.f64883b;
            objArr[i] = objArr[size];
            objArr[size] = null;
            long[] jArr = this.f64882a;
            long j = jArr[size];
            jArr[i] = j;
            jArr[size] = -1;
            int[] iArr = this.f64887f;
            int length = ((int) (j >>> 32)) & (iArr.length - 1);
            int i2 = iArr[length];
            if (i2 == size) {
                iArr[length] = i;
                return;
            }
            while (true) {
                long[] jArr2 = this.f64882a;
                long j2 = jArr2[i2];
                int i3 = (int) j2;
                if (i3 == size) {
                    jArr2[i2] = m55019a(j2, i);
                    return;
                }
                i2 = i3;
            }
        } else {
            this.f64883b[i] = null;
            this.f64882a[i] = -1;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(E e) {
        long[] jArr = this.f64882a;
        Object[] objArr = this.f64883b;
        int a = C27535w.m55048a(e);
        int[] iArr = this.f64887f;
        int length = (iArr.length - 1) & a;
        int i = this.f64886e;
        int i2 = iArr[length];
        if (i2 == -1) {
            iArr[length] = i;
        } else {
            while (true) {
                long j = jArr[i2];
                if (((int) (j >>> 32)) == a && C27241i.m54222a(e, objArr[i2])) {
                    return false;
                }
                int i3 = (int) j;
                if (i3 == -1) {
                    jArr[i2] = m55019a(j, i);
                    break;
                }
                i2 = i3;
            }
        }
        int i4 = Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            int i5 = i + 1;
            int length2 = this.f64882a.length;
            if (i5 > length2) {
                int max = Math.max(1, length2 >>> 1) + length2;
                if (max >= 0) {
                    i4 = max;
                }
                if (i4 != length2) {
                    this.f64883b = Arrays.copyOf(this.f64883b, i4);
                    long[] jArr2 = this.f64882a;
                    int length3 = jArr2.length;
                    long[] copyOf = Arrays.copyOf(jArr2, i4);
                    if (i4 > length3) {
                        Arrays.fill(copyOf, length3, i4, -1L);
                    }
                    this.f64882a = copyOf;
                }
            }
            this.f64882a[i] = (((long) a) << 32) | 4294967295L;
            this.f64883b[i] = e;
            this.f64886e = i5;
            if (i >= this.f64888g) {
                m55022b(this.f64887f.length * 2);
            }
            this.f64885d++;
            return true;
        }
        throw new IllegalStateException("Cannot contain more than Integer.MAX_VALUE elements!");
    }

    /* renamed from: a */
    public final boolean mo46044a(Object obj, int i) {
        int[] iArr = this.f64887f;
        int length = (iArr.length - 1) & i;
        int i2 = iArr[length];
        if (i2 == -1) {
            return false;
        }
        int i3 = -1;
        while (true) {
            if (((int) (this.f64882a[i2] >>> 32)) != i || !C27241i.m54222a(obj, this.f64883b[i2])) {
                int i4 = (int) this.f64882a[i2];
                if (i4 == -1) {
                    return false;
                }
                i3 = i2;
                i2 = i4;
            } else {
                if (i3 == -1) {
                    this.f64887f[length] = (int) this.f64882a[i2];
                } else {
                    long[] jArr = this.f64882a;
                    jArr[i3] = m55019a(jArr[i3], (int) jArr[i2]);
                }
                m55024c(i2);
                this.f64886e--;
                this.f64885d++;
                return true;
            }
        }
    }
}
