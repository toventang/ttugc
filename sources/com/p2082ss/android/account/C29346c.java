package com.p2082ss.android.account;

import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import org.json.JSONObject;

/* renamed from: com.ss.android.account.c */
public final class C29346c extends C29340a {

    /* renamed from: A */
    public String f69637A;

    /* renamed from: B */
    public int f69638B;

    /* renamed from: C */
    public int f69639C;

    /* renamed from: D */
    public int f69640D;

    /* renamed from: E */
    public int f69641E;

    /* renamed from: F */
    public int f69642F;

    /* renamed from: G */
    public int f69643G;

    /* renamed from: H */
    public int f69644H;

    /* renamed from: I */
    public long f69645I;

    /* renamed from: J */
    public String f69646J;

    /* renamed from: K */
    public int f69647K;

    /* renamed from: L */
    public int f69648L;

    /* renamed from: M */
    public boolean f69649M;

    /* renamed from: N */
    public boolean f69650N;

    /* renamed from: O */
    public String f69651O;

    /* renamed from: P */
    public String f69652P;

    /* renamed from: Q */
    public String f69653Q;

    /* renamed from: R */
    public int f69654R;

    /* renamed from: S */
    public int f69655S;

    /* renamed from: T */
    public boolean f69656T;

    /* renamed from: U */
    public boolean f69657U;

    /* renamed from: V */
    public int f69658V;

    /* renamed from: s */
    public String f69659s;

    /* renamed from: t */
    public String f69660t;

    /* renamed from: u */
    public long f69661u;

    /* renamed from: v */
    public String f69662v;

    /* renamed from: w */
    public String f69663w;

    /* renamed from: x */
    public boolean f69664x;

    /* renamed from: y */
    public String f69665y;

    /* renamed from: z */
    public String f69666z;

    static {
        Covode.recordClassIndex(35734);
    }

    public C29346c() {
    }

    @Override // com.bytedance.sdk.p1625a.p1663n.C22507a, com.p2082ss.android.account.C29340a
    /* renamed from: a */
    public final void mo36780a() {
        boolean z;
        super.mo36780a();
        JSONObject jSONObject = this.f53224o;
        this.f69638B = jSONObject.optInt("can_be_found_by_phone");
        this.f69639C = jSONObject.optInt("share_to_repost", -1);
        boolean z2 = true;
        this.f69640D = jSONObject.optInt("user_privacy_extend") & 1;
        this.f69641E = jSONObject.optInt("user_privacy_extend");
        this.f69648L = jSONObject.optInt("gender");
        this.f69659s = jSONObject.optString("screen_name");
        this.f69660t = jSONObject.optString("verified_content");
        this.f69649M = jSONObject.optBoolean("is_generated");
        this.f69650N = jSONObject.optBoolean("user_verified");
        if (jSONObject.optInt("is_recommend_allowed") != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f69664x = z;
        this.f69665y = jSONObject.optString("recommend_hint_message");
        this.f69666z = jSONObject.optString("user_decoration");
        this.f69637A = jSONObject.optString("user_auth_info");
        this.f69651O = jSONObject.optString("birthday");
        this.f69652P = jSONObject.optString("area");
        this.f69653Q = jSONObject.optString("industry");
        this.f69655S = jSONObject.optInt("is_blocked");
        this.f69654R = jSONObject.optInt("is_blocking");
        this.f69656T = jSONObject.optBoolean("is_toutiao");
        if (jSONObject.optInt("has_password") == 0) {
            z2 = false;
        }
        this.f69657U = z2;
        JSONObject optJSONObject = jSONObject.optJSONObject("media");
        if (optJSONObject != null) {
            this.f69662v = optJSONObject.optString("avatar_url");
            this.f69661u = optJSONObject.optLong("id");
            this.f69663w = optJSONObject.optString(StringSet.name);
            this.f69647K = optJSONObject.optInt("display_app_ocr_entrance", 0);
        }
        this.f69642F = jSONObject.optInt("followings_count");
        this.f69643G = jSONObject.optInt("followers_count");
        this.f69644H = jSONObject.optInt("visit_count_recent");
        this.f69645I = jSONObject.optLong("media_id");
        this.f69646J = jSONObject.optString("bg_img_url");
        this.f69658V = jSONObject.optInt("app_id");
    }

    public C29346c(JSONObject jSONObject) {
        super(jSONObject);
    }

    /* renamed from: com.ss.android.account.c$a */
    public static class C29347a {
        static {
            Covode.recordClassIndex(35735);
        }

        /* renamed from: a */
        public static C29346c m58778a(JSONObject jSONObject) {
            C29346c cVar = new C29346c(jSONObject);
            cVar.mo36780a();
            return cVar;
        }
    }

    public C29346c(JSONObject jSONObject, JSONObject jSONObject2) {
        super(jSONObject, jSONObject2);
    }
}
