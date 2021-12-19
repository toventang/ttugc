package com.bytedance.apm.p773f.p774a;

import android.os.Handler;
import com.bytedance.apm.PerfConfig;
import com.bytedance.apm.block.C12390g;
import com.bytedance.apm.block.evil.EvilMethodSwitcher;
import com.bytedance.apm.block.p766a.C12364f;
import com.bytedance.apm.block.p766a.C12370g;
import com.bytedance.covode.number.Covode;
import com.bytedance.monitor.collector.C21495h;
import com.bytedance.p1562p.p1564b.C21614c;

/* renamed from: com.bytedance.apm.f.a.b */
public final class C12455b {

    /* renamed from: a */
    private static boolean f30251a;

    /* renamed from: b */
    private static boolean f30252b;

    /* renamed from: c */
    private static C21614c f30253c;

    static {
        Covode.recordClassIndex(14265);
    }

    /* renamed from: c */
    public static synchronized void m22422c() {
        synchronized (C12455b.class) {
            if (f30253c != null && EvilMethodSwitcher.isOpenLaunchEvilMethod()) {
                f30253c.mo35281b();
            }
        }
    }

    /* renamed from: b */
    public static synchronized void m22421b() {
        synchronized (C12455b.class) {
            if (f30251a) {
                f30251a = false;
                f30253c.f51265c = EvilMethodSwitcher.isLimitEvilMethodDepth();
                C21614c.m40561a(EvilMethodSwitcher.getEvilThresholdMs());
                C12390g.m22260b("app_launch_evil_method_scene_apm_2");
            }
        }
    }

    /* renamed from: a */
    public static synchronized void m22420a() {
        synchronized (C12455b.class) {
            if (!f30251a) {
                f30251a = true;
                if (!f30252b) {
                    f30252b = true;
                    C21614c.m40561a(EvilMethodSwitcher.getLaunchEvilThresholdMs());
                    C21614c.f51258e = true;
                    if (EvilMethodSwitcher.isMessageKeyEnable()) {
                        PerfConfig.setReportMessage();
                    }
                    C12364f.f29788r.mo20119a();
                    C12370g.m22225a();
                    C21614c.f51257d = true;
                    C21614c cVar = new C21614c(EvilMethodSwitcher.isLaunchLimitEvilMethodDepth(), true);
                    f30253c = cVar;
                    cVar.mo35280a();
                    C21495h.m40379a(true, "launch");
                    new Handler().postDelayed(new Runnable() {
                        /* class com.bytedance.apm.p773f.p774a.C12455b.RunnableC124561 */

                        static {
                            Covode.recordClassIndex(14266);
                        }

                        public final void run() {
                            C12455b.m22421b();
                        }
                    }, 10000);
                }
                C12390g.m22259a("app_launch_evil_method_scene_apm_2");
            }
        }
    }
}
