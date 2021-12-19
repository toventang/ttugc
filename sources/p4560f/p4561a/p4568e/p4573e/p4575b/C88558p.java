package p4560f.p4561a.p4568e.p4573e.p4575b;

import com.bytedance.covode.number.Covode;
import org.p4663a.AbstractC90214c;
import p4560f.p4561a.AbstractC88924h;
import p4560f.p4561a.AbstractC88955l;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4560f.p4561a.p4568e.p4570b.C88466b;
import p4560f.p4561a.p4568e.p4571c.AbstractC88468a;
import p4560f.p4561a.p4568e.p4582h.AbstractC88888a;
import p4560f.p4561a.p4568e.p4582h.AbstractC88889b;

/* renamed from: f.a.e.e.b.p */
public final class C88558p<T, U> extends AbstractC88514a<T, U> {

    /* renamed from: c */
    final AbstractC88434g<? super T, ? extends U> f200921c;

    static {
        Covode.recordClassIndex(104600);
    }

    /* renamed from: f.a.e.e.b.p$a */
    static final class C88559a<T, U> extends AbstractC88888a<T, U> {

        /* renamed from: a */
        final AbstractC88434g<? super T, ? extends U> f200922a;

        static {
            Covode.recordClassIndex(104601);
        }

        @Override // p4560f.p4561a.p4568e.p4571c.AbstractC88476i
        public final U poll() {
            Object poll = this.f201875g.poll();
            if (poll != null) {
                return (U) C88466b.m153697a(this.f200922a.apply(poll), "The mapper function returned a null value.");
            }
            return null;
        }

        @Override // p4560f.p4561a.p4568e.p4571c.AbstractC88472e
        public final int requestFusion(int i) {
            return mo143155a(i);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: f.a.e.c.a */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // p4560f.p4561a.p4568e.p4571c.AbstractC88468a
        /* renamed from: a */
        public final boolean mo142981a(T t) {
            if (this.f201876h) {
                return false;
            }
            try {
                return this.f201873e.mo142981a(C88466b.m153697a(this.f200922a.apply(t), "The mapper function returned a null value."));
            } catch (Throwable th) {
                mo143156a(th);
                return true;
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: f.a.e.c.a */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // org.p4663a.AbstractC90214c
        public final void onNext(T t) {
            if (!this.f201876h) {
                if (this.f201877i != 0) {
                    this.f201873e.onNext(null);
                    return;
                }
                try {
                    this.f201873e.onNext(C88466b.m153697a(this.f200922a.apply(t), "The mapper function returned a null value."));
                } catch (Throwable th) {
                    mo143156a(th);
                }
            }
        }

        C88559a(AbstractC88468a<? super U> aVar, AbstractC88434g<? super T, ? extends U> gVar) {
            super(aVar);
            this.f200922a = gVar;
        }
    }

    /* renamed from: f.a.e.e.b.p$b */
    static final class C88560b<T, U> extends AbstractC88889b<T, U> {

        /* renamed from: a */
        final AbstractC88434g<? super T, ? extends U> f200923a;

        static {
            Covode.recordClassIndex(104602);
        }

        @Override // p4560f.p4561a.p4568e.p4571c.AbstractC88476i
        public final U poll() {
            Object poll = this.f201880g.poll();
            if (poll != null) {
                return (U) C88466b.m153697a(this.f200923a.apply(poll), "The mapper function returned a null value.");
            }
            return null;
        }

        @Override // p4560f.p4561a.p4568e.p4571c.AbstractC88472e
        public final int requestFusion(int i) {
            return mo143157a(i);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: org.a.c */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // org.p4663a.AbstractC90214c
        public final void onNext(T t) {
            if (!this.f201881h) {
                if (this.f201882i != 0) {
                    this.f201878e.onNext(null);
                    return;
                }
                try {
                    this.f201878e.onNext(C88466b.m153697a(this.f200923a.apply(t), "The mapper function returned a null value."));
                } catch (Throwable th) {
                    mo143158a(th);
                }
            }
        }

        C88560b(AbstractC90214c<? super U> cVar, AbstractC88434g<? super T, ? extends U> gVar) {
            super(cVar);
            this.f200923a = gVar;
        }
    }

    @Override // p4560f.p4561a.AbstractC88924h
    /* renamed from: a */
    public final void mo17954a(AbstractC90214c<? super U> cVar) {
        if (cVar instanceof AbstractC88468a) {
            this.f200799b.mo143201a((AbstractC88955l) new C88559a((AbstractC88468a) cVar, this.f200921c));
        } else {
            this.f200799b.mo143201a((AbstractC88955l) new C88560b(cVar, this.f200921c));
        }
    }

    public C88558p(AbstractC88924h<T> hVar, AbstractC88434g<? super T, ? extends U> gVar) {
        super(hVar);
        this.f200921c = gVar;
    }
}
