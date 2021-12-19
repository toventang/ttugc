package p4560f.p4561a.p4568e.p4572d;

import com.bytedance.covode.number.Covode;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4568e.p4571c.AbstractC88475h;
import p4560f.p4561a.p4568e.p4584j.AbstractC88913k;
import p4560f.p4561a.p4568e.p4584j.C88916n;

/* renamed from: f.a.e.d.p */
public abstract class AbstractC88492p<T, U, V> extends C88494r implements AbstractC88913k<U, V>, AbstractC88986z<T> {

    /* renamed from: a */
    protected final AbstractC88986z<? super V> f200749a;

    /* renamed from: b */
    public final AbstractC88475h<U> f200750b;

    /* renamed from: c */
    public volatile boolean f200751c;

    /* renamed from: d */
    protected volatile boolean f200752d;

    /* renamed from: e */
    protected Throwable f200753e;

    static {
        Covode.recordClassIndex(104534);
    }

    @Override // p4560f.p4561a.p4568e.p4584j.AbstractC88913k
    /* renamed from: a */
    public void mo143008a(AbstractC88986z<? super V> zVar, U u) {
    }

    @Override // p4560f.p4561a.p4568e.p4584j.AbstractC88913k
    /* renamed from: b */
    public final boolean mo143012b() {
        return this.f200752d;
    }

    @Override // p4560f.p4561a.p4568e.p4584j.AbstractC88913k
    /* renamed from: d */
    public final Throwable mo143014d() {
        return this.f200753e;
    }

    @Override // p4560f.p4561a.p4568e.p4584j.AbstractC88913k
    /* renamed from: a */
    public final boolean mo143010a() {
        return this.f200751c;
    }

    /* renamed from: c */
    public final boolean mo143013c() {
        if (this.f200754f.getAndIncrement() == 0) {
            return true;
        }
        return false;
    }

    @Override // p4560f.p4561a.p4568e.p4584j.AbstractC88913k
    /* renamed from: a */
    public final int mo143007a(int i) {
        return this.f200754f.addAndGet(i);
    }

    public AbstractC88492p(AbstractC88986z<? super V> zVar, AbstractC88475h<U> hVar) {
        this.f200749a = zVar;
        this.f200750b = hVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo143009a(U u, AbstractC88412b bVar) {
        AbstractC88986z<? super V> zVar = this.f200749a;
        AbstractC88475h<U> hVar = this.f200750b;
        if (this.f200754f.get() != 0 || !this.f200754f.compareAndSet(0, 1)) {
            hVar.offer(u);
            if (!mo143013c()) {
                return;
            }
        } else {
            mo143008a((AbstractC88986z) zVar, (Object) u);
            if (mo143007a(-1) == 0) {
                return;
            }
        }
        C88916n.m154121a(hVar, zVar, bVar, this);
    }

    /* renamed from: b */
    public final void mo143011b(U u, AbstractC88412b bVar) {
        AbstractC88986z<? super V> zVar = this.f200749a;
        AbstractC88475h<U> hVar = this.f200750b;
        if (this.f200754f.get() != 0 || !this.f200754f.compareAndSet(0, 1)) {
            hVar.offer(u);
            if (!mo143013c()) {
                return;
            }
        } else if (hVar.isEmpty()) {
            mo143008a((AbstractC88986z) zVar, (Object) u);
            if (mo143007a(-1) == 0) {
                return;
            }
        } else {
            hVar.offer(u);
        }
        C88916n.m154121a(hVar, zVar, bVar, this);
    }
}
