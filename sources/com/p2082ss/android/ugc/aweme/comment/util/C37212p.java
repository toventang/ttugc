package com.p2082ss.android.ugc.aweme.comment.util;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import java.util.List;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.comment.util.p */
public final class C37212p implements Serializable {
    @AbstractC27891c(mo46611a = "icon_url_list")

    /* renamed from: a */
    private final List<UrlModel> f87737a;

    static {
        Covode.recordClassIndex(44567);
    }

    public C37212p() {
        this(null, 1, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.comment.util.p */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C37212p copy$default(C37212p pVar, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = pVar.f87737a;
        }
        return pVar.copy(list);
    }

    public final List<UrlModel> component1() {
        return this.f87737a;
    }

    public final C37212p copy(List<? extends UrlModel> list) {
        return new C37212p(list);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C37212p) && C89219l.m154714a(this.f87737a, ((C37212p) obj).f87737a);
        }
        return true;
    }

    public final int hashCode() {
        List<UrlModel> list = this.f87737a;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "DonationStickerAnchorExtra(iconUrlList=" + this.f87737a + ")";
    }

    public final List<UrlModel> getIconUrlList() {
        return this.f87737a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.base.model.UrlModel> */
    /* JADX WARN: Multi-variable type inference failed */
    public C37212p(List<? extends UrlModel> list) {
        this.f87737a = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C37212p(List list, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : list);
    }
}
