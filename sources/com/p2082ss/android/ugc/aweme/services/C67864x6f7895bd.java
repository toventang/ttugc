package com.p2082ss.android.ugc.aweme.services;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1559o.C21582f;
import com.p2082ss.android.ugc.aweme.C35470cg;
import com.p2082ss.android.ugc.aweme.C35478ch;
import com.p2082ss.android.ugc.aweme.account.model.AbstractC32846a;
import com.p2082ss.android.ugc.aweme.experiment.C46873ec;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.servicimpl.C67905b;
import com.p2082ss.android.ugc.aweme.tools.live.LiveSettingApi;
import com.p2082ss.android.ugc.aweme.tools.live.sticker.C78626a;
import com.p2082ss.android.ugc.aweme.utils.C80322d;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import java.util.List;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4600h.p4611f.p4613b.C89219l;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.services.DMTBottomTabIntegrationServiceImplDiff$addLiveModule$$inlined$apply$lambda$1 */
public final class C67864x6f7895bd<TTaskResult, TContinuationResult> implements AbstractC1729g {
    final /* synthetic */ C67905b $context$inlined;
    final /* synthetic */ C21582f $diContainer$inlined;
    final /* synthetic */ C67905b $this_apply;
    final /* synthetic */ List $this_apply$inlined;

    static {
        Covode.recordClassIndex(79606);
    }

    C67864x6f7895bd(C67905b bVar, List list, C67905b bVar2, C21582f fVar) {
        this.$this_apply = bVar;
        this.$this_apply$inlined = list;
        this.$context$inlined = bVar2;
        this.$diContainer$inlined = fVar;
    }

    @Override // p077b.AbstractC1729g
    public final Object then(C1731i<LiveSettingApi.C78613b> iVar) {
        Integer num;
        LiveSettingApi.C78613b.C78614a aVar;
        C89219l.m154716b(iVar, "");
        int i = 0;
        if (iVar.mo5535a()) {
            LiveSettingApi.C78613b d = iVar.mo5545d();
            int i2 = 2;
            if (!(d == null || (aVar = d.f176657a) == null)) {
                C63238c.f143592s.mo93839a(aVar.f176658a);
                C35478ch chVar = aVar.f176659b;
                if (chVar != null) {
                    C63238c.f143592s.mo93836a(chVar);
                }
                C35470cg cgVar = aVar.f176660c;
                if (cgVar != null) {
                    C63238c.f143592s.mo93835a(cgVar);
                }
                C35478ch chVar2 = aVar.f176659b;
                if (chVar2 == null || !chVar2.f83669a) {
                    C35470cg cgVar2 = aVar.f176660c;
                    if (cgVar2 == null || !cgVar2.f83651c) {
                        i = 2;
                    } else {
                        i = 1;
                    }
                }
                this.$context$inlined.f152097d.invoke(Boolean.valueOf(aVar.f176658a));
                i2 = i;
            }
            if (this.$this_apply.f152094a.invoke().booleanValue()) {
                C78626a.f176685a = 3;
                DMTBottomTabIntegrationServiceImplDiff.INSTANCE.addLiveTabInternal(this.$diContainer$inlined, this.$this_apply.f152098e);
                C84425b a = new C84425b().mo129406a("shoot_way", this.$this_apply.f152095b.f155831p);
                AbstractC32846a e = C63238c.f143594u.mo93906e();
                if (e != null) {
                    num = Integer.valueOf(e.mo58670m());
                } else {
                    num = null;
                }
                C80322d.m139251a("livesdk_live_tab_show", a.mo129405a("fans_cnt", num).mo129403a("is_video_application_needed", i2).f188764a);
            }
        } else {
            this.$this_apply.f152097d.invoke(false);
        }
        if (!C46873ec.m90187a()) {
            DMTBottomTabIntegrationServiceImplDiff.INSTANCE.tryShowPopupForLiveWhenFirstTime(this.$diContainer$inlined);
        }
        return null;
    }
}
