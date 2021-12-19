package com.p2082ss.android.ugc.aweme.notice.repo.list.bean;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.utils.C80342dg;
import java.io.Serializable;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notice.repo.list.bean.g */
public final class C61632g implements Serializable {
    @AbstractC27891c(mo46611a = "group")

    /* renamed from: a */
    private final int f139905a;
    @AbstractC27891c(mo46611a = "max_time")

    /* renamed from: b */
    private final long f139906b;
    @AbstractC27891c(mo46611a = "min_time")

    /* renamed from: c */
    private final long f139907c;
    @AbstractC27891c(mo46611a = "count")

    /* renamed from: d */
    private final int f139908d;
    @AbstractC27891c(mo46611a = "is_mark_read")

    /* renamed from: e */
    private final int f139909e;

    static {
        Covode.recordClassIndex(72359);
    }

    /* renamed from: com_ss_android_ugc_aweme_notice_repo_list_bean_MultiNotice_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m111647xa319ce7e(int i) {
        return i;
    }

    /* renamed from: com_ss_android_ugc_aweme_notice_repo_list_bean_MultiNotice_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m111648xa319ce7e(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static /* synthetic */ C61632g copy$default(C61632g gVar, int i, long j, long j2, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = gVar.f139905a;
        }
        if ((i4 & 2) != 0) {
            j = gVar.f139906b;
        }
        if ((i4 & 4) != 0) {
            j2 = gVar.f139907c;
        }
        if ((i4 & 8) != 0) {
            i2 = gVar.f139908d;
        }
        if ((i4 & 16) != 0) {
            i3 = gVar.f139909e;
        }
        return gVar.copy(i, j, j2, i2, i3);
    }

    public final int component1() {
        return this.f139905a;
    }

    public final long component2() {
        return this.f139906b;
    }

    public final long component3() {
        return this.f139907c;
    }

    public final int component4() {
        return this.f139908d;
    }

    public final int component5() {
        return this.f139909e;
    }

    public final C61632g copy(int i, long j, long j2, int i2, int i3) {
        return new C61632g(i, j, j2, i2, i3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C61632g)) {
            return false;
        }
        C61632g gVar = (C61632g) obj;
        return this.f139905a == gVar.f139905a && this.f139906b == gVar.f139906b && this.f139907c == gVar.f139907c && this.f139908d == gVar.f139908d && this.f139909e == gVar.f139909e;
    }

    public final int hashCode() {
        return (((((((m111647xa319ce7e(this.f139905a) * 31) + m111648xa319ce7e(this.f139906b)) * 31) + m111648xa319ce7e(this.f139907c)) * 31) + m111647xa319ce7e(this.f139908d)) * 31) + m111647xa319ce7e(this.f139909e);
    }

    public final String toString() {
        return "MultiNotice(group=" + this.f139905a + ", maxTime=" + this.f139906b + ", minTime=" + this.f139907c + ", count=" + this.f139908d + ", markRead=" + this.f139909e + ")";
    }

    public final int getCount() {
        return this.f139908d;
    }

    public final int getGroup() {
        return this.f139905a;
    }

    public final int getMarkRead() {
        return this.f139909e;
    }

    public final long getMaxTime() {
        return this.f139906b;
    }

    public final long getMinTime() {
        return this.f139907c;
    }

    public final String toReqStr() {
        String b = C80342dg.m139300a().mo46674b(C89070n.m154516a(this));
        C89219l.m154716b(b, "");
        return b;
    }

    public C61632g(int i, long j, long j2, int i2, int i3) {
        this.f139905a = i;
        this.f139906b = j;
        this.f139907c = j2;
        this.f139908d = i2;
        this.f139909e = i3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C61632g(int i, long j, long j2, int i2, int i3, int i4, C89214g gVar) {
        this(i, (i4 & 2) != 0 ? 0 : j, (i4 & 4) == 0 ? j2 : 0, (i4 & 8) != 0 ? 20 : i2, (i4 & 16) != 0 ? 1 : i3);
    }
}
