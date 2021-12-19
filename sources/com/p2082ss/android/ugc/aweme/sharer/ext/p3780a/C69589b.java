package com.p2082ss.android.ugc.aweme.sharer.ext.p3780a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sharer.ext.a.b */
public final class C69589b {

    /* renamed from: a */
    public static final String f155428a = "com.twitter.composer.ComposerActivity";

    /* renamed from: b */
    public static final C69589b f155429b = new C69589b();

    private C69589b() {
    }

    static {
        Covode.recordClassIndex(81961);
    }

    /* renamed from: a */
    public static String m122882a() {
        try {
            String a = SettingsManager.m29616a().mo25398a("share_twitter_target_type", "com.twitter.composer.ComposerActivity");
            C89219l.m154716b(a, "");
            return a;
        } catch (Throwable unused) {
            return f155428a;
        }
    }
}
