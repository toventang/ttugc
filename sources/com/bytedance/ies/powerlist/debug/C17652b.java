package com.bytedance.ies.powerlist.debug;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.powerlist.debug.b */
public final class C17652b {

    /* renamed from: a */
    public final RecyclerView f42217a;

    /* renamed from: b */
    public final String f42218b;

    static {
        Covode.recordClassIndex(20206);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17652b)) {
            return false;
        }
        C17652b bVar = (C17652b) obj;
        return C89219l.m154714a(this.f42217a, bVar.f42217a) && C89219l.m154714a(this.f42218b, bVar.f42218b);
    }

    public final int hashCode() {
        RecyclerView recyclerView = this.f42217a;
        int i = 0;
        int hashCode = (recyclerView != null ? recyclerView.hashCode() : 0) * 31;
        String str = this.f42218b;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "FpsInfo(fpsList=" + this.f42217a + ", fpsName=" + this.f42218b + ")";
    }

    public C17652b(RecyclerView recyclerView, String str) {
        C89219l.m154719c(recyclerView, "");
        C89219l.m154719c(str, "");
        this.f42217a = recyclerView;
        this.f42218b = str;
    }
}
