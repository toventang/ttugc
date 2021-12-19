package kotlinx.coroutines.p4638c;

import com.bytedance.covode.number.Covode;
import java.util.NoSuchElementException;
import kotlinx.coroutines.AbstractC89671m;
import kotlinx.coroutines.C89672n;
import p4560f.p4561a.AbstractC88984x;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.p4604a.C89099b;
import p4600h.p4603c.p4604a.EnumC89098a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: kotlinx.coroutines.c.b */
public final class C89575b {
    static {
        Covode.recordClassIndex(105666);
    }

    /* renamed from: kotlinx.coroutines.c.b$a */
    public static final class C89576a implements AbstractC88986z<T> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89671m f203302a;

        /* renamed from: b */
        final /* synthetic */ AbstractC88984x f203303b;

        /* renamed from: c */
        final /* synthetic */ EnumC89574a f203304c;

        /* renamed from: d */
        final /* synthetic */ Object f203305d = null;

        /* renamed from: e */
        private AbstractC88412b f203306e;

        /* renamed from: f */
        private T f203307f;

        /* renamed from: g */
        private boolean f203308g;

        static {
            Covode.recordClassIndex(105667);
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onComplete() {
            if (this.f203308g) {
                if (this.f203302a.mo144213a()) {
                    this.f203302a.resumeWith(C89379q.m157068constructorimpl(this.f203307f));
                }
            } else if (this.f203304c == EnumC89574a.FIRST_OR_DEFAULT) {
                this.f203302a.resumeWith(C89379q.m157068constructorimpl(this.f203305d));
            } else if (this.f203302a.mo144213a()) {
                this.f203302a.resumeWith(C89379q.m157068constructorimpl(C89382r.m154941a((Throwable) new NoSuchElementException("No value received via onNext for " + this.f203304c))));
            }
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onError(Throwable th) {
            this.f203302a.resumeWith(C89379q.m157068constructorimpl(C89382r.m154941a(th)));
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onSubscribe(final AbstractC88412b bVar) {
            this.f203306e = bVar;
            this.f203302a.mo144211a((AbstractC89172b<? super Throwable, C89391z>) new AbstractC89172b<Throwable, C89391z>() {
                /* class kotlinx.coroutines.p4638c.C89575b.C89576a.C895771 */

                static {
                    Covode.recordClassIndex(105668);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(Throwable th) {
                    bVar.dispose();
                    return C89391z.f203057a;
                }
            });
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onNext(T t) {
            int i = C89578c.f203310a[this.f203304c.ordinal()];
            if (i == 1 || i == 2) {
                if (!this.f203308g) {
                    this.f203308g = true;
                    this.f203302a.resumeWith(C89379q.m157068constructorimpl(t));
                    AbstractC88412b bVar = this.f203306e;
                    if (bVar == null) {
                        C89219l.m154710a("subscription");
                    }
                    bVar.dispose();
                }
            } else if (i != 3 && i != 4) {
            } else {
                if (this.f203304c != EnumC89574a.SINGLE || !this.f203308g) {
                    this.f203307f = t;
                    this.f203308g = true;
                    return;
                }
                if (this.f203302a.mo144213a()) {
                    this.f203302a.resumeWith(C89379q.m157068constructorimpl(C89382r.m154941a((Throwable) new IllegalArgumentException("More than one onNext value for " + this.f203304c))));
                }
                AbstractC88412b bVar2 = this.f203306e;
                if (bVar2 == null) {
                    C89219l.m154710a("subscription");
                }
                bVar2.dispose();
            }
        }

        C89576a(AbstractC89671m mVar, AbstractC88984x xVar, EnumC89574a aVar, Object obj) {
            this.f203302a = mVar;
            this.f203303b = xVar;
            this.f203304c = aVar;
        }
    }

    /* renamed from: a */
    public static final <T> Object m155515a(AbstractC88984x<T> xVar, AbstractC89124d<? super T> dVar) {
        return m155516a(xVar, EnumC89574a.FIRST, dVar);
    }

    /* renamed from: a */
    private static /* synthetic */ <T> Object m155516a(AbstractC88984x<T> xVar, EnumC89574a aVar, AbstractC89124d<? super T> dVar) {
        C89672n nVar = new C89672n(C89099b.m154605a(dVar), 1);
        xVar.mo143062b(new C89576a(nVar, xVar, aVar, null));
        Object e = nVar.mo144218e();
        if (e == EnumC89098a.COROUTINE_SUSPENDED) {
            C89219l.m154721d(dVar, "");
        }
        return e;
    }
}
