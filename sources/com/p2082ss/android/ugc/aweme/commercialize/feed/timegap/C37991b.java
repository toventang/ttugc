package com.p2082ss.android.ugc.aweme.commercialize.feed.timegap;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.feed.timegap.b */
public final class C37991b implements Serializable {
    @AbstractC27891c(mo46611a = "final_pos")

    /* renamed from: a */
    private int f89795a;
    @AbstractC27891c(mo46611a = "adjust_info")

    /* renamed from: b */
    private final List<C37990a> f89796b;
    @AbstractC27891c(mo46611a = "is_drop")

    /* renamed from: c */
    private boolean f89797c;

    static {
        Covode.recordClassIndex(45452);
    }

    /* renamed from: com_ss_android_ugc_aweme_commercialize_feed_timegap_AdExtraInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m77047x5f6188(int i) {
        return i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.commercialize.feed.timegap.b */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C37991b copy$default(C37991b bVar, int i, List list, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = bVar.f89795a;
        }
        if ((i2 & 2) != 0) {
            list = bVar.f89796b;
        }
        if ((i2 & 4) != 0) {
            z = bVar.f89797c;
        }
        return bVar.copy(i, list, z);
    }

    public final int component1() {
        return this.f89795a;
    }

    public final List<C37990a> component2() {
        return this.f89796b;
    }

    public final boolean component3() {
        return this.f89797c;
    }

    public final C37991b copy(int i, List<C37990a> list, boolean z) {
        C89219l.m154721d(list, "");
        return new C37991b(i, list, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37991b)) {
            return false;
        }
        C37991b bVar = (C37991b) obj;
        return this.f89795a == bVar.f89795a && C89219l.m154714a(this.f89796b, bVar.f89796b) && this.f89797c == bVar.f89797c;
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_commercialize_feed_timegap_AdExtraInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = m77047x5f6188(this.f89795a) * 31;
        List<C37990a> list = this.f89796b;
        int hashCode = (com_ss_android_ugc_aweme_commercialize_feed_timegap_AdExtraInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (list != null ? list.hashCode() : 0)) * 31;
        boolean z = this.f89797c;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        return hashCode + i;
    }

    public final String toString() {
        return "AdExtraInfo(finalPos=" + this.f89795a + ", adjustInfoList=" + this.f89796b + ", isDrop=" + this.f89797c + ")";
    }

    public final List<C37990a> getAdjustInfoList() {
        return this.f89796b;
    }

    public final int getFinalPos() {
        return this.f89795a;
    }

    public final boolean isDrop() {
        return this.f89797c;
    }

    public final void setDrop(boolean z) {
        this.f89797c = z;
    }

    public final void setFinalPos(int i) {
        this.f89795a = i;
    }

    public C37991b(int i, List<C37990a> list, boolean z) {
        C89219l.m154721d(list, "");
        this.f89795a = i;
        this.f89796b = list;
        this.f89797c = z;
    }
}
