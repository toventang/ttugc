package p4560f.p4561a.p4568e.p4572d;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.CountDownLatch;
import p4560f.p4561a.AbstractC88406ae;
import p4560f.p4561a.AbstractC88427d;
import p4560f.p4561a.AbstractC88975p;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4568e.p4584j.C88903e;
import p4560f.p4561a.p4568e.p4584j.C88906h;

/* renamed from: f.a.e.d.g */
public final class C88483g<T> extends CountDownLatch implements AbstractC88406ae<T>, AbstractC88427d, AbstractC88975p<T> {

    /* renamed from: a */
    T f200726a;

    /* renamed from: b */
    Throwable f200727b;

    /* renamed from: c */
    AbstractC88412b f200728c;

    /* renamed from: d */
    volatile boolean f200729d;

    static {
        Covode.recordClassIndex(104525);
    }

    @Override // p4560f.p4561a.AbstractC88975p, p4560f.p4561a.AbstractC88427d
    public final void onComplete() {
        countDown();
    }

    public C88483g() {
        super(1);
    }

    /* renamed from: a */
    public final T mo142989a() {
        if (getCount() != 0) {
            try {
                C88903e.m154100a();
                await();
            } catch (InterruptedException e) {
                this.f200729d = true;
                AbstractC88412b bVar = this.f200728c;
                if (bVar != null) {
                    bVar.dispose();
                }
                throw C88906h.m154104a(e);
            }
        }
        Throwable th = this.f200727b;
        if (th == null) {
            return this.f200726a;
        }
        throw C88906h.m154104a(th);
    }

    @Override // p4560f.p4561a.AbstractC88975p, p4560f.p4561a.AbstractC88406ae, p4560f.p4561a.AbstractC88427d
    public final void onError(Throwable th) {
        this.f200727b = th;
        countDown();
    }

    @Override // p4560f.p4561a.AbstractC88975p, p4560f.p4561a.AbstractC88406ae
    public final void onSuccess(T t) {
        this.f200726a = t;
        countDown();
    }

    @Override // p4560f.p4561a.AbstractC88975p, p4560f.p4561a.AbstractC88406ae, p4560f.p4561a.AbstractC88427d
    public final void onSubscribe(AbstractC88412b bVar) {
        this.f200728c = bVar;
        if (this.f200729d) {
            bVar.dispose();
        }
    }
}
