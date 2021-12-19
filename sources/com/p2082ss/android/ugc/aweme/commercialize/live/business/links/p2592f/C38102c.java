package com.p2082ss.android.ugc.aweme.commercialize.live.business.links.p2592f;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.live.business.links.f.c */
public final class C38102c implements Serializable {
    @AbstractC27891c(mo46611a = "card_list")

    /* renamed from: a */
    private final List<C38101b> f90024a;

    static {
        Covode.recordClassIndex(45569);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.commercialize.live.business.links.f.c */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C38102c copy$default(C38102c cVar, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = cVar.f90024a;
        }
        return cVar.copy(list);
    }

    public final List<C38101b> component1() {
        return this.f90024a;
    }

    public final C38102c copy(List<C38101b> list) {
        C89219l.m154721d(list, "");
        return new C38102c(list);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C38102c) && C89219l.m154714a(this.f90024a, ((C38102c) obj).f90024a);
        }
        return true;
    }

    public final int hashCode() {
        List<C38101b> list = this.f90024a;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "BusinessLinksCardList(cardList=" + this.f90024a + ")";
    }

    public final List<C38101b> getCardList() {
        return this.f90024a;
    }

    public C38102c(List<C38101b> list) {
        C89219l.m154721d(list, "");
        this.f90024a = list;
    }
}
