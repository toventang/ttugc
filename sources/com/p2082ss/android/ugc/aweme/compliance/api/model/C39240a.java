package com.p2082ss.android.ugc.aweme.compliance.api.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.api.model.a */
public final class C39240a extends BaseResponse implements Serializable {
    @AbstractC27891c(mo46611a = "ban_infos")

    /* renamed from: a */
    private final List<C39241b> f92681a;

    static {
        Covode.recordClassIndex(46898);
    }

    public C39240a() {
        this(null, 1, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.compliance.api.model.a */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C39240a copy$default(C39240a aVar, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = aVar.f92681a;
        }
        return aVar.copy(list);
    }

    public final List<C39241b> component1() {
        return this.f92681a;
    }

    public final C39240a copy(List<C39241b> list) {
        return new C39240a(list);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C39240a) && C89219l.m154714a(this.f92681a, ((C39240a) obj).f92681a);
        }
        return true;
    }

    public final int hashCode() {
        List<C39241b> list = this.f92681a;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "AccountBannedDetail(banInfos=" + this.f92681a + ")";
    }

    public final List<C39241b> getBanInfos() {
        return this.f92681a;
    }

    public C39240a(List<C39241b> list) {
        this.f92681a = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C39240a(List list, int i, C89214g gVar) {
        this((i & 1) != 0 ? new ArrayList() : list);
    }
}
