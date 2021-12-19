package com.google.p1998c.p2001c;

import com.bytedance.covode.number.Covode;
import com.google.p1998c.p1999a.C27245k;
import com.google.p1998c.p2001c.AbstractC27438au;
import com.google.p1998c.p2001c.C27440av;
import com.google.p1998c.p2004f.C27560a;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: com.google.c.c.e */
abstract class AbstractC27500e<E> extends AbstractC27506h<E> implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    transient C27448ay<E> f64837a;

    /* renamed from: b */
    transient long f64838b;

    static {
        Covode.recordClassIndex(33080);
    }

    @Override // com.google.p1998c.p2001c.AbstractC27438au
    public final int size() {
        return C27560a.m55098a(this.f64838b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<E> iterator() {
        return new C27440av.C27445e(this, entrySet().iterator());
    }

    @Override // com.google.p1998c.p2001c.AbstractC27506h
    public final void clear() {
        C27448ay<E> ayVar = this.f64837a;
        ayVar.f64750d++;
        Arrays.fill(ayVar.f64747a, 0, ayVar.f64749c, (Object) null);
        Arrays.fill(ayVar.f64748b, 0, ayVar.f64749c, 0);
        Arrays.fill(ayVar.f64751e, -1);
        Arrays.fill(ayVar.f64752f, -1L);
        ayVar.f64749c = 0;
        this.f64838b = 0;
    }

    @Override // com.google.p1998c.p2001c.AbstractC27438au
    public final int count(Object obj) {
        return this.f64837a.mo45807b(obj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.google.c.c.e<E> */
    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        for (int i = 0; i < readInt; i++) {
            add(objectInputStream.readObject(), objectInputStream.readInt());
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(entrySet().size());
        for (AbstractC27438au.AbstractC27439a<E> aVar : entrySet()) {
            objectOutputStream.writeObject(aVar.mo45778a());
            objectOutputStream.writeInt(aVar.mo45779b());
        }
    }

    @Override // com.google.p1998c.p2001c.AbstractC27438au, com.google.p1998c.p2001c.AbstractC27506h
    public final int setCount(E e, int i) {
        int a;
        C27511k.m54993a(i, "count");
        C27448ay<E> ayVar = this.f64837a;
        if (i == 0) {
            a = ayVar.mo45808b(e, C27535w.m55048a(e));
        } else {
            a = ayVar.mo45805a(e, i);
        }
        this.f64838b += (long) (i - a);
        return a;
    }

    @Override // com.google.p1998c.p2001c.AbstractC27438au, com.google.p1998c.p2001c.AbstractC27506h
    public final int remove(Object obj, int i) {
        boolean z;
        if (i == 0) {
            return count(obj);
        }
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        C27245k.m54237a(z, "occurrences cannot be negative: %s", i);
        int a = this.f64837a.mo45804a(obj);
        if (a == -1) {
            return 0;
        }
        int c = this.f64837a.mo45810c(a);
        if (c > i) {
            this.f64837a.mo45806a(a, c - i);
        } else {
            this.f64837a.mo45812e(a);
            i = c;
        }
        this.f64838b -= (long) i;
        return c;
    }

    @Override // com.google.p1998c.p2001c.AbstractC27438au, com.google.p1998c.p2001c.AbstractC27506h
    public final int add(E e, int i) {
        boolean z;
        if (i == 0) {
            return count(e);
        }
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        C27245k.m54237a(z, "occurrences cannot be negative: %s", i);
        int a = this.f64837a.mo45804a(e);
        if (a == -1) {
            this.f64837a.mo45805a(e, i);
            this.f64838b += (long) i;
            return 0;
        }
        int c = this.f64837a.mo45810c(a);
        long j = (long) i;
        long j2 = ((long) c) + j;
        if (j2 <= 2147483647L) {
            this.f64837a.mo45806a(a, (int) j2);
            this.f64838b += j;
            return c;
        }
        throw new IllegalArgumentException(C27245k.m54233a("too many occurrences: %s", Long.valueOf(j2)));
    }

    @Override // com.google.p1998c.p2001c.AbstractC27438au, com.google.p1998c.p2001c.AbstractC27506h
    public final boolean setCount(E e, int i, int i2) {
        C27511k.m54993a(i, "oldCount");
        C27511k.m54993a(i2, "newCount");
        int a = this.f64837a.mo45804a(e);
        if (a == -1) {
            if (i != 0) {
                return false;
            }
            if (i2 > 0) {
                this.f64837a.mo45805a(e, i2);
                this.f64838b += (long) i2;
            }
            return true;
        } else if (this.f64837a.mo45810c(a) != i) {
            return false;
        } else {
            if (i2 == 0) {
                this.f64837a.mo45812e(a);
                this.f64838b -= (long) i;
            } else {
                this.f64837a.mo45806a(a, i2);
                this.f64838b += (long) (i2 - i);
            }
            return true;
        }
    }
}
