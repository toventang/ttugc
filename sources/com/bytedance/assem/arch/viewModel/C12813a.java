package com.bytedance.assem.arch.viewModel;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Constructor;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.assem.arch.viewModel.a */
public final class C12813a {
    static {
        Covode.recordClassIndex(14645);
    }

    /* renamed from: a */
    public static final Handler m23048a(Looper looper) {
        C89219l.m154719c(looper, "");
        int i = Build.VERSION.SDK_INT;
        if (Build.VERSION.SDK_INT >= 28) {
            Handler createAsync = Handler.createAsync(looper);
            C89219l.m154709a((Object) createAsync, "");
            return createAsync;
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
