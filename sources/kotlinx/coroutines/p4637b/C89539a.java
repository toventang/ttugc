package kotlinx.coroutines.p4637b;

import com.bytedance.covode.number.Covode;
import kotlinx.coroutines.C89541ba;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.p4604a.C89099b;
import p4600h.p4611f.p4612a.AbstractC89183m;

/* renamed from: kotlinx.coroutines.b.a */
public final class C89539a {
    static {
        Covode.recordClassIndex(105630);
    }

    /* renamed from: a */
    public static final void m155468a(AbstractC89124d<? super C89391z> dVar, AbstractC89124d<?> dVar2) {
        try {
            C89541ba.m155472a(C89099b.m154605a(dVar), C89379q.m157068constructorimpl(C89391z.f203057a));
        } catch (Throwable th) {
            dVar2.resumeWith(C89379q.m157068constructorimpl(C89382r.m154941a(th)));
        }
    }

    /* renamed from: a */
    public static final <R, T> void m155469a(AbstractC89183m<? super R, ? super AbstractC89124d<? super T>, ? extends Object> mVar, R r, AbstractC89124d<? super T> dVar) {
        try {
            C89541ba.m155472a(C89099b.m154605a(C89099b.m154607a(mVar, r, dVar)), C89379q.m157068constructorimpl(C89391z.f203057a));
        } catch (Throwable th) {
            dVar.resumeWith(C89379q.m157068constructorimpl(C89382r.m154941a(th)));
        }
    }
}
