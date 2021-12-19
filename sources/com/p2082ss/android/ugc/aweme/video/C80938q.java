package com.p2082ss.android.ugc.aweme.video;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.simkit.AbstractC74616d;
import com.p2082ss.android.ugc.aweme.simkit.ISimKitConfig;

/* renamed from: com.ss.android.ugc.aweme.video.q */
public final class C80938q {

    /* renamed from: a */
    public static ISimKitConfig f180973a;

    /* renamed from: b */
    public static boolean f180974b;

    static {
        Covode.recordClassIndex(94240);
    }

    /* renamed from: a */
    public static void m140454a() {
        if (f180974b) {
            AbstractC74616d.m131036a().mo117290b().getPlayerGlobalConfig().setForceHttps(true);
            return;
        }
        ISimKitConfig iSimKitConfig = f180973a;
        if (iSimKitConfig != null) {
            iSimKitConfig.getPlayerGlobalConfig().setForceHttps(true);
        }
    }

    /* renamed from: b */
    public static void m140455b() {
        if (f180974b) {
            AbstractC74616d.m131036a().mo117290b().getPlayerGlobalConfig().setForceHttps(false);
            return;
        }
        ISimKitConfig iSimKitConfig = f180973a;
        if (iSimKitConfig != null) {
            iSimKitConfig.getPlayerGlobalConfig().setForceHttps(false);
        }
    }
}
