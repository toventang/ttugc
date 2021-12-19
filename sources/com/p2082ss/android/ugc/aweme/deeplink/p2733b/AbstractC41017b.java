package com.p2082ss.android.ugc.aweme.deeplink.p2733b;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.aweme.app.C33796j;
import com.p2082ss.android.ugc.aweme.app.C33830n;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38693bn;
import com.p2082ss.android.ugc.aweme.deeplink.C41035d;
import com.p2082ss.android.ugc.aweme.deeplink.C41058p;
import com.p2082ss.android.ugc.aweme.deeplink.C41059q;
import com.p2082ss.android.ugc.aweme.deeplink.p2735d.C41041e;
import com.p2082ss.android.ugc.aweme.main.C59054bd;
import java.util.HashMap;
import java.util.Objects;
import org.json.JSONObject;
import p4600h.C89378p;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.deeplink.b.b */
public abstract class AbstractC41017b {

    /* renamed from: a */
    public String f95901a = "";

    /* renamed from: b */
    public boolean f95902b;

    static {
        Covode.recordClassIndex(48887);
    }

    /* renamed from: a */
    public abstract C89378p<Boolean, String> mo70236a(C41035d dVar, HashMap<String, Object> hashMap);

    /* renamed from: a */
    public final void mo70237a(String str) {
        C89219l.m154721d(str, "");
        this.f95901a = str;
    }

    /* renamed from: a */
    private static String m82631a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static void m82632a(Activity activity, Uri uri) {
        C89219l.m154721d(activity, "");
        C89219l.m154721d(uri, "");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("open_url", uri.toString());
            C33830n.m69192a("service_monitor", "no_matched_deep_link", jSONObject);
        } catch (Exception unused) {
        }
        C41041e.m82679a(uri.toString(), false, "abs intent == null");
        activity.finish();
        if (!C41059q.C41060a.m82717a()) {
            SmartRouter.buildRoute(activity, "//main").open();
        }
    }

    /* renamed from: a */
    public static void m82633a(Uri uri, C41035d dVar, HashMap<String, Object> hashMap) {
        String str;
        C89219l.m154721d(uri, "");
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(hashMap, "");
        Intent intent = dVar.f95923f;
        C41058p pVar = dVar.f95920c;
        C89219l.m154721d(dVar, "");
        Intent intent2 = dVar.f95923f;
        Uri uri2 = dVar.f95922e;
        HashMap hashMap2 = new HashMap();
        String scheme = uri2.getScheme();
        String host = uri2.getHost();
        if (!(scheme == null || host == null)) {
            String a = C41059q.C41060a.m82712a(intent2, "from_token");
            if (a == null) {
                a = "";
            }
            hashMap2.put("from_token", a);
            if (TextUtils.isEmpty(uri2.getQueryParameter("enter_from"))) {
                if (TextUtils.equals("token", C41059q.C41060a.m82712a(intent2, "enter_from"))) {
                    hashMap2.put("enter_from", "token");
                } else {
                    Object obj = dVar.f95919b.get("is_from_notification");
                    if (obj != null) {
                        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Boolean");
                        if (((Boolean) obj).booleanValue()) {
                            str = "push";
                            hashMap2.put("enter_from", str);
                        }
                    }
                    str = "deeplink";
                    hashMap2.put("enter_from", str);
                }
            }
            if (intent2 != null) {
                if (!C41059q.C41060a.m82717a() && !intent2.hasExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB")) {
                    String a2 = C59054bd.C59055a.m108537a(uri2.getQueryParameter("tab_index"));
                    if ((!C89219l.m154714a((Object) "aweme", (Object) host) || !C89219l.m154714a((Object) "click_push_newvideo", (Object) uri2.getQueryParameter("gd_label")) || !TextUtils.equals(a2, "DISCOVER")) && !TextUtils.isEmpty(a2)) {
                        hashMap2.put("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", a2);
                    }
                    hashMap2.put("is_from_push", true);
                }
                if (uri2.getQueryParameter("backurl") != null) {
                    hashMap2.put("backurl", "backUrl");
                }
            }
            C33796j a3 = C33796j.m69147a();
            C89219l.m154716b(a3, "");
            a3.f80040a = false;
            C38693bn.m78504a(uri2, intent2);
            String queryParameter = uri2.getQueryParameter("gd_label");
            if (queryParameter != null && C89361p.m154874b(queryParameter, "click_wap", false)) {
                hashMap2.put("ads_app_activity_by_wap_click", true);
            }
            hashMap.putAll(hashMap2);
        }
        Object obj2 = dVar.f95919b.get("is_from_notification");
        if (obj2 != null) {
            C89219l.m154716b(obj2, "");
            hashMap.put("from_notification", obj2);
        }
        Object obj3 = dVar.f95919b.get("notification_id");
        if (obj3 != null) {
            C89219l.m154716b(obj3, "");
            hashMap.put("from_notification_uuid", obj3);
        }
        Object obj4 = dVar.f95919b.get("rule_id");
        if (obj4 != null) {
            C89219l.m154716b(obj4, "");
            hashMap.put("rule_id", obj4);
        }
        if (m82631a(intent, "share_url_user_id") != null) {
            String a4 = m82631a(intent, "share_url_user_id");
            if (a4 == null) {
                a4 = "";
            }
            pVar.mo70270f(a4);
        } else if (m82631a(intent, "share_sec_url_user_id") != null) {
            String a5 = m82631a(intent, "share_sec_url_user_id");
            if (a5 == null) {
                a5 = "";
            }
            pVar.mo70270f(a5);
        }
        if (m82631a(intent, "share_url_link_id") != null) {
            String a6 = m82631a(intent, "share_url_link_id");
            if (a6 == null) {
                a6 = "";
            }
            pVar.mo70271g(a6);
        }
        ComponentName component = intent.getComponent();
        if (component == null) {
            C89219l.m154715b();
        }
        C89219l.m154716b(component, "");
        String className = component.getClassName();
        C89219l.m154716b(className, "");
        C41059q.C41060a.m82716a(uri, className);
    }
}
