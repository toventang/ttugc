package com.bytedance.android.livesdk.p604qa;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.ArrayList;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.qa.ah */
public final class C10190ah {
    @AbstractC27891c(mo46611a = "questions")

    /* renamed from: a */
    public ArrayList<C10188af> f24697a;
    @AbstractC27891c(mo46611a = "has_more")

    /* renamed from: b */
    public boolean f24698b;

    static {
        Covode.recordClassIndex(11756);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10190ah)) {
            return false;
        }
        C10190ah ahVar = (C10190ah) obj;
        return C89219l.m154714a(this.f24697a, ahVar.f24697a) && this.f24698b == ahVar.f24698b;
    }

    public final int hashCode() {
        ArrayList<C10188af> arrayList = this.f24697a;
        int hashCode = (arrayList != null ? arrayList.hashCode() : 0) * 31;
        boolean z = this.f24698b;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        return hashCode + i;
    }

    public final String toString() {
        return "QuestionList(questionExList=" + this.f24697a + ", hasMore=" + this.f24698b + ")";
    }

    public /* synthetic */ C10190ah() {
        this(new ArrayList());
    }

    private C10190ah(ArrayList<C10188af> arrayList) {
        C89219l.m154721d(arrayList, "");
        this.f24697a = arrayList;
        this.f24698b = false;
    }
}
