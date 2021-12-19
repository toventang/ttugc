package androidx.core.p033d;

import android.os.Build;
import android.os.Handler;
import android.os.Message;
import com.bytedance.covode.number.Covode;

/* renamed from: androidx.core.d.c */
public final class C0649c {
    static {
        Covode.recordClassIndex(728);
    }

    /* renamed from: a */
    public static boolean m2386a(Handler handler, Runnable runnable, Object obj, long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            return handler.postDelayed(runnable, obj, j);
        }
        Message obtain = Message.obtain(handler, runnable);
        obtain.obj = obj;
        return handler.sendMessageDelayed(obtain, j);
    }
}
