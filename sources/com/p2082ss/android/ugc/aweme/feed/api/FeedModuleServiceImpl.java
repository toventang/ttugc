package com.p2082ss.android.ugc.aweme.feed.api;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.AbstractC35329by;
import com.p2082ss.android.ugc.aweme.C43044dj;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.foryoutab.C50303a;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.foryoutab.ForYouTab;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.api.FeedModuleServiceImpl */
public final class FeedModuleServiceImpl extends FeedModuleServiceCommonImpl {
    static {
        Covode.recordClassIndex(57085);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.api.FeedModuleServiceCommonImpl
    public final String getFeedRequstParam() {
        return null;
    }

    /* renamed from: a */
    public static IFeedModuleService m91780a() {
        MethodCollector.m26663i(6055);
        Object a = C81908b.m141854a(IFeedModuleService.class, false);
        if (a != null) {
            IFeedModuleService iFeedModuleService = (IFeedModuleService) a;
            MethodCollector.m26664o(6055);
            return iFeedModuleService;
        }
        if (C81908b.f183234bk == null) {
            synchronized (IFeedModuleService.class) {
                try {
                    if (C81908b.f183234bk == null) {
                        C81908b.f183234bk = new FeedModuleServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(6055);
                    throw th;
                }
            }
        }
        FeedModuleServiceCommonImpl feedModuleServiceCommonImpl = (FeedModuleServiceCommonImpl) C81908b.f183234bk;
        MethodCollector.m26664o(6055);
        return feedModuleServiceCommonImpl;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.api.IFeedModuleService
    /* renamed from: a */
    public final C43044dj mo80447a(Context context) {
        C89219l.m154721d(context, "");
        return C50303a.m94396a(context);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.api.IFeedModuleService
    /* renamed from: b */
    public final AbstractC35329by mo80448b(Context context) {
        C89219l.m154721d(context, "");
        return new ForYouTab(context);
    }
}
