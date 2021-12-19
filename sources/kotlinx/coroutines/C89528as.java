package kotlinx.coroutines;

import com.bytedance.covode.number.Covode;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.p4603c.AbstractC89124d;

/* renamed from: kotlinx.coroutines.as */
public final class C89528as {
    static {
        Covode.recordClassIndex(105619);
    }

    /* renamed from: a */
    public static final String m155453a(AbstractC89124d<?> dVar) {
        Object obj;
        if (dVar instanceof C89537az) {
            return dVar.toString();
        }
        try {
            obj = C89379q.m157068constructorimpl(dVar + '@' + Integer.toHexString(System.identityHashCode(dVar)));
        } catch (Throwable th) {
            obj = C89379q.m157068constructorimpl(C89382r.m154941a(th));
        }
        if (C89379q.m157071exceptionOrNullimpl(obj) != null) {
            obj = dVar.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(dVar));
        }
        return (String) obj;
    }
}
