package kotlinx.coroutines.internal;

import com.bytedance.covode.number.Covode;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* renamed from: kotlinx.coroutines.internal.d */
public final class C89631d {

    /* renamed from: a */
    private static final Method f203368a;

    static {
        Method method;
        Covode.recordClassIndex(105724);
        try {
            method = ScheduledThreadPoolExecutor.class.getMethod("setRemoveOnCancelPolicy", Boolean.TYPE);
        } catch (Throwable unused) {
            method = null;
        }
        f203368a = method;
    }

    /* renamed from: a */
    public static final boolean m155574a(Executor executor) {
        Method method;
        try {
            if (!(executor instanceof ScheduledExecutorService)) {
                executor = null;
            }
            ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) executor;
            if (scheduledExecutorService == null || (method = f203368a) == null) {
                return false;
            }
            method.invoke(scheduledExecutorService, true);
            return true;
        } catch (Throwable unused) {
        }
    }
}
