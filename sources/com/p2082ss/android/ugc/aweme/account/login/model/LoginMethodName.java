package com.p2082ss.android.ugc.aweme.account.login.model;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.account.login.model.LoginMethodName */
public enum LoginMethodName {
    DEFAULT,
    EMAIL_PASS,
    USER_NAME_PASS,
    PHONE_NUMBER_PASS,
    PHONE_SMS,
    THIRD_PARTY;

    static {
        Covode.recordClassIndex(38713);
    }
}
