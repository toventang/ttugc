package com.bytedance.android.livesdk.browser.jsbridge.p473d;

import com.bytedance.android.livesdk.p425aa.p429d.C6542d;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.p1285a.AbstractC18293d;
import com.bytedance.ies.web.p1285a.C18297h;
import com.kakao.usermgmt.StringSet;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.d.b */
public final class C7050b implements AbstractC18293d {

    /* renamed from: a */
    private WeakReference<AbstractC7051a> f17659a;

    /* renamed from: com.bytedance.android.livesdk.browser.jsbridge.d.b$a */
    public interface AbstractC7051a {
        static {
            Covode.recordClassIndex(7790);
        }

        /* renamed from: b */
        void mo13297b(String str);

        /* renamed from: b */
        void mo13298b(String str, Object obj);

        /* renamed from: g */
        void mo13303g();

        /* renamed from: h */
        void mo13304h();
    }

    static {
        Covode.recordClassIndex(7789);
    }

    public C7050b(WeakReference<AbstractC7051a> weakReference) {
        this.f17659a = weakReference;
    }

    @Override // com.bytedance.ies.web.p1285a.AbstractC18293d
    public final void call(C18297h hVar, JSONObject jSONObject) {
        if (hVar.f43671d != null) {
            AbstractC7051a aVar = this.f17659a.get();
            String optString = hVar.f43671d.optString(StringSet.type);
            optString.hashCode();
            if (optString.equals("charge")) {
                aVar.mo13297b(C6542d.m13984a("ttlive_charge_open_fe_detail"));
            } else if (optString.equals("cashdesk")) {
                aVar.mo13297b(C6542d.m13984a("ttlive_charge_open_check_fe_detail"));
            }
            if (hVar.f43671d.has("args")) {
                JSONObject optJSONObject = hVar.f43671d.optJSONObject("args");
                if (optJSONObject.has("first_loaded")) {
                    aVar.mo13303g();
                }
                if (optJSONObject.has("blank_duration")) {
                    aVar.mo13298b("blank_duration", Long.valueOf(optJSONObject.optLong("blank_duration")));
                    aVar.mo13304h();
                }
                if (optJSONObject.has("interactive_duration")) {
                    aVar.mo13298b("interactive_duration", Long.valueOf(optJSONObject.optLong("interactive_duration")));
                }
                if (optJSONObject.has("finished_duration")) {
                    aVar.mo13298b("finished_duration", Long.valueOf(optJSONObject.optLong("finished_duration")));
                }
            }
        }
    }
}
