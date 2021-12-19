package com.p2082ss.android.ugc.aweme.share.p3767m;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38701br;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: com.ss.android.ugc.aweme.share.m.j */
public final class C69318j {

    /* renamed from: a */
    public static final C69318j f154882a = new C69318j();

    private C69318j() {
    }

    static {
        Covode.recordClassIndex(81648);
    }

    /* renamed from: a */
    public static boolean m122516a(Aweme aweme) {
        if (aweme == null || aweme.getVideo() == null) {
            return false;
        }
        if (aweme.getAuthor() != null || C38701br.m78512a(aweme, 3)) {
            return true;
        }
        return false;
    }
}
