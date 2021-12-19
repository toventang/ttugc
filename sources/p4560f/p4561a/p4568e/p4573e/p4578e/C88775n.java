package p4560f.p4561a.p4568e.p4573e.p4578e;

import com.bytedance.covode.number.Covode;
import p4560f.p4561a.AbstractC88984x;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4567d.AbstractC88431d;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4560f.p4561a.p4568e.p4572d.AbstractC88477a;

/* renamed from: f.a.e.e.e.n */
public final class C88775n<T, K> extends AbstractC88637a<T, T> {

    /* renamed from: b */
    final AbstractC88434g<? super T, K> f201563b;

    /* renamed from: c */
    final AbstractC88431d<? super K, ? super K> f201564c;

    static {
        Covode.recordClassIndex(104817);
    }

    /* renamed from: f.a.e.e.e.n$a */
    static final class C88776a<T, K> extends AbstractC88477a<T, T> {

        /* renamed from: f */
        final AbstractC88434g<? super T, K> f201565f;

        /* renamed from: g */
        final AbstractC88431d<? super K, ? super K> f201566g;

        /* renamed from: h */
        K f201567h;

        /* renamed from: i */
        boolean f201568i;

        static {
            Covode.recordClassIndex(104818);
        }

        /* JADX WARN: Type inference failed for: r3v0, types: [T, java.lang.Object] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4560f.p4561a.p4568e.p4571c.AbstractC88476i
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final T poll() {
            /*
                r4 = this;
            L_0x0000:
                f.a.e.c.d r0 = r4.f200718c
                java.lang.Object r3 = r0.poll()
                if (r3 != 0) goto L_0x000a
                r0 = 0
                return r0
            L_0x000a:
                f.a.d.g<? super T, K> r0 = r4.f201565f
                java.lang.Object r2 = r0.apply(r3)
                boolean r0 = r4.f201568i
                if (r0 != 0) goto L_0x001a
                r0 = 1
                r4.f201568i = r0
                r4.f201567h = r2
                return r3
            L_0x001a:
                f.a.d.d<? super K, ? super K> r1 = r4.f201566g
                K r0 = r4.f201567h
                boolean r0 = r1.mo20694a(r0, r2)
                if (r0 != 0) goto L_0x0027
                r4.f201567h = r2
                return r3
            L_0x0027:
                r4.f201567h = r2
                goto L_0x0000
            */
            throw new UnsupportedOperationException("Method not decompiled: p4560f.p4561a.p4568e.p4573e.p4578e.C88775n.C88776a.poll():java.lang.Object");
        }

        @Override // p4560f.p4561a.p4568e.p4571c.AbstractC88472e
        public final int requestFusion(int i) {
            return mo142985a(i);
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onNext(T t) {
            if (!this.f200719d) {
                if (this.f200720e != 0) {
                    this.f200716a.onNext(t);
                    return;
                }
                try {
                    K apply = this.f201565f.apply(t);
                    if (this.f201568i) {
                        boolean a = this.f201566g.mo20694a(this.f201567h, apply);
                        this.f201567h = apply;
                        if (a) {
                            return;
                        }
                    } else {
                        this.f201568i = true;
                        this.f201567h = apply;
                    }
                    this.f200716a.onNext(t);
                } catch (Throwable th) {
                    mo142986a(th);
                }
            }
        }

        C88776a(AbstractC88986z<? super T> zVar, AbstractC88434g<? super T, K> gVar, AbstractC88431d<? super K, ? super K> dVar) {
            super(zVar);
            this.f201565f = gVar;
            this.f201566g = dVar;
        }
    }

    @Override // p4560f.p4561a.AbstractC88979t
    /* renamed from: a */
    public final void mo17922a(AbstractC88986z<? super T> zVar) {
        this.f201095a.mo143062b(new C88776a(zVar, this.f201563b, this.f201564c));
    }

    public C88775n(AbstractC88984x<T> xVar, AbstractC88434g<? super T, K> gVar, AbstractC88431d<? super K, ? super K> dVar) {
        super(xVar);
        this.f201563b = gVar;
        this.f201564c = dVar;
    }
}
