package p4560f.p4561a.p4568e.p4572d;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.CountDownLatch;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4568e.p4584j.C88903e;
import p4560f.p4561a.p4568e.p4584j.C88906h;

/* renamed from: f.a.e.d.e */
public abstract class AbstractC88481e<T> extends CountDownLatch implements AbstractC88412b, AbstractC88986z<T> {

    /* renamed from: a */
    T f200722a;

    /* renamed from: b */
    Throwable f200723b;

    /* renamed from: c */
    AbstractC88412b f200724c;

    /* renamed from: d */
    volatile boolean f200725d;

    static {
        Covode.recordClassIndex(104523);
    }

    @Override // p4560f.p4561a.p4565b.AbstractC88412b
    public final boolean isDisposed() {
        return this.f200725d;
    }

    @Override // p4560f.p4561a.AbstractC88986z
    public final void onComplete() {
        countDown();
    }

    public AbstractC88481e() {
        super(1);
    }

    @Override // p4560f.p4561a.p4565b.AbstractC88412b
    public final void dispose() {
        this.f200725d = true;
        AbstractC88412b bVar = this.f200724c;
        if (bVar != null) {
            bVar.dispose();
        }
    }

    /* renamed from: a */
    public final T mo142988a() {
        if (getCount() != 0) {
            try {
                C88903e.m154100a();
                await();
            } catch (InterruptedException e) {
                dispose();
                throw C88906h.m154104a(e);
            }
        }
        Throwable th = this.f200723b;
        if (th == null) {
            return this.f200722a;
        }
        throw C88906h.m154104a(th);
    }

    @Override // p4560f.p4561a.AbstractC88986z
    public final void onSubscribe(AbstractC88412b bVar) {
        this.f200724c = bVar;
        if (this.f200725d) {
            bVar.dispose();
        }
    }
}
