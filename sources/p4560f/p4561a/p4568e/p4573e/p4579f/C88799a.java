package p4560f.p4561a.p4568e.p4573e.p4579f;

import com.C1764a;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicReference;
import p4560f.p4561a.AbstractC88403ab;
import p4560f.p4561a.AbstractC88405ad;
import p4560f.p4561a.AbstractC88406ae;
import p4560f.p4561a.AbstractC88407af;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4566c.C88422b;
import p4560f.p4561a.p4568e.p4569a.EnumC88441b;
import p4560f.p4561a.p4587h.C88925a;

/* renamed from: f.a.e.e.f.a */
public final class C88799a<T> extends AbstractC88403ab<T> {

    /* renamed from: a */
    final AbstractC88407af<T> f201651a;

    static {
        Covode.recordClassIndex(104841);
    }

    /* renamed from: f.a.e.e.f.a$a */
    static final class C88800a<T> extends AtomicReference<AbstractC88412b> implements AbstractC88405ad<T>, AbstractC88412b {
        private static final long serialVersionUID = -2467358622224974244L;

        /* renamed from: a */
        final AbstractC88406ae<? super T> f201652a;

        static {
            Covode.recordClassIndex(104842);
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final void dispose() {
            EnumC88441b.dispose(this);
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b, p4560f.p4561a.AbstractC88405ad
        public final boolean isDisposed() {
            return EnumC88441b.isDisposed((AbstractC88412b) get());
        }

        public final String toString() {
            return C1764a.m5928a("%s{%s}", new Object[]{getClass().getSimpleName(), super.toString()});
        }

        C88800a(AbstractC88406ae<? super T> aeVar) {
            this.f201652a = aeVar;
        }

        @Override // p4560f.p4561a.AbstractC88405ad
        /* renamed from: a */
        public final void mo142932a(Throwable th) {
            if (!mo142933b(th)) {
                C88925a.m154178a(th);
            }
        }

        @Override // p4560f.p4561a.AbstractC88405ad
        /* renamed from: a */
        public final void mo142931a(T t) {
            AbstractC88412b bVar;
            if (get() != EnumC88441b.DISPOSED && (bVar = (AbstractC88412b) getAndSet(EnumC88441b.DISPOSED)) != EnumC88441b.DISPOSED) {
                if (t == null) {
                    try {
                        this.f201652a.onError(new NullPointerException("onSuccess called with null. Null values are generally not allowed in 2.x operators and sources."));
                    } catch (Throwable th) {
                        if (bVar != null) {
                            bVar.dispose();
                        }
                        throw th;
                    }
                } else {
                    this.f201652a.onSuccess(t);
                }
                if (bVar != null) {
                    bVar.dispose();
                }
            }
        }

        @Override // p4560f.p4561a.AbstractC88405ad
        /* renamed from: b */
        public final boolean mo142933b(Throwable th) {
            AbstractC88412b bVar;
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            if (get() == EnumC88441b.DISPOSED || (bVar = (AbstractC88412b) getAndSet(EnumC88441b.DISPOSED)) == EnumC88441b.DISPOSED) {
                return false;
            }
            try {
                this.f201652a.onError(th);
            } finally {
                if (bVar != null) {
                    bVar.dispose();
                }
            }
        }
    }

    public C88799a(AbstractC88407af<T> afVar) {
        this.f201651a = afVar;
    }

    @Override // p4560f.p4561a.AbstractC88403ab
    /* renamed from: a */
    public final void mo17955a(AbstractC88406ae<? super T> aeVar) {
        C88800a aVar = new C88800a(aeVar);
        aeVar.onSubscribe(aVar);
        try {
            this.f201651a.subscribe(aVar);
        } catch (Throwable th) {
            C88422b.m153670a(th);
            aVar.mo142932a(th);
        }
    }
}
