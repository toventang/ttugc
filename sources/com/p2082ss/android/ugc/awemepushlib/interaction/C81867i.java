package com.p2082ss.android.ugc.awemepushlib.interaction;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.statisticlogger.C18205a;
import com.p2082ss.android.common.applog.AppLog;
import com.p2082ss.android.ugc.aweme.AccountService;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.C34611o;
import com.p2082ss.android.ugc.aweme.common.C39161q;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.awemepushlib.p4247c.C81822a;
import com.p2082ss.android.ugc.awemepushlib.p4247c.C81823b;
import com.p2082ss.android.ugc.awemepushlib.p4251f.C81832a;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.awemepushlib.interaction.i */
public final class C81867i {
    static {
        Covode.recordClassIndex(95281);
    }

    /* renamed from: a */
    public static boolean m141781a() {
        if (C13627m.m24498a(AppLog.getClientId()) || C13627m.m24498a(C18205a.m33878a())) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static void m141778a(C81823b bVar, int i) {
        int i2;
        JSONObject jSONObject = new JSONObject(C81822a.m141702a(bVar, i, C81832a.m141716a()));
        try {
            jSONObject.put("real_receive_time", System.currentTimeMillis());
            if (AccountService.m65215a().mo57069e().isChildrenMode()) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            jSONObject.put("is_push_enabled", i2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        C39162r.m79461a("push_receive", jSONObject);
    }

    /* renamed from: a */
    public static void m141780a(String str, boolean z) {
        String str2;
        if (!TextUtils.isEmpty(str)) {
            Uri parse = Uri.parse(str);
            if (TextUtils.equals(parse.getQueryParameter("gd_label"), "click_push_user")) {
                C39162r.m79460a("follow_recommend", new C33744d().mo59983a("enter_from", "push_out_app").mo59983a("scene_type", "push").mo59983a("action_type", "show").mo59983a("to_user_id", parse.getQueryParameter("to_user_id")).mo59983a("rule_id", parse.getQueryParameter("rule_id")).mo59983a("rec_type", parse.getQueryParameter("rec_type")).mo59983a("follow_type", parse.getQueryParameter("follow_type")).mo59983a("relation_type", parse.getQueryParameter("relation_type")).f79943a);
            }
            String host = parse.getHost();
            List<String> pathSegments = parse.getPathSegments();
            Set<String> queryParameterNames = parse.getQueryParameterNames();
            StringBuilder sb = new StringBuilder("//");
            sb.append(host);
            for (String str3 : pathSegments) {
                if (!TextUtils.isEmpty(str3)) {
                    sb.append("/");
                    try {
                        Long.parseLong(str3);
                        sb.append("xxx");
                    } catch (NumberFormatException unused) {
                        sb.append(str3);
                    }
                }
            }
            if (queryParameterNames != null && !queryParameterNames.isEmpty()) {
                sb.append("?");
                Iterator<String> it = queryParameterNames.iterator();
                while (it.hasNext()) {
                    sb.append(it.next());
                    if (it.hasNext()) {
                        sb.append("&");
                    }
                }
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("open_url", sb.toString());
                if (z) {
                    str2 = "1";
                } else {
                    str2 = "0";
                }
                jSONObject.put("is_push", str2);
                C34611o.m70671b("deep_link_collect", "", jSONObject);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public static void m141779a(C81823b bVar, boolean z, int i) {
        String str;
        String str2;
        Map<String, String> a = C81822a.m141702a(bVar, i, C81832a.m141716a());
        String str3 = "1";
        if (z) {
            str = str3;
        } else {
            str = "0";
        }
        a.put("has_image", str);
        if (bVar.extra.style == 5) {
            str2 = str3;
        } else {
            str2 = "0";
        }
        a.put("mediastyle", str2);
        if (TextUtils.isEmpty(bVar.extra.bg_color)) {
            str3 = "0";
        }
        a.put("colorized", str3);
        C39162r.m79461a("push_show", new JSONObject(a));
    }

    /* renamed from: a */
    public static void m141777a(Context context, String str, long j, long j2, JSONObject... jSONObjectArr) {
        if (jSONObjectArr.length > 0) {
            C39161q.m79449a(context, "apn", str, j, j2, jSONObjectArr[0]);
        } else {
            C39161q.m79448a(context, "apn", str, j, j2);
        }
    }
}
