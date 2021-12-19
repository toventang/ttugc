package com.p2082ss.android.ugc.aweme.comment.util;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: com.ss.android.ugc.aweme.comment.util.s */
public final class C37216s {

    /* renamed from: a */
    public static final C37216s f87747a = new C37216s();

    private C37216s() {
    }

    static {
        Covode.recordClassIndex(44571);
    }

    /* renamed from: a */
    public static final int m75209a(Aweme aweme) {
        if (aweme == null || !aweme.isLike()) {
            return 0;
        }
        return 1;
    }

    /* renamed from: b */
    public static final int m75210b(Aweme aweme) {
        if (aweme == null || aweme.getFollowStatus() != 1) {
            return 0;
        }
        return 1;
    }
}
