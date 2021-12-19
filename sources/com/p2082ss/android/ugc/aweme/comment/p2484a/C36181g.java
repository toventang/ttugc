package com.p2082ss.android.ugc.aweme.comment.p2484a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: com.ss.android.ugc.aweme.comment.a.g */
public final class C36181g {

    /* renamed from: a */
    public static final C36181g f85461a = new C36181g();

    private C36181g() {
    }

    static {
        Covode.recordClassIndex(43441);
    }

    /* renamed from: a */
    public static final boolean m73735a() {
        if (SettingsManager.m29616a().mo25394a("enable_video_reply", 0) == 1) {
            return true;
        }
        return false;
    }
}
