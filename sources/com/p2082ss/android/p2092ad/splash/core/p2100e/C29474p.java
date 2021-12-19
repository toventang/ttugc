package com.p2082ss.android.p2092ad.splash.core.p2100e;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.p2092ad.splash.p2109f.C29643f;
import com.p2082ss.android.p2092ad.splash.p2109f.C29657l;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ad.splash.core.e.p */
public final class C29474p {

    /* renamed from: a */
    public List<String> f70121a;

    /* renamed from: b */
    public List<String> f70122b;

    /* renamed from: c */
    public List<String> f70123c;

    /* renamed from: d */
    public String f70124d;

    /* renamed from: e */
    public long f70125e;

    /* renamed from: f */
    public boolean f70126f;

    /* renamed from: g */
    public int f70127g;

    /* renamed from: h */
    public int f70128h;

    /* renamed from: i */
    public String f70129i;

    /* renamed from: j */
    public long f70130j;

    static {
        Covode.recordClassIndex(35868);
    }

    /* renamed from: a */
    public final boolean mo51561a() {
        if (C29657l.m59760a(this.f70124d) || this.f70127g <= 0 || C29643f.m59683a(this.f70123c) || C29657l.m59760a(this.f70123c.get(0))) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo51560a(JSONObject jSONObject) {
        int i;
        JSONArray optJSONArray = jSONObject.optJSONArray("play_track_url_list");
        if (!(optJSONArray == null || optJSONArray.length() == 0)) {
            this.f70121a = new ArrayList();
            for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                try {
                    this.f70121a.add(optJSONArray.getString(i2));
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
        JSONArray optJSONArray2 = jSONObject.optJSONArray("playover_track_url_list");
        if (!(optJSONArray2 == null || optJSONArray2.length() == 0)) {
            this.f70122b = new ArrayList();
            for (int i3 = 0; i3 < optJSONArray2.length(); i3++) {
                try {
                    this.f70122b.add(optJSONArray2.getString(i3));
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
        JSONArray optJSONArray3 = jSONObject.optJSONArray("video_url_list");
        if (!(optJSONArray3 == null || optJSONArray3.length() == 0)) {
            this.f70123c = new ArrayList();
            for (int i4 = 0; i4 < optJSONArray3.length(); i4++) {
                try {
                    this.f70123c.add(optJSONArray3.getString(i4));
                } catch (Exception e3) {
                    e3.printStackTrace();
                }
            }
        }
        this.f70124d = jSONObject.optString("video_id");
        this.f70125e = jSONObject.optLong("video_group_id");
        this.f70126f = jSONObject.optBoolean("voice_switch");
        this.f70130j = jSONObject.optLong("video_duration_ms");
        String optString = jSONObject.optString("video_density");
        this.f70129i = jSONObject.optString("secret_key");
        int indexOf = optString.indexOf("x");
        if (indexOf >= 0 && (i = indexOf + 1) < optString.length()) {
            this.f70128h = Integer.parseInt(optString.substring(0, indexOf));
            this.f70127g = Integer.parseInt(optString.substring(i));
        }
    }
}
