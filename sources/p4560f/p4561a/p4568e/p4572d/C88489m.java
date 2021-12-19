package p4560f.p4561a.p4568e.p4572d;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicReference;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4568e.p4569a.EnumC88441b;
import p4560f.p4561a.p4568e.p4571c.AbstractC88471d;
import p4560f.p4561a.p4568e.p4571c.AbstractC88476i;
import p4560f.p4561a.p4568e.p4580f.C88850b;
import p4560f.p4561a.p4568e.p4580f.C88851c;

/* renamed from: f.a.e.d.m */
public final class C88489m<T> extends AtomicReference<AbstractC88412b> implements AbstractC88412b, AbstractC88986z<T> {
    private static final long serialVersionUID = -5417183359794346637L;

    /* renamed from: a */
    final AbstractC88490n<T> f200740a;

    /* renamed from: b */
    final int f200741b;

    /* renamed from: c */
    AbstractC88476i<T> f200742c;

    /* renamed from: d */
    volatile boolean f200743d;

    /* renamed from: e */
    int f200744e;

    static {
        Covode.recordClassIndex(104531);
    }

    public final void setDone() {
        this.f200743d = true;
    }

    @Override // p4560f.p4561a.p4565b.AbstractC88412b
    public final void dispose() {
        EnumC88441b.dispose(this);
    }

    public final int fusionMode() {
        return this.f200744e;
    }

    public final boolean isDone() {
        return this.f200743d;
    }

    public final AbstractC88476i<T> queue() {
        return this.f200742c;
    }

    @Override // p4560f.p4561a.AbstractC88986z
    public final void onComplete() {
        this.f200740a.mo143003a(this);
    }

    @Override // p4560f.p4561a.p4565b.AbstractC88412b
    public final boolean isDisposed() {
        return EnumC88441b.isDisposed((AbstractC88412b) get());
    }

    @Override // p4560f.p4561a.AbstractC88986z
    public final void onError(Throwable th) {
        this.f200740a.mo143005a((C88489m) this, th);
    }

    @Override // p4560f.p4561a.AbstractC88986z
    public final void onNext(T t) {
        if (this.f200744e == 0) {
            this.f200740a.mo143004a((C88489m) this, (Object) t);
        } else {
            this.f200740a.mo143002a();
        }
    }

    @Override // p4560f.p4561a.AbstractC88986z
    public final void onSubscribe(AbstractC88412b bVar) {
        AbstractC88476i<T> bVar2;
        if (EnumC88441b.setOnce(this, bVar)) {
            if (bVar instanceof AbstractC88471d) {
                AbstractC88471d dVar = (AbstractC88471d) bVar;
                int requestFusion = dVar.requestFusion(3);
                if (requestFusion == 1) {
                    this.f200744e = requestFusion;
                    this.f200742c = dVar;
                    this.f200743d = true;
                    this.f200740a.mo143003a(this);
                    return;
                } else if (requestFusion == 2) {
                    this.f200744e = requestFusion;
                    this.f200742c = dVar;
                    return;
                }
            }
            int i = -this.f200741b;
            if (i < 0) {
                bVar2 = new C88851c<>(-i);
            } else {
                bVar2 = new C88850b<>(i);
            }
            this.f200742c = bVar2;
        }
    }

    public C88489m(AbstractC88490n<T> nVar, int i) {
        this.f200740a = nVar;
        this.f200741b = i;
    }
}
