package com.p2082ss.android.ugc.aweme.choosemusic.model;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.services.external.ability.IAVInfoService;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.model.ab */
final /* synthetic */ class C35882ab implements IAVInfoService.IGetInfoCallback {

    /* renamed from: a */
    private final IAVInfoService.IGetInfoCallback f84676a;

    /* renamed from: b */
    private final List f84677b;

    static {
        Covode.recordClassIndex(43122);
    }

    C35882ab(IAVInfoService.IGetInfoCallback iGetInfoCallback, List list) {
        this.f84676a = iGetInfoCallback;
        this.f84677b = list;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.external.ability.IAVInfoService.IGetInfoCallback
    public final void finish(Object obj) {
        List list = (List) obj;
        this.f84676a.finish(list);
        C51423a.m95784a(2, "Local Sound filter result", C35920u.m73284a(list));
    }
}
