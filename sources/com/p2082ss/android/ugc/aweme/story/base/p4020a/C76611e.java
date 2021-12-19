package com.p2082ss.android.ugc.aweme.story.base.p4020a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: com.ss.android.ugc.aweme.story.base.a.e */
public final class C76611e {

    /* renamed from: a */
    public static final int f171944a = 1;

    /* renamed from: b */
    public static final C76611e f171945b = new C76611e();

    private C76611e() {
    }

    static {
        Covode.recordClassIndex(89597);
    }

    /* renamed from: a */
    public static int m134196a() {
        if (C16048b.m29633a().mo25421a(true, "creative_story_publish_retry_enable", false)) {
            return SettingsManager.m29616a().mo25394a("creative_story_publish_retry_time", 1);
        }
        return 0;
    }
}
