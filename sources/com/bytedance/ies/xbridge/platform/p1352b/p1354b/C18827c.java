package com.bytedance.ies.xbridge.platform.p1352b.p1354b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.AbstractC18659k;
import com.bytedance.ies.xbridge.AbstractC18700m;
import com.bytedance.ies.xbridge.AbstractC18754n;
import com.bytedance.ies.xbridge.EnumC18805o;
import com.bytedance.ies.xbridge.platform.p1352b.C18820a;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xbridge.platform.b.b.c */
public final class C18827c implements AbstractC18700m {

    /* renamed from: a */
    private final JSONArray f44634a;

    static {
        Covode.recordClassIndex(21523);
    }

    @Override // com.bytedance.ies.xbridge.AbstractC18700m
    /* renamed from: a */
    public final int mo29730a() {
        return this.f44634a.length();
    }

    @Override // com.bytedance.ies.xbridge.AbstractC18700m
    /* renamed from: b */
    public final List<Object> mo29733b() {
        return C18820a.m34919a(this.f44634a);
    }

    @Override // com.bytedance.ies.xbridge.AbstractC18700m
    /* renamed from: b */
    public final double mo29732b(int i) {
        return this.f44634a.optDouble(i);
    }

    @Override // com.bytedance.ies.xbridge.AbstractC18700m
    /* renamed from: c */
    public final int mo29734c(int i) {
        return this.f44634a.optInt(i);
    }

    public C18827c(JSONArray jSONArray) {
        C89219l.m154719c(jSONArray, "");
        this.f44634a = jSONArray;
    }

    @Override // com.bytedance.ies.xbridge.AbstractC18700m
    /* renamed from: a */
    public final boolean mo29731a(int i) {
        return this.f44634a.optBoolean(i);
    }

    @Override // com.bytedance.ies.xbridge.AbstractC18700m
    /* renamed from: d */
    public final String mo29735d(int i) {
        String optString = this.f44634a.optString(i);
        C89219l.m154709a((Object) optString, "");
        return optString;
    }

    @Override // com.bytedance.ies.xbridge.AbstractC18700m
    /* renamed from: e */
    public final AbstractC18700m mo29736e(int i) {
        JSONArray optJSONArray = this.f44634a.optJSONArray(i);
        if (optJSONArray == null) {
            return null;
        }
        return new C18827c(optJSONArray);
    }

    @Override // com.bytedance.ies.xbridge.AbstractC18700m
    /* renamed from: f */
    public final AbstractC18754n mo29737f(int i) {
        JSONObject optJSONObject = this.f44634a.optJSONObject(i);
        if (optJSONObject == null) {
            return null;
        }
        return new C18828d(optJSONObject);
    }

    @Override // com.bytedance.ies.xbridge.AbstractC18700m
    /* renamed from: g */
    public final AbstractC18659k mo29738g(int i) {
        return new C18825a(this.f44634a.opt(i));
    }

    @Override // com.bytedance.ies.xbridge.AbstractC18700m
    /* renamed from: h */
    public final EnumC18805o mo29739h(int i) {
        Object opt = this.f44634a.opt(i);
        if (opt instanceof JSONArray) {
            return EnumC18805o.Array;
        }
        if (opt instanceof Boolean) {
            return EnumC18805o.Boolean;
        }
        if (opt instanceof JSONObject) {
            return EnumC18805o.Map;
        }
        if (opt instanceof Integer) {
            return EnumC18805o.Int;
        }
        if (opt instanceof Number) {
            return EnumC18805o.Number;
        }
        if (opt instanceof String) {
            return EnumC18805o.String;
        }
        return EnumC18805o.Null;
    }
}
