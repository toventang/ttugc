package com.bytedance.geckox.statistic.model;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* renamed from: com.bytedance.geckox.statistic.model.b */
public final class C15040b {

    /* renamed from: a */
    public long f36731a;

    /* renamed from: b */
    public int f36732b;

    /* renamed from: c */
    public String f36733c;

    /* renamed from: d */
    public String f36734d;

    /* renamed from: e */
    public int f36735e;

    /* renamed from: f */
    public int f36736f;

    /* renamed from: g */
    public long f36737g;

    /* renamed from: h */
    public int f36738h;

    /* renamed from: i */
    public int f36739i;

    static {
        Covode.recordClassIndex(17206);
    }

    /* renamed from: a */
    public final void mo24320a(JSONObject jSONObject) {
        jSONObject.put("access_key", this.f36734d);
        jSONObject.put("channel", this.f36733c);
        jSONObject.put("stats_type", this.f36732b);
        jSONObject.put("clean_duration", this.f36737g);
        long j = this.f36731a;
        if (j != 0) {
            jSONObject.put("id", j);
        }
        int i = this.f36738h;
        if (i != 0) {
            jSONObject.put("req_type", i);
        }
        int i2 = this.f36735e;
        if (i2 != 0) {
            jSONObject.put("clean_type", i2);
        }
        int i3 = this.f36736f;
        if (i3 != 0) {
            jSONObject.put("clean_strategy", i3);
        }
        int i4 = this.f36739i;
        if (i4 != 0) {
            jSONObject.put("expire_age", i4);
        }
    }

    public C15040b(String str, long j, int i, int i2, int i3) {
        this.f36734d = null;
        this.f36733c = str;
        this.f36737g = j;
        this.f36732b = i;
        this.f36739i = i2;
        this.f36735e = i3;
    }

    public C15040b(String str, String str2, int i, int i2, long j, long j2, int i3) {
        this.f36733c = str2;
        this.f36734d = str;
        this.f36735e = i;
        this.f36736f = 1;
        this.f36737g = j2;
        this.f36732b = i2;
        this.f36731a = j;
        this.f36738h = i3;
    }
}
