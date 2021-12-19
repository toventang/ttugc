package com.p2082ss.android.ugc.aweme.legacy;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.main.guide.C59095a;
import com.p2082ss.android.ugc.aweme.main.guide.IFollowTabBubbleGuideHelper;
import com.p2082ss.android.ugc.aweme.profile.model.User;

/* renamed from: com.ss.android.ugc.aweme.legacy.FollowTabBubbleGuideHelperImpl */
public class FollowTabBubbleGuideHelperImpl implements IFollowTabBubbleGuideHelper {

    /* renamed from: a */
    private final IFollowTabBubbleGuideHelper f132328a = C59095a.f134501a;

    static {
        Covode.recordClassIndex(68139);
    }

    @Override // com.p2082ss.android.ugc.aweme.main.guide.IFollowTabBubbleGuideHelper
    /* renamed from: a */
    public final String mo95595a() {
        return this.f132328a.mo95595a();
    }

    /* renamed from: b */
    public static IFollowTabBubbleGuideHelper m104989b() {
        MethodCollector.m26663i(8119);
        Object a = C81908b.m141854a(IFollowTabBubbleGuideHelper.class, false);
        if (a != null) {
            IFollowTabBubbleGuideHelper iFollowTabBubbleGuideHelper = (IFollowTabBubbleGuideHelper) a;
            MethodCollector.m26664o(8119);
            return iFollowTabBubbleGuideHelper;
        }
        if (C81908b.f183281ce == null) {
            synchronized (IFollowTabBubbleGuideHelper.class) {
                try {
                    if (C81908b.f183281ce == null) {
                        C81908b.f183281ce = new FollowTabBubbleGuideHelperImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(8119);
                    throw th;
                }
            }
        }
        FollowTabBubbleGuideHelperImpl followTabBubbleGuideHelperImpl = (FollowTabBubbleGuideHelperImpl) C81908b.f183281ce;
        MethodCollector.m26664o(8119);
        return followTabBubbleGuideHelperImpl;
    }

    @Override // com.p2082ss.android.ugc.aweme.main.guide.IFollowTabBubbleGuideHelper
    /* renamed from: a */
    public final void mo95596a(User user) {
        this.f132328a.mo95596a(user);
    }
}
