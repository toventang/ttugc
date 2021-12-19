package com.p2082ss.android.ugc.aweme.effect;

import com.bytedance.covode.number.Covode;
import com.bytedance.cukaie.closet.AbstractC14409e;
import com.bytedance.cukaie.closet.internal.AbstractC14412a;

/* renamed from: com.ss.android.ugc.aweme.effect.IEditEffectPreferences_CukaieClosetAdapter */
public final class IEditEffectPreferences_CukaieClosetAdapter extends AbstractC14412a implements IEditEffectPreferences {
    static {
        Covode.recordClassIndex(54832);
    }

    public IEditEffectPreferences_CukaieClosetAdapter(AbstractC14409e eVar) {
        super(eVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.effect.IEditEffectPreferences
    public final int getResourceVersion(int i) {
        return super.getStore().mo23220a("fallback_resource_version", i);
    }

    @Override // com.p2082ss.android.ugc.aweme.effect.IEditEffectPreferences
    public final void setResourceVersion(int i) {
        super.getStore().mo23228b("fallback_resource_version", i);
    }
}
