package com.bytedance.android.live.effect.api;

import com.bytedance.android.live.effect.api.p240a.AbstractC4149b;
import com.bytedance.android.live.effect.api.p240a.AbstractC4152e;
import com.bytedance.android.live.effect.api.p240a.AbstractC4154g;
import com.bytedance.android.live.effect.api.p240a.AbstractC4155h;
import com.bytedance.android.live.effect.api.p240a.AbstractC4156i;
import com.bytedance.android.live.effect.api.p240a.AbstractC4157j;
import com.bytedance.android.live.effect.api.p240a.AbstractC4162k;
import com.bytedance.android.live.effect.model.C4312b;
import com.bytedance.android.livesdk.AbstractC11293v;
import com.bytedance.android.livesdkapi.depend.model.C11672a;
import com.bytedance.android.livesdkapi.depend.model.p685a.AbstractC11683e;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;

public class EffectServiceDummy implements IEffectService {
    static {
        Covode.recordClassIndex(4715);
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public AbstractC4152e baseComposerManager() {
        return null;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public AbstractC4155h composerManager() {
        return null;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public AbstractC4156i composerManagerB() {
        return null;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public C11672a convertStickerBean(Effect effect) {
        return null;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public AbstractC4149b getComposerHandler(AbstractC11683e eVar) {
        return null;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public AbstractC11293v getEffectDialogFragment(AbstractC4154g gVar, C4312b bVar) {
        return null;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public AbstractC4167d getEffectLogHelper() {
        return null;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public AbstractC11293v getEffectNewDialogFragment(C4312b bVar) {
        return null;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public AbstractC4157j getLiveEffectDataProvider() {
        return null;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public AbstractC4162k getLiveEffectRestoreManager() {
        return null;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public AbstractC4169e getLiveFilterHelper() {
        return null;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public AbstractC4170f getLiveFilterManager() {
        return null;
    }

    @Override // com.bytedance.android.live.base.AbstractC2953a
    public void onInit() {
    }
}
