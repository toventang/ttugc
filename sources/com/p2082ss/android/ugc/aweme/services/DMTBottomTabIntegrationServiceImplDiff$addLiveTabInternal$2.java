package com.p2082ss.android.ugc.aweme.services;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1559o.C21582f;
import com.p2082ss.android.ugc.aweme.experiment.C46873ec;
import com.p2082ss.android.ugc.aweme.tools.live.LiveSettingApi;
import com.p2082ss.android.ugc.aweme.tools.live.p4119a.C78623a;
import com.p2082ss.android.ugc.gamora.recorder.p4294b.AbstractC83406b;
import com.p2082ss.android.ugc.gamora.recorder.p4301h.C83723d;
import java.lang.reflect.Type;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.services.DMTBottomTabIntegrationServiceImplDiff$addLiveTabInternal$2 */
public final class DMTBottomTabIntegrationServiceImplDiff$addLiveTabInternal$2<TTaskResult, TContinuationResult> implements AbstractC1729g {
    final /* synthetic */ C21582f $diContainer;
    final /* synthetic */ AbstractC89172b $getLiveIndex;
    final /* synthetic */ C83723d $liveTabPopUpKeva;

    static {
        Covode.recordClassIndex(79607);
    }

    DMTBottomTabIntegrationServiceImplDiff$addLiveTabInternal$2(C83723d dVar, C21582f fVar, AbstractC89172b bVar) {
        this.$liveTabPopUpKeva = dVar;
        this.$diContainer = fVar;
        this.$getLiveIndex = bVar;
    }

    @Override // p077b.AbstractC1729g
    public final Object then(C1731i<LiveSettingApi.C78611a> iVar) {
        LiveSettingApi.C78611a.C78612a aVar;
        boolean z = false;
        if (iVar == null || !iVar.mo5535a()) {
            this.$liveTabPopUpKeva.mo128695a(false);
        } else {
            LiveSettingApi.C78611a d = iVar.mo5545d();
            C83723d dVar = this.$liveTabPopUpKeva;
            if (!(d == null || (aVar = d.f176655a) == null)) {
                z = aVar.f176656a;
            }
            dVar.mo128695a(z);
        }
        if (this.$liveTabPopUpKeva.mo128697b()) {
            AbstractC83406b bVar = (AbstractC83406b) this.$diContainer.mo35249a((Type) AbstractC83406b.class, (String) null);
            String currentBottomTag = bVar.getCurrentBottomTag();
            bVar.addBottomTab(((Number) this.$getLiveIndex.invoke(Integer.valueOf(bVar.bottomTabSize()))).intValue() - 1, new C78623a(this.$diContainer), 0);
            bVar.resetToCurTab(currentBottomTag);
            if (C46873ec.m90188b()) {
                bVar.tryShowPopupForLiveTab();
            }
            return bVar;
        }
        AbstractC83406b bVar2 = (AbstractC83406b) this.$diContainer.mo35249a((Type) AbstractC83406b.class, (String) null);
        bVar2.addBottomTab(((Number) this.$getLiveIndex.invoke(Integer.valueOf(bVar2.bottomTabSize()))).intValue(), new C78623a(this.$diContainer), 0);
        return bVar2;
    }
}
