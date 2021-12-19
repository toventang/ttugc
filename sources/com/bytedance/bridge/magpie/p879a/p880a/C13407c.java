package com.bytedance.bridge.magpie.p879a.p880a;

import com.bytedance.bridge.magpie.p883b.C13431b;
import com.bytedance.covode.number.Covode;
import java.util.LinkedHashSet;
import java.util.Set;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.bridge.magpie.a.a.c */
public final class C13407c {

    /* renamed from: a */
    public C13431b.EnumC13432a f32707a;

    /* renamed from: b */
    public Set<String> f32708b;

    /* renamed from: c */
    public Set<String> f32709c;

    static {
        Covode.recordClassIndex(15407);
    }

    public C13407c() {
        this(null, null, null, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13407c)) {
            return false;
        }
        C13407c cVar = (C13407c) obj;
        return C89219l.m154714a(this.f32707a, cVar.f32707a) && C89219l.m154714a(this.f32708b, cVar.f32708b) && C89219l.m154714a(this.f32709c, cVar.f32709c);
    }

    public final int hashCode() {
        C13431b.EnumC13432a aVar = this.f32707a;
        int i = 0;
        int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
        Set<String> set = this.f32708b;
        int hashCode2 = (hashCode + (set != null ? set.hashCode() : 0)) * 31;
        Set<String> set2 = this.f32709c;
        if (set2 != null) {
            i = set2.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "PermissionRule(access=" + this.f32707a + ", includedMethods=" + this.f32708b + ", excludedMethods=" + this.f32709c + ")";
    }

    private C13407c(C13431b.EnumC13432a aVar, Set<String> set, Set<String> set2) {
        C89219l.m154719c(aVar, "");
        C89219l.m154719c(set, "");
        C89219l.m154719c(set2, "");
        this.f32707a = aVar;
        this.f32708b = set;
        this.f32709c = set2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13407c(C13431b.EnumC13432a aVar, Set set, Set set2, int i) {
        this((i & 1) != 0 ? C13431b.EnumC13432a.PUBLIC : aVar, (i & 2) != 0 ? new LinkedHashSet() : set, (i & 4) != 0 ? new LinkedHashSet() : set2);
    }
}
