package p4560f.p4561a.p4568e.p4580f;

import com.bytedance.covode.number.Covode;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import p4560f.p4561a.p4568e.p4571c.AbstractC88475h;
import p4560f.p4561a.p4568e.p4584j.C88915m;

/* renamed from: f.a.e.f.c */
public final class C88851c<T> implements AbstractC88475h<T> {

    /* renamed from: a */
    static final int f201760a = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();

    /* renamed from: j */
    private static final Object f201761j = new Object();

    /* renamed from: b */
    final AtomicLong f201762b = new AtomicLong();

    /* renamed from: c */
    int f201763c;

    /* renamed from: d */
    long f201764d;

    /* renamed from: e */
    final int f201765e;

    /* renamed from: f */
    AtomicReferenceArray<Object> f201766f;

    /* renamed from: g */
    final int f201767g;

    /* renamed from: h */
    AtomicReferenceArray<Object> f201768h;

    /* renamed from: i */
    final AtomicLong f201769i = new AtomicLong();

    @Override // p4560f.p4561a.p4568e.p4571c.AbstractC88476i
    public final void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    static {
        Covode.recordClassIndex(104893);
    }

    @Override // p4560f.p4561a.p4568e.p4571c.AbstractC88476i
    public final boolean isEmpty() {
        if (this.f201762b.get() == this.f201769i.get()) {
            return true;
        }
        return false;
    }

    @Override // p4560f.p4561a.p4568e.p4571c.AbstractC88475h, p4560f.p4561a.p4568e.p4571c.AbstractC88476i
    public final T poll() {
        boolean z;
        AtomicReferenceArray<Object> atomicReferenceArray = this.f201768h;
        long j = this.f201769i.get();
        int i = this.f201767g;
        int i2 = ((int) j) & i;
        T t = (T) atomicReferenceArray.get(i2);
        if (t == f201761j) {
            z = true;
        } else {
            z = false;
        }
        if (t != null) {
            if (!z) {
                atomicReferenceArray.lazySet(i2, null);
                m154042b(j + 1);
                return t;
            }
        } else if (!z) {
            return null;
        }
        int i3 = i + 1;
        AtomicReferenceArray<Object> atomicReferenceArray2 = (AtomicReferenceArray) atomicReferenceArray.get(i3);
        atomicReferenceArray.lazySet(i3, null);
        this.f201768h = atomicReferenceArray2;
        T t2 = (T) atomicReferenceArray2.get(i2);
        if (t2 != null) {
            atomicReferenceArray2.lazySet(i2, null);
            m154042b(j + 1);
        }
        return t2;
    }

    /* renamed from: a */
    private void m154040a(long j) {
        this.f201762b.lazySet(j);
    }

    /* renamed from: b */
    private void m154042b(long j) {
        this.f201769i.lazySet(j);
    }

    public C88851c(int i) {
        int a = C88915m.m154120a(Math.max(8, i));
        int i2 = a - 1;
        AtomicReferenceArray<Object> atomicReferenceArray = new AtomicReferenceArray<>(a + 1);
        this.f201766f = atomicReferenceArray;
        this.f201765e = i2;
        this.f201763c = Math.min(a / 4, f201760a);
        this.f201768h = atomicReferenceArray;
        this.f201767g = i2;
        this.f201764d = (long) (i2 - 1);
        m154040a(0);
    }

    @Override // p4560f.p4561a.p4568e.p4571c.AbstractC88476i
    public final boolean offer(T t) {
        Objects.requireNonNull(t, "Null is not a valid element");
        AtomicReferenceArray<Object> atomicReferenceArray = this.f201766f;
        long j = this.f201762b.get();
        int i = this.f201765e;
        int i2 = ((int) j) & i;
        if (j < this.f201764d) {
            return m154041a(atomicReferenceArray, t, j, i2);
        }
        long j2 = ((long) this.f201763c) + j;
        if (atomicReferenceArray.get(((int) j2) & i) == null) {
            this.f201764d = j2 - 1;
            return m154041a(atomicReferenceArray, t, j, i2);
        }
        long j3 = j + 1;
        if (atomicReferenceArray.get(((int) j3) & i) == null) {
            return m154041a(atomicReferenceArray, t, j, i2);
        }
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
        this.f201766f = atomicReferenceArray2;
        this.f201764d = (j + ((long) i)) - 1;
        atomicReferenceArray2.lazySet(i2, t);
        atomicReferenceArray.lazySet(atomicReferenceArray.length() - 1, atomicReferenceArray2);
        atomicReferenceArray.lazySet(i2, f201761j);
        m154040a(j3);
        return true;
    }

    /* renamed from: a */
    private boolean m154041a(AtomicReferenceArray<Object> atomicReferenceArray, T t, long j, int i) {
        atomicReferenceArray.lazySet(i, t);
        m154040a(j + 1);
        return true;
    }
}
