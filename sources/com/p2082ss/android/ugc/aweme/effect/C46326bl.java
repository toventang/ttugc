package com.p2082ss.android.ugc.aweme.effect;

import com.bytedance.covode.number.Covode;
import com.google.p1998c.p1999a.AbstractC27246l;

/* renamed from: com.ss.android.ugc.aweme.effect.bl */
final /* synthetic */ class C46326bl implements AbstractC27246l {

    /* renamed from: a */
    private final int f107983a;

    static {
        Covode.recordClassIndex(54903);
    }

    C46326bl(int i) {
        this.f107983a = i;
    }

    @Override // com.google.p1998c.p1999a.AbstractC27246l
    /* renamed from: a */
    public final boolean mo45331a(Object obj) {
        EffectPointModel effectPointModel = (EffectPointModel) obj;
        return effectPointModel != null && effectPointModel.getIndex() == this.f107983a;
    }
}
