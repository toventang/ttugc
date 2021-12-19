package p4560f.p4561a.p4562a;

import android.os.Looper;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicBoolean;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;

/* renamed from: f.a.a.a */
public abstract class AbstractC88389a implements AbstractC88412b {

    /* renamed from: a */
    private final AtomicBoolean f200656a = new AtomicBoolean();

    static {
        Covode.recordClassIndex(104431);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo17923a();

    @Override // p4560f.p4561a.p4565b.AbstractC88412b
    public final boolean isDisposed() {
        return this.f200656a.get();
    }

    @Override // p4560f.p4561a.p4565b.AbstractC88412b
    public final void dispose() {
        if (!this.f200656a.compareAndSet(false, true)) {
            return;
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            mo17923a();
        } else {
            C88391a.m153580a(C88392a.f200660a).mo142900a(new Runnable() {
                /* class p4560f.p4561a.p4562a.AbstractC88389a.RunnableC883901 */

                static {
                    Covode.recordClassIndex(104432);
                }

                public final void run() {
                    AbstractC88389a.this.mo17923a();
                }
            });
        }
    }
}
