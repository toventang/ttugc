package com.p2082ss.android.ugc.aweme.effect;

import com.bytedance.covode.number.Covode;
import com.bytedance.cukaie.closet.AbstractC14409e;
import com.bytedance.cukaie.closet.internal.AbstractC14413b;

/* renamed from: com.ss.android.ugc.aweme.effect.IEditEffectPreferences_CukaieClosetFactory */
public final class IEditEffectPreferences_CukaieClosetFactory implements AbstractC14413b {
    static {
        Covode.recordClassIndex(54833);
    }

    @Override // com.bytedance.cukaie.closet.internal.AbstractC14413b
    public final String closetName() {
        return "EditEffectConfig";
    }

    @Override // com.bytedance.cukaie.closet.internal.AbstractC14413b
    public final Object createCloset(AbstractC14409e eVar) {
        return new IEditEffectPreferences_CukaieClosetAdapter(eVar);
    }
}
