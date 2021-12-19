package com.p2082ss.android.ugc.aweme.ecommercelive.framework.p2875d.p2876a;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Constructor;
import kotlinx.coroutines.android.AbstractC89522b;
import kotlinx.coroutines.android.C89523c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommercelive.framework.d.a.b */
public final class C45813b {

    /* renamed from: a */
    public static final C45812a f106732a = new C45812a(C45816d.f106744a);

    /* renamed from: b */
    public static final AbstractC89522b f106733b;

    /* renamed from: c */
    private static final C45812a f106734c = new C45812a(C45816d.f106744a);

    /* renamed from: d */
    private static final C45812a f106735d = new C45812a(C45816d.f106746c);

    /* renamed from: e */
    private static final C45812a f106736e = new C45812a(C45816d.f106745b);

    /* renamed from: f */
    private static final C45812a f106737f = new C45812a(C45816d.f106747d);

    static {
        Covode.recordClassIndex(54332);
        Looper mainLooper = Looper.getMainLooper();
        C89219l.m154716b(mainLooper, "");
        f106733b = C89523c.m155452a(m88430a(mainLooper), "fast-main");
    }

    /* renamed from: a */
    private static Handler m88430a(Looper looper) {
        C89219l.m154721d(looper, "");
        int i = Build.VERSION.SDK_INT;
        if (Build.VERSION.SDK_INT >= 28) {
            Handler createAsync = Handler.createAsync(looper);
            C89219l.m154716b(createAsync, "");
            return createAsync;
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
