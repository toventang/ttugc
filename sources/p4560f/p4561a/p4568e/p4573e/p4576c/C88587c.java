package p4560f.p4561a.p4568e.p4573e.p4576c;

import com.C1764a;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicReference;
import p4560f.p4561a.AbstractC88973n;
import p4560f.p4561a.AbstractC88974o;
import p4560f.p4561a.AbstractC88975p;
import p4560f.p4561a.AbstractC88976q;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4566c.C88422b;
import p4560f.p4561a.p4568e.p4569a.EnumC88441b;
import p4560f.p4561a.p4587h.C88925a;

/* renamed from: f.a.e.e.c.c */
public final class C88587c<T> extends AbstractC88973n<T> {

    /* renamed from: a */
    final AbstractC88976q<T> f201002a;

    static {
        Covode.recordClassIndex(104629);
    }

    /* renamed from: f.a.e.e.c.c$a */
    static final class C88588a<T> extends AtomicReference<AbstractC88412b> implements AbstractC88412b, AbstractC88974o<T> {
        private static final long serialVersionUID = -2467358622224974244L;

        /* renamed from: a */
        final AbstractC88975p<? super T> f201003a;

        static {
            Covode.recordClassIndex(104630);
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final void dispose() {
            EnumC88441b.dispose(this);
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final boolean isDisposed() {
            return EnumC88441b.isDisposed((AbstractC88412b) get());
        }

        public final String toString() {
            return C1764a.m5928a("%s{%s}", new Object[]{getClass().getSimpleName(), super.toString()});
        }

        @Override // p4560f.p4561a.AbstractC88974o
        /* renamed from: a */
        public final void mo143048a() {
            AbstractC88412b bVar;
            if (get() != EnumC88441b.DISPOSED && (bVar = (AbstractC88412b) getAndSet(EnumC88441b.DISPOSED)) != EnumC88441b.DISPOSED) {
                try {
                    this.f201003a.onComplete();
                } finally {
                    if (bVar != null) {
                        bVar.dispose();
                    }
                }
            }
        }

        C88588a(AbstractC88975p<? super T> pVar) {
            this.f201003a = pVar;
        }

        @Override // p4560f.p4561a.AbstractC88974o
        /* renamed from: a */
        public final void mo143050a(Throwable th) {
            if (!mo143051b(th)) {
                C88925a.m154178a(th);
            }
        }

        @Override // p4560f.p4561a.AbstractC88974o
        /* renamed from: b */
        public final boolean mo143051b(Throwable th) {
            AbstractC88412b bVar;
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            if (get() == EnumC88441b.DISPOSED || (bVar = (AbstractC88412b) getAndSet(EnumC88441b.DISPOSED)) == EnumC88441b.DISPOSED) {
                return false;
            }
            try {
                this.f201003a.onError(th);
            } finally {
                if (bVar != null) {
                    bVar.dispose();
                }
            }
        }

        @Override // p4560f.p4561a.AbstractC88974o
        /* renamed from: a */
        public final void mo143049a(T t) {
            AbstractC88412b bVar;
            if (get() != EnumC88441b.DISPOSED && (bVar = (AbstractC88412b) getAndSet(EnumC88441b.DISPOSED)) != EnumC88441b.DISPOSED) {
                if (t == null) {
                    try {
                        this.f201003a.onError(new NullPointerException("onSuccess called with null. Null values are generally not allowed in 2.x operators and sources."));
                    } catch (Throwable th) {
                        if (bVar != null) {
                            bVar.dispose();
                        }
                        throw th;
                    }
                } else {
                    this.f201003a.onSuccess(t);
                }
                if (bVar != null) {
                    bVar.dispose();
                }
            }
        }
    }

    public C88587c(AbstractC88976q<T> qVar) {
        this.f201002a = qVar;
    }

    @Override // p4560f.p4561a.AbstractC88973n
    /* renamed from: b */
    public final void mo143019b(AbstractC88975p<? super T> pVar) {
        C88588a aVar = new C88588a(pVar);
        pVar.onSubscribe(aVar);
        try {
            this.f201002a.mo58447a(aVar);
        } catch (Throwable th) {
            C88422b.m153670a(th);
            aVar.mo143050a(th);
        }
    }
}
