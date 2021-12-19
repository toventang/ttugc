package com.p2082ss.android.account;

import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.p1625a.p1663n.C22507a;
import com.kakao.usermgmt.StringSet;
import org.json.JSONObject;

/* renamed from: com.ss.android.account.a */
public class C29340a extends C22507a {

    /* renamed from: p */
    public String f69616p;

    /* renamed from: q */
    public String f69617q;

    /* renamed from: r */
    public String f69618r;

    static {
        Covode.recordClassIndex(35726);
    }

    public C29340a() {
    }

    @Override // com.bytedance.sdk.p1625a.p1663n.C22507a
    /* renamed from: a */
    public void mo36780a() {
        super.mo36780a();
        JSONObject jSONObject = this.f53224o;
        if (jSONObject.has(StringSet.name)) {
            this.f69616p = jSONObject.optString(StringSet.name);
        } else if (jSONObject.has("username")) {
            this.f69616p = jSONObject.optString("username");
        }
        this.f69618r = jSONObject.optString("avatar_url");
        this.f69617q = jSONObject.optString("description");
    }

    public C29340a(JSONObject jSONObject) {
        super(jSONObject);
    }

    public C29340a(JSONObject jSONObject, JSONObject jSONObject2) {
        super(jSONObject, jSONObject2);
    }
}
