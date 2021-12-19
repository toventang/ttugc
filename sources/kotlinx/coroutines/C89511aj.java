package kotlinx.coroutines;

import com.bytedance.covode.number.Covode;
import p4600h.C89032a;
import p4600h.p4603c.AbstractC89127f;

/* renamed from: kotlinx.coroutines.aj */
public final class C89511aj {
    static {
        Covode.recordClassIndex(105600);
    }

    /* renamed from: a */
    public static final Throwable m155442a(Throwable th, Throwable th2) {
        if (th == th2) {
            return th;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
        C89032a.m154603a(runtimeException, th);
        return runtimeException;
    }

    /* renamed from: a */
    public static final void m155443a(AbstractC89127f fVar, Throwable th) {
        try {
            CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) fVar.get(CoroutineExceptionHandler.f203145c);
            if (coroutineExceptionHandler != null) {
                coroutineExceptionHandler.handleException(fVar, th);
            } else {
                C89510ai.m155441a(fVar, th);
            }
        } catch (Throwable th2) {
            C89510ai.m155441a(fVar, m155442a(th, th2));
        }
    }
}
