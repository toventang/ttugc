package com.p2082ss.android.ugc.aweme.feed.cache;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.FeedItemList;

/* renamed from: com.ss.android.ugc.aweme.feed.cache.IFeedApi */
public interface IFeedApi {
    static {
        Covode.recordClassIndex(58096);
    }

    FeedItemList fetchFeedList(int i, long j, long j2, int i2, Integer num, String str, int i3, int i4, String str2, String str3, String str4, long j3, AbstractC49331j jVar, Bundle bundle, Boolean bool);
}
