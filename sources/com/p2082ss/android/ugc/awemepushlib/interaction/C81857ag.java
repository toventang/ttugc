package com.p2082ss.android.ugc.awemepushlib.interaction;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.IAccountService;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.awemepushlib.manager.AwemeRedBadgerManager;

/* renamed from: com.ss.android.ugc.awemepushlib.interaction.ag */
final /* synthetic */ class C81857ag implements IAccountService.AbstractC31272b {

    /* renamed from: a */
    private final Context f183015a;

    static {
        Covode.recordClassIndex(95271);
    }

    C81857ag(Context context) {
        this.f183015a = context;
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountService.AbstractC31272b
    public final void onAccountResult(int i, boolean z, int i2, User user) {
        AwemeRedBadgerManager.m141795a(this.f183015a);
    }
}
