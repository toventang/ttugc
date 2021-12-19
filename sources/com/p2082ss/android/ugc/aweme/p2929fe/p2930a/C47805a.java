package com.p2082ss.android.ugc.aweme.p2929fe.p2930a;

import android.app.Activity;
import android.content.Context;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.common.util.C29844g;
import com.p2082ss.android.newmedia.p2164b.C30125a;
import com.p2082ss.android.ugc.aweme.activity.C33067a;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.fe.a.a */
public final class C47805a {
    static {
        Covode.recordClassIndex(56431);
    }

    /* renamed from: a */
    public static void m90818a(Context context, JSONObject jSONObject) {
        try {
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                if (activity != null) {
                    if (C33067a.m67726a(activity, true)) {
                        String optString = jSONObject.optString(StringSet.type);
                        if (!C13627m.m24498a(optString) && optString.indexOf(58) < 0) {
                            C29844g gVar = new C29844g("sslocal://".concat(String.valueOf(optString)));
                            m90819a(jSONObject.optJSONObject("args"), gVar);
                            C30125a.m60938b(activity, gVar.mo52126a());
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    private static void m90819a(JSONObject jSONObject, C29844g gVar) {
        if (jSONObject != null && jSONObject.length() > 0) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object obj = jSONObject.get(next);
                if (obj instanceof Integer) {
                    gVar.mo52128a(next, ((Integer) obj).intValue());
                } else if (obj instanceof Long) {
                    gVar.mo52129a(next, ((Long) obj).longValue());
                } else if (obj instanceof Double) {
                    gVar.mo52127a(next, ((Double) obj).doubleValue());
                } else if (obj instanceof String) {
                    gVar.mo52130a(next, (String) obj);
                } else if (obj instanceof JSONObject) {
                    m90819a((JSONObject) obj, gVar);
                }
            }
        }
    }
}
