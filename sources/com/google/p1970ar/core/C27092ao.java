package com.google.p1970ar.core;

import android.content.pm.PackageInstaller;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;

/* access modifiers changed from: package-private */
/* renamed from: com.google.ar.core.ao */
public final class C27092ao extends PackageInstaller.SessionCallback {

    /* renamed from: a */
    final Map<Integer, PackageInstaller.SessionInfo> f64106a = new HashMap();

    /* renamed from: b */
    final /* synthetic */ C27086ai f64107b;

    /* renamed from: c */
    final /* synthetic */ C27088ak f64108c;

    static {
        Covode.recordClassIndex(32644);
    }

    public final void onActiveChanged(int i, boolean z) {
    }

    public final void onBadgingChanged(int i) {
    }

    public final void onProgressChanged(int i, float f) {
    }

    public final void onCreated(int i) {
        this.f64106a.put(Integer.valueOf(i), this.f64108c.f64095d.getSessionInfo(i));
    }

    C27092ao(C27088ak akVar, C27086ai aiVar) {
        this.f64108c = akVar;
        this.f64107b = aiVar;
    }

    public final void onFinished(int i, boolean z) {
        PackageInstaller.SessionInfo remove = this.f64106a.remove(Integer.valueOf(i));
        if (remove != null && "com.google.ar.core".equals(remove.getAppPackageName())) {
            this.f64107b.mo45123a(EnumC27087aj.COMPLETED);
        }
    }
}
