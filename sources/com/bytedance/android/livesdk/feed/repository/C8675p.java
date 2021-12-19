package com.bytedance.android.livesdk.feed.repository;

import android.util.Pair;
import com.bytedance.android.live.base.model.p181c.C2965a;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.common.utility.C13617h;
import com.bytedance.covode.number.Covode;
import java.util.List;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.bytedance.android.livesdk.feed.repository.p */
final /* synthetic */ class C8675p implements AbstractC88433f {

    /* renamed from: a */
    static final AbstractC88433f f21424a = new C8675p();

    static {
        Covode.recordClassIndex(9541);
    }

    private C8675p() {
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        Pair pair = (Pair) obj;
        if (!(pair == null || C13617h.m24465a((List) pair.first))) {
            for (FeedItem feedItem : (List) pair.first) {
                if (((C2965a) pair.second).mo7786a() != null) {
                    feedItem.logPb = ((C2965a) pair.second).mo7786a().toString();
                }
            }
        }
    }
}
