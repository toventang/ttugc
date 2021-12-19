package com.p2082ss.android.ugc.aweme.video.simplayer.p4228tt;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63042j;
import com.p2082ss.android.ugc.aweme.player.sdk.p3552a.C63012m;
import com.p2082ss.android.ugc.aweme.video.AbstractC80773m;
import com.p2082ss.android.ugc.aweme.video.config.C80716a;
import com.p2082ss.android.ugc.playerkit.model.C84209m;

/* renamed from: com.ss.android.ugc.aweme.video.simplayer.tt.b */
public final class C81034b extends AbstractC80773m {
    static {
        Covode.recordClassIndex(94353);
    }

    public C81034b(boolean z) {
        super(z);
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63041i
    /* renamed from: a */
    public final AbstractC63042j mo101178a(C84209m.EnumC84214e eVar) {
        C84209m playerConfig = C80716a.C80717a.f180462a.mo123864a().getPlayerConfig(eVar, false, this.f180601a);
        if (playerConfig.f188060b == C84209m.EnumC84214e.Ijk) {
            return new C63012m(playerConfig.f188059a, playerConfig.f188061c, playerConfig.f188063e, playerConfig.f188064f, playerConfig);
        }
        if (playerConfig.f188060b == C84209m.EnumC84214e.IjkHardware) {
            return new C63012m(playerConfig.f188059a, playerConfig.f188061c, playerConfig.f188063e, playerConfig.f188064f, playerConfig);
        }
        if (playerConfig.f188060b == C84209m.EnumC84214e.TT || playerConfig.f188060b == C84209m.EnumC84214e.TT_IJK_ENGINE) {
            return new C63012m(playerConfig.f188059a, playerConfig.f188061c, playerConfig.f188063e, playerConfig.f188064f, playerConfig);
        }
        if (playerConfig.f188060b == C84209m.EnumC84214e.TT_HARDWARE) {
            return new C63012m(playerConfig.f188059a, true, playerConfig.f188063e, playerConfig.f188064f, playerConfig);
        }
        return new C63012m(playerConfig.f188059a);
    }
}
