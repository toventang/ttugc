package com.p2082ss.android.ugc.aweme.services.effect;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.services.effectplatform.EffectPlatformBuilder;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.services.effect.EffectService$$Lambda$0 */
public final /* synthetic */ class EffectService$$Lambda$0 implements AbstractC89172b {
    private final String arg$1;

    static {
        Covode.recordClassIndex(79775);
    }

    EffectService$$Lambda$0(String str) {
        this.arg$1 = str;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89172b
    public final Object invoke(Object obj) {
        return ((EffectPlatformBuilder) obj).setRegion(this.arg$1);
    }
}
