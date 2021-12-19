package com.bytedance.android.p126a.p127a.p133f;

import android.text.TextUtils;
import com.bytedance.android.p126a.p127a.p135h.C2640a;
import com.bytedance.android.p126a.p127a.p135h.C2646f;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.a.a.f.a */
public final class C2633a extends C2635b {

    /* renamed from: a */
    public C2634a f7918a;

    /* renamed from: b */
    public boolean f7919b;

    /* renamed from: c */
    public boolean f7920c;

    /* renamed from: d */
    public String f7921d;

    /* renamed from: e */
    public String f7922e;

    /* renamed from: f */
    public boolean f7923f;

    /* renamed from: g */
    public boolean f7924g;

    /* renamed from: h */
    public Map<String, JSONObject> f7925h;

    static {
        Covode.recordClassIndex(3021);
    }

    /* renamed from: com.bytedance.android.a.a.f.a$a */
    public static final class C2634a {

        /* renamed from: a */
        public boolean f7926a;

        /* renamed from: b */
        public boolean f7927b;

        /* renamed from: c */
        public boolean f7928c;

        /* renamed from: d */
        public String f7929d;

        /* renamed from: e */
        public JSONObject f7930e;

        static {
            Covode.recordClassIndex(3022);
        }

        /* renamed from: a */
        public final C2633a mo7154a() {
            if (this.f7930e == null) {
                this.f7930e = new JSONObject();
            }
            return new C2633a(this, (byte) 0);
        }
    }

    private C2633a(C2634a aVar) {
        this.f7922e = "";
        this.f7918a = aVar;
        this.f7931i = aVar.f7926a;
        this.f7919b = aVar.f7927b;
        this.f7920c = aVar.f7928c;
        this.f7921d = C2646f.m7661c(aVar.f7929d);
        mo7153a(aVar.f7930e);
    }

    @Override // com.bytedance.android.p126a.p127a.p133f.C2635b
    /* renamed from: a */
    public final void mo7153a(JSONObject jSONObject) {
        JSONObject optJSONObject;
        super.mo7153a(jSONObject);
        if (jSONObject != null) {
            try {
                this.f7922e = jSONObject.optString("appid", "");
                if (this.f7925h == null) {
                    this.f7925h = new HashMap();
                }
                this.f7923f = m7631a(jSONObject, "is_enable_monitor");
                this.f7924g = m7631a(jSONObject, "is_enable_net_opt");
                this.f7925h.clear();
                JSONObject optJSONObject2 = jSONObject.optJSONObject("settings");
                if (optJSONObject2 != null) {
                    Iterator<String> keys = optJSONObject2.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        if (!TextUtils.isEmpty(next) && (optJSONObject = optJSONObject2.optJSONObject(next)) != null) {
                            this.f7925h.put(next, optJSONObject);
                        }
                    }
                }
            } catch (Throwable th) {
                C2640a.m7643a(th.getMessage());
            }
        }
    }

    /* synthetic */ C2633a(C2634a aVar, byte b) {
        this(aVar);
    }
}
