package p4560f.p4561a.p4568e.p4582h;

import com.bytedance.covode.number.Covode;
import org.p4663a.AbstractC90214c;
import org.p4663a.AbstractC90215d;
import p4560f.p4561a.AbstractC88955l;
import p4560f.p4561a.p4566c.C88422b;
import p4560f.p4561a.p4568e.p4571c.AbstractC88473f;
import p4560f.p4561a.p4568e.p4583i.EnumC88897f;
import p4560f.p4561a.p4587h.C88925a;

/* renamed from: f.a.e.h.b */
public abstract class AbstractC88889b<T, R> implements AbstractC88473f<R>, AbstractC88955l<T> {

    /* renamed from: e */
    protected final AbstractC90214c<? super R> f201878e;

    /* renamed from: f */
    protected AbstractC90215d f201879f;

    /* renamed from: g */
    protected AbstractC88473f<T> f201880g;

    /* renamed from: h */
    protected boolean f201881h;

    /* renamed from: i */
    protected int f201882i;

    static {
        Covode.recordClassIndex(104931);
    }

    @Override // org.p4663a.AbstractC90215d
    public void cancel() {
        this.f201879f.cancel();
    }

    @Override // p4560f.p4561a.p4568e.p4571c.AbstractC88476i
    public void clear() {
        this.f201880g.clear();
    }

    @Override // p4560f.p4561a.p4568e.p4571c.AbstractC88476i
    public boolean isEmpty() {
        return this.f201880g.isEmpty();
    }

    @Override // org.p4663a.AbstractC90214c
    public void onComplete() {
        if (!this.f201881h) {
            this.f201881h = true;
            this.f201878e.onComplete();
        }
    }

    public AbstractC88889b(AbstractC90214c<? super R> cVar) {
        this.f201878e = cVar;
    }

    @Override // p4560f.p4561a.p4568e.p4571c.AbstractC88476i
    public final boolean offer(R r) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // org.p4663a.AbstractC90215d
    public void request(long j) {
        this.f201879f.request(j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo143158a(Throwable th) {
        C88422b.m153670a(th);
        this.f201879f.cancel();
        onError(th);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo143157a(int i) {
        AbstractC88473f<T> fVar = this.f201880g;
        if (fVar == null || (i & 4) != 0) {
            return 0;
        }
        int requestFusion = fVar.requestFusion(i);
        if (requestFusion != 0) {
            this.f201882i = requestFusion;
        }
        return requestFusion;
    }

    @Override // org.p4663a.AbstractC90214c
    public void onError(Throwable th) {
        if (this.f201881h) {
            C88925a.m154178a(th);
            return;
        }
        this.f201881h = true;
        this.f201878e.onError(th);
    }

    @Override // org.p4663a.AbstractC90214c, p4560f.p4561a.AbstractC88955l
    public final void onSubscribe(AbstractC90215d dVar) {
        if (EnumC88897f.validate(this.f201879f, dVar)) {
            this.f201879f = dVar;
            if (dVar instanceof AbstractC88473f) {
                this.f201880g = (AbstractC88473f) dVar;
            }
            this.f201878e.onSubscribe(this);
        }
    }
}
