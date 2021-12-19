package p4560f.p4561a.p4568e.p4573e.p4575b;

import com.bytedance.covode.number.Covode;
import org.p4663a.AbstractC90214c;
import p4560f.p4561a.AbstractC88924h;
import p4560f.p4561a.AbstractC88955l;
import p4560f.p4561a.p4567d.AbstractC88438k;
import p4560f.p4561a.p4568e.p4571c.AbstractC88468a;
import p4560f.p4561a.p4568e.p4582h.AbstractC88888a;
import p4560f.p4561a.p4568e.p4582h.AbstractC88889b;

/* renamed from: f.a.e.e.b.h */
public final class C88543h<T> extends AbstractC88514a<T, T> {

    /* renamed from: c */
    final AbstractC88438k<? super T> f200873c;

    static {
        Covode.recordClassIndex(104585);
    }

    /* renamed from: f.a.e.e.b.h$a */
    static final class C88544a<T> extends AbstractC88888a<T, T> {

        /* renamed from: a */
        final AbstractC88438k<? super T> f200874a;

        static {
            Covode.recordClassIndex(104586);
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [T, java.lang.Object] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4560f.p4561a.p4568e.p4571c.AbstractC88476i
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final T poll() {
            /*
                r4 = this;
                f.a.e.c.f r3 = r4.f201875g
                f.a.d.k<? super T> r2 = r4.f200874a
            L_0x0004:
                java.lang.Object r1 = r3.poll()
                if (r1 != 0) goto L_0x000c
                r0 = 0
                return r0
            L_0x000c:
                boolean r0 = r2.mo7718a(r1)
                if (r0 == 0) goto L_0x0013
                return r1
            L_0x0013:
                int r1 = r4.f201877i
                r0 = 2
                if (r1 != r0) goto L_0x0004
                r0 = 1
                r3.request(r0)
                goto L_0x0004
            */
            throw new UnsupportedOperationException("Method not decompiled: p4560f.p4561a.p4568e.p4573e.p4575b.C88543h.C88544a.poll():java.lang.Object");
        }

        @Override // p4560f.p4561a.p4568e.p4571c.AbstractC88472e
        public final int requestFusion(int i) {
            return mo143155a(i);
        }

        @Override // org.p4663a.AbstractC90214c
        public final void onNext(T t) {
            if (!mo142981a((Object) t)) {
                this.f201874f.request(1);
            }
        }

        @Override // p4560f.p4561a.p4568e.p4571c.AbstractC88468a
        /* renamed from: a */
        public final boolean mo142981a(T t) {
            if (this.f201876h) {
                return false;
            }
            if (this.f201877i != 0) {
                return this.f201873e.mo142981a(null);
            }
            try {
                if (!this.f200874a.mo7718a(t) || !this.f201873e.mo142981a(t)) {
                    return false;
                }
                return true;
            } catch (Throwable th) {
                mo143156a(th);
                return true;
            }
        }

        C88544a(AbstractC88468a<? super T> aVar, AbstractC88438k<? super T> kVar) {
            super(aVar);
            this.f200874a = kVar;
        }
    }

    /* renamed from: f.a.e.e.b.h$b */
    static final class C88545b<T> extends AbstractC88889b<T, T> implements AbstractC88468a<T> {

        /* renamed from: a */
        final AbstractC88438k<? super T> f200875a;

        static {
            Covode.recordClassIndex(104587);
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [T, java.lang.Object] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4560f.p4561a.p4568e.p4571c.AbstractC88476i
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final T poll() {
            /*
                r4 = this;
                f.a.e.c.f r3 = r4.f201880g
                f.a.d.k<? super T> r2 = r4.f200875a
            L_0x0004:
                java.lang.Object r1 = r3.poll()
                if (r1 != 0) goto L_0x000c
                r0 = 0
                return r0
            L_0x000c:
                boolean r0 = r2.mo7718a(r1)
                if (r0 == 0) goto L_0x0013
                return r1
            L_0x0013:
                int r1 = r4.f201882i
                r0 = 2
                if (r1 != r0) goto L_0x0004
                r0 = 1
                r3.request(r0)
                goto L_0x0004
            */
            throw new UnsupportedOperationException("Method not decompiled: p4560f.p4561a.p4568e.p4573e.p4575b.C88543h.C88545b.poll():java.lang.Object");
        }

        @Override // p4560f.p4561a.p4568e.p4571c.AbstractC88472e
        public final int requestFusion(int i) {
            return mo143157a(i);
        }

        @Override // org.p4663a.AbstractC90214c
        public final void onNext(T t) {
            if (!mo142981a((Object) t)) {
                this.f201879f.request(1);
            }
        }

        @Override // p4560f.p4561a.p4568e.p4571c.AbstractC88468a
        /* renamed from: a */
        public final boolean mo142981a(T t) {
            if (this.f201881h) {
                return false;
            }
            if (this.f201882i != 0) {
                this.f201878e.onNext(null);
                return true;
            }
            try {
                boolean a = this.f200875a.mo7718a(t);
                if (a) {
                    this.f201878e.onNext(t);
                }
                return a;
            } catch (Throwable th) {
                mo143158a(th);
                return true;
            }
        }

        C88545b(AbstractC90214c<? super T> cVar, AbstractC88438k<? super T> kVar) {
            super(cVar);
            this.f200875a = kVar;
        }
    }

    @Override // p4560f.p4561a.AbstractC88924h
    /* renamed from: a */
    public final void mo17954a(AbstractC90214c<? super T> cVar) {
        if (cVar instanceof AbstractC88468a) {
            this.f200799b.mo143201a((AbstractC88955l) new C88544a((AbstractC88468a) cVar, this.f200873c));
        } else {
            this.f200799b.mo143201a((AbstractC88955l) new C88545b(cVar, this.f200873c));
        }
    }

    public C88543h(AbstractC88924h<T> hVar, AbstractC88438k<? super T> kVar) {
        super(hVar);
        this.f200873c = kVar;
    }
}
