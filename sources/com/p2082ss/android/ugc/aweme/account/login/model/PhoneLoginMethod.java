package com.p2082ss.android.ugc.aweme.account.login.model;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.account.login.model.CommonUserInfo;
import com.p2082ss.android.ugc.aweme.account.login.p2263h.C31940a;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.login.model.PhoneLoginMethod */
public final class PhoneLoginMethod extends BaseLoginMethod {
    private C31940a.C31941a phoneNumber;

    static {
        Covode.recordClassIndex(38716);
    }

    public PhoneLoginMethod(String str, C31940a.C31941a aVar) {
        this(str, null, aVar, null, null, null, null, 122, null);
    }

    public PhoneLoginMethod(String str, LoginMethodName loginMethodName, C31940a.C31941a aVar) {
        this(str, loginMethodName, aVar, null, null, null, null, 120, null);
    }

    public PhoneLoginMethod(String str, LoginMethodName loginMethodName, C31940a.C31941a aVar, CommonUserInfo commonUserInfo) {
        this(str, loginMethodName, aVar, commonUserInfo, null, null, null, 112, null);
    }

    public PhoneLoginMethod(String str, LoginMethodName loginMethodName, C31940a.C31941a aVar, CommonUserInfo commonUserInfo, Long l) {
        this(str, loginMethodName, aVar, commonUserInfo, l, null, null, 96, null);
    }

    public PhoneLoginMethod(String str, LoginMethodName loginMethodName, C31940a.C31941a aVar, CommonUserInfo commonUserInfo, Long l, Long l2) {
        this(str, loginMethodName, aVar, commonUserInfo, l, l2, null, 64, null);
    }

    public final C31940a.C31941a getPhoneNumber() {
        return this.phoneNumber;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PhoneLoginMethod(String str, LoginMethodName loginMethodName, String str2, String str3, String str4, Long l, int i, C89214g gVar) {
        this(str, (i & 2) != 0 ? LoginMethodName.PHONE_SMS : loginMethodName, (i & 4) != 0 ? "" : str2, str3, str4, l);
    }

    public final void setPhoneNumber(C31940a.C31941a aVar) {
        C89219l.m154721d(aVar, "");
        this.phoneNumber = aVar;
    }

    private final String parseNumber(String str) {
        boolean z;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        if (str != null) {
            for (int i = 0; i < str.length(); i++) {
                int digit = Character.digit(str.charAt(i), 10);
                if (digit != -1) {
                    sb.append(digit);
                }
            }
        }
        if (sb.length() == 0) {
            return "0";
        }
        String sb2 = sb.toString();
        C89219l.m154716b(sb2, "");
        return sb2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PhoneLoginMethod(String str, LoginMethodName loginMethodName, String str2, String str3, String str4, Long l) {
        this(str, loginMethodName, new C31940a.C31941a(), null, l, null, null, 104, null);
        C89219l.m154721d(str, "");
        C89219l.m154721d(loginMethodName, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(str4, "");
        this.phoneNumber.setCountryIso(str2);
        this.phoneNumber.setCountryCode(Integer.parseInt(parseNumber(str3)));
        this.phoneNumber.setNationalNumber(Long.parseLong(parseNumber(str4)));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PhoneLoginMethod(String str, LoginMethodName loginMethodName, C31940a.C31941a aVar, CommonUserInfo commonUserInfo, Long l, Long l2, Boolean bool) {
        super(str, loginMethodName, commonUserInfo, null, l, l2, bool, null, null, 392, null);
        C89219l.m154721d(str, "");
        C89219l.m154721d(loginMethodName, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(commonUserInfo, "");
        this.phoneNumber = aVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PhoneLoginMethod(String str, LoginMethodName loginMethodName, C31940a.C31941a aVar, CommonUserInfo commonUserInfo, Long l, Long l2, Boolean bool, int i, C89214g gVar) {
        this(str, (i & 2) != 0 ? LoginMethodName.PHONE_SMS : loginMethodName, aVar, (i & 8) != 0 ? CommonUserInfo.C31964a.m66331a() : commonUserInfo, (i & 16) != 0 ? -1L : l, (i & 32) != 0 ? -1L : l2, (i & 64) != 0 ? false : bool);
    }
}
