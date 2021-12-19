package com.lynx.tasm.p2054c;

import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.lynx.tasm.c.c */
public class C28725c extends C28724b {

    /* renamed from: a */
    private Map<String, Object> f67737a = new HashMap();

    static {
        Covode.recordClassIndex(34819);
    }

    @Override // com.lynx.tasm.p2054c.C28724b
    /* renamed from: b */
    public final String mo30328b() {
        return "detail";
    }

    @Override // com.lynx.tasm.p2054c.C28724b
    /* renamed from: a */
    public final Map<String, Object> mo30096a() {
        return this.f67737a;
    }

    /* renamed from: a */
    public final void mo49838a(String str, Object obj) {
        this.f67737a.put(str, obj);
    }

    public C28725c(int i, String str) {
        super(i, str);
    }
}
