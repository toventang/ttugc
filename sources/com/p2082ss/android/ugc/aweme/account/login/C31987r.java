package com.p2082ss.android.ugc.aweme.account.login;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.account.login.model.LoginMethodName;

/* renamed from: com.ss.android.ugc.aweme.account.login.r */
public final /* synthetic */ class C31987r {

    /* renamed from: a */
    public static final /* synthetic */ int[] f76379a;

    static {
        Covode.recordClassIndex(38741);
        int[] iArr = new int[LoginMethodName.values().length];
        f76379a = iArr;
        iArr[LoginMethodName.EMAIL_PASS.ordinal()] = 1;
        iArr[LoginMethodName.USER_NAME_PASS.ordinal()] = 2;
        iArr[LoginMethodName.PHONE_NUMBER_PASS.ordinal()] = 3;
        iArr[LoginMethodName.PHONE_SMS.ordinal()] = 4;
        iArr[LoginMethodName.THIRD_PARTY.ordinal()] = 5;
    }
}
