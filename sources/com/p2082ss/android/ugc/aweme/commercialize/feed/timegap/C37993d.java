package com.p2082ss.android.ugc.aweme.commercialize.feed.timegap;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.feed.timegap.d */
public final class C37993d implements Serializable {
    @AbstractC27891c(mo46611a = "not_show_length")

    /* renamed from: a */
    private final int f89798a;
    @AbstractC27891c(mo46611a = "client_last_ad_pos")

    /* renamed from: b */
    private final int f89799b;
    @AbstractC27891c(mo46611a = "ad_drop_time_list")

    /* renamed from: c */
    private final List<Long> f89800c;
    @AbstractC27891c(mo46611a = "ad_extra_info_list")

    /* renamed from: d */
    private final List<C37991b> f89801d;

    static {
        Covode.recordClassIndex(45454);
    }

    /* renamed from: com_ss_android_ugc_aweme_commercialize_feed_timegap_ShowTimeGapReqInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m77049x59c6ee43(int i) {
        return i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.commercialize.feed.timegap.d */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C37993d copy$default(C37993d dVar, int i, int i2, List list, List list2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = dVar.f89798a;
        }
        if ((i3 & 2) != 0) {
            i2 = dVar.f89799b;
        }
        if ((i3 & 4) != 0) {
            list = dVar.f89800c;
        }
        if ((i3 & 8) != 0) {
            list2 = dVar.f89801d;
        }
        return dVar.copy(i, i2, list, list2);
    }

    public final int component1() {
        return this.f89798a;
    }

    public final int component2() {
        return this.f89799b;
    }

    public final List<Long> component3() {
        return this.f89800c;
    }

    public final List<C37991b> component4() {
        return this.f89801d;
    }

    public final C37993d copy(int i, int i2, List<Long> list, List<C37991b> list2) {
        C89219l.m154721d(list, "");
        C89219l.m154721d(list2, "");
        return new C37993d(i, i2, list, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37993d)) {
            return false;
        }
        C37993d dVar = (C37993d) obj;
        return this.f89798a == dVar.f89798a && this.f89799b == dVar.f89799b && C89219l.m154714a(this.f89800c, dVar.f89800c) && C89219l.m154714a(this.f89801d, dVar.f89801d);
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_commercialize_feed_timegap_ShowTimeGapReqInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = ((m77049x59c6ee43(this.f89798a) * 31) + m77049x59c6ee43(this.f89799b)) * 31;
        List<Long> list = this.f89800c;
        int i = 0;
        int hashCode = (com_ss_android_ugc_aweme_commercialize_feed_timegap_ShowTimeGapReqInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (list != null ? list.hashCode() : 0)) * 31;
        List<C37991b> list2 = this.f89801d;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "ShowTimeGapReqInfo(notShowLength=" + this.f89798a + ", lastAdPost=" + this.f89799b + ", adDropTimeList=" + this.f89800c + ", adExtraInfoList=" + this.f89801d + ")";
    }

    public final List<Long> getAdDropTimeList() {
        return this.f89800c;
    }

    public final List<C37991b> getAdExtraInfoList() {
        return this.f89801d;
    }

    public final int getLastAdPost() {
        return this.f89799b;
    }

    public final int getNotShowLength() {
        return this.f89798a;
    }

    public C37993d(int i, int i2, List<Long> list, List<C37991b> list2) {
        C89219l.m154721d(list, "");
        C89219l.m154721d(list2, "");
        this.f89798a = i;
        this.f89799b = i2;
        this.f89800c = list;
        this.f89801d = list2;
    }
}
