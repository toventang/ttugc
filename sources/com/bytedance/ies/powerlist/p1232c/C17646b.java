package com.bytedance.ies.powerlist.p1232c;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Constructor;
import kotlinx.coroutines.android.AbstractC89522b;
import kotlinx.coroutines.android.C89523c;
import p4600h.C89388w;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.powerlist.c.b */
public final class C17646b {

    /* renamed from: a */
    public static AbstractC89522b f42199a;

    static {
        Covode.recordClassIndex(20199);
        Looper mainLooper = Looper.getMainLooper();
        C89219l.m154709a((Object) mainLooper, "");
        f42199a = C89523c.m155452a(m32763a(mainLooper), "fast-main");
    }

    /* renamed from: a */
    private static Handler m32763a(Looper looper) {
        C89219l.m154719c(looper, "");
        int i = Build.VERSION.SDK_INT;
        if (Build.VERSION.SDK_INT >= 28) {
            Object invoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
            if (invoke != null) {
                return (Handler) invoke;
            }
            throw new C89388w("null cannot be cast to non-null type");
        }
        try {
            Constructor declaredConstructor = Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE);
            C89219l.m154709a((Object) declaredConstructor, "");
            Object newInstance = declaredConstructor.newInstance(looper, null, true);
            C89219l.m154709a(newInstance, "");
            return (Handler) newInstance;
        } catch (NoSuchMethodException unused) {
            return new Handler(looper);
        }
    }
}
