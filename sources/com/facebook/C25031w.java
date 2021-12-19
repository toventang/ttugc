package com.facebook;

import android.content.Intent;
import androidx.p051h.p052a.C0998a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.internal.C24693ad;
import com.facebook.internal.C24699ae;

/* renamed from: com.facebook.w */
public final class C25031w {

    /* renamed from: c */
    private static volatile C25031w f59373c;

    /* renamed from: a */
    final C25030v f59374a;

    /* renamed from: b */
    public Profile f59375b;

    /* renamed from: d */
    private final C0998a f59376d;

    static {
        Covode.recordClassIndex(30363);
    }

    /* renamed from: a */
    public static C25031w m47997a() {
        MethodCollector.m26663i(10900);
        if (f59373c == null) {
            synchronized (C25031w.class) {
                try {
                    if (f59373c == null) {
                        C24699ae.m47299a();
                        f59373c = new C25031w(C0998a.m3454a(C24872m.f59047g), new C25030v());
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(10900);
                    throw th;
                }
            }
        }
        C25031w wVar = f59373c;
        MethodCollector.m26664o(10900);
        return wVar;
    }

    private C25031w(C0998a aVar, C25030v vVar) {
        C24699ae.m47301a(aVar, "localBroadcastManager");
        C24699ae.m47301a(vVar, "profileCache");
        this.f59376d = aVar;
        this.f59374a = vVar;
    }

    /* renamed from: a */
    private void m47998a(Profile profile, Profile profile2) {
        Intent intent = new Intent("com.facebook.sdk.ACTION_CURRENT_PROFILE_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_PROFILE", profile);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_PROFILE", profile2);
        this.f59376d.mo3694a(intent);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo40922a(Profile profile, boolean z) {
        Profile profile2 = this.f59375b;
        this.f59375b = profile;
        if (z) {
            if (profile != null) {
                this.f59374a.mo40920a(profile);
            } else {
                this.f59374a.mo40921b();
            }
        }
        if (!C24693ad.m47260a(profile2, profile)) {
            m47998a(profile2, profile);
        }
    }
}
