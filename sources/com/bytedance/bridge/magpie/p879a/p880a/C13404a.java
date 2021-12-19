package com.bytedance.bridge.magpie.p879a.p880a;

import com.bytedance.bridge.magpie.p883b.C13431b;
import com.bytedance.covode.number.Covode;
import java.util.List;
import java.util.regex.Pattern;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.bridge.magpie.a.a.a */
public final class C13404a {

    /* renamed from: a */
    public Pattern f32699a;

    /* renamed from: b */
    public C13431b.EnumC13432a f32700b;

    /* renamed from: c */
    public List<String> f32701c;

    /* renamed from: d */
    public List<String> f32702d;

    static {
        Covode.recordClassIndex(15404);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13404a)) {
            return false;
        }
        C13404a aVar = (C13404a) obj;
        return C89219l.m154714a(this.f32699a, aVar.f32699a) && C89219l.m154714a(this.f32700b, aVar.f32700b) && C89219l.m154714a(this.f32701c, aVar.f32701c) && C89219l.m154714a(this.f32702d, aVar.f32702d);
    }

    public final int hashCode() {
        Pattern pattern = this.f32699a;
        int i = 0;
        int hashCode = (pattern != null ? pattern.hashCode() : 0) * 31;
        C13431b.EnumC13432a aVar = this.f32700b;
        int hashCode2 = (hashCode + (aVar != null ? aVar.hashCode() : 0)) * 31;
        List<String> list = this.f32701c;
        int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        List<String> list2 = this.f32702d;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        return "PermissionConfig(pattern=" + this.f32699a + ", access=" + this.f32700b + ", includedMethods=" + this.f32701c + ", excludedMethods=" + this.f32702d + ")";
    }

    public C13404a(Pattern pattern, C13431b.EnumC13432a aVar, List<String> list, List<String> list2) {
        C89219l.m154719c(aVar, "");
        C89219l.m154719c(list, "");
        C89219l.m154719c(list2, "");
        this.f32699a = pattern;
        this.f32700b = aVar;
        this.f32701c = list;
        this.f32702d = list2;
    }
}
