package com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.service;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p3070im.C53598c;
import com.p2082ss.android.ugc.aweme.p3070im.IIMAdapterService;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.providedservices.IMService;
import com.p2082ss.android.ugc.aweme.profile.model.User;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.im.sdk.common.data.service.a */
public abstract class AbstractC55277a implements IIMAdapterService {
    static {
        Covode.recordClassIndex(65032);
    }

    AbstractC55277a() {
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.IIMAdapterService
    /* renamed from: a */
    public void mo90128a(User user) {
        IMService.createIIMServicebyMonsterPlugin(false).updateIMUserFollowStatus(C53598c.m98833a(user));
    }
}
