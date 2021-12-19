package com.p2082ss.android.ugc.aweme.feed.p2979x;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: com.ss.android.ugc.aweme.feed.x.l */
public final class C50544l {
    static {
        Covode.recordClassIndex(59691);
    }

    /* renamed from: a */
    public static final String m94759a(Aweme aweme) {
        if (aweme == null) {
            return null;
        }
        String aid = aweme.getAid();
        if (aid == null || aid.length() == 0) {
            return aweme.getFakeAid();
        }
        return aweme.getAid();
    }
}
