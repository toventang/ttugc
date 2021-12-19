package com.bytedance.sdk.p1625a.p1663n;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.account.p2089b.C29345a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.a.n.a */
public class C22507a {

    /* renamed from: a */
    public long f53210a;

    /* renamed from: b */
    public final Map<String, C29345a> f53211b = new HashMap();

    /* renamed from: c */
    public String f53212c;

    /* renamed from: d */
    public int f53213d;

    /* renamed from: e */
    public boolean f53214e;

    /* renamed from: f */
    public String f53215f;

    /* renamed from: g */
    public String f53216g;

    /* renamed from: h */
    public String f53217h;

    /* renamed from: i */
    public String f53218i;

    /* renamed from: j */
    public boolean f53219j;

    /* renamed from: k */
    public boolean f53220k;

    /* renamed from: l */
    public boolean f53221l;

    /* renamed from: m */
    public JSONObject f53222m;

    /* renamed from: n */
    public JSONObject f53223n;

    /* renamed from: o */
    public JSONObject f53224o;

    static {
        Covode.recordClassIndex(26323);
    }

    public C22507a() {
    }

    /* renamed from: a */
    public void mo36780a() {
        boolean z;
        boolean z2;
        boolean z3;
        JSONObject jSONObject = this.f53224o;
        long j = 0;
        this.f53210a = jSONObject.optLong("user_id", 0);
        this.f53212c = jSONObject.optString("sec_user_id", "");
        this.f53215f = jSONObject.optString("session_key", "");
        this.f53212c = jSONObject.optString("sec_user_id", "");
        if (jSONObject.optInt("new_user") != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f53214e = z;
        this.f53216g = jSONObject.optString("mobile", "");
        if (jSONObject.optInt("has_password") != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f53219j = z2;
        this.f53218i = jSONObject.optString("sec_user_id", "");
        this.f53220k = jSONObject.optBoolean("is_visitor_account", false);
        this.f53217h = jSONObject.optString("email", "");
        C29345a a = C29345a.m58775a("mobile");
        C29345a a2 = C29345a.m58775a("email");
        a2.f69628d = this.f53217h;
        if (!TextUtils.isEmpty(this.f53217h)) {
            this.f53211b.put(a2.f69626b, a2);
        }
        a.f69628d = this.f53216g;
        if (!TextUtils.isEmpty(this.f53216g)) {
            this.f53211b.put(a.f69626b, a);
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("connects");
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            long currentTimeMillis = System.currentTimeMillis();
            int i = 0;
            while (i < length) {
                JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                String string = jSONObject2.getString("platform");
                if (!(string == null || string.length() == 0)) {
                    C29345a a3 = C29345a.m58775a(string);
                    if (jSONObject2.has("screen_name")) {
                        a3.f69628d = jSONObject2.optString("screen_name");
                    } else if (jSONObject2.has("platform_screen_name")) {
                        a3.f69628d = jSONObject2.optString("platform_screen_name");
                    }
                    a3.f69629e = jSONObject2.optString("profile_image_url");
                    a3.f69630f = jSONObject2.optString("platform_uid");
                    a3.f69631g = jSONObject2.optString("sec_platform_uid");
                    a3.f69633i = jSONObject2.optLong("modify_time");
                    a3.f69632h = jSONObject2.optString("create_time");
                    a3.f69636l = jSONObject.optLong("user_id", j);
                    long optLong = jSONObject2.optLong("expires_in");
                    if (optLong > j) {
                        a3.f69634j = currentTimeMillis + (1000 * optLong);
                    }
                    a3.f69635k = optLong;
                    C29345a aVar = this.f53211b.get(string);
                    if (aVar == null || aVar.f69633i <= 0 || aVar.f69633i <= a3.f69633i) {
                        this.f53211b.put(string, a3);
                    }
                }
                i++;
                j = 0;
            }
        }
        this.f53213d = jSONObject.optInt("country_code", -1);
        if (jSONObject.optInt("is_kids_mode") == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f53221l = z3;
    }

    public C22507a(JSONObject jSONObject) {
        this.f53223n = jSONObject;
        JSONObject optJSONObject = jSONObject.optJSONObject("data");
        this.f53222m = optJSONObject;
        this.f53224o = optJSONObject;
    }

    public C22507a(JSONObject jSONObject, JSONObject jSONObject2) {
        this.f53223n = jSONObject;
        this.f53222m = jSONObject.optJSONObject("data");
        this.f53224o = jSONObject2;
    }
}
