package com.bytedance.helios.api.p1088b;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.helios.api.b.i */
public final class C15312i {

    /* renamed from: a */
    public Set<String> f37337a;

    /* renamed from: b */
    public List<C15313j> f37338b;

    static {
        Covode.recordClassIndex(17542);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15312i)) {
            return false;
        }
        C15312i iVar = (C15312i) obj;
        return C89219l.m154714a(this.f37337a, iVar.f37337a) && C89219l.m154714a(this.f37338b, iVar.f37338b);
    }

    public final int hashCode() {
        Set<String> set = this.f37337a;
        int i = 0;
        int hashCode = (set != null ? set.hashCode() : 0) * 31;
        List<C15313j> list = this.f37338b;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "FrequencyExtra(frequencyNames=" + this.f37337a + ", frequencyLogs=" + this.f37338b + ")";
    }

    public /* synthetic */ C15312i() {
        this(new LinkedHashSet(), new ArrayList());
    }

    private C15312i(Set<String> set, List<C15313j> list) {
        C89219l.m154719c(set, "");
        C89219l.m154719c(list, "");
        this.f37337a = set;
        this.f37338b = list;
    }
}
