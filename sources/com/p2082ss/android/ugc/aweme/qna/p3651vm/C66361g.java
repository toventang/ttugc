package com.p2082ss.android.ugc.aweme.qna.p3651vm;

import com.bytedance.assem.arch.extensions.AbstractC12783f;
import com.bytedance.assem.arch.extensions.C12797s;
import com.bytedance.assem.arch.viewModel.AbstractC12853j;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.question.model.C66575a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.qna.vm.g */
public final class C66361g implements AbstractC12853j {

    /* renamed from: a */
    public final AbstractC12783f<C66575a> f149238a;

    /* renamed from: b */
    public final EnumC66359e f149239b;

    static {
        Covode.recordClassIndex(77879);
    }

    /* renamed from: a */
    public static C66361g m118020a(AbstractC12783f<C66575a> fVar, EnumC66359e eVar) {
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(eVar, "");
        return new C66361g(fVar, eVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C66361g)) {
            return false;
        }
        C66361g gVar = (C66361g) obj;
        return C89219l.m154714a(this.f149238a, gVar.f149238a) && C89219l.m154714a(this.f149239b, gVar.f149239b);
    }

    public final int hashCode() {
        AbstractC12783f<C66575a> fVar = this.f149238a;
        int i = 0;
        int hashCode = (fVar != null ? fVar.hashCode() : 0) * 31;
        EnumC66359e eVar = this.f149239b;
        if (eVar != null) {
            i = eVar.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "QnaCreationState(response=" + this.f149238a + ", event=" + this.f149239b + ")";
    }

    public /* synthetic */ C66361g() {
        this(C12797s.f31127a, EnumC66359e.PUBLISH_NONE);
    }

    private C66361g(AbstractC12783f<C66575a> fVar, EnumC66359e eVar) {
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(eVar, "");
        this.f149238a = fVar;
        this.f149239b = eVar;
    }
}
