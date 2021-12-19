package com.p2082ss.android.ugc.aweme.account.login.rememberaccount;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.account.login.model.BaseLoginMethod;
import com.p2082ss.android.ugc.aweme.account.login.model.LoginMethodName;
import com.p2082ss.android.ugc.aweme.account.login.model.TPLoginMethod;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.login.rememberaccount.a */
public final class C32052a {

    /* renamed from: a */
    public static final C32052a f76511a = new C32052a();

    private C32052a() {
    }

    static {
        Covode.recordClassIndex(38809);
    }

    /* renamed from: a */
    public static String m66445a(BaseLoginMethod baseLoginMethod) {
        C89219l.m154721d(baseLoginMethod, "");
        LoginMethodName loginMethodName = baseLoginMethod.getLoginMethodName();
        if (loginMethodName == LoginMethodName.EMAIL_PASS) {
            return "email";
        }
        if (loginMethodName == LoginMethodName.USER_NAME_PASS) {
            return "handle";
        }
        if (loginMethodName == LoginMethodName.PHONE_NUMBER_PASS) {
            return "phone";
        }
        if (loginMethodName == LoginMethodName.PHONE_SMS) {
            return "sms_verification";
        }
        if (loginMethodName == LoginMethodName.THIRD_PARTY) {
            return ((TPLoginMethod) baseLoginMethod).getPlatform();
        }
        return "";
    }
}
