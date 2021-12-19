package com.aweme.storage;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.utils.ServiceLifecycle;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import java.lang.reflect.Field;
import java.util.concurrent.Callable;
import p077b.AbstractC1729g;
import p077b.C1731i;

public class CompatJobService extends JobService {

    /* renamed from: a */
    public static volatile boolean f7148a;

    static {
        Covode.recordClassIndex(2624);
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        ServiceLifecycle.onStartCommand(this, intent, i, i2);
        return 2;
    }

    public boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    public boolean onStartJob(final JobParameters jobParameters) {
        C1731i.m5640b(new Callable<String>() {
            /* class com.aweme.storage.CompatJobService.CallableC23503 */

            static {
                Covode.recordClassIndex(2627);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ String call() {
                C2360c.m7183c(CompatJobService.this);
                return null;
            }
        }, C40780g.m82241a()).mo5543c(new AbstractC1729g<String, String>() {
            /* class com.aweme.storage.CompatJobService.C23492 */

            static {
                Covode.recordClassIndex(2626);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [b.i] */
            @Override // p077b.AbstractC1729g
            public final /* synthetic */ String then(C1731i<String> iVar) {
                C2360c.m7184d(CompatJobService.this);
                return null;
            }
        }, C1731i.f5564c).mo5537b((AbstractC1729g) new AbstractC1729g<String, C1731i<String>>() {
            /* class com.aweme.storage.CompatJobService.C23481 */

            static {
                Covode.recordClassIndex(2625);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [b.i] */
            @Override // p077b.AbstractC1729g
            public final /* synthetic */ C1731i<String> then(C1731i<String> iVar) {
                CompatJobService.this.jobFinished(jobParameters, false);
                CompatJobService.f7148a = false;
                return null;
            }
        });
        return true;
    }

    /* renamed from: a */
    public static Object m7168a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(1669);
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
                    MethodCollector.m26664o(1669);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
