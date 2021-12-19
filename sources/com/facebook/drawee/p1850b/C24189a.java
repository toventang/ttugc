package com.facebook.drawee.p1850b;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.common.p1832d.C24091i;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.facebook.drawee.b.a */
public final class C24189a {

    /* renamed from: d */
    private static C24189a f57257d;

    /* renamed from: a */
    public final Set<AbstractC24191a> f57258a = new HashSet();

    /* renamed from: b */
    public final Handler f57259b = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    public final Runnable f57260c = new Runnable() {
        /* class com.facebook.drawee.p1850b.C24189a.RunnableC241901 */

        static {
            Covode.recordClassIndex(28321);
        }

        public final void run() {
            C24189a.m45877b();
            for (AbstractC24191a aVar : C24189a.this.f57258a) {
                aVar.mo39803d();
            }
            C24189a.this.f57258a.clear();
        }
    };

    /* renamed from: com.facebook.drawee.b.a$a */
    public interface AbstractC24191a {
        static {
            Covode.recordClassIndex(28322);
        }

        /* renamed from: d */
        void mo39803d();
    }

    static {
        Covode.recordClassIndex(28320);
    }

    /* renamed from: a */
    public static synchronized C24189a m45876a() {
        C24189a aVar;
        synchronized (C24189a.class) {
            MethodCollector.m26663i(6371);
            if (f57257d == null) {
                f57257d = new C24189a();
            }
            aVar = f57257d;
            MethodCollector.m26664o(6371);
        }
        return aVar;
    }

    /* renamed from: b */
    public static void m45877b() {
        boolean z;
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            z = true;
        } else {
            z = false;
        }
        C24091i.m45622b(z);
    }

    /* renamed from: a */
    public final void mo39801a(AbstractC24191a aVar) {
        m45877b();
        this.f57258a.remove(aVar);
    }
}
