package com.p2082ss.android.ugc.aweme.story.edit.business.shared.toolbar;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.toolbar.n */
public final class C77092n {

    /* renamed from: a */
    public final int f172924a;

    /* renamed from: b */
    public final String f172925b;

    static {
        Covode.recordClassIndex(90093);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C77092n)) {
            return false;
        }
        C77092n nVar = (C77092n) obj;
        return this.f172924a == nVar.f172924a && C89219l.m154714a(this.f172925b, nVar.f172925b);
    }

    public final int hashCode() {
        int i = this.f172924a * 31;
        String str = this.f172925b;
        return i + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "ToolbarClickEvent(type=" + this.f172924a + ", enterMethod=" + this.f172925b + ")";
    }

    public /* synthetic */ C77092n(int i) {
        this(i, "click_button");
    }

    public C77092n(int i, String str) {
        C89219l.m154721d(str, "");
        this.f172924a = i;
        this.f172925b = str;
    }
}
