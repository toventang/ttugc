package com.bytedance.android.ecommerce.p164j;

import com.bytedance.android.ecommerce.p153a.C2733a;
import com.bytedance.android.ecommerce.p153a.C2746f;
import com.bytedance.android.ecommerce.p153a.C2752l;
import com.bytedance.android.ecommerce.p159e.C2778c;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.ecommerce.j.a */
public final class C2802a implements AbstractC2806e {

    /* renamed from: a */
    public JSONArray f8388a;

    /* renamed from: b */
    public JSONArray f8389b;

    /* renamed from: c */
    public JSONArray f8390c;

    /* renamed from: d */
    private List<C2733a> f8391d = new ArrayList();

    /* renamed from: e */
    private List<C2746f> f8392e = new ArrayList();

    /* renamed from: f */
    private Map<String, C2746f> f8393f = new HashMap();

    /* renamed from: g */
    private AbstractC2811j f8394g;

    /* renamed from: h */
    private Map<String, C2752l> f8395h = new HashMap();

    /* renamed from: i */
    private Map<String, C2752l> f8396i = new HashMap();

    /* renamed from: j */
    private Map<String, C2733a> f8397j = new HashMap();

    static {
        Covode.recordClassIndex(3228);
    }

    @Override // com.bytedance.android.ecommerce.p164j.AbstractC2806e
    /* renamed from: b */
    public final C2746f mo7386b(String str) {
        return this.f8393f.get(str);
    }

    @Override // com.bytedance.android.ecommerce.p164j.AbstractC2806e
    /* renamed from: c */
    public final String mo7387c(String str) {
        return this.f8394g.mo7404a(C2778c.f8362a.mo7372d().f8326l, str);
    }

    @Override // com.bytedance.android.ecommerce.p164j.AbstractC2806e
    /* renamed from: d */
    public final C2733a mo7388d(String str) {
        return this.f8397j.get(str);
    }

    @Override // com.bytedance.android.ecommerce.p164j.AbstractC2806e
    /* renamed from: a */
    public final C2733a mo7385a(String str) {
        for (C2733a aVar : this.f8391d) {
            if (Pattern.matches(aVar.f8148c, str)) {
                return aVar;
            }
        }
        return null;
    }

    public C2802a(JSONArray jSONArray, JSONArray jSONArray2, JSONArray jSONArray3, AbstractC2811j jVar) {
        this.f8388a = jSONArray;
        this.f8389b = jSONArray2;
        this.f8390c = jSONArray3;
        this.f8394g = jVar;
        if (this.f8388a != null) {
            for (int i = 0; i < this.f8388a.length(); i++) {
                try {
                    C2733a aVar = new C2733a((JSONObject) this.f8388a.get(i));
                    this.f8391d.add(aVar);
                    this.f8397j.put(aVar.f8152g, aVar);
                } catch (Throwable unused) {
                }
            }
        }
        if (this.f8389b != null) {
            for (int i2 = 0; i2 < this.f8389b.length(); i2++) {
                try {
                    C2746f fVar = new C2746f((JSONObject) this.f8389b.get(i2));
                    this.f8392e.add(fVar);
                    this.f8393f.put(fVar.f8238a, fVar);
                    for (C2746f fVar2 : fVar.f8253p) {
                        this.f8392e.add(fVar2);
                        this.f8393f.put(fVar2.f8238a, fVar2);
                    }
                } catch (Throwable unused2) {
                }
            }
        }
        if (this.f8390c != null) {
            for (int i3 = 0; i3 < this.f8390c.length(); i3++) {
                try {
                    C2752l lVar = new C2752l((JSONObject) this.f8390c.get(i3));
                    this.f8395h.put(lVar.f8286h, lVar);
                    this.f8396i.put(lVar.f8279a, lVar);
                } catch (Throwable unused3) {
                }
            }
        }
    }
}
