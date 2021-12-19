package com.bytedance.android.monitorV2.p735h;

import android.content.SharedPreferences;
import com.bytedance.android.monitorV2.p729b.C12076a;
import com.bytedance.android.monitorV2.p735h.p736a.C12100c;
import com.bytedance.android.monitorV2.p735h.p736a.C12102d;
import com.bytedance.android.monitorV2.p737i.C12115b;
import com.bytedance.android.monitorV2.p740l.C12125b;
import com.bytedance.android.monitorV2.p740l.C12130f;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import java.io.IOException;
import okhttp3.AbstractC90025ab;
import okhttp3.C90022aa;
import okhttp3.C90204w;
import okhttp3.C90208y;
import okhttp3.Request;
import org.json.JSONException;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.monitorV2.h.d */
public final class C12111d {

    /* renamed from: a */
    private String f29128a = "HybridSettingRequestService";

    /* renamed from: b */
    private C12100c f29129b;

    /* renamed from: c */
    private String f29130c = "/monitor_web/settings/hybrid-settings";

    static {
        Covode.recordClassIndex(13840);
    }

    /* renamed from: a */
    public final C12102d mo19489a() {
        C90208y d = new C90208y().mo145086b().mo145103d();
        C90204w b = C90204w.m156843b("application/json");
        JSONObject jSONObject = new JSONObject();
        C12130f.m21652a(jSONObject, "aid", this.f29129b.f29075a);
        if (this.f29129b.f29075a == null) {
            C12115b.m21584c(this.f29128a, "monitor setting aid should not be null");
        }
        C12130f.m21652a(jSONObject, "os", this.f29129b.f29077c);
        C12130f.m21652a(jSONObject, "os_version", this.f29129b.f29078d);
        C12130f.m21652a(jSONObject, "install_id", this.f29129b.f29079e);
        C12130f.m21652a(jSONObject, "device_id", this.f29129b.f29080f);
        C12130f.m21652a(jSONObject, "channel", this.f29129b.f29081g);
        C12130f.m21652a(jSONObject, "version_code", this.f29129b.f29082h);
        C12130f.m21652a(jSONObject, "update_version_code", this.f29129b.f29083i);
        C12130f.m21652a(jSONObject, "region", this.f29129b.f29084j);
        C12130f.m21652a(jSONObject, "language", this.f29129b.f29085k);
        try {
            return m21563a(C90022aa.m156235a(d, new Request.C90016a().mo144691a(this.f29129b.f29076b + this.f29130c).mo144693a("POST", AbstractC90025ab.create(b, jSONObject.toString())).mo144700b("Content-Type", "application/json").mo144698a(), false).mo144709b().f204111g.string());
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public C12111d(C12100c cVar) {
        this.f29129b = cVar;
    }

    /* renamed from: a */
    private C12102d m21563a(String str) {
        SharedPreferences sharedPreferences;
        SharedPreferences.Editor edit;
        SharedPreferences.Editor putString;
        try {
            if (C12130f.m21647a(new JSONObject(str), "errno") == 200) {
                C12115b.m21581a(this.f29128a, "monitor setting request: succeeded");
                C12102d a = C12125b.m21628a(str);
                C89219l.m154719c("monitor_setting_response", "");
                C89219l.m154719c(str, "");
                if (!(C12076a.f28938b == null || (sharedPreferences = C12076a.f28937a) == null || (edit = sharedPreferences.edit()) == null || (putString = edit.putString("monitor_setting_response", str)) == null)) {
                    putString.apply();
                }
                return a;
            }
            C12115b.m21581a(this.f29128a, "monitor setting request: failed, checking sp...");
            String a2 = C12076a.m21501a("monitor_setting_response", "");
            if (!C13627m.m24498a(a2)) {
                return C12125b.m21628a(a2);
            }
            return null;
        } catch (JSONException e) {
            e.printStackTrace();
            C12115b.m21581a(this.f29128a, "monitor setting request: failed, checking sp...");
            String a3 = C12076a.m21501a("monitor_setting_response", "");
            if (!C13627m.m24498a(a3)) {
                return C12125b.m21628a(a3);
            }
            return null;
        }
    }
}
