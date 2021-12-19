package kotlinx.coroutines;

import com.bytedance.covode.number.Covode;
import kotlinx.coroutines.internal.C89658u;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.p4605b.p4606a.AbstractC89111e;

/* renamed from: kotlinx.coroutines.aa */
public final class C89500aa {
    static {
        Covode.recordClassIndex(105589);
    }

    /* renamed from: a */
    public static final <T> Object m155437a(Object obj) {
        Throwable r4 = C89379q.m157071exceptionOrNullimpl(obj);
        if (r4 == null) {
            return obj;
        }
        return new CompletedExceptionally(r4, false, 2, null);
    }

    /* renamed from: a */
    public static final <T> Object m155438a(Object obj, AbstractC89124d<? super T> dVar) {
        if (!(obj instanceof CompletedExceptionally)) {
            return C89379q.m157068constructorimpl(obj);
        }
        Throwable th = ((CompletedExceptionally) obj).cause;
        if (C89527ar.f203245c && (dVar instanceof AbstractC89111e)) {
            th = C89658u.m155628a(th, (AbstractC89111e) dVar);
        }
        return C89379q.m157068constructorimpl(C89382r.m154941a(th));
    }
}
