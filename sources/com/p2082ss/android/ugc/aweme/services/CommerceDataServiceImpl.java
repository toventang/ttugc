package com.p2082ss.android.ugc.aweme.services;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.commercialize.feed.AbstractC37878bb;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38650ar;

/* renamed from: com.ss.android.ugc.aweme.services.CommerceDataServiceImpl */
public class CommerceDataServiceImpl implements AbstractC37878bb {
    static {
        Covode.recordClassIndex(79604);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.AbstractC37878bb
    public int getDelayTimeAfterInteraction() {
        return 1;
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.AbstractC37878bb
    public boolean isShowCommerceAfterInteraction() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.AbstractC37878bb
    public boolean shouldShowCard() {
        return C38650ar.m78411a();
    }
}
