package com.p2082ss.android.ugc.aweme.account.login.twostep;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.C36085cj;
import com.p2082ss.android.ugc.aweme.account.login.twostep.C32176a;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.login.twostep.q */
public final class C32258q {

    /* renamed from: a */
    public static final C32258q f76961a = new C32258q();

    private C32258q() {
    }

    /* renamed from: a */
    public static void m66622a(String str, boolean z) {
        C89219l.m154721d(str, "");
        C39162r.m79460a("authorized_logins_result", m66614a().mo59983a("enter_from", str).mo59983a("result", z ? "success" : "fail").f79943a);
    }

    /* renamed from: a */
    public static void m66621a(String str, String str2, boolean z) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C39162r.m79460a("login_two_step_verification_result", m66614a().mo59983a("platform", str).mo59983a("verification_method", str2).mo59983a("status", z ? "success" : "fail").f79943a);
    }

    static {
        Covode.recordClassIndex(39023);
    }

    /* renamed from: a */
    public static C33744d m66614a() {
        C33744d a = new C33744d().mo59980a("aid", C17867d.f42590n).mo59983a("user_id", C36085cj.m73548b()).mo59983a("params_for_special", "uc_login");
        C89219l.m154716b(a, "");
        return a;
    }

    /* renamed from: b */
    public static void m66623b(String str) {
        C89219l.m154721d(str, "");
        C39162r.m79460a("two_step_verification_turn_on_notify", m66614a().mo59983a("enter_from", str).f79943a);
    }

    /* renamed from: c */
    public static void m66626c(String str) {
        C89219l.m154721d(str, "");
        C39162r.m79460a("two_step_verification_manage_notify", m66614a().mo59983a("enter_from", str).f79943a);
    }

    /* renamed from: d */
    private static void m66628d(String str) {
        C39162r.m79460a("twosv_setup_show", m66614a().mo59983a("enter_from", "settings_security").mo59983a("page_type", str).f79943a);
    }

    /* renamed from: a */
    public static String m66615a(String str) {
        C89219l.m154721d(str, "");
        switch (str.hashCode()) {
            case -797498437:
                if (str.equals("pwd_verify")) {
                    return "password";
                }
                break;
            case 300626556:
                if (str.equals("email_verify")) {
                    return "email_code";
                }
                break;
            case 312290780:
                if (str.equals("mobile_sms_verify")) {
                    return "sms";
                }
                break;
            case 961294113:
                if (str.equals("oauth_verify")) {
                    return "oauth";
                }
                break;
        }
        return "";
    }

    /* renamed from: a */
    public static String m66616a(List<String> list) {
        String str = "";
        C89219l.m154721d(list, str);
        for (String str2 : list) {
            StringBuilder append = new StringBuilder().append(str);
            if (str.length() > 0) {
                str2 = ",".concat(String.valueOf(str2));
            }
            str = append.append(str2).toString();
        }
        return str;
    }

    /* renamed from: a */
    public static void m66617a(C32176a aVar) {
        String str;
        C89219l.m154721d(aVar, "");
        C32176a.C32177a data = aVar.getData();
        if (data != null) {
            str = data.getDefault_verify_way();
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            m66628d("off");
        } else {
            m66628d("on");
        }
    }

    /* renamed from: a */
    public static void m66619a(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C39162r.m79460a("two_step_verification_manage_click", m66614a().mo59983a("click_button", str).mo59983a("enter_from", str2).f79943a);
    }

    /* renamed from: b */
    public static void m66624b(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C39162r.m79460a("twosv_setup_popup_show", m66614a().mo59983a("popup_type", str).mo59983a("enter_from", str2).f79943a);
    }

    /* renamed from: c */
    public static void m66627c(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C39162r.m79460a("login_two_step_verification_notify", m66614a().mo59983a("platform", str).mo59983a("verification_method", str2).f79943a);
    }

    /* renamed from: b */
    public static void m66625b(String str, String str2, String str3) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C39162r.m79460a("twosv_setup_popup_click", m66614a().mo59983a("popup_type", str2).mo59983a("click_button", str).mo59983a("enter_from", str3).f79943a);
    }

    /* renamed from: a */
    public static void m66620a(String str, String str2, String str3) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C39162r.m79460a("twosv_setup_verification_result", m66614a().mo59983a("verify_method", str).mo59983a("status", str2).mo59983a("enter_from", str3).f79943a);
    }

    /* renamed from: a */
    public static void m66618a(String str, int i, int i2, int i3, String str2, String str3) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C39162r.m79460a("twosv_setup_method_remove_success", m66614a().mo59980a("is_sms_removed", i).mo59980a("is_email_removed", i2).mo59980a("is_pw_removed", i3).mo59983a(StringSet.type, str).mo59983a("enter_from", str2).mo59983a("verify_method", str3).f79943a);
    }
}
