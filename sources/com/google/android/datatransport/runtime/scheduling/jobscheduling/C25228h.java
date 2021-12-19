package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.ClipboardManager;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13846c;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.google.android.datatransport.runtime.AbstractC25162k;
import com.google.android.datatransport.runtime.backends.AbstractC25129e;
import com.google.android.datatransport.runtime.p1926c.AbstractC25144b;
import com.google.android.datatransport.runtime.p1927d.AbstractC25148a;
import com.google.android.datatransport.runtime.scheduling.p1929a.AbstractC25182c;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.net.p3492e.C61338a;
import java.lang.reflect.Field;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.h */
public final class C25228h {

    /* renamed from: a */
    final Context f59726a;

    /* renamed from: b */
    final AbstractC25129e f59727b;

    /* renamed from: c */
    final AbstractC25182c f59728c;

    /* renamed from: d */
    final AbstractC25239s f59729d;

    /* renamed from: e */
    final AbstractC25144b f59730e;

    /* renamed from: f */
    final AbstractC25148a f59731f;

    /* renamed from: g */
    private final Executor f59732g;

    static {
        Covode.recordClassIndex(30596);
    }

    /* renamed from: a */
    public static NetworkInfo m48386a(ConnectivityManager connectivityManager) {
        try {
            return connectivityManager.getActiveNetworkInfo();
        } catch (Exception e) {
            C51423a.m95790a((Throwable) e);
            return C61338a.m111034a();
        }
    }

    /* renamed from: a */
    public static Object m48387a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(3406);
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
                            C13846c.m25011a(e, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    C58027i.f132246a = false;
                } finally {
                    MethodCollector.m26664o(3406);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    /* renamed from: a */
    public final void mo41212a(AbstractC25162k kVar, int i, Runnable runnable) {
        this.f59732g.execute(RunnableC25229i.m48389a(this, kVar, i, runnable));
    }

    public C25228h(Context context, AbstractC25129e eVar, AbstractC25182c cVar, AbstractC25239s sVar, Executor executor, AbstractC25144b bVar, AbstractC25148a aVar) {
        this.f59726a = context;
        this.f59727b = eVar;
        this.f59728c = cVar;
        this.f59729d = sVar;
        this.f59732g = executor;
        this.f59730e = bVar;
        this.f59731f = aVar;
    }
}
