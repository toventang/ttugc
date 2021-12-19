package com.bytedance.sdk.p1665b.p1667b;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.b.b.c */
public final class C22531c {

    /* renamed from: a */
    public boolean f53263a;

    /* renamed from: b */
    public long f53264b;

    /* renamed from: c */
    public String f53265c;

    /* renamed from: d */
    public C22532a f53266d;

    /* renamed from: com.bytedance.sdk.b.b.c$a */
    public static class C22532a {

        /* renamed from: a */
        public boolean f53267a;

        /* renamed from: b */
        public String f53268b = "";

        /* renamed from: c */
        public String f53269c = "";

        /* renamed from: d */
        public String f53270d = "";

        static {
            Covode.recordClassIndex(26348);
        }
    }

    static {
        Covode.recordClassIndex(26347);
    }

    /* renamed from: a */
    public static C22531c m42504a(String str) {
        C22531c cVar = new C22531c();
        JSONObject jSONObject = new JSONObject(str);
        cVar.f53265c = str;
        if (jSONObject.has("data_plan_info")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("data_plan_info");
            if (jSONObject2 != null) {
                C22532a aVar = new C22532a();
                cVar.f53266d = aVar;
                aVar.f53267a = jSONObject2.getBoolean("product_active");
                cVar.f53266d.f53268b = jSONObject2.getString("product_id");
                cVar.f53266d.f53269c = jSONObject2.getString("product_name");
                cVar.f53266d.f53270d = jSONObject2.getString("product_start_time");
                cVar.f53264b = jSONObject2.optLong("residual_flow");
                cVar.f53263a = cVar.f53266d.f53267a;
            } else {
                cVar.f53263a = false;
            }
        } else {
            cVar.f53263a = false;
        }
        return cVar;
    }
}
