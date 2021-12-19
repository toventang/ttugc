package com.p2082ss.android.ugc.aweme.effect;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.utils.ServiceLifecycle;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import java.io.File;
import java.lang.reflect.Field;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.effect.EffectCompatJobService */
public class EffectCompatJobService extends JobService {

    /* renamed from: a */
    public static volatile int f107802a = 190806;

    /* renamed from: b */
    public static volatile boolean f107803b;

    public int onStartCommand(Intent intent, int i, int i2) {
        ServiceLifecycle.onStartCommand(this, intent, i, i2);
        return 2;
    }

    public boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    static {
        Covode.recordClassIndex(54824);
    }

    /* renamed from: a */
    static final /* synthetic */ Object m89248a() {
        try {
            AVExternalServiceImpl.m113114a().configService().cacheConfig().clearDraftEffectCache();
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public boolean onStartJob(JobParameters jobParameters) {
        String effectCacheDir = AVExternalServiceImpl.m113114a().configService().cacheConfig().effectCacheDir();
        if (TextUtils.isEmpty(effectCacheDir) || new File(effectCacheDir).list() == null || new File(effectCacheDir).list().length == 0) {
            return false;
        }
        C1731i.m5640b(CallableC46353e.f108050a, C40780g.m82241a()).mo5543c(new C46356f(this, jobParameters), C1731i.f5564c);
        return true;
    }

    /* renamed from: a */
    public static Object m89249a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(7725);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!C58027i.f132247b && "connectivity".equals(str)) {
                try {
                    new C21708b().mo35361a();
                    C58027i.f132247b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (C58027i.f132246a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new C58027i.HandlerC58028a((Handler) declaredField.get(obj)));
                        } catch (Exception e) {
                            C13849d.m25015a(e, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    C58027i.f132246a = false;
                } finally {
                    MethodCollector.m26664o(7725);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
