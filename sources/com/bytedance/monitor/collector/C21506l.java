package com.bytedance.monitor.collector;

import android.os.Build;
import android.system.Os;
import android.system.OsConstants;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.monitor.p1546a.p1548b.AbstractRunnableC21452e;
import com.bytedance.monitor.p1546a.p1548b.C21448c;

/* renamed from: com.bytedance.monitor.collector.l */
public final class C21506l extends AbstractC21475b {

    /* renamed from: f */
    AbstractRunnableC21452e f51045f = C21448c.m40280a("collect-proc", new Runnable() {
        /* class com.bytedance.monitor.collector.C21506l.RunnableC215071 */

        static {
            Covode.recordClassIndex(25134);
        }

        public final void run() {
            C21506l.this.mo35107d();
        }
    });

    /* renamed from: g */
    private int f51046g = 200;

    /* renamed from: h */
    private int f51047h = 1000;

    /* renamed from: i */
    private boolean f51048i = true;

    static {
        Covode.recordClassIndex(25133);
    }

    /* renamed from: d */
    public final synchronized void mo35107d() {
        try {
            if (C21501k.f51022a) {
                MonitorJni.doCollect();
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.monitor.collector.AbstractC21475b
    /* renamed from: b */
    public final void mo35075b() {
        super.mo35075b();
        try {
            if (C21501k.f51022a) {
                if (this.f50916e != null) {
                    this.f50916e.mo35040b(this.f51045f);
                }
                MonitorJni.doStop();
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.monitor.collector.AbstractC21475b
    /* renamed from: c */
    public final synchronized Pair<String, String> mo35059c() {
        try {
            if (!C21501k.f51022a) {
                return null;
            }
            return new Pair<>(this.f50912a, MonitorJni.getProcInfos());
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.bytedance.monitor.collector.AbstractC21475b
    /* renamed from: a */
    public final void mo35073a() {
        super.mo35073a();
        try {
            if (C21501k.f51022a) {
                boolean z = this.f51048i;
                if (z) {
                    this.f51047h = 5000;
                } else {
                    this.f51047h = 1000;
                }
                MonitorJni.keepProcHyperOpen(z);
                MonitorJni.doStart();
                if (this.f50916e != null) {
                    this.f50916e.mo35036a(this.f51045f, 0, (long) this.f51047h);
                }
            }
        } catch (Throwable unused) {
        }
    }

    public C21506l(int i) {
        super(i, "proc_monitor");
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.monitor.collector.AbstractC21475b
    /* renamed from: b */
    public final void mo35058b(int i) {
        try {
            if (C21501k.f51022a) {
                mo35075b();
                if (i != 0) {
                    if (i == 1) {
                        this.f51046g = 200;
                        this.f51047h = 1000;
                        MonitorJni.setBufferSize(200);
                    } else if (i == 2 || i == 3) {
                        this.f51046g = 400;
                        this.f51047h = 1000;
                        MonitorJni.setBufferSize(400);
                    }
                    mo35073a();
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: c */
    public static long m40398c(int i) {
        long j;
        try {
            if (!C21501k.f51022a) {
                return -1;
            }
            long doGetCpuTime = MonitorJni.doGetCpuTime(i);
            if (C21511n.f51058b == -1) {
                if (C21511n.f51057a > 0) {
                    j = C21511n.f51057a;
                } else {
                    if (Build.VERSION.SDK_INT >= 21) {
                        j = Os.sysconf(OsConstants._SC_CLK_TCK);
                    } else {
                        int i2 = Build.VERSION.SDK_INT;
                        j = C21511n.m40407a("_SC_CLK_TCK");
                    }
                    if (j <= 0) {
                        j = 100;
                    }
                    C21511n.f51057a = j;
                }
                C21511n.f51058b = 1000 / j;
            }
            return doGetCpuTime * C21511n.f51058b;
        } catch (Throwable unused) {
            return -1;
        }
    }

    @Override // com.bytedance.monitor.collector.AbstractC21475b
    /* renamed from: a */
    public final synchronized Pair<String, String> mo35057a(long j, long j2) {
        try {
            if (!C21501k.f51022a) {
                return null;
            }
            return new Pair<>(this.f50912a, MonitorJni.getProcInfoTimeRange(j, j2));
        } catch (Throwable unused) {
            return null;
        }
    }
}
