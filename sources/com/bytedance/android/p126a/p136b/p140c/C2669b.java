package com.bytedance.android.p126a.p136b.p140c;

import android.os.SystemClock;
import com.bytedance.android.p126a.p127a.p133f.C2635b;
import com.bytedance.android.p126a.p127a.p135h.C2640a;
import com.bytedance.android.p126a.p136b.p137a.AbstractC2653a;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.a.b.c.b */
public final class C2669b extends C2635b {

    /* renamed from: a */
    public C2671a f7971a;

    /* renamed from: b */
    public long f7972b;

    /* renamed from: c */
    public boolean f7973c;

    /* renamed from: d */
    public int f7974d;

    /* renamed from: e */
    public List<String> f7975e;

    /* renamed from: f */
    public List<String> f7976f;

    /* renamed from: g */
    public List<String> f7977g;

    /* renamed from: h */
    public AbstractC2653a f7978h;

    /* renamed from: j */
    public int f7979j;

    /* renamed from: k */
    public boolean f7980k;

    /* renamed from: l */
    public List<String> f7981l;

    /* renamed from: m */
    private boolean f7982m;

    /* renamed from: com.bytedance.android.a.b.c.b$a */
    public static final class C2671a {

        /* renamed from: a */
        public boolean f7984a = true;

        /* renamed from: b */
        public int f7985b;

        /* renamed from: c */
        public AbstractC2653a f7986c;

        static {
            Covode.recordClassIndex(3059);
        }
    }

    static {
        Covode.recordClassIndex(3057);
    }

    private C2669b(C2671a aVar) {
        this.f7973c = true;
        this.f7975e = C2668a.m7707a(true);
        this.f7976f = C2668a.m7707a(false);
        this.f7982m = false;
        this.f7977g = new ArrayList();
        this.f7979j = 10000;
        this.f7980k = true;
        this.f7981l = new ArrayList();
        this.f7971a = aVar;
        this.f7931i = aVar.f7984a;
        this.f7974d = aVar.f7985b;
        this.f7978h = aVar.f7986c;
        this.f7972b = SystemClock.uptimeMillis();
    }

    @Override // com.bytedance.android.p126a.p127a.p133f.C2635b
    /* renamed from: a */
    public final void mo7153a(JSONObject jSONObject) {
        boolean z;
        super.mo7153a(jSONObject);
        if (jSONObject != null) {
            boolean z2 = false;
            try {
                this.f7973c = m7632a(jSONObject, "store_when_offline", true);
                this.f7974d = jSONObject.optInt("android_store_impl", 0);
                if (this.f7975e == null) {
                    this.f7975e = new ArrayList();
                }
                this.f7975e.clear();
                JSONArray optJSONArray = jSONObject.optJSONArray("macro_standard");
                if (optJSONArray != null) {
                    m7709a(optJSONArray, this.f7975e);
                    C2668a.m7708a(this.f7975e);
                } else {
                    this.f7975e.addAll(C2668a.m7707a(true));
                }
                if (this.f7976f == null) {
                    this.f7976f = new ArrayList();
                }
                this.f7976f.clear();
                JSONArray optJSONArray2 = jSONObject.optJSONArray("macro_non_standard");
                if (optJSONArray2 != null) {
                    z = true;
                } else {
                    z = false;
                }
                this.f7982m = z;
                if (optJSONArray2 != null) {
                    m7709a(optJSONArray2, this.f7976f);
                    C2668a.m7708a(this.f7976f);
                } else {
                    this.f7976f.addAll(C2668a.m7707a(false));
                }
                if (this.f7977g == null) {
                    this.f7977g = new ArrayList();
                }
                this.f7977g.clear();
                m7709a(jSONObject.optJSONArray("macro_blocklist"), this.f7977g);
                this.f7979j = jSONObject.optInt("request_timeout", 10000);
                this.f7981l.clear();
                m7709a(jSONObject.optJSONArray("redirect_blocklist"), this.f7981l);
            } catch (Throwable th) {
                C2640a.m7643a(th.getMessage());
            }
            this.f7972b = SystemClock.uptimeMillis();
            if (jSONObject.optInt("enable_url_encode_compat", 1) == 1) {
                z2 = true;
            }
            this.f7980k = z2;
        }
    }

    public /* synthetic */ C2669b(C2671a aVar, byte b) {
        this(aVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.List<java.lang.String> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    private static void m7709a(JSONArray jSONArray, List<String> list) {
        if (!(jSONArray == null || list == 0)) {
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    Object obj = jSONArray.get(i);
                    if (obj instanceof String) {
                        list.add(obj);
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                    return;
                }
            }
        }
    }
}
