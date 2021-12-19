package com.p2082ss.android.ugc.aweme.services.effect;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.services.effectplatform.EffectPlatformBuilder;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.services.effect.EffectService$$Lambda$1 */
public final /* synthetic */ class EffectService$$Lambda$1 implements AbstractC89172b {
    private final EffectService arg$1;
    private final String arg$2;

    static {
        Covode.recordClassIndex(79776);
    }

    EffectService$$Lambda$1(EffectService effectService, String str) {
        this.arg$1 = effectService;
        this.arg$2 = str;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89172b
    public final Object invoke(Object obj) {
        return this.arg$1.lambda$createMvEffectPlatform$1$EffectService(this.arg$2, (EffectPlatformBuilder) obj);
    }
}
