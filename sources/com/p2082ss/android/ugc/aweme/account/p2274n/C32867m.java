package com.p2082ss.android.ugc.aweme.account.p2274n;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.EnumC32592i;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.EnumC32594j;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.n.m */
public final class C32867m {

    /* renamed from: a */
    public static final C32867m f78247a = new C32867m();

    private C32867m() {
    }

    static {
        Covode.recordClassIndex(39652);
    }

    /* renamed from: a */
    public static final SmartRoute m67466a(Context context) {
        C89219l.m154721d(context, "");
        SmartRoute withParam = SmartRouter.buildRoute(context, "//account/ftc").withParam("current_scene", EnumC32592i.SIGN_UP.getValue()).withParam("next_page", EnumC32594j.FTC_CREATE_ACCOUNT.getValue());
        C89219l.m154716b(withParam, "");
        return withParam;
    }

    /* renamed from: b */
    public static final SmartRoute m67467b(Context context) {
        C89219l.m154721d(context, "");
        SmartRoute withParam = SmartRouter.buildRoute(context, "//account/login/signup_or_login").withParam("current_scene", EnumC32592i.SIGN_UP.getValue()).withParam("next_page", EnumC32594j.PHONE_EMAIL_SIGN_UP.getValue());
        C89219l.m154716b(withParam, "");
        return withParam;
    }

    /* renamed from: c */
    public static final SmartRoute m67468c(Context context) {
        C89219l.m154721d(context, "");
        SmartRoute withParam = SmartRouter.buildRoute(context, "//account/login/signup_or_login").withParam("current_scene", EnumC32592i.LOGIN.getValue()).withParam("next_page", EnumC32594j.PHONE_EMAIL_LOGIN.getValue());
        C89219l.m154716b(withParam, "");
        return withParam;
    }
}
