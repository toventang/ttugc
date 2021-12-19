package com.p2082ss.android.ugc.aweme.homepage.story.icon;

import com.bytedance.assem.arch.extensions.C12776a;
import com.bytedance.assem.arch.viewModel.AbstractC12853j;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.homepage.story.icon.i */
public final class C53173i implements AbstractC12853j {

    /* renamed from: a */
    public final C12776a<Boolean> f122199a;

    static {
        Covode.recordClassIndex(62721);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C53173i) && C89219l.m154714a(this.f122199a, ((C53173i) obj).f122199a);
        }
        return true;
    }

    public final int hashCode() {
        C12776a<Boolean> aVar = this.f122199a;
        if (aVar != null) {
            return aVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "StoryIconState(needStoryIconRefresh=" + this.f122199a + ")";
    }

    public /* synthetic */ C53173i() {
        this(new C12776a(false));
    }

    public C53173i(C12776a<Boolean> aVar) {
        C89219l.m154721d(aVar, "");
        this.f122199a = aVar;
    }
}
