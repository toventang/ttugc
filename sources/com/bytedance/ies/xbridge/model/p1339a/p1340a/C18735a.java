package com.bytedance.ies.xbridge.model.p1339a.p1340a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.AbstractC18659k;
import com.bytedance.ies.xbridge.AbstractC18700m;
import com.bytedance.ies.xbridge.AbstractC18754n;
import com.bytedance.ies.xbridge.EnumC18805o;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.ies.xbridge.model.a.a.a */
public final class C18735a implements AbstractC18659k {

    /* renamed from: a */
    private final Object f44520a;

    static {
        Covode.recordClassIndex(21429);
    }

    @Override // com.bytedance.ies.xbridge.AbstractC18659k
    /* renamed from: b */
    public final boolean mo29708b() {
        Object obj = this.f44520a;
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        throw new IllegalArgumentException("Dynamic is not Boolean");
    }

    @Override // com.bytedance.ies.xbridge.AbstractC18659k
    /* renamed from: d */
    public final int mo29710d() {
        Object obj = this.f44520a;
        if (obj instanceof Integer) {
            return ((Number) obj).intValue();
        }
        throw new IllegalArgumentException("Dynamic is not Int");
    }

    @Override // com.bytedance.ies.xbridge.AbstractC18659k
    /* renamed from: e */
    public final String mo29711e() {
        Object obj = this.f44520a;
        if (obj instanceof String) {
            return (String) obj;
        }
        throw new IllegalArgumentException("Dynamic is not String");
    }

    @Override // com.bytedance.ies.xbridge.AbstractC18659k
    /* renamed from: f */
    public final AbstractC18700m mo29712f() {
        if (this.f44520a instanceof JSONArray) {
            return new C18737c((JSONArray) this.f44520a);
        }
        throw new IllegalArgumentException("Dynamic is not JSONArray");
    }

    @Override // com.bytedance.ies.xbridge.AbstractC18659k
    /* renamed from: g */
    public final AbstractC18754n mo29713g() {
        if (this.f44520a instanceof JSONObject) {
            return new C18738d((JSONObject) this.f44520a);
        }
        throw new IllegalArgumentException("Dynamic is not JSONObject");
    }

    @Override // com.bytedance.ies.xbridge.AbstractC18659k
    /* renamed from: a */
    public final EnumC18805o mo29707a() {
        Object obj = this.f44520a;
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
        Object obj = this.f44520a;
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
        throw new IllegalArgumentException("Dynamic is not Double");
    }

    public C18735a(Object obj) {
        this.f44520a = obj;
    }
}
