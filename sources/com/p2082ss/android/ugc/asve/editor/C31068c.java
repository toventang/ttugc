package com.p2082ss.android.ugc.asve.editor;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Constructor;
import java.util.Objects;
import kotlinx.coroutines.android.AbstractC89522b;
import kotlinx.coroutines.android.C89523c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.asve.editor.c */
public final class C31068c {

    /* renamed from: a */
    public static AbstractC89522b f74429a;

    static {
        Covode.recordClassIndex(37698);
        Looper mainLooper = Looper.getMainLooper();
        C89219l.m154716b(mainLooper, "");
        f74429a = C89523c.m155452a(m64119a(mainLooper), "fast-main");
    }

    /* renamed from: a */
    private static Handler m64119a(Looper looper) {
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
