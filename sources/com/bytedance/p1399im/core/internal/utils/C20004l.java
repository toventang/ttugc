package com.bytedance.p1399im.core.internal.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.p1399im.core.internal.p1419a.p1420a.C19741a;
import com.bytedance.p1399im.core.internal.p1427b.p1428a.C19930x;
import com.bytedance.p1399im.core.internal.p1434e.AbstractC19985b;
import com.bytedance.p1399im.core.internal.p1434e.AbstractC19986c;
import com.bytedance.p1399im.core.internal.p1434e.C19983a;
import com.bytedance.p1399im.core.internal.p1434e.RunnableC19987d;
import com.bytedance.p1399im.core.p1404a.C19483d;
import com.bytedance.p1399im.core.p1404a.C19497k;
import com.bytedance.p1399im.core.p1407c.C19512f;
import com.bytedance.p1399im.core.p1415g.C19696b;

/* renamed from: com.bytedance.im.core.internal.utils.l */
public class C20004l {

    /* renamed from: e */
    private static C20004l f47543e;

    /* renamed from: a */
    public volatile boolean f47544a;

    /* renamed from: b */
    public volatile boolean f47545b;

    /* renamed from: c */
    public volatile boolean f47546c;

    /* renamed from: d */
    public volatile int f47547d = -1;

    static {
        Covode.recordClassIndex(22849);
    }

    /* renamed from: b */
    public final int mo31880b() {
        if (this.f47547d < 0) {
            C20041s.m37876a();
            this.f47547d = C20041s.m37882b();
        }
        return this.f47547d;
    }

    /* renamed from: a */
    public static C20004l m37794a() {
        MethodCollector.m26663i(10792);
        if (f47543e == null) {
            synchronized (C20004l.class) {
                try {
                    if (f47543e == null) {
                        f47543e = new C20004l();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(10792);
                    throw th;
                }
            }
        }
        C20004l lVar = f47543e;
        MethodCollector.m26664o(10792);
        return lVar;
    }

    /* renamed from: c */
    public final void mo31881c() {
        if (this.f47544a || this.f47546c) {
            C19512f.m36457b("imsdk", "LinkModeManager afterPullMixLink checking or ever migrated, isCheck:" + this.f47544a + ", isEverMigrated:" + this.f47546c, (Throwable) null);
            return;
        }
        this.f47544a = true;
        RunnableC19987d.m37729a(new AbstractC19986c<Boolean>() {
            /* class com.bytedance.p1399im.core.internal.utils.C20004l.C200073 */

            static {
                Covode.recordClassIndex(22852);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // com.bytedance.p1399im.core.internal.p1434e.AbstractC19986c
            /* renamed from: a */
            public final /* synthetic */ Boolean mo31187a() {
                C20004l lVar = C20004l.this;
                int b = lVar.mo31880b();
                C19497k kVar = C19483d.m36365a().mo31141b().f46244ai;
                C19512f.m36457b("imsdk", "LinkModeManager migrateMix, mode:" + b + ", config:" + kVar, (Throwable) null);
                if (b == 0) {
                    C19512f.m36457b("imsdk", "LinkModeManager migrateMix pulled recent on mix mode!!!", (Throwable) null);
                } else if (kVar.enable == 1) {
                    C19512f.m36457b("imsdk", "LinkModeManager migrateMix config recent", (Throwable) null);
                } else {
                    C19512f.m36457b("imsdk", "LinkModeManager migrateMix start to migrate", (Throwable) null);
                    lVar.f47545b = true;
                    C19696b.m36813a(0, kVar);
                    if (kVar.fallbackStrategy == C19497k.FALLBACK_CLEAR) {
                        C19512f.m36457b("imsdk", "LinkModeManager migrateMixClear start", (Throwable) null);
                        C19483d.m36365a().mo31143d();
                        C20041s.m37876a();
                        C20041s.m37907n();
                        C19741a.m36958a().mo31685d();
                        C19483d.m36365a().mo31142c();
                        C19512f.m36457b("imsdk", "LinkModeManager migrateMixClear end", (Throwable) null);
                    } else {
                        lVar.mo31882d();
                    }
                    lVar.f47546c = true;
                    lVar.f47545b = false;
                    C19512f.m36457b("imsdk", "LinkModeManager migrateMix migrate end", (Throwable) null);
                }
                return null;
            }
        }, new AbstractC19985b<Boolean>() {
            /* class com.bytedance.p1399im.core.internal.utils.C20004l.C200084 */

            static {
                Covode.recordClassIndex(22853);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.bytedance.p1399im.core.internal.p1434e.AbstractC19985b
            /* renamed from: a */
            public final /* bridge */ /* synthetic */ void mo31188a(Boolean bool) {
                C20004l.this.f47544a = false;
            }
        }, C19983a.m37722d());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo31882d() {
        C19512f.m36457b("imsdk", "LinkModeManager migrateMixNormal start", (Throwable) null);
        int[] a = C19996e.m37756a();
        mo31879a(0);
        for (int i : a) {
            C20041s.m37876a();
            long a2 = C20041s.m37875a(i);
            C20041s.m37876a();
            long d = C20041s.m37891d(i);
            if (d > 0 && d > a2) {
                C20041s.m37876a();
                C20041s.m37879a(i, d);
            }
            C19512f.m36457b("imsdk", "LinkModeManager migrateMixNormal for inbox:" + i + ", oldCursor:" + a2 + ", cursor:" + d, (Throwable) null);
            C19930x.m37536a();
            C19930x.m37543b(i, 9);
        }
        C19512f.m36457b("imsdk", "LinkModeManager migrateMixNormal end", (Throwable) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo31879a(int i) {
        if (i == 0 || i == 1) {
            C20041s.m37876a();
            if (i == 0 || i == 1) {
                C20041s.f47627a.mo27989a(C20041s.m37878a("current_link_mode"), i);
            } else {
                C19512f.m36457b("imsdk", "SPUtils setLinkMode invalid:".concat(String.valueOf(i)), (Throwable) null);
            }
            this.f47547d = i;
            return;
        }
        C19512f.m36457b("imsdk", "LinkModeManager setLinkMode invalid:".concat(String.valueOf(i)), (Throwable) null);
    }
}
