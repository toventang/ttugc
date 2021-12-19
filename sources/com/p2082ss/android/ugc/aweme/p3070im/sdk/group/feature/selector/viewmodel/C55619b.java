package com.p2082ss.android.ugc.aweme.p3070im.sdk.group.feature.selector.viewmodel;

import com.bytedance.assem.arch.extensions.C12776a;
import com.bytedance.assem.arch.viewModel.AbstractC12853j;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import java.util.List;
import p4600h.C89378p;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.viewmodel.b */
public final class C55619b implements AbstractC12853j {

    /* renamed from: a */
    public final C12776a<List<IMUser>> f126870a;

    /* renamed from: b */
    public final C12776a<IMUser> f126871b;

    /* renamed from: c */
    public final C89378p<List<IMUser>, String> f126872c;

    static {
        Covode.recordClassIndex(65399);
    }

    /* renamed from: a */
    private static C55619b m101311a(C12776a<? extends List<? extends IMUser>> aVar, C12776a<? extends IMUser> aVar2, C89378p<? extends List<? extends IMUser>, String> pVar) {
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(pVar, "");
        return new C55619b(aVar, aVar2, pVar);
    }

    /* renamed from: a */
    public static /* synthetic */ C55619b m101312a(C55619b bVar, C12776a aVar, C12776a aVar2, C89378p pVar, int i) {
        if ((i & 1) != 0) {
            aVar = bVar.f126870a;
        }
        if ((i & 2) != 0) {
            aVar2 = bVar.f126871b;
        }
        if ((i & 4) != 0) {
            pVar = bVar.f126872c;
        }
        return m101311a(aVar, aVar2, pVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C55619b)) {
            return false;
        }
        C55619b bVar = (C55619b) obj;
        return C89219l.m154714a(this.f126870a, bVar.f126870a) && C89219l.m154714a(this.f126871b, bVar.f126871b) && C89219l.m154714a(this.f126872c, bVar.f126872c);
    }

    public final int hashCode() {
        C12776a<List<IMUser>> aVar = this.f126870a;
        int i = 0;
        int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
        C12776a<IMUser> aVar2 = this.f126871b;
        int hashCode2 = (hashCode + (aVar2 != null ? aVar2.hashCode() : 0)) * 31;
        C89378p<List<IMUser>, String> pVar = this.f126872c;
        if (pVar != null) {
            i = pVar.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "SelectorState(contactList=" + this.f126870a + ", isSelectedChangedUser=" + this.f126871b + ", searchResult=" + this.f126872c + ")";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.bytedance.assem.arch.extensions.a<? extends java.util.List<? extends com.ss.android.ugc.aweme.im.service.model.IMUser>> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.bytedance.assem.arch.extensions.a<? extends com.ss.android.ugc.aweme.im.service.model.IMUser> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: h.p<? extends java.util.List<? extends com.ss.android.ugc.aweme.im.service.model.IMUser>, java.lang.String> */
    /* JADX WARN: Multi-variable type inference failed */
    public C55619b(C12776a<? extends List<? extends IMUser>> aVar, C12776a<? extends IMUser> aVar2, C89378p<? extends List<? extends IMUser>, String> pVar) {
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(pVar, "");
        this.f126870a = aVar;
        this.f126871b = aVar2;
        this.f126872c = pVar;
    }
}
