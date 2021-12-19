package com.p2082ss.optimizer.live.sdk.p4400a.p4401a;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.optimizer.live.sdk.a.a.a */
public final class C86124a {

    /* renamed from: a */
    public int f192034a;

    /* renamed from: b */
    public JSONObject f192035b;

    /* renamed from: c */
    public String f192036c;

    /* renamed from: d */
    public int f192037d = 300;

    /* renamed from: e */
    public boolean f192038e;

    /* renamed from: f */
    public boolean f192039f;

    /* renamed from: g */
    private String f192040g;

    static {
        Covode.recordClassIndex(101265);
    }

    /* renamed from: a */
    public final List<String> mo136401a(String str) {
        JSONObject jSONObject;
        if (this.f192034a != 0 || (jSONObject = this.f192035b) == null || jSONObject.length() <= 0) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            if (!this.f192035b.has(str)) {
                return null;
            }
            JSONArray jSONArray = this.f192035b.getJSONArray(str);
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(jSONArray.getString(i));
            }
            return arrayList;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    public C86124a(JSONObject jSONObject) {
        try {
            this.f192034a = jSONObject.getInt("StatusCode");
            this.f192040g = jSONObject.getString("StatusMessage");
            if (this.f192034a == 0) {
                this.f192035b = jSONObject.getJSONObject("IpMap");
                this.f192036c = jSONObject.getString("Symbol");
            }
            this.f192037d = jSONObject.getInt("DnsTTL");
            this.f192038e = jSONObject.getBoolean("EnableIpSettings");
            this.f192039f = jSONObject.getBoolean("EnablePing");
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
