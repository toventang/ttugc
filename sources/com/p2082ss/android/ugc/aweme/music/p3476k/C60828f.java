package com.p2082ss.android.ugc.aweme.music.p3476k;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.services.external.ability.IAVInfoService;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.music.k.f */
public final /* synthetic */ class C60828f implements IAVInfoService.IGetInfoCallback {

    /* renamed from: a */
    private final IAVInfoService.IGetInfoCallback f138239a;

    /* renamed from: b */
    private final List f138240b;

    static {
        Covode.recordClassIndex(71385);
    }

    C60828f(IAVInfoService.IGetInfoCallback iGetInfoCallback, List list) {
        this.f138239a = iGetInfoCallback;
        this.f138240b = list;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.external.ability.IAVInfoService.IGetInfoCallback
    public final void finish(Object obj) {
        this.f138239a.finish(obj);
    }
}
