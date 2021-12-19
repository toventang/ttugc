package com.p2082ss.android.ugc.aweme.feed.p2968t;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.feed.FeedApiService;
import com.p2082ss.android.ugc.aweme.feed.cache.C49301e;
import com.p2082ss.android.ugc.aweme.feed.model.FeedItemList;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.feed.t.k */
final /* synthetic */ class CallableC49945k implements Callable {

    /* renamed from: a */
    private final C49943i f115131a;

    static {
        Covode.recordClassIndex(59056);
    }

    CallableC49945k(C49943i iVar) {
        this.f115131a = iVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        C49943i iVar = this.f115131a;
        C17867d.m33078a();
        if (!C58029j.f132256h || !C58029j.m104846b() || C58029j.m104847c()) {
            C58029j.f132256h = C49943i.m93779d();
        }
        if (!C58029j.f132256h) {
            return null;
        }
        if (iVar.f115126a) {
            iVar.f115126a = false;
            return null;
        }
        FeedItemList fetchFeedList = FeedApiService.m91022a().fetchFeedList(0, 0, 0, 6, null, null, 0, 0, "", null, null, 0, C49944j.f115130a, null, false);
        if (fetchFeedList != null) {
            fetchFeedList.appendCache = C49301e.m92360a();
            C49935d.f115106a.mo84986a(4).mo84984b(fetchFeedList);
        }
        return fetchFeedList;
    }
}
