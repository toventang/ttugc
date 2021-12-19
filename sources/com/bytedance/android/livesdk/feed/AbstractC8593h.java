package com.bytedance.android.livesdk.feed;

import com.bytedance.android.live.base.model.p181c.C2965a;
import com.bytedance.android.livesdk.feed.feed.AbstractC8586e;
import com.bytedance.android.livesdk.feed.feed.FeedDataKey;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.covode.number.Covode;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.feed.h */
public interface AbstractC8593h extends AbstractC8632j {

    /* renamed from: com.bytedance.android.livesdk.feed.h$a */
    public interface AbstractC8594a {
        static {
            Covode.recordClassIndex(9451);
        }

        /* renamed from: a */
        void mo14897a();
    }

    static {
        Covode.recordClassIndex(9450);
    }

    /* renamed from: a */
    void mo14829a();

    /* renamed from: a */
    void mo14830a(FeedDataKey feedDataKey, AbstractC8656r rVar);

    /* renamed from: a */
    void mo14831a(FeedDataKey feedDataKey, String str);

    /* renamed from: a */
    void mo14832a(AbstractC8586e eVar);

    /* renamed from: a */
    void mo14833a(AbstractC8594a aVar);

    /* renamed from: a */
    void mo14834a(String str, List<FeedItem> list, C2965a aVar, boolean z);

    /* renamed from: a */
    boolean mo14835a(FeedDataKey feedDataKey);

    /* renamed from: b */
    void mo14837b(AbstractC8586e eVar);

    /* renamed from: b */
    void mo14838b(AbstractC8594a aVar);
}
