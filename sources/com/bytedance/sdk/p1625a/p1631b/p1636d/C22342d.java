package com.bytedance.sdk.p1625a.p1631b.p1636d;

import com.bytedance.covode.number.Covode;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.a.b.d.d */
public final class C22342d extends C22341c {

    /* renamed from: g */
    public boolean f52787g;

    /* renamed from: h */
    public boolean f52788h;

    /* renamed from: i */
    public boolean f52789i;

    /* renamed from: j */
    public boolean f52790j;

    /* renamed from: k */
    public boolean f52791k;

    /* renamed from: l */
    public boolean f52792l;

    /* renamed from: m */
    public boolean f52793m;

    /* renamed from: n */
    public boolean f52794n;

    /* renamed from: o */
    public boolean f52795o;

    /* renamed from: p */
    public String f52796p;

    /* renamed from: q */
    public boolean f52797q;

    /* renamed from: r */
    public C22343a f52798r;

    /* renamed from: s */
    public C22343a f52799s;

    static {
        Covode.recordClassIndex(26158);
    }

    /* renamed from: com.bytedance.sdk.a.b.d.d$a */
    public static class C22343a {

        /* renamed from: a */
        public JSONObject f52800a;

        /* renamed from: b */
        public boolean f52801b;

        /* renamed from: c */
        public Set<String> f52802c;

        static {
            Covode.recordClassIndex(26159);
        }

        public C22343a(JSONObject jSONObject) {
            int length;
            if (jSONObject != null) {
                this.f52800a = jSONObject;
                this.f52801b = jSONObject.optBoolean("can_skip_confirm");
                JSONArray optJSONArray = jSONObject.optJSONArray("content");
                if (optJSONArray != null && (length = optJSONArray.length()) > 0) {
                    this.f52802c = new HashSet();
                    int i = 0;
                    do {
                        this.f52802c.add(optJSONArray.optString(i));
                        i++;
                    } while (i < length);
                }
            }
        }
    }
}
