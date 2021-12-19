package com.p2082ss.android.ugc.aweme.comment.util;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: com.ss.android.ugc.aweme.comment.util.h */
public final class C37198h {

    /* renamed from: a */
    public static final C37198h f87711a = new C37198h();

    private C37198h() {
    }

    static {
        Covode.recordClassIndex(44553);
    }

    /* renamed from: a */
    public static final boolean m75172a() {
        if (SettingsManager.m29616a().mo25394a("mt_comment_load_timer_setting", 1) == 1) {
            return true;
        }
        return false;
    }
}
