package com.google.android.play.core.p1965d;

import android.content.Context;
import android.util.Base64;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.play.core.d.q */
public final class C26991q {

    /* renamed from: a */
    private static ThreadPoolExecutor f63888a;

    static {
        Covode.recordClassIndex(32467);
    }

    /* renamed from: a */
    public static Context m53630a(Context context) {
        Context b = m53633b(context);
        return b != null ? b : context;
    }

    /* renamed from: a */
    public static String m53631a(byte[] bArr) {
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            instance.update(bArr);
            return Base64.encodeToString(instance.digest(), 11);
        } catch (NoSuchAlgorithmException unused) {
            return "";
        }
    }

    /* renamed from: a */
    public static Executor m53632a() {
        MethodCollector.m26663i(12341);
        if (f63888a == null) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 10, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC26977c());
            f63888a = threadPoolExecutor;
            threadPoolExecutor.allowCoreThreadTimeOut(true);
        }
        ThreadPoolExecutor threadPoolExecutor2 = f63888a;
        MethodCollector.m26664o(12341);
        return threadPoolExecutor2;
    }

    /* renamed from: b */
    private static Context m53633b(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            return C58003a.f132199a;
        }
        return applicationContext;
    }
}
