package com.p2082ss.android.ugc.aweme.services;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1559o.C21582f;
import com.p2082ss.android.ugc.aweme.experiment.C46873ec;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.servicimpl.C67905b;
import com.p2082ss.android.ugc.aweme.tools.live.LiveSettingApi;
import com.p2082ss.android.ugc.aweme.tools.live.p4119a.C78623a;
import com.p2082ss.android.ugc.aweme.tools.live.sticker.C78626a;
import com.p2082ss.android.ugc.gamora.recorder.p4294b.AbstractC83405a;
import com.p2082ss.android.ugc.gamora.recorder.p4294b.AbstractC83406b;
import com.p2082ss.android.ugc.gamora.recorder.p4301h.C83723d;
import java.util.List;
import p077b.C1731i;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.services.DMTBottomTabIntegrationServiceImplDiff */
public final class DMTBottomTabIntegrationServiceImplDiff {
    public static final DMTBottomTabIntegrationServiceImplDiff INSTANCE = new DMTBottomTabIntegrationServiceImplDiff();

    private DMTBottomTabIntegrationServiceImplDiff() {
    }

    static {
        Covode.recordClassIndex(79605);
    }

    public final void tryShowPopupForLiveWhenFirstTime(C21582f fVar) {
        C83723d dVar = new C83723d();
        if (!dVar.mo128696a() && C46873ec.m90188b()) {
            LiveSettingApi.f176654a.createInfo().mo5534a(new C67865xc10b8bce(dVar, fVar), C1731i.f5564c, null);
        }
    }

    public final boolean addLiveTabInternal(C21582f fVar, AbstractC89172b<? super Integer, Integer> bVar) {
        if (C46873ec.m90187a()) {
            C83723d dVar = new C83723d();
            if (dVar.mo128696a() && dVar.mo128697b()) {
                AbstractC83406b bVar2 = (AbstractC83406b) fVar.mo35249a(AbstractC83406b.class, (String) null);
                String currentBottomTag = bVar2.getCurrentBottomTag();
                bVar2.addBottomTab(bVar.invoke(Integer.valueOf(bVar2.bottomTabSize())).intValue() - 1, new C78623a(fVar), 0);
                bVar2.resetToCurTab(currentBottomTag);
                return false;
            } else if (!dVar.mo128696a()) {
                LiveSettingApi.f176654a.createInfo().mo5534a(new DMTBottomTabIntegrationServiceImplDiff$addLiveTabInternal$2(dVar, fVar, bVar), C1731i.f5564c, null);
                return true;
            } else {
                AbstractC83406b bVar3 = (AbstractC83406b) fVar.mo35249a(AbstractC83406b.class, (String) null);
                bVar3.addBottomTab(bVar.invoke(Integer.valueOf(bVar3.bottomTabSize())).intValue(), new C78623a(fVar), 0);
                return false;
            }
        } else {
            AbstractC83406b bVar4 = (AbstractC83406b) fVar.mo35249a(AbstractC83406b.class, (String) null);
            bVar4.addBottomTab(bVar.invoke(Integer.valueOf(bVar4.bottomTabSize())).intValue(), new C78623a(fVar), 0);
            return false;
        }
    }

    public final List<AbstractC83405a> addLiveModule(C21582f fVar, List<AbstractC83405a> list, C67905b bVar) {
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(list, "");
        C89219l.m154721d(bVar, "");
        if (!C63238c.f143594u.mo93901a() && bVar.f152095b.f155765Z == null) {
            if (C46873ec.m90187a() || !bVar.f152095b.f155800aj) {
                bVar.f152096c.invoke();
                LiveSettingApi.WebcastAPI webcastAPI = LiveSettingApi.f176654a;
                C89219l.m154716b(webcastAPI, "");
                webcastAPI.getLivePodCast().mo5534a(new C67864x6f7895bd(bVar, list, bVar, fVar), C1731i.f5564c, null);
            } else {
                C78626a.f176685a = 0;
                if (bVar.f152094a.invoke().booleanValue() && !bVar.f152095b.f155800aj) {
                    C78626a.f176685a = 1;
                }
                if (!bVar.f152094a.invoke().booleanValue() && bVar.f152095b.f155800aj) {
                    C78626a.f176685a = 2;
                }
                list.add(new C78623a(fVar));
                if (!C46873ec.m90187a()) {
                    INSTANCE.tryShowPopupForLiveWhenFirstTime(fVar);
                }
            }
        }
        return list;
    }
}
