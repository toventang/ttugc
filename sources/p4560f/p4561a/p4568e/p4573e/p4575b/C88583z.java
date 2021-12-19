package p4560f.p4561a.p4568e.p4573e.p4575b;

import com.bytedance.covode.number.Covode;
import java.util.NoSuchElementException;
import org.p4663a.AbstractC90214c;
import org.p4663a.AbstractC90215d;
import p4560f.p4561a.AbstractC88924h;
import p4560f.p4561a.AbstractC88955l;
import p4560f.p4561a.p4568e.p4583i.C88893b;
import p4560f.p4561a.p4568e.p4583i.EnumC88897f;
import p4560f.p4561a.p4587h.C88925a;

/* renamed from: f.a.e.e.b.z */
public final class C88583z<T> extends AbstractC88514a<T, T> {

    /* renamed from: c */
    final T f200992c;

    /* renamed from: d */
    final boolean f200993d;

    static {
        Covode.recordClassIndex(104625);
    }

    /* renamed from: f.a.e.e.b.z$a */
    static final class C88584a<T> extends C88893b<T> implements AbstractC88955l<T> {
        private static final long serialVersionUID = -5526049321428043809L;

        /* renamed from: a */
        final T f200994a;

        /* renamed from: b */
        final boolean f200995b;

        /* renamed from: c */
        AbstractC90215d f200996c;

        /* renamed from: d */
        boolean f200997d;

        static {
            Covode.recordClassIndex(104626);
        }

        @Override // org.p4663a.AbstractC90215d, p4560f.p4561a.p4568e.p4583i.C88893b
        public final void cancel() {
            super.cancel();
            this.f200996c.cancel();
        }

        @Override // org.p4663a.AbstractC90214c
        public final void onComplete() {
            if (!this.f200997d) {
                this.f200997d = true;
                T t = (T) this.f201894f;
                this.f201894f = null;
                if (t != null || (t = this.f200994a) != null) {
                    complete(t);
                } else if (this.f200995b) {
                    this.f201893e.onError(new NoSuchElementException());
                } else {
                    this.f201893e.onComplete();
                }
            }
        }

        @Override // org.p4663a.AbstractC90214c
        public final void onError(Throwable th) {
            if (this.f200997d) {
                C88925a.m154178a(th);
                return;
            }
            this.f200997d = true;
            this.f201893e.onError(th);
        }

        @Override // org.p4663a.AbstractC90214c, p4560f.p4561a.AbstractC88955l
        public final void onSubscribe(AbstractC90215d dVar) {
            if (EnumC88897f.validate(this.f200996c, dVar)) {
                this.f200996c = dVar;
                this.f201893e.onSubscribe(this);
                dVar.request(Long.MAX_VALUE);
            }
        }

        @Override // org.p4663a.AbstractC90214c
        public final void onNext(T t) {
            if (!this.f200997d) {
                if (this.f201894f != null) {
                    this.f200997d = true;
                    this.f200996c.cancel();
                    this.f201893e.onError(new IllegalArgumentException("Sequence contains more than one element!"));
                    return;
                }
                this.f201894f = t;
            }
        }

        C88584a(AbstractC90214c<? super T> cVar, T t, boolean z) {
            super(cVar);
            this.f200994a = t;
            this.f200995b = z;
        }
    }

    @Override // p4560f.p4561a.AbstractC88924h
    /* renamed from: a */
    public final void mo17954a(AbstractC90214c<? super T> cVar) {
        this.f200799b.mo143201a((AbstractC88955l) new C88584a(cVar, this.f200992c, this.f200993d));
    }

    public C88583z(AbstractC88924h<T> hVar, T t, boolean z) {
        super(hVar);
        this.f200992c = t;
        this.f200993d = z;
    }
}
