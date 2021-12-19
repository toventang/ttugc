package com.p2082ss.android.ugc.aweme.shortvideo.edit.audioeffect;

import com.bytedance.covode.number.Covode;
import com.bytedance.cukaie.closet.AbstractC14409e;
import com.bytedance.cukaie.closet.internal.AbstractC14413b;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.IAudioEffectPreferences_CukaieClosetFactory */
public final class IAudioEffectPreferences_CukaieClosetFactory implements AbstractC14413b {
    static {
        Covode.recordClassIndex(83315);
    }

    @Override // com.bytedance.cukaie.closet.internal.AbstractC14413b
    public final String closetName() {
        return "AudioEffect";
    }

    @Override // com.bytedance.cukaie.closet.internal.AbstractC14413b
    public final Object createCloset(AbstractC14409e eVar) {
        return new IAudioEffectPreferences_CukaieClosetAdapter(eVar);
    }
}
