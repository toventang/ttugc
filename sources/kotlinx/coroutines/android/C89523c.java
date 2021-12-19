package kotlinx.coroutines.android;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.C89388w;

/* renamed from: kotlinx.coroutines.android.c */
public final class C89523c {

    /* renamed from: a */
    public static final AbstractC89522b f203239a;

    static {
        Object obj;
        Covode.recordClassIndex(105614);
        try {
            obj = C89379q.m157068constructorimpl(new C89518a(m155451a(Looper.getMainLooper()), "Main"));
        } catch (Throwable th) {
            obj = C89379q.m157068constructorimpl(C89382r.m154941a(th));
        }
        if (C89379q.m157073isFailureimpl(obj)) {
            obj = null;
        }
        f203239a = (AbstractC89522b) obj;
    }

    /* renamed from: a */
    public static final Handler m155451a(Looper looper) {
        int i = Build.VERSION.SDK_INT;
        if (Build.VERSION.SDK_INT >= 28) {
            Object invoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
            if (invoke != null) {
                return (Handler) invoke;
            }
            throw new C89388w("null cannot be cast to non-null type");
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, true);
        } catch (NoSuchMethodException unused) {
            return new Handler(looper);
        }
    }

    /* renamed from: a */
    public static final AbstractC89522b m155452a(Handler handler, String str) {
        return new C89518a(handler, str);
    }
}
