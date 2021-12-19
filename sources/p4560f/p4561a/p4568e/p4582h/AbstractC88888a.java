package p4560f.p4561a.p4568e.p4582h;

import com.bytedance.covode.number.Covode;
import org.p4663a.AbstractC90215d;
import p4560f.p4561a.p4566c.C88422b;
import p4560f.p4561a.p4568e.p4571c.AbstractC88468a;
import p4560f.p4561a.p4568e.p4571c.AbstractC88473f;
import p4560f.p4561a.p4568e.p4583i.EnumC88897f;
import p4560f.p4561a.p4587h.C88925a;

/* renamed from: f.a.e.h.a */
public abstract class AbstractC88888a<T, R> implements AbstractC88468a<T>, AbstractC88473f<R> {

    /* renamed from: e */
    protected final AbstractC88468a<? super R> f201873e;

    /* renamed from: f */
    protected AbstractC90215d f201874f;

    /* renamed from: g */
    protected AbstractC88473f<T> f201875g;

    /* renamed from: h */
    protected boolean f201876h;

    /* renamed from: i */
    protected int f201877i;

    static {
        Covode.recordClassIndex(104930);
    }

    @Override // org.p4663a.AbstractC90215d
    public void cancel() {
        this.f201874f.cancel();
    }

    @Override // p4560f.p4561a.p4568e.p4571c.AbstractC88476i
    public void clear() {
        this.f201875g.clear();
    }

    @Override // p4560f.p4561a.p4568e.p4571c.AbstractC88476i
    public boolean isEmpty() {
        return this.f201875g.isEmpty();
    }

    @Override // org.p4663a.AbstractC90214c
    public void onComplete() {
        if (!this.f201876h) {
            this.f201876h = true;
            this.f201873e.onComplete();
        }
    }

    public AbstractC88888a(AbstractC88468a<? super R> aVar) {
        this.f201873e = aVar;
    }

    @Override // p4560f.p4561a.p4568e.p4571c.AbstractC88476i
    public final boolean offer(R r) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // org.p4663a.AbstractC90215d
    public void request(long j) {
        this.f201874f.request(j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo143156a(Throwable th) {
        C88422b.m153670a(th);
        this.f201874f.cancel();
        onError(th);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo143155a(int i) {
        AbstractC88473f<T> fVar = this.f201875g;
        if (fVar == null || (i & 4) != 0) {
            return 0;
        }
        int requestFusion = fVar.requestFusion(i);
        if (requestFusion != 0) {
            this.f201877i = requestFusion;
        }
        return requestFusion;
    }

    @Override // org.p4663a.AbstractC90214c
    public void onError(Throwable th) {
        if (this.f201876h) {
            C88925a.m154178a(th);
            return;
        }
        this.f201876h = true;
        this.f201873e.onError(th);
    }

    @Override // org.p4663a.AbstractC90214c, p4560f.p4561a.AbstractC88955l
    public final void onSubscribe(AbstractC90215d dVar) {
        if (EnumC88897f.validate(this.f201874f, dVar)) {
            this.f201874f = dVar;
            if (dVar instanceof AbstractC88473f) {
                this.f201875g = (AbstractC88473f) dVar;
            }
            this.f201873e.onSubscribe(this);
        }
    }
}
