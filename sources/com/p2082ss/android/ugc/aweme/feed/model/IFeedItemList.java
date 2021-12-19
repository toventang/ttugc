package com.p2082ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.feed.model.IFeedItemList */
public interface IFeedItemList {
    static {
        Covode.recordClassIndex(58707);
    }

    List<Aweme> getItems();
}
