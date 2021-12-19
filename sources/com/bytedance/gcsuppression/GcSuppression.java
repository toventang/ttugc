package com.bytedance.gcsuppression;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Trace;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class GcSuppression {

    /* renamed from: d */
    private static volatile GcSuppression f36306d;

    /* renamed from: a */
    public AtomicInteger f36307a = new AtomicInteger(0);

    /* renamed from: b */
    public long f36308b = 60;

    /* renamed from: c */
    public ExecutorService f36309c;

    /* renamed from: e */
    private Context f36310e;

    /* renamed from: f */
    private AtomicBoolean f36311f = new AtomicBoolean(false);

    /* renamed from: g */
    private boolean f36312g = true;

    /* renamed from: h */
    private long f36313h = 0;

    /* renamed from: i */
    private long f36314i = 0;

    /* renamed from: j */
    private ScheduledFuture f36315j;

    /* renamed from: k */
    private AbstractC14869a f36316k;

    /* renamed from: l */
    private Runnable f36317l = new Runnable() {
        /* class com.bytedance.gcsuppression.GcSuppression.RunnableC148671 */

        static {
            Covode.recordClassIndex(16969);
        }

        public final void run() {
            GcSuppression.this.mo23900b();
        }
    };

    /* renamed from: com.bytedance.gcsuppression.GcSuppression$a */
    public interface AbstractC14869a {
        static {
            Covode.recordClassIndex(16971);
        }
    }

    static {
        Covode.recordClassIndex(16968);
    }

    private native int startGcSuppression();

    private native int stopGcSuppression();

    private GcSuppression() {
    }

    /* renamed from: a */
    public static GcSuppression m27294a() {
        MethodCollector.m26663i(6558);
        if (f36306d == null) {
            synchronized (GcSuppression.class) {
                try {
                    if (f36306d == null) {
                        f36306d = new GcSuppression();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(6558);
                    throw th;
                }
            }
        }
        GcSuppression gcSuppression = f36306d;
        MethodCollector.m26664o(6558);
        return gcSuppression;
    }

    /* renamed from: b */
    public final int mo23900b() {
        boolean z;
        MethodCollector.m26663i(6708);
        if (this.f36312g) {
            this.f36314i = System.currentTimeMillis();
            int i = Build.VERSION.SDK_INT;
            Trace.beginSection("GcSuppressionStop");
        }
        int i2 = -1;
        if (this.f36307a.get() == 2) {
            ScheduledFuture scheduledFuture = this.f36315j;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                this.f36315j = null;
            }
            int stopGcSuppression = stopGcSuppression();
            if (stopGcSuppression > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f36307a.compareAndSet(2, 3);
                SharedPreferences.Editor edit = C34822d.m71158a(this.f36310e, "gcsuppress", 0).edit();
                edit.putInt("vc", 1029);
                edit.putInt("state", this.f36307a.get());
                edit.commit();
            } else {
                this.f36307a.compareAndSet(2, 1);
            }
            if (!(this.f36316k == null || stopGcSuppression == -1 || this.f36311f.get())) {
                this.f36311f.set(true);
                SharedPreferences.Editor edit2 = C34822d.m71158a(this.f36310e, "gcsuppress", 0).edit();
                edit2.putBoolean("hfs", true);
                edit2.commit();
            }
            i2 = stopGcSuppression;
        }
        if (this.f36312g) {
            System.currentTimeMillis();
            if (i2 == 0) {
                System.currentTimeMillis();
            }
            int i3 = Build.VERSION.SDK_INT;
            Trace.endSection();
        }
        MethodCollector.m26664o(6708);
        return i2;
    }
}
