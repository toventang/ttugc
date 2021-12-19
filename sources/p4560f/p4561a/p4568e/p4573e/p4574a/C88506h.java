package p4560f.p4561a.p4568e.p4573e.p4574a;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicReference;
import p4560f.p4561a.AbstractC88398aa;
import p4560f.p4561a.AbstractC88410b;
import p4560f.p4561a.AbstractC88427d;
import p4560f.p4561a.AbstractC88917f;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4568e.p4569a.EnumC88441b;

/* renamed from: f.a.e.e.a.h */
public final class C88506h extends AbstractC88410b {

    /* renamed from: a */
    final AbstractC88917f f200775a;

    /* renamed from: b */
    final AbstractC88398aa f200776b;

    static {
        Covode.recordClassIndex(104548);
    }

    /* renamed from: f.a.e.e.a.h$a */
    static final class RunnableC88507a extends AtomicReference<AbstractC88412b> implements AbstractC88412b, AbstractC88427d, Runnable {
        private static final long serialVersionUID = 8571289934935992137L;

        /* renamed from: a */
        final AbstractC88427d f200777a;

        /* renamed from: b */
        final AbstractC88398aa f200778b;

        /* renamed from: c */
        Throwable f200779c;

        static {
            Covode.recordClassIndex(104549);
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final void dispose() {
            EnumC88441b.dispose(this);
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final boolean isDisposed() {
            return EnumC88441b.isDisposed((AbstractC88412b) get());
        }

        @Override // p4560f.p4561a.AbstractC88427d
        public final void onComplete() {
            EnumC88441b.replace(this, this.f200778b.mo142900a(this));
        }

        public final void run() {
            Throwable th = this.f200779c;
            if (th != null) {
                this.f200779c = null;
                this.f200777a.onError(th);
                return;
            }
            this.f200777a.onComplete();
        }

        @Override // p4560f.p4561a.AbstractC88427d
        public final void onError(Throwable th) {
            this.f200779c = th;
            EnumC88441b.replace(this, this.f200778b.mo142900a(this));
        }

        @Override // p4560f.p4561a.AbstractC88427d
        public final void onSubscribe(AbstractC88412b bVar) {
            if (EnumC88441b.setOnce(this, bVar)) {
                this.f200777a.onSubscribe(this);
            }
        }

        RunnableC88507a(AbstractC88427d dVar, AbstractC88398aa aaVar) {
            this.f200777a = dVar;
            this.f200778b = aaVar;
        }
    }

    @Override // p4560f.p4561a.AbstractC88410b
    /* renamed from: b */
    public final void mo142942b(AbstractC88427d dVar) {
        this.f200775a.mo17931a(new RunnableC88507a(dVar, this.f200776b));
    }

    public C88506h(AbstractC88917f fVar, AbstractC88398aa aaVar) {
        this.f200775a = fVar;
        this.f200776b = aaVar;
    }
}
