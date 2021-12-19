package com.p2082ss.android.ugc.aweme.comment.p2484a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: com.ss.android.ugc.aweme.comment.a.f */
public final class C36180f {

    /* renamed from: a */
    public static final C36180f f85460a = new C36180f();

    private C36180f() {
    }

    static {
        Covode.recordClassIndex(43440);
    }

    /* renamed from: a */
    public static final boolean m73734a() {
        if (SettingsManager.m29616a().mo25394a("video_reply_comments_all", 0) == 1) {
            return true;
        }
        return false;
    }
}
