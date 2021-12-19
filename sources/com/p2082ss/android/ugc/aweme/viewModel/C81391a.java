package com.p2082ss.android.ugc.aweme.viewModel;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.viewModel.a */
public final class C81391a {

    /* renamed from: a */
    public EnumC81392b f181778a;

    /* renamed from: b */
    public EnumC81392b f181779b;

    static {
        Covode.recordClassIndex(94733);
    }

    public C81391a() {
        this(null, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C81391a)) {
            return false;
        }
        C81391a aVar = (C81391a) obj;
        return C89219l.m154714a(this.f181778a, aVar.f181778a) && C89219l.m154714a(this.f181779b, aVar.f181779b);
    }

    public final int hashCode() {
        EnumC81392b bVar = this.f181778a;
        int i = 0;
        int hashCode = (bVar != null ? bVar.hashCode() : 0) * 31;
        EnumC81392b bVar2 = this.f181779b;
        if (bVar2 != null) {
            i = bVar2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "OnboardingStep(onboardingState=" + this.f181778a + ", prevOnboardingState=" + this.f181779b + ")";
    }

    private C81391a(EnumC81392b bVar) {
        C89219l.m154721d(bVar, "");
        this.f181778a = bVar;
        this.f181779b = null;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C81391a(EnumC81392b bVar, int i) {
        this((i & 1) != 0 ? EnumC81392b.NOT_INITIALIZED : bVar);
    }
}
