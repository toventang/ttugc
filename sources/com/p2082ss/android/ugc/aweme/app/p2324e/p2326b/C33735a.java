package com.p2082ss.android.ugc.aweme.app.p2324e.p2326b;

import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.app.e.b.a */
public final class C33735a {

    /* renamed from: a */
    public String f79904a;

    /* renamed from: b */
    public String f79905b;

    /* renamed from: c */
    public String f79906c;

    /* renamed from: d */
    public String f79907d;

    /* renamed from: e */
    public String f79908e;

    /* renamed from: f */
    public String f79909f;

    /* renamed from: g */
    public JSONObject f79910g;

    /* renamed from: h */
    public boolean f79911h;

    /* renamed from: i */
    public String f79912i;

    /* renamed from: j */
    public String f79913j;

    /* renamed from: k */
    public boolean f79914k;

    /* renamed from: l */
    public String f79915l;

    /* renamed from: m */
    public String f79916m;

    /* renamed from: n */
    public int f79917n;

    /* renamed from: o */
    public String f79918o;

    /* renamed from: p */
    public String f79919p;

    /* renamed from: q */
    public int f79920q;

    /* renamed from: r */
    public boolean f79921r;

    /* renamed from: s */
    public boolean f79922s;

    /* renamed from: t */
    public int f79923t;

    /* renamed from: u */
    public List<String> f79924u = new LinkedList();

    /* renamed from: v */
    private String f79925v;

    static {
        Covode.recordClassIndex(40630);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v52, resolved type: java.util.List<java.lang.String> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public final void mo59969a(JSONObject jSONObject) {
        boolean z;
        boolean z2;
        boolean z3;
        Object obj;
        if (jSONObject != null) {
            this.f79904a = jSONObject.optString("id", null);
            this.f79905b = jSONObject.optString("source", null);
            this.f79906c = jSONObject.optString("card_type", null);
            this.f79907d = jSONObject.optString("pkg_name", null);
            this.f79908e = jSONObject.optString(StringSet.name, null);
            this.f79909f = jSONObject.optString("download_url", null);
            boolean z4 = true;
            if (jSONObject.optInt("is_ad", 0) == 1) {
                z = true;
            } else {
                z = false;
            }
            this.f79911h = z;
            this.f79925v = jSONObject.optString("log_extra", null);
            this.f79912i = jSONObject.optString("event_tag", "game_room_app_ad");
            this.f79913j = jSONObject.optString("event_refer", null);
            this.f79910g = jSONObject.optJSONObject("extra");
            if (jSONObject.optInt("support_multiple", 0) == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.f79914k = z2;
            this.f79915l = jSONObject.optString("group_id", null);
            this.f79916m = jSONObject.optString("quick_app_url", "");
            this.f79917n = jSONObject.optInt("download_mode", 0);
            this.f79918o = jSONObject.optString("open_url", null);
            this.f79919p = jSONObject.optString("source_avatar", null);
            this.f79920q = jSONObject.optInt("auto_open", 0);
            if (jSONObject.optInt("is_landing_page_ad", 0) == 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            this.f79921r = z3;
            if (jSONObject.optInt("disable_download_dialog", 1) != 1) {
                z4 = false;
            }
            this.f79922s = z4;
            this.f79923t = jSONObject.optInt("download_scene", 0);
            JSONArray optJSONArray = jSONObject.optJSONArray("click_track_url_list");
            if (optJSONArray != null && optJSONArray.length() > 0) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    try {
                        obj = optJSONArray.get(i);
                    } catch (Exception e) {
                        e.printStackTrace();
                        obj = null;
                    }
                    if (obj instanceof String) {
                        this.f79924u.add(obj);
                    }
                }
            }
        }
    }
}
