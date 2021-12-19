package com.p2082ss.android.ugc.aweme.favorites.api.notice;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.AbstractC18099f;
import com.bytedance.ies.ugc.aweme.network.ext.C18097a;
import com.google.p1998c.p2006h.p2007a.AbstractFutureC27655q;
import com.p2082ss.android.ugc.aweme.app.api.Api;
import p4640l.p4644b.AbstractC89722f;

/* renamed from: com.ss.android.ugc.aweme.favorites.api.notice.CollectionNoticeApi */
public final class CollectionNoticeApi {

    /* renamed from: a */
    static final AbstractC18099f f109866a = C18097a.m33697a(Api.f79771d);

    /* renamed from: com.ss.android.ugc.aweme.favorites.api.notice.CollectionNoticeApi$RealApi */
    interface RealApi {
        static {
            Covode.recordClassIndex(55812);
        }

        @AbstractC89722f(mo144276a = "/aweme/v1/collection/notice/")
        AbstractFutureC27655q<CollectionNotice> getCollectionNotice();
    }

    static {
        Covode.recordClassIndex(55811);
    }
}
