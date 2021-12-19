package com.lynx.tasm.p2054c;

import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.lynx.tasm.c.e */
public class C28727e extends C28724b {

    /* renamed from: a */
    private String f67740a;

    /* renamed from: b */
    private HashMap<String, Object> f67741b;

    static {
        Covode.recordClassIndex(34821);
    }

    @Override // com.lynx.tasm.p2054c.C28724b
    /* renamed from: a */
    public final Map<String, Object> mo30096a() {
        HashMap<String, Object> hashMap = this.f67741b;
        if (hashMap == null) {
            return null;
        }
        return hashMap;
    }

    @Override // com.lynx.tasm.p2054c.C28724b
    /* renamed from: b */
    public final String mo30328b() {
        String str = this.f67740a;
        if (str != null) {
            return str;
        }
        return "params";
    }

    public C28727e(int i, String str) {
        super(i, str);
    }

    /* renamed from: a */
    public final void mo49839a(String str, HashMap<String, Object> hashMap) {
        this.f67740a = str;
        this.f67741b = hashMap;
    }
}
