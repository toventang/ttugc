package com.p2082ss.android.ugc.aweme.video.simplayer;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.video.config.C80716a;
import com.p2082ss.android.ugc.playerkit.model.C84222t;
import com.p2082ss.android.ugc.playerkit.p4321a.AbstractC84179d;
import com.p2082ss.android.ugc.playerkit.simapicommon.p4325a.C84232a;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.video.simplayer.w */
public final /* synthetic */ class C81044w implements AbstractC84179d {

    /* renamed from: a */
    private final C84232a f181160a;

    static {
        Covode.recordClassIndex(94363);
    }

    C81044w(C84232a aVar) {
        this.f181160a = aVar;
    }

    @Override // com.p2082ss.android.ugc.playerkit.p4321a.AbstractC84179d
    /* renamed from: a */
    public final Object mo124484a() {
        C84222t tVar;
        C84232a aVar = this.f181160a;
        if (C81027s.f181145d != null && (tVar = C81027s.f181145d.get(aVar)) != null) {
            return tVar;
        }
        if (C80716a.C80717a.f180462a.mo123864a().isPlayerPreferchCaption()) {
            return C80716a.C80717a.f180462a.mo123864a().createSubUrlProcessor().mo129299a(aVar);
        }
        return C80716a.C80717a.f180462a.mo123864a().createSubUrlProcessor().mo129300b(aVar);
    }
}
