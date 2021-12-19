package com.p2082ss.android.ugc.aweme.account.p2250i;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.i.a */
public final class C31686a extends AbstractC31689c {

    /* renamed from: a */
    public static final C31686a f75795a = new C31686a();

    /* renamed from: c */
    private static final String f75796c = "Login";

    /* renamed from: com.ss.android.ugc.aweme.account.i.a$a */
    public enum EnumC31687a {
        GET_THIRD_PARTY_AUTH_INFO,
        SSO_WITH_THIRD_PARTY,
        HIT_VERIFY_STRATEGY,
        HIT_NO_TRUST_DEVICE,
        REFRESH_AWEME_USER,
        USER_OPERATOR_AFTER_LOGIN,
        CHECK_PRIVACY_ACCEPT,
        ONE_LOGIN_GET_TOKEN,
        ONE_LOGIN_BY_TOKEN,
        LOGIN_BY_PASS,
        LOGIN_BY_PHONE_SMS,
        THIRD_MATCH_SETTING_BEFORE_LOGIN,
        THIRD_MATCH_SETTING_AFTER_LOGIN,
        THIRD_MATCH_SETTING_CLICK,
        THIRD_LOGIN_AGE_GATE,
        PHONE_NUMBER_INVALID,
        NEED_INTERCEPTE;

        static {
            Covode.recordClassIndex(38421);
        }
    }

    private C31686a() {
    }

    @Override // com.p2082ss.android.ugc.aweme.account.p2250i.AbstractC31689c
    /* renamed from: a */
    public final String mo57671a() {
        return f75796c;
    }

    static {
        Covode.recordClassIndex(38420);
    }

    /* renamed from: a */
    public static final void m66009a(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "on update user info result check");
        hashMap.put("errorMsg", str);
        C31686a aVar = f75795a;
        String hashMap2 = hashMap.toString();
        C89219l.m154716b(hashMap2, "");
        aVar.mo57672b(hashMap2);
    }

    /* renamed from: a */
    public static final void m66008a(EnumC31687a aVar, String str) {
        String str2;
        HashMap hashMap = new HashMap();
        hashMap.put("event", "login part success");
        if (aVar == null || (str2 = aVar.name()) == null) {
            str2 = "";
        }
        hashMap.put("part", str2);
        hashMap.put("loginMethod", "");
        if (str == null) {
            str = "";
        }
        hashMap.put("extra", str);
        C31686a aVar2 = f75795a;
        String hashMap2 = hashMap.toString();
        C89219l.m154716b(hashMap2, "");
        aVar2.mo57672b(hashMap2);
    }

    /* renamed from: a */
    public static final void m66010a(String str, String str2, EnumC31687a aVar, String str3) {
        String str4;
        HashMap hashMap = new HashMap();
        hashMap.put("event", "login part fail");
        if (str == null) {
            str = "";
        }
        hashMap.put("errorCode", str);
        if (str2 == null) {
            str2 = "";
        }
        hashMap.put("errorMsg", str2);
        if (aVar == null || (str4 = aVar.name()) == null) {
            str4 = "";
        }
        hashMap.put("part", str4);
        hashMap.put("loginMethod", "");
        hashMap.put("extra", str3);
        C31686a aVar2 = f75795a;
        String hashMap2 = hashMap.toString();
        C89219l.m154716b(hashMap2, "");
        aVar2.mo57672b(hashMap2);
    }

    /* renamed from: b */
    public static final void m66012b(boolean z, String str, boolean z2, int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "Auto fill SMS verification code");
        hashMap.put("success", String.valueOf(z));
        hashMap.put("hasSimCard", String.valueOf(z2));
        hashMap.put("googleAvailability", String.valueOf(i));
        if (!TextUtils.isEmpty(str)) {
            if (str == null) {
                str = "";
            }
            hashMap.put("errorMsg", str);
        }
        C31686a aVar = f75795a;
        String hashMap2 = hashMap.toString();
        C89219l.m154716b(hashMap2, "");
        aVar.mo57672b(hashMap2);
    }

    /* renamed from: a */
    public static final void m66011a(boolean z, String str, boolean z2, int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "Auto fill user's phone number");
        hashMap.put("success", String.valueOf(z));
        hashMap.put("hasSimCard", String.valueOf(z2));
        hashMap.put("googleAvailability", String.valueOf(i));
        if (!TextUtils.isEmpty(str)) {
            if (str == null) {
                str = "";
            }
            hashMap.put("errorMsg", str);
        }
        C31686a aVar = f75795a;
        String hashMap2 = hashMap.toString();
        C89219l.m154716b(hashMap2, "");
        aVar.mo57672b(hashMap2);
    }
}
