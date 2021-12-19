package com.bytedance.android.livesdk.feed.tab.p541b;

import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.network.response.C5827a;
import com.bytedance.android.livesdk.feed.feed.C8587f;
import com.bytedance.android.livesdk.feed.tab.api.FeedTabApi;
import com.bytedance.android.livesdk.model.C9520ag;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;

/* renamed from: com.bytedance.android.livesdk.feed.tab.b.k */
public final class C8705k implements AbstractC8703i {

    /* renamed from: a */
    private FeedTabApi f21470a;

    static {
        Covode.recordClassIndex(9573);
    }

    @Override // com.bytedance.android.livesdk.feed.tab.p541b.AbstractC8703i
    /* renamed from: a */
    public final AbstractC88979t<C5827a<C9520ag, C8587f>> mo14985a() {
        try {
            return this.f21470a.queryTab(0).mo143278b(C88925a.m154180b(C88946a.f201991c));
        } catch (Throwable th) {
            C3854a.m9460b("RemoteFeedTabDataSource", "loadFeedTabWithExtra", th);
            return null;
        }
    }

    @Override // com.bytedance.android.livesdk.feed.tab.p541b.AbstractC8703i
    /* renamed from: b */
    public final AbstractC88979t<C5827a<C9520ag, C8587f>> mo14986b() {
        return this.f21470a.queryTab(2).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a));
    }

    public C8705k(FeedTabApi feedTabApi) {
        this.f21470a = feedTabApi;
    }
}
