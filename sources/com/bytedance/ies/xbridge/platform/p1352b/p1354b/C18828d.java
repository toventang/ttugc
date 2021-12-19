package com.bytedance.ies.xbridge.platform.p1352b.p1354b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.AbstractC18659k;
import com.bytedance.ies.xbridge.AbstractC18687l;
import com.bytedance.ies.xbridge.AbstractC18700m;
import com.bytedance.ies.xbridge.AbstractC18754n;
import com.bytedance.ies.xbridge.EnumC18805o;
import com.bytedance.ies.xbridge.platform.p1352b.C18820a;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xbridge.platform.b.b.d */
public final class C18828d implements AbstractC18754n {

    /* renamed from: a */
    private final JSONObject f44635a;

    static {
        Covode.recordClassIndex(21524);
    }

    @Override // com.bytedance.ies.xbridge.AbstractC18754n
    /* renamed from: b */
    public final Map<String, Object> mo29758b() {
        return C18820a.m34920a(this.f44635a);
    }

    @Override // com.bytedance.ies.xbridge.AbstractC18754n
    /* renamed from: a */
    public final AbstractC18687l mo29756a() {
        Iterator<String> keys = this.f44635a.keys();
        C89219l.m154709a((Object) keys, "");
        return new C18826b(keys);
    }

    public C18828d(JSONObject jSONObject) {
        C89219l.m154719c(jSONObject, "");
        this.f44635a = jSONObject;
    }

    @Override // com.bytedance.ies.xbridge.AbstractC18754n
    /* renamed from: a */
    public final boolean mo29757a(String str) {
        C89219l.m154719c(str, "");
        return this.f44635a.has(str);
    }

    @Override // com.bytedance.ies.xbridge.AbstractC18754n
    /* renamed from: b */
    public final boolean mo29759b(String str) {
        C89219l.m154719c(str, "");
        return this.f44635a.isNull(str);
    }

    @Override // com.bytedance.ies.xbridge.AbstractC18754n
    /* renamed from: c */
    public final boolean mo29760c(String str) {
        C89219l.m154719c(str, "");
        return this.f44635a.optBoolean(str);
    }

    @Override // com.bytedance.ies.xbridge.AbstractC18754n
    /* renamed from: d */
    public final double mo29761d(String str) {
        C89219l.m154719c(str, "");
        return this.f44635a.optDouble(str);
    }

    @Override // com.bytedance.ies.xbridge.AbstractC18754n
    /* renamed from: e */
    public final int mo29762e(String str) {
        C89219l.m154719c(str, "");
        return this.f44635a.optInt(str);
    }

    @Override // com.bytedance.ies.xbridge.AbstractC18754n
    /* renamed from: f */
    public final String mo29763f(String str) {
        C89219l.m154719c(str, "");
        String optString = this.f44635a.optString(str);
        C89219l.m154709a((Object) optString, "");
        return optString;
    }

    @Override // com.bytedance.ies.xbridge.AbstractC18754n
    /* renamed from: g */
    public final AbstractC18700m mo29764g(String str) {
        C89219l.m154719c(str, "");
        JSONArray optJSONArray = this.f44635a.optJSONArray(str);
        if (optJSONArray == null) {
            return null;
        }
        return new C18827c(optJSONArray);
    }

    @Override // com.bytedance.ies.xbridge.AbstractC18754n
    /* renamed from: h */
    public final AbstractC18754n mo29765h(String str) {
        C89219l.m154719c(str, "");
        JSONObject optJSONObject = this.f44635a.optJSONObject(str);
        if (optJSONObject == null) {
            return null;
        }
        return new C18828d(optJSONObject);
    }

    @Override // com.bytedance.ies.xbridge.AbstractC18754n
    /* renamed from: i */
    public final AbstractC18659k mo29766i(String str) {
        C89219l.m154719c(str, "");
        return new C18825a(this.f44635a.opt(str));
    }

    @Override // com.bytedance.ies.xbridge.AbstractC18754n
    /* renamed from: j */
    public final EnumC18805o mo29767j(String str) {
        C89219l.m154719c(str, "");
        Object opt = this.f44635a.opt(str);
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
