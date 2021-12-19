package com.bytedance.crash.p932j;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* renamed from: com.bytedance.crash.j.n */
public final class C13926n {

    /* renamed from: a */
    public final int f33927a;

    /* renamed from: b */
    public String f33928b;

    /* renamed from: c */
    public JSONObject f33929c;

    /* renamed from: d */
    public byte[] f33930d;

    static {
        Covode.recordClassIndex(15986);
    }

    /* renamed from: a */
    public final boolean mo22410a() {
        if (this.f33927a != 207) {
            return true;
        }
        return false;
    }

    public C13926n(int i) {
        this.f33927a = i;
    }

    public C13926n(String str) {
        this.f33927a = 206;
        this.f33928b = str;
    }

    public C13926n(JSONObject jSONObject) {
        this.f33927a = 0;
        this.f33929c = jSONObject;
    }

    public C13926n(byte[] bArr) {
        this.f33927a = 204;
        this.f33930d = bArr;
    }

    public C13926n(int i, Throwable th) {
        this.f33927a = i;
        this.f33928b = th.getMessage();
    }
}
