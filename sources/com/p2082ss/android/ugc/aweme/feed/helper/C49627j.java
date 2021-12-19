package com.p2082ss.android.ugc.aweme.feed.helper;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.helper.j */
public final class C49627j {
    @AbstractC27891c(mo46611a = "show_interval_time")

    /* renamed from: a */
    public long f114203a = 0;
    @AbstractC27891c(mo46611a = "bi_cancel_interval_time")

    /* renamed from: b */
    public long f114204b = 0;
    @AbstractC27891c(mo46611a = "fixed_survey")

    /* renamed from: c */
    public C49626i f114205c = null;
    @AbstractC27891c(mo46611a = "flexible_survey")

    /* renamed from: d */
    public C49626i f114206d = null;
    @AbstractC27891c(mo46611a = "feed_trigger_threshold")

    /* renamed from: e */
    public int f114207e = 0;

    static {
        Covode.recordClassIndex(58474);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C49627j)) {
            return false;
        }
        C49627j jVar = (C49627j) obj;
        return this.f114203a == jVar.f114203a && this.f114204b == jVar.f114204b && C89219l.m154714a(this.f114205c, jVar.f114205c) && C89219l.m154714a(this.f114206d, jVar.f114206d) && this.f114207e == jVar.f114207e;
    }

    public final String toString() {
        return "FeedSurveyConfig(showIntervalTime=" + this.f114203a + ", biCanceIntervalTime=" + this.f114204b + ", fixedSurvey=" + this.f114205c + ", flexibleSurvey=" + this.f114206d + ", feedTriggerThreshold=" + this.f114207e + ")";
    }

    private C49627j() {
    }

    public final int hashCode() {
        int i;
        long j = this.f114203a;
        long j2 = this.f114204b;
        int i2 = ((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        C49626i iVar = this.f114205c;
        int i3 = 0;
        if (iVar != null) {
            i = iVar.hashCode();
        } else {
            i = 0;
        }
        int i4 = (i2 + i) * 31;
        C49626i iVar2 = this.f114206d;
        if (iVar2 != null) {
            i3 = iVar2.hashCode();
        }
        return ((i4 + i3) * 31) + this.f114207e;
    }
}
