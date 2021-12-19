package com.p2082ss.android.ugc.aweme.homepage.story.feed;

import com.bytedance.assem.arch.extensions.C12776a;
import com.bytedance.assem.arch.viewModel.AbstractC12853j;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.homepage.story.feed.d */
public final class C53110d implements AbstractC12853j {

    /* renamed from: a */
    public final int f122127a;

    /* renamed from: b */
    public final int f122128b;

    /* renamed from: c */
    public final C12776a<C53108b> f122129c;

    /* renamed from: d */
    public final C12776a<String> f122130d;

    /* renamed from: e */
    public final C12776a<Boolean> f122131e;

    /* renamed from: f */
    public final C12776a<Boolean> f122132f;

    static {
        Covode.recordClassIndex(62656);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C53110d)) {
            return false;
        }
        C53110d dVar = (C53110d) obj;
        return this.f122127a == dVar.f122127a && this.f122128b == dVar.f122128b && C89219l.m154714a(this.f122129c, dVar.f122129c) && C89219l.m154714a(this.f122130d, dVar.f122130d) && C89219l.m154714a(this.f122131e, dVar.f122131e) && C89219l.m154714a(this.f122132f, dVar.f122132f);
    }

    public final int hashCode() {
        int i = ((this.f122127a * 31) + this.f122128b) * 31;
        C12776a<C53108b> aVar = this.f122129c;
        int i2 = 0;
        int hashCode = (i + (aVar != null ? aVar.hashCode() : 0)) * 31;
        C12776a<String> aVar2 = this.f122130d;
        int hashCode2 = (hashCode + (aVar2 != null ? aVar2.hashCode() : 0)) * 31;
        C12776a<Boolean> aVar3 = this.f122131e;
        int hashCode3 = (hashCode2 + (aVar3 != null ? aVar3.hashCode() : 0)) * 31;
        C12776a<Boolean> aVar4 = this.f122132f;
        if (aVar4 != null) {
            i2 = aVar4.hashCode();
        }
        return hashCode3 + i2;
    }

    public final String toString() {
        return "StoryFeedState(sidebarStatus=" + this.f122127a + ", refreshStatus=" + this.f122128b + ", containerMessage=" + this.f122129c + ", needSidebarOpen=" + this.f122130d + ", needSidebarClose=" + this.f122131e + ", needStoryIconRefresh=" + this.f122132f + ")";
    }

    public /* synthetic */ C53110d() {
        this(0, 0, new C12776a(new C53108b(false, null, 3)), new C12776a("auto"), new C12776a(false), new C12776a(false));
    }

    private C53110d(int i, int i2, C12776a<C53108b> aVar, C12776a<String> aVar2, C12776a<Boolean> aVar3, C12776a<Boolean> aVar4) {
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(aVar2, "");
        C89219l.m154721d(aVar3, "");
        C89219l.m154721d(aVar4, "");
        this.f122127a = i;
        this.f122128b = i2;
        this.f122129c = aVar;
        this.f122130d = aVar2;
        this.f122131e = aVar3;
        this.f122132f = aVar4;
    }

    /* renamed from: a */
    public static /* synthetic */ C53110d m98146a(C53110d dVar, int i, int i2, C12776a aVar, C12776a aVar2, C12776a aVar3, C12776a aVar4, int i3) {
        C12776a aVar5 = aVar4;
        C12776a aVar6 = aVar3;
        int i4 = i;
        int i5 = i2;
        C12776a aVar7 = aVar;
        C12776a aVar8 = aVar2;
        if ((i3 & 1) != 0) {
            i4 = dVar.f122127a;
        }
        if ((i3 & 2) != 0) {
            i5 = dVar.f122128b;
        }
        if ((i3 & 4) != 0) {
            aVar7 = dVar.f122129c;
        }
        if ((i3 & 8) != 0) {
            aVar8 = dVar.f122130d;
        }
        if ((i3 & 16) != 0) {
            aVar6 = dVar.f122131e;
        }
        if ((i3 & 32) != 0) {
            aVar5 = dVar.f122132f;
        }
        C89219l.m154721d(aVar7, "");
        C89219l.m154721d(aVar8, "");
        C89219l.m154721d(aVar6, "");
        C89219l.m154721d(aVar5, "");
        return new C53110d(i4, i5, aVar7, aVar8, aVar6, aVar5);
    }
}
