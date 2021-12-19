package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.content.pm.PackageManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.play.core.p1963b.C26909b;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.assetpacks.cg */
public final class C26827cg {

    /* renamed from: a */
    private static final C26909b f63635a = new C26909b("PackageStateCache");

    /* renamed from: b */
    private final Context f63636b;

    /* renamed from: c */
    private int f63637c = -1;

    static {
        Covode.recordClassIndex(32302);
    }

    C26827cg(Context context) {
        this.f63636b = context;
    }

    /* renamed from: a */
    public final synchronized int mo44516a() {
        int i;
        MethodCollector.m26663i(13668);
        if (this.f63637c == -1) {
            try {
                this.f63637c = this.f63636b.getPackageManager().getPackageInfo(this.f63636b.getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException unused) {
                f63635a.mo44596b("The current version of the app could not be retrieved", new Object[0]);
            }
        }
        i = this.f63637c;
        MethodCollector.m26664o(13668);
        return i;
    }
}
