package com.p2082ss.android.sdk.webview.p2175a;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.p1285a.AbstractC18293d;
import com.bytedance.ies.web.p1285a.C18297h;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.common.util.C29844g;
import com.p2082ss.android.sdk.webview.p2176di.C30247a;
import com.p2082ss.android.ugc.aweme.activity.C33067a;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.ss.android.sdk.webview.a.g */
public class C30242g implements AbstractC18293d {

    /* renamed from: a */
    protected WeakReference<Context> f72158a;

    static {
        Covode.recordClassIndex(36753);
    }

    public C30242g(WeakReference<Context> weakReference) {
        this.f72158a = weakReference;
    }

    /* renamed from: a */
    protected static Activity m61207a(Context context) {
        while (context != null) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            if (!(context instanceof ContextWrapper)) {
                return null;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    /* renamed from: a */
    public void mo53694a(JSONObject jSONObject) {
        Activity activity;
        try {
            WeakReference<Context> weakReference = this.f72158a;
            Context context = null;
            if (weakReference != null) {
                context = weakReference.get();
            }
            if ((((context instanceof Activity) && (activity = (Activity) context) != null) || (activity = m61207a(context)) != null) && C33067a.m67726a(activity, true)) {
                String optString = jSONObject.optString(StringSet.type);
                if (!C13627m.m24498a(optString) && optString.indexOf(58) < 0) {
                    C29844g gVar = new C29844g(C30247a.m61216a().f72163a.getSSLocalScheme() + "://" + optString);
                    m61208a(jSONObject.optJSONObject("args"), gVar);
                    C30247a.m61216a().f72163a.startAdsAppActivity(activity, gVar.mo52126a());
                }
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.ies.web.p1285a.AbstractC18293d
    public void call(C18297h hVar, JSONObject jSONObject) {
        mo53694a(hVar.f43671d);
        jSONObject.put("code", 1);
    }

    /* renamed from: a */
    private void m61208a(JSONObject jSONObject, C29844g gVar) {
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
                } else if (obj instanceof Boolean) {
                    gVar.mo52130a(next, obj.toString());
                } else if (obj instanceof JSONObject) {
                    m61208a((JSONObject) obj, gVar);
                }
            }
        }
    }
}
