package com.bytedance.android.live.effect.api;

import com.bytedance.android.live.base.AbstractC2953a;
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

public interface IEffectService extends AbstractC2953a {
    static {
        Covode.recordClassIndex(4716);
    }

    AbstractC4152e baseComposerManager();

    AbstractC4155h composerManager();

    AbstractC4156i composerManagerB();

    C11672a convertStickerBean(Effect effect);

    AbstractC4149b getComposerHandler(AbstractC11683e eVar);

    AbstractC11293v getEffectDialogFragment(AbstractC4154g gVar, C4312b bVar);

    AbstractC4167d getEffectLogHelper();

    AbstractC11293v getEffectNewDialogFragment(C4312b bVar);

    AbstractC4157j getLiveEffectDataProvider();

    AbstractC4162k getLiveEffectRestoreManager();

    AbstractC4169e getLiveFilterHelper();

    AbstractC4170f getLiveFilterManager();
}
