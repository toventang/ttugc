package com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2269a;

import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.bytedance.sdk.p1625a.p1663n.C22507a;
import com.google.i18n.phonenumbers.NumberParseException;
import com.google.i18n.phonenumbers.PhoneNumberUtil;
import com.google.i18n.phonenumbers.Phonenumber;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32584f;
import com.p2082ss.android.ugc.aweme.account.p2233a.p2235b.C31376a;
import com.p2082ss.android.ugc.aweme.account.p2252k.C31717c;
import com.p2082ss.android.ugc.aweme.app.services.HybridABInfoService;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.p4173ug.C79679i;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import p4600h.p4611f.p4613b.C89206ad;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.v */
public final class C32404v {

    /* renamed from: a */
    public static final C32404v f77257a = new C32404v();

    private C32404v() {
    }

    /* renamed from: a */
    public static void m66780a(boolean z, String str, String str2, String str3, int i) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C39162r.m79460a("set_password_response", new C31376a().mo57399a("platform", str).mo57399a("enter_from", str2).mo57399a("enter_method", str3).mo57397a("is_success", z ? 1 : 0).mo57399a("status", z ? "success" : "fail").mo57397a("error_code", i).f75156a);
    }

    /* renamed from: a */
    public static /* synthetic */ void m66770a(Boolean bool, String str, AbstractC32584f fVar, boolean z, Map map, boolean z2, int i) {
        Boolean bool2 = bool;
        boolean z3 = z2;
        boolean z4 = z;
        Map map2 = null;
        if ((i & 1) != 0) {
            bool2 = null;
        }
        if ((i & 8) != 0) {
            z4 = false;
        }
        if ((i & 16) == 0) {
            map2 = map;
        }
        if ((i & 32) != 0) {
            z3 = false;
        }
        m66769a(bool2, str, fVar, z4, map2, z3);
    }

    /* renamed from: a */
    public static /* synthetic */ void m66778a(boolean z, String str, AbstractC32584f fVar, C22507a aVar, Map map, boolean z2, int i) {
        if ((i & 16) != 0) {
            map = null;
        }
        if ((i & 32) != 0) {
            z2 = false;
        }
        m66777a(z, str, fVar, aVar, map, z2);
    }

    /* renamed from: a */
    public static void m66777a(boolean z, String str, AbstractC32584f fVar, C22507a aVar, Map<String, ? extends Object> map, boolean z2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(fVar, "");
        C31376a aVar2 = new C31376a();
        Map<String, Object> a = m66765a(fVar.ae_());
        HashMap hashMap = new HashMap();
        if (map != null) {
            hashMap.putAll(map);
        }
        if (a != null) {
            hashMap.putAll(a);
        }
        m66768a(aVar2, hashMap);
        C31376a a2 = aVar2.mo57399a("enter_method", fVar.ab_()).mo57399a("enter_from", fVar.aa_()).mo57397a("is_register", z ? 1 : 0).mo57397a("error_code", 0);
        long j = -1;
        a2.mo57398a("user_id", aVar != null ? aVar.f53210a : -1).mo57397a("gms_auto_fill", z2 ? 1 : 0);
        if (C89219l.m154714a((Object) str, (Object) "google_onetap")) {
            aVar2.mo57399a("enter_type", "google_onetap").mo57399a("platform", "google");
        } else {
            aVar2.mo57399a("enter_type", fVar.ac_()).mo57399a("platform", str);
        }
        Integer a3 = HybridABInfoService.m69246b().mo60084a();
        if (a3 != null) {
            aVar2.mo57397a("is_ab_backend_resp_received", a3.intValue());
        }
        C39162r.m79460a("login_success", aVar2.f75156a);
        String aa_ = fVar.aa_();
        String ab_ = fVar.ab_();
        String ac_ = fVar.ac_();
        if (aVar != null) {
            j = aVar.f53210a;
        }
        C79679i.C79680a.m138494a(z, str, aa_, ab_, ac_, z2, j);
    }

    /* renamed from: a */
    public static void m66774a(boolean z, int i, String str, AbstractC32584f fVar, Map<String, ? extends Object> map, boolean z2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(fVar, "");
        C31376a aVar = new C31376a();
        Map<String, Object> a = m66765a(fVar.ae_());
        HashMap hashMap = new HashMap();
        if (map != null) {
            hashMap.putAll(map);
        }
        if (a != null) {
            hashMap.putAll(a);
        }
        m66768a(aVar, hashMap);
        aVar.mo57399a("enter_method", fVar.ab_()).mo57399a("enter_from", fVar.aa_()).mo57397a("is_register", z ? 1 : 0).mo57397a("error_code", i).mo57397a("gms_auto_fill", z2 ? 1 : 0);
        if (C89219l.m154714a((Object) str, (Object) "google_onetap")) {
            aVar.mo57399a("enter_type", "google_onetap").mo57399a("platform", "google");
        } else {
            aVar.mo57399a("enter_type", fVar.ac_()).mo57399a("platform", str);
        }
        Integer a2 = HybridABInfoService.m69246b().mo60084a();
        if (a2 != null) {
            aVar.mo57397a("is_ab_backend_resp_received", a2.intValue());
        }
        C39162r.m79460a("login_failure", aVar.f75156a);
    }

    /* renamed from: a */
    public static void m66776a(boolean z, AbstractC32572b bVar) {
        C89219l.m154721d(bVar, "");
        C39162r.m79460a("verify_sms_code", new C31376a().mo57399a("enter_from", bVar.mo58466w()).mo57399a("enter_method", bVar.mo58467x()).mo57397a("status", z ? 1 : 2).f75156a);
    }

    /* renamed from: a */
    public static void m66772a(String str, String str2, int i, int i2, String str3, int i3) {
        C89219l.m154721d(str3, "");
        C39162r.m79460a("gms_login_info_save_status", new C31376a().mo57399a("platform", str).mo57399a("enter_method", str3).mo57399a("user_id", str2).mo57397a("error_code", i2).mo57397a("gms_auto_fill", i3).mo57397a("status", i).f75156a);
    }

    /* renamed from: a */
    public static /* synthetic */ void m66773a(String str, String str2, String str3) {
        C89219l.m154721d(str3, "");
        C39162r.m79460a("gms_login_info_save_notify", new C31376a().mo57399a("platform", str).mo57399a("enter_method", str3).mo57397a("gms_auto_fill", 0).mo57399a("user_id", str2).f75156a);
    }

    /* renamed from: a */
    public static void m66771a(String str) {
        C89219l.m154721d(str, "");
        C39162r.m79460a("gms_login_info_autofill_confirm", new C31376a().mo57399a("platform", str).f75156a);
    }

    static {
        Covode.recordClassIndex(39172);
    }

    /* renamed from: a */
    public static Map<String, Object> m66765a(Bundle bundle) {
        Serializable serializable;
        Map<String, Object> map = null;
        if (bundle != null) {
            serializable = bundle.getSerializable("extra_param");
        } else {
            serializable = null;
        }
        if (C89206ad.m154685g(serializable)) {
            map = serializable;
        }
        return map;
    }

    /* renamed from: a */
    private static String m66764a(Context context) {
        if (context == null) {
            return "";
        }
        try {
            Object a = m66763a(context, "phone");
            if (a != null) {
                String simOperatorName = ((TelephonyManager) a).getSimOperatorName();
                C89219l.m154716b(simOperatorName, "");
                return simOperatorName;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.telephony.TelephonyManager");
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /* renamed from: a */
    private static Object m66763a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(9627);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!C58027i.f132247b && "connectivity".equals(str)) {
                try {
                    new C21708b().mo35361a();
                    C58027i.f132247b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (C58027i.f132246a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new C58027i.HandlerC58028a((Handler) declaredField.get(obj)));
                        } catch (Exception e) {
                            C13849d.m25015a(e, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    C58027i.f132246a = false;
                } finally {
                    MethodCollector.m26664o(9627);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    /* renamed from: a */
    public static void m66768a(C31376a aVar, Map<String, ? extends Object> map) {
        if (!(map == null || map.isEmpty())) {
            for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (value instanceof Integer) {
                    aVar.mo57397a(key, ((Number) value).intValue());
                } else if (value instanceof String) {
                    aVar.mo57399a(key, (String) value);
                } else if (value instanceof Long) {
                    aVar.mo57398a(key, ((Number) value).longValue());
                } else {
                    aVar.mo57399a(key, "");
                }
            }
        }
    }

    /* renamed from: b */
    public static void m66781b(int i, String str, String str2) {
        int i2;
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C31376a a = new C31376a().mo57399a("enter_from", str).mo57399a("enter_method", str2);
        if (i == 0) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        C39162r.m79460a("email_code_login_result", a.mo57397a("is_success", i2).mo57397a("error_code", i).f75156a);
    }

    /* renamed from: a */
    public static void m66767a(int i, String str, String str2) {
        int i2;
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C31376a a = new C31376a().mo57399a("enter_from", str).mo57399a("enter_method", str2);
        if (i == 0) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        C39162r.m79460a("email_code_verification_result", a.mo57397a("is_success", i2).mo57397a("error_code", i).f75156a);
    }

    /* renamed from: b */
    public static /* synthetic */ void m66782b(boolean z, String str, String str2, String str3) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C39162r.m79460a("verify_password_response", new C31376a().mo57399a("platform", str).mo57399a("enter_from", str2).mo57399a("enter_method", str3).mo57397a("is_success", z ? 1 : 0).mo57397a("error_code", 0).f75156a);
    }

    /* renamed from: a */
    public static void m66766a(int i, String str, int i2, String str2, String str3, String str4) {
        String str5;
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C31376a a = new C31376a().mo57399a("send_method", str).mo57397a("send_reason", i2).mo57399a("send_type", str2);
        if (i == 0) {
            str5 = "success";
        } else {
            str5 = "fail";
        }
        C31376a a2 = a.mo57399a("status", str5).mo57397a("error_code", i).mo57399a("fail_info", str3).mo57399a("params_for_special", "uc_login").mo57399a("carrier", m66764a(C17867d.m33078a()));
        if (!TextUtils.isEmpty(str4)) {
            try {
                Phonenumber.PhoneNumber parse = PhoneNumberUtil.getInstance().parse(str4, null);
                C89219l.m154716b(parse, "");
                a2.mo57397a("phone_country", parse.getCountryCode());
                a2.mo57397a("phone_number_cnt", String.valueOf(parse.getNationalNumber()).length());
            } catch (NumberParseException e) {
                e.printStackTrace();
            }
        }
        C39162r.m79460a("uc_send_sms", a2.f75156a);
    }

    /* renamed from: a */
    public static void m66769a(Boolean bool, String str, AbstractC32584f fVar, boolean z, Map<String, ? extends Object> map, boolean z2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(fVar, "");
        C31376a aVar = new C31376a();
        Map<String, Object> a = m66765a(fVar.ae_());
        HashMap hashMap = new HashMap();
        if (map != null) {
            hashMap.putAll(map);
        }
        if (a != null) {
            hashMap.putAll(a);
        }
        m66768a(aVar, hashMap);
        aVar.mo57399a("enter_method", fVar.ab_()).mo57399a("enter_from", fVar.aa_()).mo57399a("log_pb", C31717c.m66045a(fVar.ae_()));
        if (C89219l.m154714a((Object) str, (Object) "google_onetap")) {
            aVar.mo57399a("enter_type", "google_onetap").mo57399a("platform", "google");
        } else {
            aVar.mo57399a("enter_type", fVar.ac_()).mo57399a("platform", str);
        }
        if (bool != null) {
            aVar.mo57397a("is_register", bool.booleanValue() ? 1 : 0);
        }
        if (z) {
            aVar.mo57399a("login_from", "reset_password");
        }
        aVar.mo57397a("gms_auto_fill", z2 ? 1 : 0);
        C39162r.m79460a("login_submit", aVar.f75156a);
    }

    /* renamed from: a */
    public static /* synthetic */ void m66775a(boolean z, int i, String str, AbstractC32584f fVar, Map map, boolean z2, int i2) {
        if ((i2 & 16) != 0) {
            map = null;
        }
        if ((i2 & 32) != 0) {
            z2 = false;
        }
        m66774a(z, i, str, fVar, map, z2);
    }
}
