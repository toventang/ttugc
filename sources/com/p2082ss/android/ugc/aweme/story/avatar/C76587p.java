package com.p2082ss.android.ugc.aweme.story.avatar;

import com.bytedance.assem.arch.extensions.C12776a;
import com.bytedance.assem.arch.viewModel.AbstractC12853j;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.avatar.p */
public final class C76587p implements AbstractC12853j {

    /* renamed from: a */
    public final C12776a<String> f171907a;

    static {
        Covode.recordClassIndex(89572);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C76587p) && C89219l.m154714a(this.f171907a, ((C76587p) obj).f171907a);
        }
        return true;
    }

    public final int hashCode() {
        C12776a<String> aVar = this.f171907a;
        if (aVar != null) {
            return aVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "StoryAvatarState(refreshEvent=" + this.f171907a + ")";
    }

    public /* synthetic */ C76587p() {
        this(new C12776a(""));
    }

    public C76587p(C12776a<String> aVar) {
        C89219l.m154721d(aVar, "");
        this.f171907a = aVar;
    }
}
