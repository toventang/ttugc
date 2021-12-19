package com.bytedance.android.livesdk.feed.repository;

import android.text.TextUtils;
import com.bytedance.android.live.core.p210a.AbstractC3851n;
import com.bytedance.android.live.core.p218f.C3956q;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.livesdk.feed.repository.g */
public final /* synthetic */ class C8666g implements AbstractC3851n {

    /* renamed from: a */
    private final String f21414a;

    static {
        Covode.recordClassIndex(9532);
    }

    C8666g(String str) {
        this.f21414a = str;
    }

    @Override // com.bytedance.android.live.core.p210a.AbstractC3851n
    /* renamed from: a */
    public final boolean mo9213a(Object obj) {
        FeedItem feedItem = (FeedItem) obj;
        return (feedItem == null || feedItem.item == null || !TextUtils.equals(C3956q.m9643a(feedItem.item.getMixId()), C3956q.m9643a(this.f21414a))) ? false : true;
    }
}
