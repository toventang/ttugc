package com.bytedance.p802b.p806b.p807a.p810c;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* renamed from: com.bytedance.b.b.a.c.b */
public final class C12944b {

    /* renamed from: a */
    public byte[] f31523a;

    static {
        Covode.recordClassIndex(14780);
    }

    public final String toString() {
        try {
            return new JSONObject(new String(this.f31523a)).toString();
        } catch (Exception unused) {
            return "";
        }
    }

    public C12944b(byte[] bArr) {
        this.f31523a = bArr;
    }
}
