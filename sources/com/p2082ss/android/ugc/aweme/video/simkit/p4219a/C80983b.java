package com.p2082ss.android.ugc.aweme.video.simkit.p4219a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.playerkit.p3555a.AbstractC63101e;
import com.p2082ss.android.ugc.aweme.playerkit.p3555a.C63102f;
import com.p2082ss.android.ugc.aweme.request_combine.common.ServerPortraitCollections;
import com.p2082ss.android.ugc.aweme.requestcombine.IServerPortraitService;
import com.p2082ss.android.ugc.aweme.simkit.config.p3907a.C74611b;
import com.p2082ss.android.ugc.aweme.video.simkit.p4219a.p4220a.p4222b.AbstractC80977a;
import com.p2082ss.android.ugc.aweme.video.simkit.p4219a.p4220a.p4222b.AbstractC80979b;
import com.p2082ss.android.ugc.aweme.video.simkit.p4219a.p4220a.p4222b.AbstractC80981c;
import com.p2082ss.android.ugc.aweme.video.simkit.p4219a.p4223b.C80984a;
import com.p2082ss.android.ugc.playerkit.exp.PlayerSettingService;

/* renamed from: com.ss.android.ugc.aweme.video.simkit.a.b */
public final class C80983b extends C74611b {

    /* renamed from: a */
    private C63102f f181021a;

    static {
        Covode.recordClassIndex(94293);
    }

    @Override // com.p2082ss.android.ugc.aweme.simkit.api.IDimensionBitrateFilterConfig, com.p2082ss.android.ugc.aweme.simkit.config.p3907a.C74611b
    /* renamed from: a */
    public final boolean mo117322a() {
        return AbstractC80979b.C80980a.f181018a;
    }

    @Override // com.p2082ss.android.ugc.aweme.simkit.api.IDimensionBitrateFilterConfig, com.p2082ss.android.ugc.aweme.simkit.config.p3907a.C74611b
    /* renamed from: b */
    public final C63102f mo117323b() {
        IServerPortraitService d = ServerPortraitCollections.m118773d();
        if (this.f181021a == null) {
            C63102f.C63103a aVar = new C63102f.C63103a();
            aVar.f143409a = AbstractC80981c.C80982a.f181020a;
            aVar.f143410b = AbstractC80977a.C80978a.f181017a;
            aVar.f143411c = d.mo105954a();
            AbstractC63101e[] eVarArr = C80984a.f181022a;
            for (AbstractC63101e eVar : eVarArr) {
                if (!aVar.f143413e.contains(eVar)) {
                    aVar.f143413e.add(eVar);
                }
            }
            if ((aVar.f143409a == null || aVar.f143409a.mo46684a() == 0) && ((aVar.f143410b == null || aVar.f143410b.mo46684a() == 0) && PlayerSettingService.isDebug())) {
                throw new RuntimeException("globalConditionListJson/additionalConditionListJson must not be null at the same time!");
            }
            C63102f fVar = new C63102f(aVar.f143409a, aVar.f143410b, aVar.f143411c, null, aVar.f143413e, (byte) 0);
            fVar.f143405d = aVar.f143412d;
            this.f181021a = fVar;
        }
        this.f181021a.f143404c = d.mo105954a();
        return this.f181021a;
    }
}
