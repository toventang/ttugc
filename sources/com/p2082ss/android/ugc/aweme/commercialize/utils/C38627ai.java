package com.p2082ss.android.ugc.aweme.commercialize.utils;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.Video;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.ai */
final /* synthetic */ class C38627ai implements AbstractC38626ah {

    /* renamed from: b */
    static final AbstractC38626ah f91282b = new C38627ai();

    static {
        Covode.recordClassIndex(46168);
    }

    private C38627ai() {
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.utils.AbstractC38626ah
    /* renamed from: a */
    public final Video mo67208a(Aweme aweme) {
        if (aweme == null) {
            return null;
        }
        return aweme.getVideo();
    }
}
