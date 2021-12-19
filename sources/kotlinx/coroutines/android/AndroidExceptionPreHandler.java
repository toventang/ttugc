package kotlinx.coroutines.android;

import android.os.Build;
import com.bytedance.covode.number.Covode;
import java.lang.Thread;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import kotlinx.coroutines.CoroutineExceptionHandler;
import p4600h.p4603c.AbstractC89097a;
import p4600h.p4603c.AbstractC89127f;

public final class AndroidExceptionPreHandler extends AbstractC89097a implements CoroutineExceptionHandler {
    private volatile Object _preHandler = this;

    static {
        Covode.recordClassIndex(105608);
    }

    public AndroidExceptionPreHandler() {
        super(CoroutineExceptionHandler.f203145c);
    }

    private final Method preHandler() {
        Object obj = this._preHandler;
        if (obj != this) {
            return (Method) obj;
        }
        Method method = null;
        boolean z = false;
        try {
            Method declaredMethod = Thread.class.getDeclaredMethod("getUncaughtExceptionPreHandler", new Class[0]);
            if (Modifier.isPublic(declaredMethod.getModifiers()) && Modifier.isStatic(declaredMethod.getModifiers())) {
                z = true;
            }
            if (z) {
                method = declaredMethod;
            }
        } catch (Throwable unused) {
        }
        this._preHandler = method;
        return method;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void handleException(AbstractC89127f fVar, Throwable th) {
        Object obj;
        Thread currentThread = Thread.currentThread();
        if (Build.VERSION.SDK_INT >= 28) {
            currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
            return;
        }
        Method preHandler = preHandler();
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = null;
        if (preHandler != null) {
            obj = preHandler.invoke(null, new Object[0]);
        } else {
            obj = null;
        }
        if (obj instanceof Thread.UncaughtExceptionHandler) {
            uncaughtExceptionHandler = obj;
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = uncaughtExceptionHandler;
        if (uncaughtExceptionHandler2 != null) {
            uncaughtExceptionHandler2.uncaughtException(currentThread, th);
        }
    }
}
