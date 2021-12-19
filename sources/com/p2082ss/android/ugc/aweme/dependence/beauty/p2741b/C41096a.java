package com.p2082ss.android.ugc.aweme.dependence.beauty.p2741b;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Constructor;
import java.util.Objects;
import kotlinx.coroutines.android.AbstractC89522b;
import kotlinx.coroutines.android.C89523c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.dependence.beauty.b.a */
public final class C41096a {

    /* renamed from: a */
    public static AbstractC89522b f96058a;

    static {
        Covode.recordClassIndex(48966);
        Looper mainLooper = Looper.getMainLooper();
        C89219l.m154716b(mainLooper, "");
        f96058a = C89523c.m155452a(m82775a(mainLooper), "fast-main");
    }

    /* renamed from: a */
    private static Handler m82775a(Looper looper) {
        C89219l.m154721d(looper, "");
        int i = Build.VERSION.SDK_INT;
        if (Build.VERSION.SDK_INT >= 28) {
            Object invoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
            Objects.requireNonNull(invoke, "null cannot be cast to non-null type android.os.Handler");
            return (Handler) invoke;
        }
        try {
            Constructor declaredConstructor = Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE);
            C89219l.m154716b(declaredConstructor, "");
            Object newInstance = declaredConstructor.newInstance(looper, null, true);
            C89219l.m154716b(newInstance, "");
            return (Handler) newInstance;
        } catch (NoSuchMethodException unused) {
            return new Handler(looper);
        }
    }
}
