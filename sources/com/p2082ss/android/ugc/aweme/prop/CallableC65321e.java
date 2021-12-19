package com.p2082ss.android.ugc.aweme.prop;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.api.Api;
import com.p2082ss.android.ugc.aweme.prop.api.StickerPropApi;
import com.p2082ss.android.ugc.aweme.services.RetrofitService;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.prop.e */
final /* synthetic */ class CallableC65321e implements Callable {

    /* renamed from: a */
    private final Effect f147436a;

    static {
        Covode.recordClassIndex(76800);
    }

    CallableC65321e(Effect effect) {
        this.f147436a = effect;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return ((StickerPropApi) RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(Api.f79771d).create(StickerPropApi.class)).getStickerDetail(this.f147436a.getEffectId()).get();
    }
}
