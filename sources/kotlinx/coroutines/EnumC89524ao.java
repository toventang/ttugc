package kotlinx.coroutines;

import com.bytedance.covode.number.Covode;
import kotlinx.coroutines.internal.C89663z;
import kotlinx.coroutines.p4637b.C89539a;
import p4600h.C89376n;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.C89388w;
import p4600h.C89391z;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.AbstractC89127f;
import p4600h.p4603c.p4604a.C89099b;
import p4600h.p4603c.p4604a.EnumC89098a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89206ad;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: kotlinx.coroutines.ao */
public enum EnumC89524ao {
    DEFAULT,
    LAZY,
    ATOMIC,
    UNDISPATCHED;

    static {
        Covode.recordClassIndex(105615);
    }

    public static /* synthetic */ void isLazy$annotations() {
    }

    public final boolean isLazy() {
        if (this == LAZY) {
            return true;
        }
        return false;
    }

    /* JADX INFO: finally extract failed */
    public final <T> void invoke(AbstractC89172b<? super AbstractC89124d<? super T>, ? extends Object> bVar, AbstractC89124d<? super T> dVar) {
        int i = C89525ap.f203241a[ordinal()];
        if (i == 1) {
            try {
                C89541ba.m155472a(C89099b.m154605a(C89099b.m154606a(bVar, dVar)), C89379q.m157068constructorimpl(C89391z.f203057a));
            } catch (Throwable th) {
                dVar.resumeWith(C89379q.m157068constructorimpl(C89382r.m154941a(th)));
            }
        } else if (i == 2) {
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(dVar, "");
            C89099b.m154605a(C89099b.m154606a(bVar, dVar)).resumeWith(C89379q.m157068constructorimpl(C89391z.f203057a));
        } else if (i == 3) {
            C89219l.m154721d(dVar, "");
            try {
                AbstractC89127f context = dVar.getContext();
                Object a = C89663z.m155642a(context, null);
                if (bVar != null) {
                    try {
                        Object invoke = ((AbstractC89172b) C89206ad.m154679b(bVar, 1)).invoke(dVar);
                        C89663z.m155643b(context, a);
                        if (invoke != EnumC89098a.COROUTINE_SUSPENDED) {
                            dVar.resumeWith(C89379q.m157068constructorimpl(invoke));
                        }
                    } catch (Throwable th2) {
                        C89663z.m155643b(context, a);
                        throw th2;
                    }
                } else {
                    throw new C89388w("null cannot be cast to non-null type");
                }
            } catch (Throwable th3) {
                dVar.resumeWith(C89379q.m157068constructorimpl(C89382r.m154941a(th3)));
            }
        } else if (i != 4) {
            throw new C89376n();
        }
    }

    /* JADX INFO: finally extract failed */
    public final <R, T> void invoke(AbstractC89183m<? super R, ? super AbstractC89124d<? super T>, ? extends Object> mVar, R r, AbstractC89124d<? super T> dVar) {
        int i = C89525ap.f203242b[ordinal()];
        if (i == 1) {
            C89539a.m155469a(mVar, r, dVar);
        } else if (i == 2) {
            C89219l.m154721d(mVar, "");
            C89219l.m154721d(dVar, "");
            C89099b.m154605a(C89099b.m154607a(mVar, r, dVar)).resumeWith(C89379q.m157068constructorimpl(C89391z.f203057a));
        } else if (i == 3) {
            C89219l.m154721d(dVar, "");
            try {
                AbstractC89127f context = dVar.getContext();
                Object a = C89663z.m155642a(context, null);
                if (mVar != null) {
                    try {
                        Object invoke = ((AbstractC89183m) C89206ad.m154679b(mVar, 2)).invoke(r, dVar);
                        C89663z.m155643b(context, a);
                        if (invoke != EnumC89098a.COROUTINE_SUSPENDED) {
                            dVar.resumeWith(C89379q.m157068constructorimpl(invoke));
                        }
                    } catch (Throwable th) {
                        C89663z.m155643b(context, a);
                        throw th;
                    }
                } else {
                    throw new C89388w("null cannot be cast to non-null type");
                }
            } catch (Throwable th2) {
                dVar.resumeWith(C89379q.m157068constructorimpl(C89382r.m154941a(th2)));
            }
        } else if (i != 4) {
            throw new C89376n();
        }
    }
}
