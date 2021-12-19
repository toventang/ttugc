package com.google.android.gms.measurement.internal;

import android.app.ActivityManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.internal.measurement.C26117lb;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.ji */
public final class C26492ji {

    /* renamed from: a */
    final /* synthetic */ C26482iz f62343a;

    static {
        Covode.recordClassIndex(31914);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo43456a() {
        this.f62343a.mo43002c();
        if (this.f62343a.mo43017r().mo43190a(this.f62343a.mo43011l().mo41857a())) {
            this.f62343a.mo43017r().f61914n.mo43205a(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                this.f62343a.mo43016q().f61835k.mo43169a("Detected application was in foreground");
                m52234b(this.f62343a.mo43011l().mo41857a(), false);
            }
        }
    }

    C26492ji(C26482iz izVar) {
        this.f62343a = izVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo43457a(long j, boolean z) {
        this.f62343a.mo43002c();
        this.f62343a.mo43440w();
        if (this.f62343a.mo43017r().mo43190a(j)) {
            this.f62343a.mo43017r().f61914n.mo43205a(true);
        }
        this.f62343a.mo43017r().f61917q.mo43210a(j);
        if (this.f62343a.mo43017r().f61914n.mo43206a()) {
            m52234b(j, z);
        }
    }

    /* renamed from: b */
    private final void m52234b(long j, boolean z) {
        this.f62343a.mo43002c();
        if (this.f62343a.f62077z.mo43265r()) {
            this.f62343a.mo43017r().f61917q.mo43210a(j);
            this.f62343a.mo43016q().f61835k.mo43170a("Session started, time", Long.valueOf(this.f62343a.mo43011l().mo41858b()));
            Long valueOf = Long.valueOf(j / 1000);
            this.f62343a.mo43004e().mo43308a("auto", "_sid", valueOf, j);
            this.f62343a.mo43017r().f61914n.mo43205a(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", valueOf.longValue());
            if (this.f62343a.mo43018s().mo43641d(null, C26530p.f62531aq) && z) {
                bundle.putLong("_aib", 1);
            }
            this.f62343a.mo43004e().mo43303a("auto", "_s", j, bundle);
            C26117lb.m51195b();
            if (this.f62343a.mo43018s().mo43641d(null, C26530p.f62536av)) {
                String a = this.f62343a.mo43017r().f61922v.mo43213a();
                if (!TextUtils.isEmpty(a)) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("_ffr", a);
                    this.f62343a.mo43004e().mo43303a("auto", "_ssr", j, bundle2);
                }
            }
        }
    }
}
