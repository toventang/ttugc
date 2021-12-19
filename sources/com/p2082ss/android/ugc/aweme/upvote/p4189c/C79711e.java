package com.p2082ss.android.ugc.aweme.upvote.p4189c;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import java.util.List;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.upvote.c.e */
public final class C79711e implements Serializable {
    @AbstractC27891c(mo46611a = "upvotes")

    /* renamed from: a */
    private final List<C79714h> f178847a;
    @AbstractC27891c(mo46611a = "cursor")

    /* renamed from: b */
    private final long f178848b;
    @AbstractC27891c(mo46611a = "has_more")

    /* renamed from: c */
    private final boolean f178849c;
    @AbstractC27891c(mo46611a = "total")

    /* renamed from: d */
    private final long f178850d;
    @AbstractC27891c(mo46611a = "item_id")

    /* renamed from: e */
    private final String f178851e;

    static {
        Covode.recordClassIndex(92932);
    }

    public C79711e() {
        this(null, 0, false, 0, null, 31, null);
    }

    /* renamed from: com_ss_android_ugc_aweme_upvote_model_UpvoteList_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m138538x89feec74(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.upvote.c.e */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C79711e copy$default(C79711e eVar, List list, long j, boolean z, long j2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = eVar.f178847a;
        }
        if ((i & 2) != 0) {
            j = eVar.f178848b;
        }
        if ((i & 4) != 0) {
            z = eVar.f178849c;
        }
        if ((i & 8) != 0) {
            j2 = eVar.f178850d;
        }
        if ((i & 16) != 0) {
            str = eVar.f178851e;
        }
        return eVar.copy(list, j, z, j2, str);
    }

    public final List<C79714h> component1() {
        return this.f178847a;
    }

    public final long component2() {
        return this.f178848b;
    }

    public final boolean component3() {
        return this.f178849c;
    }

    public final long component4() {
        return this.f178850d;
    }

    public final String component5() {
        return this.f178851e;
    }

    public final C79711e copy(List<C79714h> list, long j, boolean z, long j2, String str) {
        C89219l.m154721d(list, "");
        C89219l.m154721d(str, "");
        return new C79711e(list, j, z, j2, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C79711e)) {
            return false;
        }
        C79711e eVar = (C79711e) obj;
        return C89219l.m154714a(this.f178847a, eVar.f178847a) && this.f178848b == eVar.f178848b && this.f178849c == eVar.f178849c && this.f178850d == eVar.f178850d && C89219l.m154714a(this.f178851e, eVar.f178851e);
    }

    public final int hashCode() {
        List<C79714h> list = this.f178847a;
        int i = 0;
        int hashCode = (((list != null ? list.hashCode() : 0) * 31) + m138538x89feec74(this.f178848b)) * 31;
        boolean z = this.f178849c;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int com_ss_android_ugc_aweme_upvote_model_UpvoteList_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = (((hashCode + i2) * 31) + m138538x89feec74(this.f178850d)) * 31;
        String str = this.f178851e;
        if (str != null) {
            i = str.hashCode();
        }
        return com_ss_android_ugc_aweme_upvote_model_UpvoteList_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + i;
    }

    public final String toString() {
        return "UpvoteList(upvotes=" + this.f178847a + ", cursor=" + this.f178848b + ", hasMore=" + this.f178849c + ", total=" + this.f178850d + ", itemId=" + this.f178851e + ")";
    }

    public final long getCursor() {
        return this.f178848b;
    }

    public final boolean getHasMore() {
        return this.f178849c;
    }

    public final String getItemId() {
        return this.f178851e;
    }

    public final long getTotal() {
        return this.f178850d;
    }

    public final List<C79714h> getUpvotes() {
        return this.f178847a;
    }

    public C79711e(List<C79714h> list, long j, boolean z, long j2, String str) {
        C89219l.m154721d(list, "");
        C89219l.m154721d(str, "");
        this.f178847a = list;
        this.f178848b = j;
        this.f178849c = z;
        this.f178850d = j2;
        this.f178851e = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C79711e(List list, long j, boolean z, long j2, String str, int i, C89214g gVar) {
        this((i & 1) != 0 ? C89086z.INSTANCE : list, (i & 2) != 0 ? 0 : j, (i & 4) != 0 ? false : z, (i & 8) == 0 ? j2 : 0, (i & 16) != 0 ? "" : str);
    }
}
