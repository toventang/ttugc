package com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2269a.p2270a;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.EnumC32594j;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.a.g */
public final class C32343g {

    /* renamed from: b */
    public static final C32344a f77139b = new C32344a((byte) 0);

    /* renamed from: a */
    public final boolean f77140a;

    /* renamed from: c */
    private final String f77141c;

    /* renamed from: d */
    private final String f77142d;

    /* renamed from: e */
    private final String f77143e;

    /* renamed from: f */
    private final String f77144f;

    static {
        Covode.recordClassIndex(39111);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.a.g$a */
    public static final class C32344a {
        static {
            Covode.recordClassIndex(39112);
        }

        private C32344a() {
        }

        public /* synthetic */ C32344a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final EnumC32594j mo58400a() {
        if (C89219l.m154714a((Object) this.f77142d, (Object) "mobile")) {
            return EnumC32594j.PHONE_SMS_CHANGE_PASSWORD;
        }
        return EnumC32594j.EMAIL_SMS_CHANGE_PASSWORD;
    }

    /* renamed from: b */
    public final Bundle mo58401b() {
        String str;
        Bundle bundle = new Bundle();
        if (C89219l.m154714a((Object) this.f77142d, (Object) "mobile")) {
            str = "phone";
        } else {
            str = "email";
        }
        bundle.putString("platForm", str);
        String str2 = this.f77141c;
        if (str2 == null) {
            C89219l.m154715b();
        }
        bundle.putString("conditional_login_ticket", str2);
        bundle.putString("otp_type", this.f77142d);
        if (C89219l.m154714a((Object) this.f77142d, (Object) "mobile")) {
            bundle.putString("args_string_phone_number", this.f77143e);
        } else {
            bundle.putString("args_email", this.f77144f);
        }
        return bundle;
    }

    public C32343g(JSONObject jSONObject) {
        String str;
        String str2;
        String str3;
        boolean z;
        boolean z2;
        String str4 = null;
        if (jSONObject != null) {
            str = jSONObject.optString("mobile", "");
        } else {
            str = null;
        }
        this.f77143e = str;
        if (jSONObject != null) {
            str2 = jSONObject.optString("email", "");
        } else {
            str2 = null;
        }
        this.f77144f = str2;
        if (jSONObject != null) {
            str3 = jSONObject.optString("conditional_login_ticket");
        } else {
            str3 = null;
        }
        this.f77141c = str3;
        str4 = jSONObject != null ? jSONObject.optString("otp_type") : str4;
        this.f77142d = str4;
        boolean z3 = true;
        if (str3 == null || str3.length() <= 0) {
            z = false;
        } else {
            z = true;
        }
        if (str4 == null || str4.length() <= 0 || (!C89219l.m154714a((Object) str4, (Object) "email") && !C89219l.m154714a((Object) str4, (Object) "mobile"))) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.f77140a = (!z || !z2) ? false : z3;
    }
}
