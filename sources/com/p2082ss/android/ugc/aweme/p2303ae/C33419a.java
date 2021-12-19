package com.p2082ss.android.ugc.aweme.p2303ae;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Constructor;
import java.util.Objects;
import kotlinx.coroutines.AbstractC89507ah;
import kotlinx.coroutines.android.AbstractC89522b;
import kotlinx.coroutines.android.C89523c;
import p4600h.p4603c.AbstractC89127f;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ae.a */
public final class C33419a {

    /* renamed from: a */
    public static AbstractC89522b f79451a;

    /* renamed from: b */
    private static AbstractC89507ah f79452b = new C33420a();

    /* renamed from: com.ss.android.ugc.aweme.ae.a$a */
    public static final class C33420a extends AbstractC89507ah {
        static {
            Covode.recordClassIndex(40277);
        }

        @Override // kotlinx.coroutines.AbstractC89507ah
        public final boolean isDispatchNeeded(AbstractC89127f fVar) {
            C89219l.m154721d(fVar, "");
            return false;
        }

        C33420a() {
        }

        @Override // kotlinx.coroutines.AbstractC89507ah
        public final void dispatch(AbstractC89127f fVar, Runnable runnable) {
            C89219l.m154721d(fVar, "");
            C89219l.m154721d(runnable, "");
            runnable.run();
        }
    }

    static {
        Covode.recordClassIndex(40276);
        Looper mainLooper = Looper.getMainLooper();
        C89219l.m154716b(mainLooper, "");
        f79451a = C89523c.m155452a(m68532a(mainLooper), "fast-main");
    }

    /* renamed from: a */
    private static Handler m68532a(Looper looper) {
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
