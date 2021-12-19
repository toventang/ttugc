package com.p2082ss.android.ugc.aweme.prop.p3608d;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.api.Api;
import com.p2082ss.android.ugc.aweme.prop.api.StickerPropApi;
import com.p2082ss.android.ugc.aweme.services.RetrofitService;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.prop.d.b */
final /* synthetic */ class CallableC65319b implements Callable {

    /* renamed from: a */
    private final String f147434a;

    static {
        Covode.recordClassIndex(76798);
    }

    CallableC65319b(String str) {
        this.f147434a = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return ((StickerPropApi) RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(Api.f79771d).create(StickerPropApi.class)).getStickerDetail(this.f147434a, 1).get();
    }
}
