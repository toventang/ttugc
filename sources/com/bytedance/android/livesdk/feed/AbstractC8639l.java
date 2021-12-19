package com.bytedance.android.livesdk.feed;

import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.paging.AbstractC3985b;
import com.bytedance.android.livesdk.feed.feed.C8582a;
import com.bytedance.android.livesdk.feed.feed.C8583b;
import com.bytedance.android.livesdk.feed.feed.FeedDataKey;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.covode.number.Covode;
import java.util.List;
import p4560f.p4561a.AbstractC88979t;

/* renamed from: com.bytedance.android.livesdk.feed.l */
public interface AbstractC8639l extends AbstractC8656r<FeedItem> {

    /* renamed from: com.bytedance.android.livesdk.feed.l$a */
    public interface AbstractC8640a {
        static {
            Covode.recordClassIndex(9497);
        }

        /* renamed from: a */
        FeedDataKey mo14943a();

        /* renamed from: b */
        int mo14944b();

        /* renamed from: c */
        int mo14945c();
    }

    static {
        Covode.recordClassIndex(9496);
    }

    /* renamed from: a */
    C8582a<AbstractC3985b<FeedItem>, C8583b> mo14934a(String str);

    /* renamed from: a */
    AbstractC88979t<String> mo14935a();

    /* renamed from: a */
    void mo14936a(AbstractC1204m mVar);

    /* renamed from: a */
    void mo14937a(AbstractC8640a aVar);

    /* renamed from: a */
    void mo14938a(String str, String str2);

    /* renamed from: b */
    AbstractC88979t<List<ImageModel>> mo14939b();

    /* renamed from: b */
    void mo14940b(String str);

    /* renamed from: c */
    void mo14941c();

    /* renamed from: d */
    AbstractC8593h mo14942d();
}
