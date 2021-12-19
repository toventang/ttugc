package com.p2082ss.android.ugc.aweme.trending.p4148d;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.utils.AbstractC80348dm;
import com.p2082ss.android.ugc.aweme.utils.C80633x;

/* renamed from: com.ss.android.ugc.aweme.trending.d.c */
public abstract class AbstractC79068c implements C80633x.AbstractC80634a {
    static {
        Covode.recordClassIndex(92245);
    }

    /* renamed from: a */
    public abstract String mo122879a(Aweme aweme);

    @Override // com.p2082ss.android.ugc.aweme.utils.C80633x.AbstractC80634a
    /* renamed from: a */
    public final boolean mo106812a(Aweme aweme, String str) {
        if (aweme == null || !aweme.hasTrendingBarFYP()) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.utils.C80633x.AbstractC80634a
    /* renamed from: a */
    public final String mo106811a(Aweme aweme, String str, AbstractC80348dm dmVar) {
        return mo122879a(aweme);
    }
}
