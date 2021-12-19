package p4560f.p4561a.p4568e.p4580f;

import com.bytedance.covode.number.Covode;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import p4560f.p4561a.p4568e.p4571c.AbstractC88475h;
import p4560f.p4561a.p4568e.p4584j.C88915m;

/* renamed from: f.a.e.f.b */
public final class C88850b<E> extends AtomicReferenceArray<E> implements AbstractC88475h<E> {

    /* renamed from: f */
    private static final Integer f201754f = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);
    private static final long serialVersionUID = -1296597691183856449L;

    /* renamed from: a */
    final int f201755a = (length() - 1);

    /* renamed from: b */
    final AtomicLong f201756b = new AtomicLong();

    /* renamed from: c */
    long f201757c;

    /* renamed from: d */
    final AtomicLong f201758d = new AtomicLong();

    /* renamed from: e */
    final int f201759e;

    @Override // p4560f.p4561a.p4568e.p4571c.AbstractC88476i
    public final void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    static {
        Covode.recordClassIndex(104892);
    }

    @Override // p4560f.p4561a.p4568e.p4571c.AbstractC88476i
    public final boolean isEmpty() {
        if (this.f201756b.get() == this.f201758d.get()) {
            return true;
        }
        return false;
    }

    @Override // p4560f.p4561a.p4568e.p4571c.AbstractC88475h, p4560f.p4561a.p4568e.p4571c.AbstractC88476i
    public final E poll() {
        long j = this.f201758d.get();
        int i = ((int) j) & this.f201755a;
        E e = get(i);
        if (e == null) {
            return null;
        }
        this.f201758d.lazySet(j + 1);
        lazySet(i, null);
        return e;
    }

    public C88850b(int i) {
        super(C88915m.m154120a(i));
        this.f201759e = Math.min(i / 4, f201754f.intValue());
    }

    @Override // p4560f.p4561a.p4568e.p4571c.AbstractC88476i
    public final boolean offer(E e) {
        Objects.requireNonNull(e, "Null is not a valid element");
        int i = this.f201755a;
        long j = this.f201756b.get();
        int i2 = ((int) j) & i;
        if (j >= this.f201757c) {
            long j2 = ((long) this.f201759e) + j;
            if (get(i & ((int) j2)) == null) {
                this.f201757c = j2;
            } else if (get(i2) != null) {
                return false;
            }
        }
        lazySet(i2, e);
        this.f201756b.lazySet(j + 1);
        return true;
    }

    public final boolean offer(E e, E e2) {
        if (!offer(e) || !offer(e2)) {
            return false;
        }
        return true;
    }
}
