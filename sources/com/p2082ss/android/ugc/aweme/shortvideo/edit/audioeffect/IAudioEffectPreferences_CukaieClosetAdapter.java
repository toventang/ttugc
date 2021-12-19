package com.p2082ss.android.ugc.aweme.shortvideo.edit.audioeffect;

import com.bytedance.covode.number.Covode;
import com.bytedance.cukaie.closet.AbstractC14409e;
import com.bytedance.cukaie.closet.internal.AbstractC14412a;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.IAudioEffectPreferences_CukaieClosetAdapter */
public final class IAudioEffectPreferences_CukaieClosetAdapter extends AbstractC14412a implements IAudioEffectPreferences {
    static {
        Covode.recordClassIndex(83314);
    }

    public IAudioEffectPreferences_CukaieClosetAdapter(AbstractC14409e eVar) {
        super(eVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.audioeffect.IAudioEffectPreferences
    public final int getResourceVersion(int i) {
        return super.getStore().mo23220a("resource_version", i);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.audioeffect.IAudioEffectPreferences
    public final void setResourceVersion(int i) {
        super.getStore().mo23228b("resource_version", i);
    }
}
