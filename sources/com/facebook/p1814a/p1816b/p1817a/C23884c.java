package com.facebook.p1814a.p1816b.p1817a;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* renamed from: com.facebook.a.b.a.c */
public final class C23884c {

    /* renamed from: a */
    public final String f56541a;

    /* renamed from: b */
    public final int f56542b;

    /* renamed from: c */
    public final int f56543c;

    /* renamed from: d */
    public final String f56544d;

    /* renamed from: e */
    public final String f56545e;

    /* renamed from: f */
    public final String f56546f;

    /* renamed from: g */
    public final String f56547g;

    /* renamed from: h */
    public final int f56548h;

    static {
        Covode.recordClassIndex(28005);
    }

    /* renamed from: com.facebook.a.b.a.c$a */
    public enum EnumC23885a {
        ID(1),
        TEXT(2),
        TAG(4),
        DESCRIPTION(8),
        HINT(16);
        

        /* renamed from: a */
        private final int f56551a;

        public final int getValue() {
            return this.f56551a;
        }

        static {
            Covode.recordClassIndex(28006);
        }

        private EnumC23885a(int i) {
            this.f56551a = i;
        }
    }

    C23884c(JSONObject jSONObject) {
        this.f56541a = jSONObject.getString("class_name");
        this.f56542b = jSONObject.optInt("index", -1);
        this.f56543c = jSONObject.optInt("id");
        this.f56544d = jSONObject.optString("text");
        this.f56545e = jSONObject.optString("tag");
        this.f56546f = jSONObject.optString("description");
        this.f56547g = jSONObject.optString("hint");
        this.f56548h = jSONObject.optInt("match_bitmask");
    }
}
