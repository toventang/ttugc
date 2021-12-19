package com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3171b;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.p025c.C0484a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17420a;
import com.bytedance.p1399im.core.p1408d.C19538ai;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.MobClick;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.C53709a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.group.p3198a.p3199a.C55339a;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.b.b */
public class C55059b {

    /* renamed from: a */
    public static C53709a f126007a;

    /* renamed from: b */
    public static String f126008b;

    /* renamed from: c */
    public static Map<String, String> f126009c;

    /* renamed from: d */
    private static volatile C55059b f126010d;

    static {
        Covode.recordClassIndex(64787);
    }

    private C55059b() {
    }

    /* renamed from: a */
    public static C55059b m100685a() {
        MethodCollector.m26663i(4112);
        if (f126010d == null) {
            synchronized (C55059b.class) {
                try {
                    if (f126010d == null) {
                        f126010d = new C55059b();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(4112);
                    throw th;
                }
            }
        }
        C55059b bVar = f126010d;
        MethodCollector.m26664o(4112);
        return bVar;
    }

    /* renamed from: a */
    public static void m100688a(String str) {
        f126008b = str;
        if (TextUtils.isEmpty(str)) {
            f126008b = "";
        }
    }

    /* renamed from: b */
    public static void m100693b(String str) {
        C0484a aVar = new C0484a();
        aVar.put("action_type", str);
        C39162r.m79460a("search_contact", aVar);
    }

    /* renamed from: c */
    public static void m100696c(String str) {
        C0484a aVar = new C0484a();
        aVar.put("chat_type", str);
        C39162r.m79460a("inner_push_alert_show", aVar);
    }

    /* renamed from: d */
    public static void m100698d(String str) {
        C0484a aVar = new C0484a();
        aVar.put("action_type", str);
        C39162r.m79460a("im_official_alert", aVar);
    }

    /* renamed from: a */
    public static int m100684a(C19538ai aiVar) {
        if (aiVar == null) {
            return 0;
        }
        return C55339a.m101155d(AbstractC17420a.C17421a.m32276a().mo27720a(aiVar.getConversationId()));
    }

    /* renamed from: b */
    public static void m100694b(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            if (f126009c == null) {
                f126009c = new ConcurrentHashMap();
            }
            if (str2 == null) {
                str2 = "";
            }
            f126009c.put(str, str2);
        }
    }

    /* renamed from: c */
    public static void m100697c(String str, String str2) {
        C0484a aVar = new C0484a();
        aVar.put("chat_type", str2);
        aVar.put("conversation_id", str);
        C39162r.m79460a("chat_report_click", aVar);
    }

    /* renamed from: d */
    public static void m100699d(String str, String str2) {
        C39162r.m79460a("click_report", new C33744d().mo59983a("author_id", str).mo59983a("object_type", "im").mo59983a("enter_method", str2).mo59983a("enter_from", "chat").f79943a);
    }

    /* renamed from: a */
    public static String m100686a(String str, String str2) {
        Map<String, String> map;
        String str3;
        if (str2 == null) {
            str2 = "";
        }
        return (TextUtils.isEmpty(str) || (map = f126009c) == null || (str3 = map.get(str)) == null) ? str2 : str3;
    }

    /* renamed from: a */
    public static void m100687a(SharePackage sharePackage, String str) {
        Bundle bundle = sharePackage.f155492i;
        String string = bundle.getString("previous_page");
        String string2 = bundle.getString("enter_from");
        C0484a aVar = new C0484a();
        aVar.put("enter_method", str);
        aVar.put("enter_from", string2);
        aVar.put("previous_page", string);
        C39162r.m79460a("enter_more_friend_list", aVar);
    }

    /* renamed from: a */
    public static void m100690a(String str, String str2, String str3) {
        JSONObject jSONObject;
        if (!TextUtils.isEmpty(str3)) {
            jSONObject = new JSONObject();
            try {
                jSONObject.put("enter_from", str3);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        } else {
            jSONObject = null;
        }
        C39162r.onEvent(MobClick.obtain().setEventName("block").setLabelName(str).setValue(str2).setJsonObject(jSONObject));
    }

    /* renamed from: a */
    public static void m100692a(String str, boolean z, String str2) {
        String str3;
        if (!TextUtils.isEmpty(str)) {
            C33744d a = new C33744d().mo59983a("enter_from", "chat").mo59983a("live_event_id", str);
            if (z) {
                str3 = "0";
            } else {
                str3 = "1";
            }
            C39162r.m79460a("livesdk_live_event_card", a.mo59983a("is_free_event", str3).mo59980a("live_event_cnt", 1).mo59983a("action_type", str2).f79943a);
        }
    }

    /* renamed from: b */
    public static void m100695b(String str, String str2, String str3, String str4) {
        C0484a aVar = new C0484a();
        aVar.put("conversation_id", str);
        aVar.put("chat_type", str2);
        aVar.put("to_status", str3);
        C39162r.m79460a(str4, aVar);
    }

    /* renamed from: a */
    public static void m100691a(String str, String str2, String str3, String str4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("enter_from", "chat");
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("group_id", str2);
            }
            jSONObject.put("enter_method", str4);
            jSONObject.put("user_type", str3);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        C39162r.onEvent(MobClick.obtain().setEventName("enter_detail").setLabelName("personal_homepage").setValue(str).setJsonObject(jSONObject));
    }

    /* renamed from: a */
    public static void m100689a(String str, String str2, int i, String str3, int i2) {
        C0484a aVar = new C0484a();
        aVar.put("enter_from", str);
        aVar.put("user_type", str2);
        aVar.put("action_type", String.valueOf(i));
        if (i == 1) {
            aVar.put("to_status", str3);
        }
        aVar.put("times", String.valueOf(i2));
        C39162r.m79460a("click_dm_permission_pop_up", aVar);
    }
}
