package com.bytedance.bpea.basics;

import com.bytedance.covode.number.Covode;
import java.util.LinkedHashMap;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.bpea.basics.h */
public final class C13347h {

    /* renamed from: a */
    public final Map<String, Object> f32618a = new LinkedHashMap();

    /* renamed from: b */
    public int f32619b;

    /* renamed from: c */
    public String f32620c;

    static {
        Covode.recordClassIndex(15343);
    }

    public final String toString() {
        return "CheckResult(code=" + this.f32619b + ", msg='" + this.f32620c + "', extraMap=" + this.f32618a + ')';
    }

    /* renamed from: a */
    public final void mo21571a(String str, Object obj) {
        C89219l.m154719c(str, "");
        this.f32618a.put(str, obj);
    }

    public C13347h(int i, String str) {
        C89219l.m154719c(str, "");
        this.f32619b = i;
        this.f32620c = str;
    }
}
