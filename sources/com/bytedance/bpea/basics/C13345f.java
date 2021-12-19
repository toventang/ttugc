package com.bytedance.bpea.basics;

import com.bytedance.covode.number.Covode;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.bpea.basics.f */
public final class C13345f {

    /* renamed from: a */
    public String f32611a;

    /* renamed from: b */
    public String[] f32612b;

    /* renamed from: c */
    public Integer f32613c;

    /* renamed from: d */
    public C13351l f32614d = new C13351l();

    /* renamed from: e */
    public final Map<String, Object> f32615e = new LinkedHashMap();

    static {
        Covode.recordClassIndex(15341);
    }

    public final String toString() {
        String str;
        StringBuilder append = new StringBuilder("[entryToken:").append(this.f32611a).append(";entryDataTypes:");
        String[] strArr = this.f32612b;
        if (strArr != null) {
            str = Arrays.toString(strArr);
            C89219l.m154709a((Object) str, "");
        } else {
            str = null;
        }
        return append.append(str).append(";entryCategory:").append(this.f32613c).append(";entryExtraInfo:").append(this.f32615e).append(']').toString();
    }

    /* renamed from: a */
    public final void mo21568a(String str, String str2) {
        C89219l.m154719c(str, "");
        this.f32615e.put(str, str2);
    }
}
