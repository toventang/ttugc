package com.p2082ss.android.ugc.aweme.services;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1559o.C21582f;
import com.p2082ss.android.ugc.aweme.tools.live.LiveSettingApi;
import com.p2082ss.android.ugc.gamora.recorder.p4294b.AbstractC83406b;
import com.p2082ss.android.ugc.gamora.recorder.p4301h.C83723d;
import java.lang.reflect.Type;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4600h.p4611f.p4613b.C89219l;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.services.DMTBottomTabIntegrationServiceImplDiff$tryShowPopupForLiveWhenFirstTime$1 */
public final class C67865xc10b8bce<TTaskResult, TContinuationResult> implements AbstractC1729g {
    final /* synthetic */ C21582f $diContainer;
    final /* synthetic */ C83723d $liveTabPopUpKeva;

    static {
        Covode.recordClassIndex(79608);
    }

    C67865xc10b8bce(C83723d dVar, C21582f fVar) {
        this.$liveTabPopUpKeva = dVar;
        this.$diContainer = fVar;
    }

    @Override // p077b.AbstractC1729g
    public final void then(C1731i<LiveSettingApi.C78611a> iVar) {
        LiveSettingApi.C78611a.C78612a aVar;
        C89219l.m154716b(iVar, "");
        if (iVar.mo5535a()) {
            LiveSettingApi.C78611a d = iVar.mo5545d();
            if (d == null || (aVar = d.f176655a) == null || !aVar.f176656a) {
                this.$liveTabPopUpKeva.mo128695a(false);
                return;
            }
            this.$liveTabPopUpKeva.mo128695a(true);
            Object a = this.$diContainer.mo35249a((Type) AbstractC83406b.class, (String) null);
            ((AbstractC83406b) a).tryShowPopupForLiveTab();
            C89219l.m154716b(a, "");
        }
    }
}
