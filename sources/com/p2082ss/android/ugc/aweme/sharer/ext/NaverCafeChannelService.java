package com.p2082ss.android.ugc.aweme.sharer.ext;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b;
import com.p2082ss.android.ugc.aweme.sharer.C69584d;
import com.p2082ss.android.ugc.aweme.sharer.IChannelApi;

/* renamed from: com.ss.android.ugc.aweme.sharer.ext.NaverCafeChannelService */
public final class NaverCafeChannelService implements IChannelApi {
    static {
        Covode.recordClassIndex(81946);
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.IChannelApi
    /* renamed from: a */
    public final String mo109795a() {
        return "naver_cafe";
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.IChannelApi
    /* renamed from: a */
    public final AbstractC69581b mo109794a(C69584d dVar) {
        return new C69618o();
    }
}