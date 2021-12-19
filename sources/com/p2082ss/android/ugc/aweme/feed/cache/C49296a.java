package com.p2082ss.android.ugc.aweme.feed.cache;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.C48027ac;
import com.p2082ss.android.ugc.aweme.feed.model.FeedItemList;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;

/* renamed from: com.ss.android.ugc.aweme.feed.cache.a */
public final class C49296a {
    static {
        Covode.recordClassIndex(58097);
    }

    /* renamed from: a */
    public static void m92348a(FeedItemList feedItemList) {
        if (feedItemList != null && feedItemList.getItems() != null && !TextUtils.isEmpty(feedItemList.getRequestId())) {
            try {
                C48027ac.C48028a.f111257a.mo80056a(feedItemList.getRequestId(), feedItemList.logPb);
            } catch (Throwable unused) {
                C51423a.m95784a(2, "CacheDataProcessor", "putAwemeLogPbData error");
            }
        }
    }
}
