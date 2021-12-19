package com.p2082ss.android.ugc.aweme.video.simplayer;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.video.config.C80716a;
import com.p2082ss.android.ugc.playerkit.model.C84221s;
import com.p2082ss.android.ugc.playerkit.p4321a.AbstractC84179d;
import com.p2082ss.android.ugc.playerkit.simapicommon.p4325a.C84235d;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.video.simplayer.v */
public final /* synthetic */ class C81043v implements AbstractC84179d {

    /* renamed from: a */
    private final C84235d f181159a;

    static {
        Covode.recordClassIndex(94362);
    }

    C81043v(C84235d dVar) {
        this.f181159a = dVar;
    }

    @Override // com.p2082ss.android.ugc.playerkit.p4321a.AbstractC84179d
    /* renamed from: a */
    public final Object mo124484a() {
        C84221s sVar;
        C84235d dVar = this.f181159a;
        if (C81027s.f181144c != null && (sVar = C81027s.f181144c.get(dVar)) != null) {
            return sVar;
        }
        if (C80716a.C80717a.f180462a.mo123864a().isPlayerPreferchTtsAudio()) {
            return C80716a.C80717a.f180462a.mo123864a().createAudioUrlProcessor().mo129295a(dVar);
        }
        return C80716a.C80717a.f180462a.mo123864a().createAudioUrlProcessor().mo129296b(dVar);
    }
}
