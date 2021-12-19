package com.bytedance.apm.p767c.p768a;

import android.text.TextUtils;
import com.bytedance.apm.p767c.AbstractC12398a;
import com.bytedance.apm.p767c.p769b.C12407a;
import com.bytedance.apm.p786n.C12556c;
import com.bytedance.apm.p789q.C12592m;
import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.c.a.d */
public final class C12404d extends AbstractC12398a<C12407a> {

    /* renamed from: h */
    public static long f29966h = 30000;

    /* renamed from: i */
    public static boolean f29967i;

    /* renamed from: c */
    public int f29968c;

    /* renamed from: d */
    public boolean f29969d;

    /* renamed from: e */
    public boolean f29970e;

    /* renamed from: f */
    public boolean f29971f;

    /* renamed from: g */
    public AbstractC12403c f29972g;

    /* renamed from: j */
    private volatile int f29973j;

    /* renamed from: k */
    private volatile List<String> f29974k;

    /* renamed from: l */
    private List<Pattern> f29975l;

    /* renamed from: m */
    private List<String> f29976m;

    /* renamed from: n */
    private List<Pattern> f29977n;

    /* renamed from: o */
    private List<String> f29978o;

    /* renamed from: p */
    private List<String> f29979p;

    /* renamed from: q */
    private List<String> f29980q;

    /* renamed from: r */
    private boolean f29981r;

    /* renamed from: s */
    private double f29982s;

    /* renamed from: com.bytedance.apm.c.a.d$a */
    public static final class C12405a {

        /* renamed from: a */
        public static final C12404d f29983a = new C12404d((byte) 0);

        static {
            Covode.recordClassIndex(14212);
        }
    }

    static {
        Covode.recordClassIndex(14211);
    }

    private C12404d() {
        this.f29969d = true;
        this.f29970e = true;
    }

    /* renamed from: b */
    public final boolean mo20187b() {
        if (!this.f29970e || this.f29982s == 0.0d) {
            return false;
        }
        return true;
    }

    /* synthetic */ C12404d(byte b) {
        this();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.apm.c.b] */
    @Override // com.bytedance.apm.p767c.AbstractC12398a
    /* renamed from: c */
    public final /* synthetic */ boolean mo20182c(C12407a aVar) {
        C12407a aVar2 = aVar;
        if (aVar2 == null || TextUtils.isEmpty(aVar2.f29987d)) {
            return false;
        }
        return true;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.apm.c.b] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0024 A[Catch:{ JSONException -> 0x006d }] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x003c A[Catch:{ JSONException -> 0x006d }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0042 A[Catch:{ JSONException -> 0x006d }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    @Override // com.bytedance.apm.p767c.AbstractC12398a
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void mo20183d(com.bytedance.apm.p767c.p769b.C12407a r7) {
        /*
        // Method dump skipped, instructions count: 110
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm.p767c.p768a.C12404d.mo20183d(com.bytedance.apm.c.b):void");
    }

    /* renamed from: a */
    private static boolean m22307a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return false;
        }
        try {
            String optString = jSONObject.optString("cronet_internal_error_code");
            if (!"11".equals(jSONObject.optString("cronet_error_code")) || !"-999".equals(optString)) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.apm.c.b] */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x006b, code lost:
        if (r11.f29973j == 1) goto L_0x004c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0051  */
    @Override // com.bytedance.apm.p767c.AbstractC12398a
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void mo20184e(com.bytedance.apm.p767c.p769b.C12407a r12) {
        /*
        // Method dump skipped, instructions count: 251
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm.p767c.p768a.C12404d.mo20184e(com.bytedance.apm.c.b):void");
    }

    /* renamed from: a */
    private boolean m22306a(String str, JSONObject jSONObject) {
        int i;
        int i2;
        if (mo20187b() || this.f29968c != 0 || C12592m.m22692a(str, this.f29976m, this.f29977n)) {
            i = 1;
        } else {
            i = 0;
        }
        boolean b = C12556c.m22587b("smart_traffic");
        if (b) {
            i2 = i | 4;
        } else {
            i2 = i;
        }
        try {
            jSONObject.put("hit_rules", i2);
        } catch (JSONException unused) {
        }
        if (i != 0 || b) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.services.slardar.config.AbstractC22715a, com.bytedance.apm.p767c.AbstractC12398a
    /* renamed from: a */
    public final void mo20180a(JSONObject jSONObject, boolean z) {
        JSONObject a = C12592m.m22690a(jSONObject, "network_image_modules");
        if (a != null) {
            JSONObject a2 = C12592m.m22690a(a, "network");
            if (a2 != null) {
                this.f29974k = C12592m.m22693b(a2, "api_block_list");
                this.f29975l = C12592m.m22695d(a2, "api_block_list");
                this.f29976m = C12592m.m22694c(a2, "api_allow_list");
                this.f29977n = C12592m.m22696e(a2, "api_allow_list");
                boolean z2 = false;
                this.f29968c = a2.optInt("enable_api_all_upload", 0);
                this.f29969d = a2.optBoolean("enable_trace_log", true);
                this.f29973j = a2.optInt("enable_api_error_upload", 1);
                if (a2.optInt("enable_cancel_error_report") == 1) {
                    z2 = true;
                }
                this.f29981r = z2;
                this.f29979p = C12592m.m22694c(a2, "request_allow_header");
                this.f29980q = C12592m.m22694c(a2, "response_allow_header");
                this.f29982s = a2.optDouble("enable_base_api_all", 0.0d);
            }
            JSONObject a3 = C12592m.m22690a(a, "image");
            if (a3 != null) {
                this.f29978o = C12592m.m22694c(a3, "image_allow_list");
            }
        }
    }

    /* renamed from: a */
    private static void m22305a(List<String> list, JSONObject jSONObject, String str) {
        if (list != null && jSONObject != null) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    try {
                        String optString = jSONObject.optString(str);
                        if (!TextUtils.isEmpty(optString)) {
                            JSONObject jSONObject2 = new JSONObject(optString);
                            JSONObject jSONObject3 = new JSONObject();
                            Iterator<String> keys = jSONObject2.keys();
                            while (keys.hasNext()) {
                                String next = keys.next();
                                if (list.contains(next)) {
                                    jSONObject3.put(next, jSONObject2.opt(next));
                                }
                            }
                            jSONObject.put(str, jSONObject3.toString());
                        }
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}
