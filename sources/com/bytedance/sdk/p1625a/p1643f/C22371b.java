package com.bytedance.sdk.p1625a.p1643f;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.p1625a.p1626a.p1627a.C22292e;
import com.bytedance.sdk.p1625a.p1641d.C22355a;
import com.bytedance.sdk.p1625a.p1645h.p1646a.AbstractC22414i;
import com.bytedance.sdk.p1625a.p1645h.p1646a.C22415j;
import com.bytedance.sdk.p1625a.p1645h.p1646a.C22419n;
import com.bytedance.sdk.p1625a.p1662m.C22496a;
import com.bytedance.sdk.p1625a.p1662m.C22497b;
import com.bytedance.sdk.p1625a.p1662m.C22504f;
import com.bytedance.sdk.p1625a.p1663n.C22507a;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.account.C29346c;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.a.f.b */
public final class C22371b {
    static {
        Covode.recordClassIndex(26187);
    }

    /* renamed from: com.bytedance.sdk.a.f.b$a */
    public static class C22372a {

        /* renamed from: a */
        private static C29346c.C29347a f52854a = new C29346c.C29347a();

        static {
            Covode.recordClassIndex(26188);
        }

        /* renamed from: a */
        public static void m42133a(JSONObject jSONObject, C22504f fVar) {
            fVar.f53204b = C29346c.C29347a.m58778a(jSONObject);
        }

        /* renamed from: a */
        public static C22507a m42131a(JSONObject jSONObject, JSONObject jSONObject2) {
            C29346c cVar = new C29346c(jSONObject, jSONObject2);
            cVar.mo36780a();
            return cVar;
        }

        /* renamed from: a */
        public static C22292e m42130a(C22504f fVar, boolean z) {
            C22292e eVar = new C22292e(z, 0);
            eVar.f52715d = fVar.f53181g;
            eVar.f52717f = fVar.f53182h;
            eVar.f52725k = fVar.f53206d;
            eVar.f52726l = fVar.f53207e;
            eVar.f52727m = fVar.f53208f;
            eVar.f52724j = fVar.f53204b;
            return eVar;
        }

        /* renamed from: a */
        public static void m42132a(C22504f fVar, JSONObject jSONObject) {
            if (jSONObject != null) {
                if (jSONObject.has("error_code")) {
                    fVar.f53181g = jSONObject.optInt("error_code", fVar.f53181g);
                } else if (jSONObject.has("code")) {
                    fVar.f53181g = jSONObject.optInt("code", fVar.f53181g);
                }
                fVar.f53182h = jSONObject.optString("description");
                String optString = jSONObject.optString(StringSet.name);
                if ("connect_switch".equals(optString) || "connect_exist".equals(optString)) {
                    fVar.f53206d = jSONObject.optString("description");
                    fVar.f53207e = jSONObject.optString("dialog_tips");
                    fVar.f53208f = jSONObject.optString("auth_token");
                }
                if (fVar.f53181g == 1075) {
                    fVar.f53187m = jSONObject.optLong("apply_time");
                    fVar.f53190p = jSONObject.optString("avatar_url");
                    fVar.f53189o = jSONObject.optString("nick_name");
                    fVar.f53186l = jSONObject.optString("token");
                    fVar.f53188n = jSONObject.optLong("cancel_time");
                }
                if (fVar.f53181g == 1041) {
                    fVar.f53191q = new C22497b();
                    C22497b bVar = fVar.f53191q;
                    bVar.f53192a = jSONObject.optString("screen_name");
                    bVar.f53193b = jSONObject.optString("avatar_url");
                    bVar.f53194c = jSONObject.optString("last_login_time");
                    bVar.f53195d = jSONObject.optString("mobile");
                    bVar.f53196e = jSONObject.optString("platform_screen_name_current");
                    bVar.f53197f = jSONObject.optString("platform_screen_name_conflict");
                }
            }
        }
    }

    /* renamed from: a */
    public static void m42128a(AbstractC22414i iVar, JSONObject jSONObject) {
        if (jSONObject.has("error_code")) {
            iVar.f53003h = jSONObject.optInt("error_code", iVar.f53003h);
        } else if (jSONObject.has("code")) {
            iVar.f53003h = jSONObject.optInt("code", iVar.f53003h);
        }
        iVar.f53005j = jSONObject.optString("description");
        if (iVar instanceof AbstractC22414i) {
            iVar.f53006k = jSONObject.optString("captcha");
            iVar.f53007l = jSONObject.optString("alert_text");
        }
        if (iVar.f53003h == 1001 && (iVar instanceof C22419n)) {
            ((C22419n) iVar).f53035c = jSONObject.optString("dialog_tips");
        }
        if (iVar.f53003h == 1057 && (iVar instanceof C22419n)) {
            C22419n nVar = (C22419n) iVar;
            nVar.f53035c = jSONObject.optString("dialog_tips");
            nVar.f53036d = jSONObject.optString("next_url");
        }
        if (iVar.f53003h == 1057 && (iVar instanceof C22415j)) {
            C22415j jVar = (C22415j) iVar;
            jVar.f53016b = jSONObject.optString("dialog_tips");
            jVar.f53017c = jSONObject.optString("next_url");
        }
        if (iVar.f53003h == 1075) {
            iVar.f53010o = jSONObject.optLong("apply_time");
            iVar.f53013r = jSONObject.optString("avatar_url");
            iVar.f53012q = jSONObject.optString("nick_name");
            iVar.f53009n = jSONObject.optString("token");
            iVar.f53011p = jSONObject.optLong("cancel_time");
        }
    }

    /* renamed from: a */
    public static void m42129a(C22496a aVar, JSONObject jSONObject) {
        if (jSONObject.has("error_code")) {
            aVar.f53181g = jSONObject.optInt("error_code", aVar.f53181g);
        } else if (jSONObject.has("code")) {
            aVar.f53181g = jSONObject.optInt("code", aVar.f53181g);
        }
        aVar.f53182h = jSONObject.optString("description");
        if (aVar.f53181g == 1075) {
            aVar.f53187m = jSONObject.optLong("apply_time");
            aVar.f53190p = jSONObject.optString("avatar_url");
            aVar.f53189o = jSONObject.optString("nick_name");
            aVar.f53186l = jSONObject.optString("token");
            aVar.f53188n = jSONObject.optLong("cancel_time");
        }
    }

    /* renamed from: a */
    public static C22355a.C22356a m42127a(String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
        C22355a.C22356a aVar = new C22355a.C22356a();
        if (!TextUtils.isEmpty(str)) {
            aVar.mo36706a("platform", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            aVar.mo36706a("access_token", str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            aVar.mo36706a("expires_in", str3);
        }
        if (!TextUtils.isEmpty(str4)) {
            aVar.mo36706a("code", str4);
        }
        if (!TextUtils.isEmpty(null)) {
            aVar.mo36706a("profile_key", (String) null);
        }
        if (!TextUtils.isEmpty(str5)) {
            aVar.mo36706a("platform_app_id", str5);
        }
        if (map != null && !map.isEmpty()) {
            for (String str6 : map.keySet()) {
                if (!TextUtils.isEmpty(str6)) {
                    aVar.mo36706a(str6, map.get(str6));
                }
            }
        }
        return aVar;
    }
}
