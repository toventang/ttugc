package com.p2082ss.android.ugc.aweme.commercialize.utils;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38214ac;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import java.util.LinkedHashMap;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.bh */
public final class C38681bh {

    /* renamed from: a */
    public static final C38681bh f91382a = new C38681bh();

    /* renamed from: b */
    private static final LinkedHashMap<String, C38214ac> f91383b = new LinkedHashMap<>(12, 0.75f, true);

    private C38681bh() {
    }

    static {
        Covode.recordClassIndex(46222);
    }

    /* renamed from: a */
    public static C38214ac m78486a(Aweme aweme) {
        if (aweme == null) {
            return null;
        }
        if (aweme.getLinkAdData() == null && aweme.needPreloadAdLink()) {
            aweme.setLinkAdData(f91383b.get(aweme.getAid()));
        }
        return aweme.getLinkAdData();
    }
}
