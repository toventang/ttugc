package p4560f.p4561a.p4568e.p4573e.p4575b;

import com.bytedance.covode.number.Covode;
import org.p4663a.AbstractC90215d;
import p4560f.p4561a.AbstractC88924h;
import p4560f.p4561a.AbstractC88955l;
import p4560f.p4561a.AbstractC88973n;
import p4560f.p4561a.AbstractC88975p;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4568e.p4571c.AbstractC88469b;
import p4560f.p4561a.p4568e.p4583i.EnumC88897f;
import p4560f.p4561a.p4587h.C88925a;

/* renamed from: f.a.e.e.b.aa */
public final class C88515aa<T> extends AbstractC88973n<T> implements AbstractC88469b<T> {

    /* renamed from: a */
    final AbstractC88924h<T> f200800a;

    static {
        Covode.recordClassIndex(104557);
    }

    /* renamed from: f.a.e.e.b.aa$a */
    static final class C88516a<T> implements AbstractC88412b, AbstractC88955l<T> {

        /* renamed from: a */
        final AbstractC88975p<? super T> f200801a;

        /* renamed from: b */
        AbstractC90215d f200802b;

        /* renamed from: c */
        boolean f200803c;

        /* renamed from: d */
        T f200804d;

        static {
            Covode.recordClassIndex(104558);
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final void dispose() {
            this.f200802b.cancel();
            this.f200802b = EnumC88897f.CANCELLED;
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final boolean isDisposed() {
            if (this.f200802b == EnumC88897f.CANCELLED) {
                return true;
            }
            return false;
        }

        @Override // org.p4663a.AbstractC90214c
        public final void onComplete() {
            if (!this.f200803c) {
                this.f200803c = true;
                this.f200802b = EnumC88897f.CANCELLED;
                T t = this.f200804d;
                this.f200804d = null;
                if (t == null) {
                    this.f200801a.onComplete();
                } else {
                    this.f200801a.onSuccess(t);
                }
            }
        }

        C88516a(AbstractC88975p<? super T> pVar) {
            this.f200801a = pVar;
        }

        @Override // org.p4663a.AbstractC90214c
        public final void onError(Throwable th) {
            if (this.f200803c) {
                C88925a.m154178a(th);
                return;
            }
            this.f200803c = true;
            this.f200802b = EnumC88897f.CANCELLED;
            this.f200801a.onError(th);
        }

        @Override // org.p4663a.AbstractC90214c, p4560f.p4561a.AbstractC88955l
        public final void onSubscribe(AbstractC90215d dVar) {
            if (EnumC88897f.validate(this.f200802b, dVar)) {
                this.f200802b = dVar;
                this.f200801a.onSubscribe(this);
                dVar.request(Long.MAX_VALUE);
            }
        }

        @Override // org.p4663a.AbstractC90214c
        public final void onNext(T t) {
            if (!this.f200803c) {
                if (this.f200804d != null) {
                    this.f200803c = true;
                    this.f200802b.cancel();
                    this.f200802b = EnumC88897f.CANCELLED;
                    this.f200801a.onError(new IllegalArgumentException("Sequence contains more than one element!"));
                    return;
                }
                this.f200804d = t;
            }
        }
    }

    @Override // p4560f.p4561a.p4568e.p4571c.AbstractC88469b
    /* renamed from: a */
    public final AbstractC88924h<T> mo142982a() {
        return C88925a.m154168a(new C88583z(this.f200800a, null, false));
    }

    public C88515aa(AbstractC88924h<T> hVar) {
        this.f200800a = hVar;
    }

    @Override // p4560f.p4561a.AbstractC88973n
    /* renamed from: b */
    public final void mo143019b(AbstractC88975p<? super T> pVar) {
        this.f200800a.mo143201a((AbstractC88955l) new C88516a(pVar));
    }
}
