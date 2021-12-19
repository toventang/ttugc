package com.p2082ss.android.ugc.aweme.newfollow.statistics;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.follow.statistics.IFollowStatisticsService;

/* renamed from: com.ss.android.ugc.aweme.newfollow.statistics.FollowStatisticsServiceImpl */
public class FollowStatisticsServiceImpl implements IFollowStatisticsService {
    static {
        Covode.recordClassIndex(72165);
    }

    /* renamed from: a */
    public static IFollowStatisticsService m111370a() {
        MethodCollector.m26663i(9141);
        Object a = C81908b.m141854a(IFollowStatisticsService.class, false);
        if (a != null) {
            IFollowStatisticsService iFollowStatisticsService = (IFollowStatisticsService) a;
            MethodCollector.m26664o(9141);
            return iFollowStatisticsService;
        }
        if (C81908b.f183268cR == null) {
            synchronized (IFollowStatisticsService.class) {
                try {
                    if (C81908b.f183268cR == null) {
                        C81908b.f183268cR = new FollowStatisticsServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(9141);
                    throw th;
                }
            }
        }
        FollowStatisticsServiceImpl followStatisticsServiceImpl = (FollowStatisticsServiceImpl) C81908b.f183268cR;
        MethodCollector.m26664o(9141);
        return followStatisticsServiceImpl;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0032, code lost:
        if (r0 == null) goto L_0x0034;
     */
    @Override // com.p2082ss.android.ugc.aweme.follow.statistics.IFollowStatisticsService
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo86505a(com.p2082ss.android.ugc.aweme.feed.model.Aweme r6, java.lang.String r7, java.lang.String r8, java.lang.String r9) {
        /*
        // Method dump skipped, instructions count: 136
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.newfollow.statistics.FollowStatisticsServiceImpl.mo86505a(com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String, java.lang.String, java.lang.String):void");
    }
}
