package com.p2082ss.android.ugc.aweme.services;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.mix.p3447b.C59410j;
import com.p2082ss.android.ugc.aweme.mix.services.IMixFeedService;
import com.p2082ss.android.ugc.aweme.mix.services.MixFeedService;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63174ah;
import com.p2082ss.android.ugc.aweme.port.p3561in.IAVMixFeedService;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.services.IAVMixFeedServiceImpl */
public final class IAVMixFeedServiceImpl implements IAVMixFeedService {
    private final IMixFeedService mixFeedService = MixFeedService.m109435k();

    static {
        Covode.recordClassIndex(79615);
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.IAVMixFeedService
    public final boolean needCreateFirstMix() {
        return this.mixFeedService.mo97325b();
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.IAVMixFeedService
    public final boolean needShowAddOrRemoveButton() {
        return this.mixFeedService.mo97323a();
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.IAVMixFeedService
    public final void updateFeedEvent() {
        AbstractC81915c.m141874a(new C59410j(false, null));
    }

    public static IAVMixFeedService createIAVMixFeedServicebyMonsterPlugin(boolean z) {
        MethodCollector.m26663i(6248);
        Object a = C81908b.m141854a(IAVMixFeedService.class, z);
        if (a != null) {
            IAVMixFeedService iAVMixFeedService = (IAVMixFeedService) a;
            MethodCollector.m26664o(6248);
            return iAVMixFeedService;
        }
        if (C81908b.f183346dq == null) {
            synchronized (IAVMixFeedService.class) {
                try {
                    if (C81908b.f183346dq == null) {
                        C81908b.f183346dq = new IAVMixFeedServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(6248);
                    throw th;
                }
            }
        }
        IAVMixFeedServiceImpl iAVMixFeedServiceImpl = (IAVMixFeedServiceImpl) C81908b.f183346dq;
        MethodCollector.m26664o(6248);
        return iAVMixFeedServiceImpl;
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.IAVMixFeedService
    public final void showAddToMixInPublishPage(Activity activity, AbstractC63174ah ahVar, String str, String str2, String str3, String str4) {
        C89219l.m154721d(activity, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(str4, "");
        this.mixFeedService.mo97309a(activity, new IAVMixFeedServiceImpl$showAddToMixInPublishPage$1(ahVar), str, str2, str3, str4);
    }
}
