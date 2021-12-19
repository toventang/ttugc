package com.p2082ss.android.ugc.aweme.comment.page.tag.viewmodel;

import com.bytedance.assem.arch.extensions.C12776a;
import com.bytedance.assem.arch.viewModel.AbstractC12853j;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.comment.page.tag.viewmodel.d */
public final class C36943d implements AbstractC12853j {

    /* renamed from: a */
    public final C12776a<C36940a> f86983a;

    /* renamed from: b */
    public final C12776a<IMUser> f86984b;

    /* renamed from: c */
    public final C12776a<IMUser> f86985c;

    /* renamed from: d */
    public final C12776a<EnumC36941b> f86986d;

    /* renamed from: e */
    public final C12776a<String> f86987e;

    static {
        Covode.recordClassIndex(44285);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C36943d)) {
            return false;
        }
        C36943d dVar = (C36943d) obj;
        return C89219l.m154714a(this.f86983a, dVar.f86983a) && C89219l.m154714a(this.f86984b, dVar.f86984b) && C89219l.m154714a(this.f86985c, dVar.f86985c) && C89219l.m154714a(this.f86986d, dVar.f86986d) && C89219l.m154714a(this.f86987e, dVar.f86987e);
    }

    public final int hashCode() {
        C12776a<C36940a> aVar = this.f86983a;
        int i = 0;
        int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
        C12776a<IMUser> aVar2 = this.f86984b;
        int hashCode2 = (hashCode + (aVar2 != null ? aVar2.hashCode() : 0)) * 31;
        C12776a<IMUser> aVar3 = this.f86985c;
        int hashCode3 = (hashCode2 + (aVar3 != null ? aVar3.hashCode() : 0)) * 31;
        C12776a<EnumC36941b> aVar4 = this.f86986d;
        int hashCode4 = (hashCode3 + (aVar4 != null ? aVar4.hashCode() : 0)) * 31;
        C12776a<String> aVar5 = this.f86987e;
        if (aVar5 != null) {
            i = aVar5.hashCode();
        }
        return hashCode4 + i;
    }

    public final String toString() {
        return "SelectorState(allFriends=" + this.f86983a + ", tagChangedUser=" + this.f86984b + ", blockUser=" + this.f86985c + ", event=" + this.f86986d + ", toast=" + this.f86987e + ")";
    }

    public /* synthetic */ C36943d() {
        this(null, null, null, null, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.bytedance.assem.arch.extensions.a<? extends com.ss.android.ugc.aweme.im.service.model.IMUser> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.bytedance.assem.arch.extensions.a<? extends com.ss.android.ugc.aweme.im.service.model.IMUser> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.bytedance.assem.arch.extensions.a<? extends com.ss.android.ugc.aweme.comment.page.tag.viewmodel.b> */
    /* JADX WARN: Multi-variable type inference failed */
    private C36943d(C12776a<C36940a> aVar, C12776a<? extends IMUser> aVar2, C12776a<? extends IMUser> aVar3, C12776a<? extends EnumC36941b> aVar4, C12776a<String> aVar5) {
        this.f86983a = aVar;
        this.f86984b = aVar2;
        this.f86985c = aVar3;
        this.f86986d = aVar4;
        this.f86987e = aVar5;
    }

    /* renamed from: a */
    public static /* synthetic */ C36943d m74558a(C36943d dVar, C12776a aVar, C12776a aVar2, C12776a aVar3, C12776a aVar4, C12776a aVar5, int i) {
        C12776a aVar6 = aVar5;
        C12776a aVar7 = aVar;
        C12776a aVar8 = aVar2;
        C12776a aVar9 = aVar3;
        C12776a aVar10 = aVar4;
        if ((i & 1) != 0) {
            aVar7 = dVar.f86983a;
        }
        if ((i & 2) != 0) {
            aVar8 = dVar.f86984b;
        }
        if ((i & 4) != 0) {
            aVar9 = dVar.f86985c;
        }
        if ((i & 8) != 0) {
            aVar10 = dVar.f86986d;
        }
        if ((i & 16) != 0) {
            aVar6 = dVar.f86987e;
        }
        return new C36943d(aVar7, aVar8, aVar9, aVar10, aVar6);
    }
}
