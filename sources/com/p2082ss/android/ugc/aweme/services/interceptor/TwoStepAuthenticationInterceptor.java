package com.p2082ss.android.ugc.aweme.services.interceptor;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.p025c.C0484a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.bytedance.retrofit2.client.Request;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.EnumC32594j;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2269a.C32369ae;
import com.p2082ss.android.ugc.aweme.account.login.twostep.C32231m;
import com.p2082ss.android.ugc.aweme.account.login.twostep.C32293v;
import com.p2082ss.android.ugc.aweme.account.login.twostep.C32294w;
import com.p2082ss.android.ugc.aweme.account.login.twostep.TwoStepAuthActivity;
import com.p2082ss.android.ugc.aweme.account.p2248g.C31672b;
import com.p2082ss.android.ugc.aweme.account.p2273m.C32837b;
import com.p2082ss.android.ugc.aweme.account.util.C33036f;
import com.p2082ss.android.ugc.aweme.account.util.C33039i;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Map;
import org.json.JSONObject;
import p077b.C1731i;
import p077b.C1743j;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.services.interceptor.TwoStepAuthenticationInterceptor */
public final class TwoStepAuthenticationInterceptor implements IInterceptor {
    private Integer currentErrorCode;
    public String currentUrlPath;

    /* renamed from: com.ss.android.ugc.aweme.services.interceptor.TwoStepAuthenticationInterceptor$WhenMappings */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            Covode.recordClassIndex(79895);
            int[] iArr = new int[EnumC32594j.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[EnumC32594j.TWO_STEP_EMAIL_PASSWORD_VERIFY_SMS_2SV.ordinal()] = 1;
            iArr[EnumC32594j.TWO_STEP_EMAIL_PASSWORD_VERIFY_EMAIL_CODE_2SV.ordinal()] = 2;
            iArr[EnumC32594j.TWO_STEP_PHONE_VERIFY_EMAIL_CODE_2SV.ordinal()] = 3;
            iArr[EnumC32594j.TWO_STEP_PHONE_VERIFY_PASSWORD_2SV.ordinal()] = 4;
            iArr[EnumC32594j.PUSH_VERIFY.ordinal()] = 5;
        }
    }

    static {
        Covode.recordClassIndex(79894);
    }

    /* renamed from: com_ss_android_ugc_aweme_services_interceptor_TwoStepAuthenticationInterceptor_com_ss_android_ugc_aweme_lancet_LogLancet_d */
    public static int m120122x8ddd7cad(String str, String str2) {
        return 0;
    }

    /* renamed from: com_ss_android_ugc_aweme_services_interceptor_TwoStepAuthenticationInterceptor_com_ss_android_ugc_aweme_lancet_LogLancet_e */
    public static int m120123x8ddd7cae(String str, String str2, Throwable th) {
        return 0;
    }

    private final String getPathFromUrl(String str) {
        String str2 = null;
        try {
            str2 = new URI(str).getPath();
            return str2;
        } catch (NullPointerException e) {
            if (!TwoStepAuthenticationInterceptorKt.DEBUG) {
                return str2;
            }
            m120123x8ddd7cae("I18n.TwoStepInterceptor", "", e);
            return str2;
        } catch (URISyntaxException e2) {
            if (!TwoStepAuthenticationInterceptorKt.DEBUG) {
                return str2;
            }
            m120123x8ddd7cae("I18n.TwoStepInterceptor", "", e2);
            return str2;
        }
    }

    public final void register(C1743j<C31672b> jVar) {
        MethodCollector.m26663i(13107);
        C89219l.m154721d(jVar, "");
        C32231m a = C32231m.m66598a();
        TwoStepAuthenticationInterceptor$register$1 twoStepAuthenticationInterceptor$register$1 = new TwoStepAuthenticationInterceptor$register$1(jVar);
        synchronized (C32231m.f76903a) {
            try {
                a.f76905b = twoStepAuthenticationInterceptor$register$1;
            } finally {
                MethodCollector.m26664o(13107);
            }
        }
    }

    /* renamed from: com_ss_android_ugc_aweme_services_interceptor_TwoStepAuthenticationInterceptor_com_ss_android_ugc_tiktok_security_lancet_ContextLancet_startActivity */
    public static void m120124x6cd279a7(Context context, Intent intent) {
        C84349a.m145093a(intent, context);
        context.startActivity(intent);
    }

    private final Integer getAuthType(Integer num, String str) {
        String optString;
        if (num != null && num.intValue() == 2020) {
            return 2;
        }
        if (num != null && num.intValue() == 2032) {
            return 1;
        }
        if (num != null && num.intValue() == 2033) {
            return 4;
        }
        if (num != null) {
            if (num.intValue() == 2025) {
                return 3;
            }
            if (num.intValue() == 2031) {
                return 5;
            }
            if (num.intValue() == 2067) {
                return 6;
            }
        }
        if (num != null && num.intValue() == 2046) {
            if (str == null) {
                str = "";
            }
            JSONObject optJSONObject = new JSONObject(str).optJSONObject("data");
            if (!(optJSONObject == null || (optString = optJSONObject.optString("default_verify_way")) == null)) {
                switch (optString.hashCode()) {
                    case -797498437:
                        if (optString.equals("pwd_verify")) {
                            return 2;
                        }
                        break;
                    case 300626556:
                        if (optString.equals("email_verify")) {
                            return 4;
                        }
                        break;
                    case 312290780:
                        if (optString.equals("mobile_sms_verify")) {
                            return 1;
                        }
                        break;
                    case 961294113:
                        if (optString.equals("oauth_verify")) {
                            return 3;
                        }
                        break;
                }
            }
        }
        return null;
    }

    public final String getPlatForm(String str, Map<String, String> map, EnumC32594j jVar) {
        if (TextUtils.isEmpty(str)) {
            return "unknown";
        }
        if (str == null) {
            C89219l.m154715b();
        }
        if (C89361p.m154908a((CharSequence) str, (CharSequence) "/password/reset_by_ticket", false) || C89361p.m154908a((CharSequence) str, (CharSequence) "/password/reset_by_email_ticket", false)) {
            return "forgot_password";
        }
        if (C89361p.m154908a((CharSequence) str, (CharSequence) "/password/forced_reset_by_mobile_ticket", false)) {
            return "force_password_reset";
        }
        if (C89361p.m154908a((CharSequence) str, (CharSequence) "/passport/auth/login_only", false)) {
            if (map == null) {
                C89219l.m154715b();
            }
            String str2 = map.get("platform");
            if (str2 == null) {
                return "";
            }
            return str2;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[jVar.ordinal()];
        if (i == 1 || i == 2) {
            if (map == null || map.isEmpty()) {
                return "email";
            }
            if (map.containsKey("mobile")) {
                return "phone";
            }
            if (map.containsKey("email")) {
                return "email";
            }
            if (map.containsKey("username")) {
                return "handle";
            }
            if (map.containsKey("not_login_ticket")) {
                return "ticket";
            }
            return "unknown";
        } else if (i == 3 || i == 4) {
            return "sms_verification";
        } else {
            if (i != 5) {
                return str;
            }
            if (C89361p.m154908a((CharSequence) str, (CharSequence) "sms", false)) {
                return "sms_verification";
            }
            if (!C89361p.m154908a((CharSequence) str, (CharSequence) "user/login", false)) {
                return str;
            }
            if (map != null && !map.isEmpty()) {
                if (map.containsKey("email")) {
                    return "email";
                }
                if (map.containsKey("username")) {
                    return "username";
                }
            }
            return "unknown";
        }
    }

    public final C1731i<C31672b> authFor2067(Context context, C1743j<C31672b> jVar, String str, Map<String, String> map) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(jVar, "");
        if (!(context instanceof Activity)) {
            jVar.mo5556b(new Exception("context is not Activity"));
            return jVar.f5610a;
        }
        register(jVar);
        C32294w wVar = (C32294w) C33039i.m67674a(new JSONObject(str).optString("data"), C32294w.class);
        C32369ae.m66734a(wVar.getVerify_ticket(), "").mo143190a(new TwoStepAuthenticationInterceptor$authFor2067$1(this, context, wVar, map), new TwoStepAuthenticationInterceptor$authFor2067$2(wVar));
        return jVar.f5610a;
    }

    private final C1731i<C31672b> startTwoStepAuthentication(Context context, String str, String str2, Map<String, String> map) {
        if (TwoStepAuthenticationInterceptorKt.DEBUG) {
            m120122x8ddd7cad("I18n.TwoStepInterceptor", "Starting 2-step auth, context: " + context + ", response: " + str2);
        }
        C1743j<C31672b> jVar = new C1743j<>();
        if (context == null || str2 == null) {
            jVar.mo5556b(new Exception("Activity or response is null, activity: " + context + ", response: " + str2));
            return jVar.f5610a;
        }
        Integer authType = getAuthType(this.currentErrorCode, str2);
        if (TwoStepAuthenticationInterceptorKt.DEBUG) {
            m120122x8ddd7cad("I18n.TwoStepInterceptor", "Starting 2-step auth with type: ".concat(String.valueOf(authType)));
        }
        if (authType == null) {
            jVar.mo5556b(new Exception("Failed to parse error code from JSON response: ".concat(String.valueOf(str2))));
            return jVar.f5610a;
        }
        this.currentUrlPath = getPathFromUrl(str);
        Integer num = this.currentErrorCode;
        if (num != null && num.intValue() == 2046) {
            return authFor2046(context, jVar, str2, map, authType);
        }
        Integer num2 = this.currentErrorCode;
        if (num2 != null && num2.intValue() == 2067) {
            return authFor2067(context, jVar, str2, map);
        }
        register(jVar);
        Intent intent = new Intent(context, TwoStepAuthActivity.class);
        intent.putExtra("auth_type", authType.intValue());
        intent.putExtra("auth_data", str2);
        intent.putExtra("url_path", this.currentUrlPath);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        m120124x6cd279a7(context, intent);
        return jVar.f5610a;
    }

    private final C1731i<C31672b> authFor2046(Context context, C1743j<C31672b> jVar, String str, Map<String, String> map, Integer num) {
        boolean z;
        String optString;
        if (!(context instanceof Activity)) {
            jVar.mo5556b(new Exception("context is not Activity"));
            return jVar.f5610a;
        }
        register(jVar);
        C32293v vVar = (C32293v) C33039i.m67674a(new JSONObject(str).optString("data"), C32293v.class);
        JSONObject optJSONObject = new JSONObject(str).optJSONObject("data");
        if (optJSONObject == null || (optString = optJSONObject.optString("profile_key")) == null || C89361p.m154870a((CharSequence) optString)) {
            z = true;
        } else {
            z = false;
        }
        ((Activity) context).runOnUiThread(new TwoStepAuthenticationInterceptor$authFor2046$1(this, map, num, !z, context, vVar, str));
        return jVar.f5610a;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.interceptor.IInterceptor
    public final Map<String, String> tryToIntercept(String str, Request request, String str2, int i, Map<String, String> map) {
        String str3;
        C0484a aVar = new C0484a();
        Context j = C17873f.m33102j();
        if (j == null) {
            j = C17867d.m33078a();
        }
        this.currentErrorCode = Integer.valueOf(i);
        C1731i<C31672b> startTwoStepAuthentication = startTwoStepAuthentication(j, str, str2, map);
        if (startTwoStepAuthentication == null) {
            return aVar;
        }
        startTwoStepAuthentication.mo5547f();
        C31672b d = startTwoStepAuthentication.mo5545d();
        if (TwoStepAuthenticationInterceptorKt.DEBUG) {
            StringBuilder append = new StringBuilder("interceptAndGetNewParams, 2-step auth result: ").append(d);
            if (d != null) {
                str3 = "ticket: " + d.f75744a + ", profileKey: " + d.f75745b + ", errorCode: " + d.f75746c + ", errorMessage: " + d.f75747d;
            } else {
                str3 = null;
            }
            m120122x8ddd7cad("I18n.TwoStepInterceptor", append.append(str3).toString());
        }
        if (d == null || TextUtils.isEmpty(d.f75744a)) {
            return aVar;
        }
        if (!TextUtils.isEmpty(d.f75745b)) {
            aVar.put("profile_key", d.f75745b);
        }
        aVar.put("verify_ticket", d.f75744a);
        if (!TextUtils.isEmpty(d.f75748e)) {
            aVar.put("sms_code_key", C33036f.m67670a(d.f75748e));
        }
        JSONObject a = new C33743c().mo59976a("url_path", this.currentUrlPath).mo59974a("error_code", this.currentErrorCode).mo59977a();
        C89219l.m154716b(a, "");
        C32837b.m67403a("two_step_auth", 0, a);
        return aVar;
    }
}
