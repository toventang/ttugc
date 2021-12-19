package com.bytedance.ies.web.jsbridge2;

import com.bytedance.covode.number.Covode;
import java.lang.reflect.Type;
import org.json.JSONArray;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.ies.web.jsbridge2.i */
public final class C18343i {

    /* renamed from: a */
    public final AbstractC18354n f43882a;

    /* renamed from: b */
    public boolean f43883b;

    static {
        Covode.recordClassIndex(21015);
    }

    private C18343i(AbstractC18354n nVar) {
        this.f43882a = nVar;
    }

    /* renamed from: a */
    static C18343i m34119a(AbstractC18354n nVar) {
        return new C18343i(nVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final <T> String mo29364a(T t) {
        String str;
        if (t == null) {
            return "{}";
        }
        if ((t instanceof JSONObject) || (t instanceof JSONArray)) {
            str = t.toString();
        } else {
            str = this.f43882a.mo13334a(t);
        }
        m34120a(str);
        return str;
    }

    /* renamed from: a */
    private static void m34120a(String str) {
        if (!str.startsWith("{") || !str.endsWith("}")) {
            C18344j.m34123a((RuntimeException) new IllegalArgumentException("Param is not allowed to be List or JSONArray, rawString:\n ".concat(String.valueOf(str))));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final <T> T mo29363a(String str, Type type) {
        m34120a(str);
        return (type.equals(JSONObject.class) || ((type instanceof Class) && JSONObject.class.isAssignableFrom((Class) type))) ? (T) new JSONObject(str) : (T) this.f43882a.mo13333a(str, type);
    }
}
