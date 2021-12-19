package p4560f.p4561a.p4568e.p4573e.p4578e;

import com.C1764a;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicReference;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88982v;
import p4560f.p4561a.AbstractC88983w;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4566c.C88422b;
import p4560f.p4561a.p4568e.p4569a.EnumC88441b;
import p4560f.p4561a.p4587h.C88925a;

/* renamed from: f.a.e.e.e.i */
public final class C88762i<T> extends AbstractC88979t<T> {

    /* renamed from: a */
    final AbstractC88983w<T> f201526a;

    static {
        Covode.recordClassIndex(104804);
    }

    /* renamed from: f.a.e.e.e.i$a */
    static final class C88763a<T> extends AtomicReference<AbstractC88412b> implements AbstractC88412b, AbstractC88982v<T> {
        private static final long serialVersionUID = -3434801548987643227L;

        /* renamed from: a */
        final AbstractC88986z<? super T> f201527a;

        static {
            Covode.recordClassIndex(104805);
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final void dispose() {
            EnumC88441b.dispose(this);
        }

        @Override // p4560f.p4561a.AbstractC88982v, p4560f.p4561a.p4565b.AbstractC88412b
        public final boolean isDisposed() {
            return EnumC88441b.isDisposed((AbstractC88412b) get());
        }

        @Override // p4560f.p4561a.AbstractC88920g
        /* renamed from: a */
        public final void mo143023a() {
            if (!isDisposed()) {
                try {
                    this.f201527a.onComplete();
                } finally {
                    dispose();
                }
            }
        }

        public final String toString() {
            return C1764a.m5928a("%s{%s}", new Object[]{getClass().getSimpleName(), super.toString()});
        }

        C88763a(AbstractC88986z<? super T> zVar) {
            this.f201527a = zVar;
        }

        @Override // p4560f.p4561a.AbstractC88920g
        /* renamed from: a */
        public final void mo143024a(Throwable th) {
            if (!mo143104b(th)) {
                C88925a.m154178a(th);
            }
        }

        /* JADX INFO: finally extract failed */
        @Override // p4560f.p4561a.AbstractC88982v
        /* renamed from: b */
        public final boolean mo143104b(Throwable th) {
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            if (isDisposed()) {
                return false;
            }
            try {
                this.f201527a.onError(th);
                dispose();
                return true;
            } catch (Throwable th2) {
                dispose();
                throw th2;
            }
        }

        @Override // p4560f.p4561a.AbstractC88920g
        /* renamed from: a */
        public final void mo143031a(T t) {
            if (t == null) {
                mo143024a((Throwable) new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            } else if (!isDisposed()) {
                this.f201527a.onNext(t);
            }
        }
    }

    public C88762i(AbstractC88983w<T> wVar) {
        this.f201526a = wVar;
    }

    @Override // p4560f.p4561a.AbstractC88979t
    /* renamed from: a */
    public final void mo17922a(AbstractC88986z<? super T> zVar) {
        C88763a aVar = new C88763a(zVar);
        zVar.onSubscribe(aVar);
        try {
            this.f201526a.subscribe(aVar);
        } catch (Throwable th) {
            C88422b.m153670a(th);
            aVar.mo143024a(th);
        }
    }
}
