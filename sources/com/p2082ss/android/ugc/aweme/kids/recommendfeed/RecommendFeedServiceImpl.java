package com.p2082ss.android.ugc.aweme.kids.recommendfeed;

import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.kids.commonfeed.p3343g.p3344a.C57446b;
import com.p2082ss.android.ugc.aweme.kids.recommendfeed.api.IRecommendFeedService;
import com.p2082ss.android.ugc.aweme.kids.recommendfeed.p3366a.C57788a;

/* renamed from: com.ss.android.ugc.aweme.kids.recommendfeed.RecommendFeedServiceImpl */
public final class RecommendFeedServiceImpl implements IRecommendFeedService {
    static {
        Covode.recordClassIndex(67778);
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.recommendfeed.api.IRecommendFeedService
    /* renamed from: b */
    public final Aweme mo95101b() {
        return C57446b.f130980a;
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.recommendfeed.api.IRecommendFeedService
    /* renamed from: a */
    public final Fragment mo95100a() {
        return new C57788a();
    }

    /* renamed from: c */
    public static IRecommendFeedService m104492c() {
        MethodCollector.m26663i(1020);
        Object a = C81908b.m141854a(IRecommendFeedService.class, false);
        if (a != null) {
            IRecommendFeedService iRecommendFeedService = (IRecommendFeedService) a;
            MethodCollector.m26664o(1020);
            return iRecommendFeedService;
        }
        if (C81908b.f183218bU == null) {
            synchronized (IRecommendFeedService.class) {
                try {
                    if (C81908b.f183218bU == null) {
                        C81908b.f183218bU = new RecommendFeedServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(1020);
                    throw th;
                }
            }
        }
        RecommendFeedServiceImpl recommendFeedServiceImpl = (RecommendFeedServiceImpl) C81908b.f183218bU;
        MethodCollector.m26664o(1020);
        return recommendFeedServiceImpl;
    }
}
