package com.p2082ss.android.sdk.webview;

import android.text.TextUtils;
import com.bytedance.common.utility.collection.C13604c;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.common.util.C29844g;
import com.p2082ss.android.common.util.NetworkUtils;
import com.p2082ss.android.sdk.webview.p2176di.C30247a;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ss.android.sdk.webview.n */
public class C30270n {

    /* renamed from: d */
    private static C30270n f72203d;

    /* renamed from: a */
    final C13604c<String, C30274o> f72204a = new C13604c<>(16, 16);

    /* renamed from: b */
    final C30274o f72205b = new C30274o("", null, null);

    /* renamed from: c */
    List<AbstractC30273a> f72206c;

    /* renamed from: com.ss.android.sdk.webview.n$a */
    public interface AbstractC30273a {
        static {
            Covode.recordClassIndex(36785);
        }

        /* renamed from: a */
        void mo53681a(String str, C30274o oVar, String str2);
    }

    static {
        Covode.recordClassIndex(36782);
    }

    /* renamed from: b */
    public static boolean m61261b() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    private C30270n() {
    }

    /* renamed from: a */
    public static C30270n m61258a() {
        MethodCollector.m26663i(4369);
        if (f72203d == null) {
            synchronized (C30270n.class) {
                try {
                    if (f72203d == null) {
                        f72203d = new C30270n();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(4369);
                    throw th;
                }
            }
        }
        C30270n nVar = f72203d;
        MethodCollector.m26664o(4369);
        return nVar;
    }

    /* renamed from: a */
    private static void m61260a(JSONArray jSONArray, List<String> list) {
        if (!(jSONArray == null || list == null)) {
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                String optString = jSONArray.optString(i);
                if (!TextUtils.isEmpty(optString)) {
                    list.add(optString);
                }
            }
        }
    }

    /* renamed from: a */
    static C30274o m61259a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return null;
        }
        try {
            C29844g gVar = new C29844g(C30247a.m61216a().f72163a.getJSSDKConfigUrl());
            gVar.mo52130a("client_id", str3);
            gVar.mo52130a("partner_domain", str2);
            String executeGet = NetworkUtils.executeGet(-1, gVar.mo52126a());
            if (TextUtils.isEmpty(executeGet)) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(executeGet);
            if (!C30247a.m61216a().f72163a.isApiSuccess(jSONObject)) {
                return null;
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            if (optJSONObject == null) {
                return null;
            }
            C30274o oVar = new C30274o(str, str2, str3);
            try {
                m61260a(optJSONObject.optJSONArray("call"), oVar.f72218e);
                m61260a(optJSONObject.optJSONArray("info"), oVar.f72219f);
                m61260a(optJSONObject.optJSONArray("event"), oVar.f72220g);
            } catch (Exception unused) {
            }
            return oVar;
        } catch (Exception unused2) {
            return null;
        }
    }
}
