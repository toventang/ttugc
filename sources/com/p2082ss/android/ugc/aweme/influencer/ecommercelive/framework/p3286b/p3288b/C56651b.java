package com.p2082ss.android.ugc.aweme.influencer.ecommercelive.framework.p3286b.p3288b;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Constructor;
import kotlinx.coroutines.android.AbstractC89522b;
import kotlinx.coroutines.android.C89523c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.influencer.ecommercelive.framework.b.b.b */
public final class C56651b {

    /* renamed from: a */
    public static final C56650a f129114a = new C56650a(C56652c.f129118a);

    /* renamed from: b */
    public static final AbstractC89522b f129115b;

    /* renamed from: c */
    private static final C56650a f129116c = new C56650a(C56652c.f129118a);

    /* renamed from: d */
    private static final C56650a f129117d = new C56650a(C56652c.f129119b);

    static {
        Covode.recordClassIndex(66496);
        Looper mainLooper = Looper.getMainLooper();
        C89219l.m154716b(mainLooper, "");
        f129115b = C89523c.m155452a(m102652a(mainLooper), "fast-main");
    }

    /* renamed from: a */
    private static Handler m102652a(Looper looper) {
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
