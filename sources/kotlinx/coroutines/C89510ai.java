package kotlinx.coroutines;

import com.bytedance.covode.number.Covode;
import java.util.List;
import java.util.ServiceLoader;
import p4600h.p4603c.AbstractC89127f;
import p4600h.p4621l.C89309k;

/* renamed from: kotlinx.coroutines.ai */
public final class C89510ai {

    /* renamed from: a */
    private static final List<CoroutineExceptionHandler> f203224a = C89309k.m154813g(C89309k.m154795a(ServiceLoader.load(CoroutineExceptionHandler.class, CoroutineExceptionHandler.class.getClassLoader()).iterator()));

    static {
        Covode.recordClassIndex(105599);
    }

    /* renamed from: a */
    public static final void m155441a(AbstractC89127f fVar, Throwable th) {
        for (CoroutineExceptionHandler coroutineExceptionHandler : f203224a) {
            try {
                coroutineExceptionHandler.handleException(fVar, th);
            } catch (Throwable th2) {
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, C89511aj.m155442a(th, th2));
            }
        }
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }
}
