package com.p2082ss.android.ugc.aweme.services;

import android.app.Activity;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.aweme.AbstractC35319bw;
import com.p2082ss.android.ugc.aweme.IAccountService;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.EnumC32594j;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.services.SetUserNameService */
public final class SetUserNameService implements AbstractC35319bw {
    private IAccountService.AbstractC31277g mResult;

    static {
        Covode.recordClassIndex(79727);
    }

    @Override // com.p2082ss.android.ugc.aweme.AbstractC35319bw
    public final void returnResult(int i, int i2, Object obj) {
        IAccountService.AbstractC31277g gVar = this.mResult;
        if (gVar != null) {
            gVar.onResult(i, i2, obj);
            this.mResult = null;
        }
    }

    public final void setUserNameForThirdParty(Activity activity, Bundle bundle, IAccountService.AbstractC31277g gVar) {
        C89219l.m154721d(activity, "");
        C89219l.m154721d(bundle, "");
        C89219l.m154721d(gVar, "");
        SmartRouter.buildRoute(activity, "//account/login/signup_or_login").withParam(bundle).withParam("next_page", EnumC32594j.CREATE_USERNAME.getValue()).open();
        this.mResult = gVar;
    }
}
