package p4560f.p4561a.p4568e.p4573e.p4575b;

import com.bytedance.covode.number.Covode;
import java.util.NoSuchElementException;
import org.p4663a.AbstractC90215d;
import p4560f.p4561a.AbstractC88403ab;
import p4560f.p4561a.AbstractC88406ae;
import p4560f.p4561a.AbstractC88924h;
import p4560f.p4561a.AbstractC88955l;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4568e.p4571c.AbstractC88469b;
import p4560f.p4561a.p4568e.p4583i.EnumC88897f;
import p4560f.p4561a.p4587h.C88925a;

/* renamed from: f.a.e.e.b.ab */
public final class C88517ab<T> extends AbstractC88403ab<T> implements AbstractC88469b<T> {

    /* renamed from: a */
    final AbstractC88924h<T> f200805a;

    /* renamed from: b */
    final T f200806b = null;

    static {
        Covode.recordClassIndex(104559);
    }

    /* renamed from: f.a.e.e.b.ab$a */
    static final class C88518a<T> implements AbstractC88412b, AbstractC88955l<T> {

        /* renamed from: a */
        final AbstractC88406ae<? super T> f200807a;

        /* renamed from: b */
        final T f200808b;

        /* renamed from: c */
        AbstractC90215d f200809c;

        /* renamed from: d */
        boolean f200810d;

        /* renamed from: e */
        T f200811e;

        static {
            Covode.recordClassIndex(104560);
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final void dispose() {
            this.f200809c.cancel();
            this.f200809c = EnumC88897f.CANCELLED;
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final boolean isDisposed() {
            if (this.f200809c == EnumC88897f.CANCELLED) {
                return true;
            }
            return false;
        }

        @Override // org.p4663a.AbstractC90214c
        public final void onComplete() {
            if (!this.f200810d) {
                this.f200810d = true;
                this.f200809c = EnumC88897f.CANCELLED;
                T t = this.f200811e;
                this.f200811e = null;
                if (t == null && (t = this.f200808b) == null) {
                    this.f200807a.onError(new NoSuchElementException());
                } else {
                    this.f200807a.onSuccess(t);
                }
            }
        }

        @Override // org.p4663a.AbstractC90214c
        public final void onError(Throwable th) {
            if (this.f200810d) {
                C88925a.m154178a(th);
                return;
            }
            this.f200810d = true;
            this.f200809c = EnumC88897f.CANCELLED;
            this.f200807a.onError(th);
        }

        @Override // org.p4663a.AbstractC90214c, p4560f.p4561a.AbstractC88955l
        public final void onSubscribe(AbstractC90215d dVar) {
            if (EnumC88897f.validate(this.f200809c, dVar)) {
                this.f200809c = dVar;
                this.f200807a.onSubscribe(this);
                dVar.request(Long.MAX_VALUE);
            }
        }

        @Override // org.p4663a.AbstractC90214c
        public final void onNext(T t) {
            if (!this.f200810d) {
                if (this.f200811e != null) {
                    this.f200810d = true;
                    this.f200809c.cancel();
                    this.f200809c = EnumC88897f.CANCELLED;
                    this.f200807a.onError(new IllegalArgumentException("Sequence contains more than one element!"));
                    return;
                }
                this.f200811e = t;
            }
        }

        C88518a(AbstractC88406ae<? super T> aeVar, T t) {
            this.f200807a = aeVar;
            this.f200808b = t;
        }
    }

    @Override // p4560f.p4561a.p4568e.p4571c.AbstractC88469b
    /* renamed from: a */
    public final AbstractC88924h<T> mo142982a() {
        return C88925a.m154168a(new C88583z(this.f200805a, this.f200806b, true));
    }

    public C88517ab(AbstractC88924h<T> hVar) {
        this.f200805a = hVar;
    }

    @Override // p4560f.p4561a.AbstractC88403ab
    /* renamed from: a */
    public final void mo17955a(AbstractC88406ae<? super T> aeVar) {
        this.f200805a.mo143201a((AbstractC88955l) new C88518a(aeVar, this.f200806b));
    }
}
