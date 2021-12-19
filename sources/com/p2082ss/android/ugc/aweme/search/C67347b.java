package com.p2082ss.android.ugc.aweme.search;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.discover.alading.C41827d;
import com.p2082ss.android.ugc.aweme.discover.alading.C41832f;
import com.p2082ss.android.ugc.aweme.discover.model.SearchUser;
import com.p2082ss.android.ugc.aweme.p2817e.AbstractC43303b;

/* renamed from: com.ss.android.ugc.aweme.search.b */
public final class C67347b {
    static {
        Covode.recordClassIndex(78977);
    }

    /* renamed from: a */
    public static AbstractC43303b m119399a(C41827d dVar, SearchUser searchUser) {
        if (searchUser.cardType() == 1) {
            return new C41832f(dVar);
        }
        return null;
    }
}
