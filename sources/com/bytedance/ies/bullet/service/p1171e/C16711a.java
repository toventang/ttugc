package com.bytedance.ies.bullet.service.p1171e;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.base.AbstractC16654o;
import com.bytedance.ies.bullet.service.base.C16607an;
import com.bytedance.ies.bullet.service.base.p1164b.C16622e;
import com.bytedance.ies.bullet.service.base.p1168e.C16638b;
import com.bytedance.ies.bullet.service.p1161a.AbstractC16559e;
import com.kakao.usermgmt.StringSet;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.bullet.service.e.a */
public final class C16711a {

    /* renamed from: a */
    public static final C16711a f39897a = new C16711a();

    private C16711a() {
    }

    static {
        Covode.recordClassIndex(19151);
    }

    /* renamed from: a */
    public static /* synthetic */ void m31019a(String str, Uri uri, String str2, String str3, String str4, long j, int i) {
        Uri uri2 = uri;
        String str5 = str;
        if ((i & 1) != 0) {
            str5 = "default_bid";
        }
        if ((i & 4) != 0) {
            uri2 = null;
        }
        if ((i & 32) != 0) {
            str4 = null;
        }
        C89219l.m154719c(str5, "");
        C89219l.m154719c(str2, "");
        C89219l.m154719c(str3, "");
        Uri uri3 = Uri.EMPTY;
        C89219l.m154709a((Object) uri3, "");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("schema", "unknown");
        jSONObject.put(StringSet.type, str2);
        jSONObject.put("status", str3);
        if (str4 != null) {
            jSONObject.put("error_message", str4);
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("duration", j);
        m31020a(str5, "bdx_monitor_router_close", uri3, uri2, jSONObject, jSONObject2, (String) null);
    }

    /* renamed from: a */
    private static void m31020a(String str, String str2, Uri uri, Uri uri2, JSONObject jSONObject, JSONObject jSONObject2, String str3) {
        AbstractC16654o oVar = (AbstractC16654o) C16622e.C16623a.m30858a().mo26347a(str, AbstractC16654o.class);
        if (oVar != null) {
            Boolean bool = null;
            C16607an anVar = new C16607an(str2, null, null, 254);
            if (!(str3 == null || str3.length() == 0)) {
                AbstractC16559e<String, Object> b = C16622e.C16623a.m30858a().mo26341b(str3);
                if (b != null) {
                    bool = b.getBoolean("res_memory");
                }
                jSONObject.put("res_memory", C89219l.m154714a(bool, true) ? 1 : 0);
            }
            anVar.f39742g = jSONObject;
            anVar.f39743h = jSONObject2;
            if (uri2 == null) {
                anVar.f39740e = uri.toString();
            } else {
                anVar.f39738c = new C16638b(uri2);
            }
            oVar.mo26319a(anVar);
        }
    }

    /* renamed from: a */
    public static void m31017a(String str, Uri uri, Uri uri2, String str2, String str3, String str4, long j, Long l, String str5) {
        Uri uri3;
        String str6;
        C89219l.m154719c(str, "");
        C89219l.m154719c(str2, "");
        C89219l.m154719c(str3, "");
        C89219l.m154719c(str5, "");
        if (uri == null) {
            uri3 = Uri.EMPTY;
            C89219l.m154709a((Object) uri3, "");
        } else {
            uri3 = uri;
        }
        JSONObject jSONObject = new JSONObject();
        if (uri == null || (str6 = uri.toString()) == null) {
            str6 = "unknown";
        }
        jSONObject.put("schema", str6);
        jSONObject.put(StringSet.type, str2);
        jSONObject.put("status", str3);
        if (str4 != null) {
            jSONObject.put("error_message", str4);
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("duration", j);
        if (l != null) {
            jSONObject2.put("bullet_duration", l.longValue());
        }
        m31020a(str, "bdx_monitor_router_open", uri3, uri2, jSONObject, jSONObject2, str5);
    }
}
