package kotlinx.coroutines.p4637b;

import com.bytedance.covode.number.Covode;
import kotlinx.coroutines.C89527ar;
import kotlinx.coroutines.C89584cf;
import kotlinx.coroutines.C89604cz;
import kotlinx.coroutines.CompletedExceptionally;
import kotlinx.coroutines.internal.C89657t;
import kotlinx.coroutines.internal.C89658u;
import p4600h.C89388w;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.p4604a.EnumC89098a;
import p4600h.p4603c.p4605b.p4606a.AbstractC89111e;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89206ad;

/* renamed from: kotlinx.coroutines.b.b */
public final class C89540b {
    static {
        Covode.recordClassIndex(105631);
    }

    /* renamed from: a */
    public static final <T, R> Object m155470a(C89657t<? super T> tVar, R r, AbstractC89183m<? super R, ? super AbstractC89124d<? super T>, ? extends Object> mVar) {
        Object obj;
        tVar.cS_();
        if (mVar != null) {
            try {
                obj = ((AbstractC89183m) C89206ad.m154679b(mVar, 2)).invoke(r, tVar);
            } catch (Throwable th) {
                obj = new CompletedExceptionally(th, false, 2, null);
            }
            if (obj == EnumC89098a.COROUTINE_SUSPENDED) {
                return EnumC89098a.COROUTINE_SUSPENDED;
            }
            Object e = tVar.mo144001e(obj);
            if (e == C89584cf.f203314b) {
                return EnumC89098a.COROUTINE_SUSPENDED;
            }
            if (!(e instanceof CompletedExceptionally)) {
                return C89584cf.m155519b(e);
            }
            Throwable th2 = ((CompletedExceptionally) e).cause;
            AbstractC89124d<T> dVar = tVar.f203406e;
            if (!C89527ar.f203245c) {
                throw th2;
            } else if (!(dVar instanceof AbstractC89111e)) {
                throw th2;
            } else {
                throw C89658u.m155628a(th2, (AbstractC89111e) dVar);
            }
        } else {
            throw new C89388w("null cannot be cast to non-null type");
        }
    }

    /* renamed from: b */
    public static final <T, R> Object m155471b(C89657t<? super T> tVar, R r, AbstractC89183m<? super R, ? super AbstractC89124d<? super T>, ? extends Object> mVar) {
        Object obj;
        tVar.cS_();
        boolean z = false;
        try {
            obj = ((AbstractC89183m) C89206ad.m154679b(mVar, 2)).invoke(r, tVar);
        } catch (Throwable th) {
            obj = new CompletedExceptionally(th, false, 2, null);
        }
        if (obj == EnumC89098a.COROUTINE_SUSPENDED) {
            return EnumC89098a.COROUTINE_SUSPENDED;
        }
        Object e = tVar.mo144001e(obj);
        if (e == C89584cf.f203314b) {
            return EnumC89098a.COROUTINE_SUSPENDED;
        }
        if (!(e instanceof CompletedExceptionally)) {
            return C89584cf.m155519b(e);
        }
        CompletedExceptionally completedExceptionally = (CompletedExceptionally) e;
        Throwable th2 = completedExceptionally.cause;
        if (!(th2 instanceof C89604cz) || ((C89604cz) th2).coroutine != tVar) {
            z = true;
        }
        if (z) {
            Throwable th3 = completedExceptionally.cause;
            AbstractC89124d<T> dVar = tVar.f203406e;
            if (!C89527ar.f203245c) {
                throw th3;
            } else if (!(dVar instanceof AbstractC89111e)) {
                throw th3;
            } else {
                throw C89658u.m155628a(th3, (AbstractC89111e) dVar);
            }
        } else if (!(obj instanceof CompletedExceptionally)) {
            return obj;
        } else {
            Throwable th4 = ((CompletedExceptionally) obj).cause;
            AbstractC89124d<T> dVar2 = tVar.f203406e;
            if (!C89527ar.f203245c) {
                throw th4;
            } else if (!(dVar2 instanceof AbstractC89111e)) {
                throw th4;
            } else {
                throw C89658u.m155628a(th4, (AbstractC89111e) dVar2);
            }
        }
    }
}
