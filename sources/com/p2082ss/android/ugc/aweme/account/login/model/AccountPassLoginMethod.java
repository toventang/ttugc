package com.p2082ss.android.ugc.aweme.account.login.model;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.account.login.model.CommonUserInfo;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.login.model.AccountPassLoginMethod */
public final class AccountPassLoginMethod extends BaseLoginMethod {
    private String name;

    static {
        Covode.recordClassIndex(38709);
    }

    public AccountPassLoginMethod(String str, LoginMethodName loginMethodName, String str2) {
        this(str, loginMethodName, str2, null, null, null, null, 120, null);
    }

    public AccountPassLoginMethod(String str, LoginMethodName loginMethodName, String str2, CommonUserInfo commonUserInfo) {
        this(str, loginMethodName, str2, commonUserInfo, null, null, null, 112, null);
    }

    public AccountPassLoginMethod(String str, LoginMethodName loginMethodName, String str2, CommonUserInfo commonUserInfo, Long l) {
        this(str, loginMethodName, str2, commonUserInfo, l, null, null, 96, null);
    }

    public AccountPassLoginMethod(String str, LoginMethodName loginMethodName, String str2, CommonUserInfo commonUserInfo, Long l, Long l2) {
        this(str, loginMethodName, str2, commonUserInfo, l, l2, null, 64, null);
    }

    public AccountPassLoginMethod(String str, String str2) {
        this(str, null, str2, null, null, null, null, 122, null);
    }

    public final String getName() {
        return this.name;
    }

    public final void setName(String str) {
        C89219l.m154721d(str, "");
        this.name = str;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AccountPassLoginMethod(String str, LoginMethodName loginMethodName, String str2, CommonUserInfo commonUserInfo, Long l, Long l2, Boolean bool) {
        super(str, loginMethodName, commonUserInfo, null, l, l2, bool, null, null, 392, null);
        C89219l.m154721d(str, "");
        C89219l.m154721d(loginMethodName, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(commonUserInfo, "");
        this.name = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AccountPassLoginMethod(String str, LoginMethodName loginMethodName, String str2, CommonUserInfo commonUserInfo, Long l, Long l2, Boolean bool, int i, C89214g gVar) {
        this(str, (i & 2) != 0 ? LoginMethodName.EMAIL_PASS : loginMethodName, str2, (i & 8) != 0 ? CommonUserInfo.C31964a.m66331a() : commonUserInfo, (i & 16) != 0 ? -1L : l, (i & 32) != 0 ? -1L : l2, (i & 64) != 0 ? false : bool);
    }
}
