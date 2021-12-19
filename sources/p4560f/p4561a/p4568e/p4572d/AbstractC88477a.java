package p4560f.p4561a.p4568e.p4572d;

import com.bytedance.covode.number.Covode;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4566c.C88422b;
import p4560f.p4561a.p4568e.p4569a.EnumC88441b;
import p4560f.p4561a.p4568e.p4571c.AbstractC88471d;
import p4560f.p4561a.p4587h.C88925a;

/* renamed from: f.a.e.d.a */
public abstract class AbstractC88477a<T, R> implements AbstractC88471d<R>, AbstractC88986z<T> {

    /* renamed from: a */
    protected final AbstractC88986z<? super R> f200716a;

    /* renamed from: b */
    protected AbstractC88412b f200717b;

    /* renamed from: c */
    protected AbstractC88471d<T> f200718c;

    /* renamed from: d */
    protected boolean f200719d;

    /* renamed from: e */
    protected int f200720e;

    static {
        Covode.recordClassIndex(104519);
    }

    @Override // p4560f.p4561a.p4568e.p4571c.AbstractC88476i
    public void clear() {
        this.f200718c.clear();
    }

    @Override // p4560f.p4561a.p4565b.AbstractC88412b
    public void dispose() {
        this.f200717b.dispose();
    }

    @Override // p4560f.p4561a.p4565b.AbstractC88412b
    public boolean isDisposed() {
        return this.f200717b.isDisposed();
    }

    @Override // p4560f.p4561a.p4568e.p4571c.AbstractC88476i
    public boolean isEmpty() {
        return this.f200718c.isEmpty();
    }

    @Override // p4560f.p4561a.AbstractC88986z
    public void onComplete() {
        if (!this.f200719d) {
            this.f200719d = true;
            this.f200716a.onComplete();
        }
    }

    public AbstractC88477a(AbstractC88986z<? super R> zVar) {
        this.f200716a = zVar;
    }

    @Override // p4560f.p4561a.p4568e.p4571c.AbstractC88476i
    public final boolean offer(R r) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo142986a(Throwable th) {
        C88422b.m153670a(th);
        this.f200717b.dispose();
        onError(th);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo142985a(int i) {
        AbstractC88471d<T> dVar = this.f200718c;
        if (dVar == null || (i & 4) != 0) {
            return 0;
        }
        int requestFusion = dVar.requestFusion(i);
        if (requestFusion != 0) {
            this.f200720e = requestFusion;
        }
        return requestFusion;
    }

    @Override // p4560f.p4561a.AbstractC88986z
    public void onError(Throwable th) {
        if (this.f200719d) {
            C88925a.m154178a(th);
            return;
        }
        this.f200719d = true;
        this.f200716a.onError(th);
    }

    @Override // p4560f.p4561a.AbstractC88986z
    public final void onSubscribe(AbstractC88412b bVar) {
        if (EnumC88441b.validate(this.f200717b, bVar)) {
            this.f200717b = bVar;
            if (bVar instanceof AbstractC88471d) {
                this.f200718c = (AbstractC88471d) bVar;
            }
            this.f200716a.onSubscribe(this);
        }
    }
}
