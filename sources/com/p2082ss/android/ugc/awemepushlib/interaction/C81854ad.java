package com.p2082ss.android.ugc.awemepushlib.interaction;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.IAccountService;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.awemepushlib.manager.AwemeRedBadgerManager;

/* renamed from: com.ss.android.ugc.awemepushlib.interaction.ad */
final /* synthetic */ class C81854ad implements IAccountService.AbstractC31272b {

    /* renamed from: a */
    private final Context f183012a;

    static {
        Covode.recordClassIndex(95268);
    }

    C81854ad(Context context) {
        this.f183012a = context;
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountService.AbstractC31272b
    public final void onAccountResult(int i, boolean z, int i2, User user) {
        AwemeRedBadgerManager.m141795a(this.f183012a);
    }
}
