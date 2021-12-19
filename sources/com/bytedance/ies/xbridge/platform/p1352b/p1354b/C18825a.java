package com.bytedance.ies.xbridge.platform.p1352b.p1354b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.AbstractC18659k;
import com.bytedance.ies.xbridge.AbstractC18700m;
import com.bytedance.ies.xbridge.AbstractC18754n;
import com.bytedance.ies.xbridge.EnumC18805o;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.ies.xbridge.platform.b.b.a */
public final class C18825a implements AbstractC18659k {

    /* renamed from: a */
    private final Object f44632a;

    static {
        Covode.recordClassIndex(21521);
    }

    @Override // com.bytedance.ies.xbridge.AbstractC18659k
    /* renamed from: b */
    public final boolean mo29708b() {
        Object obj = this.f44632a;
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        throw new Exception("Dynamic is not Boolean");
    }

    @Override // com.bytedance.ies.xbridge.AbstractC18659k
    /* renamed from: d */
    public final int mo29710d() {
        Object obj = this.f44632a;
        if (obj instanceof Integer) {
            return ((Number) obj).intValue();
        }
        throw new Exception("Dynamic is not Int");
    }

    @Override // com.bytedance.ies.xbridge.AbstractC18659k
    /* renamed from: e */
    public final String mo29711e() {
        Object obj = this.f44632a;
        if (obj instanceof String) {
            return (String) obj;
        }
        throw new Exception("Dynamic is not String");
    }

    @Override // com.bytedance.ies.xbridge.AbstractC18659k
    /* renamed from: f */
    public final AbstractC18700m mo29712f() {
        if (this.f44632a instanceof JSONArray) {
            return new C18827c((JSONArray) this.f44632a);
        }
        throw new Exception("Dynamic is not JSONArray");
    }

    @Override // com.bytedance.ies.xbridge.AbstractC18659k
    /* renamed from: g */
    public final AbstractC18754n mo29713g() {
        if (this.f44632a instanceof JSONObject) {
            return new C18828d((JSONObject) this.f44632a);
        }
        throw new Exception("Dynamic is not JSONObject");
    }

    @Override // com.bytedance.ies.xbridge.AbstractC18659k
    /* renamed from: a */
    public final EnumC18805o mo29707a() {
        Object obj = this.f44632a;
        if (obj instanceof JSONArray) {
            return EnumC18805o.Array;
        }
        if (obj instanceof Boolean) {
            return EnumC18805o.Boolean;
        }
        if (obj instanceof JSONObject) {
            return EnumC18805o.Map;
        }
        if (obj instanceof Integer) {
            return EnumC18805o.Int;
        }
        if (obj instanceof Number) {
            return EnumC18805o.Number;
        }
        if (obj instanceof String) {
            return EnumC18805o.String;
        }
        return EnumC18805o.Null;
    }

    @Override // com.bytedance.ies.xbridge.AbstractC18659k
    /* renamed from: c */
    public final double mo29709c() {
        Object obj = this.f44632a;
        if (obj instanceof Double) {
            return ((Number) obj).doubleValue();
        }
        if (obj instanceof Integer) {
            return (double) ((Number) obj).intValue();
        }
        if (obj instanceof Float) {
            return (double) ((Number) obj).floatValue();
        }
        if (obj instanceof Long) {
            return (double) ((Number) obj).longValue();
        }
        throw new Exception("Dynamic is not Double");
    }

    public C18825a(Object obj) {
        this.f44632a = obj;
    }
}
