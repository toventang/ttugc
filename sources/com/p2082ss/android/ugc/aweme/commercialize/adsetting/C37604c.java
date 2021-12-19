package com.p2082ss.android.ugc.aweme.commercialize.adsetting;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.adsetting.c */
public final class C37604c {
    @AbstractC27891c(mo46611a = "status_code")

    /* renamed from: a */
    public final Integer f88892a;
    @AbstractC27891c(mo46611a = "status_msg")

    /* renamed from: b */
    public final String f88893b;
    @AbstractC27891c(mo46611a = "promotable")

    /* renamed from: c */
    public final Boolean f88894c;
    @AbstractC27891c(mo46611a = "dark_post_status")

    /* renamed from: d */
    public final Integer f88895d;
    @AbstractC27891c(mo46611a = "dark_post_source")

    /* renamed from: e */
    public final Integer f88896e;
    @AbstractC27891c(mo46611a = "video_code")

    /* renamed from: f */
    public final String f88897f;
    @AbstractC27891c(mo46611a = "code_status")

    /* renamed from: g */
    public final Integer f88898g;
    @AbstractC27891c(mo46611a = "start_time")

    /* renamed from: h */
    public final Long f88899h;
    @AbstractC27891c(mo46611a = "end_time")

    /* renamed from: i */
    public final Long f88900i;

    static {
        Covode.recordClassIndex(45022);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37604c)) {
            return false;
        }
        C37604c cVar = (C37604c) obj;
        return C89219l.m154714a(this.f88892a, cVar.f88892a) && C89219l.m154714a(this.f88893b, cVar.f88893b) && C89219l.m154714a(this.f88894c, cVar.f88894c) && C89219l.m154714a(this.f88895d, cVar.f88895d) && C89219l.m154714a(this.f88896e, cVar.f88896e) && C89219l.m154714a(this.f88897f, cVar.f88897f) && C89219l.m154714a(this.f88898g, cVar.f88898g) && C89219l.m154714a(this.f88899h, cVar.f88899h) && C89219l.m154714a(this.f88900i, cVar.f88900i);
    }

    public final int hashCode() {
        Integer num = this.f88892a;
        int i = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        String str = this.f88893b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Boolean bool = this.f88894c;
        int hashCode3 = (hashCode2 + (bool != null ? bool.hashCode() : 0)) * 31;
        Integer num2 = this.f88895d;
        int hashCode4 = (hashCode3 + (num2 != null ? num2.hashCode() : 0)) * 31;
        Integer num3 = this.f88896e;
        int hashCode5 = (hashCode4 + (num3 != null ? num3.hashCode() : 0)) * 31;
        String str2 = this.f88897f;
        int hashCode6 = (hashCode5 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Integer num4 = this.f88898g;
        int hashCode7 = (hashCode6 + (num4 != null ? num4.hashCode() : 0)) * 31;
        Long l = this.f88899h;
        int hashCode8 = (hashCode7 + (l != null ? l.hashCode() : 0)) * 31;
        Long l2 = this.f88900i;
        if (l2 != null) {
            i = l2.hashCode();
        }
        return hashCode8 + i;
    }

    public final String toString() {
        return "AdSettingsData(statusCode=" + this.f88892a + ", statusMsg=" + this.f88893b + ", promotable=" + this.f88894c + ", darkPostStatus=" + this.f88895d + ", darkPostSource=" + this.f88896e + ", videoCode=" + this.f88897f + ", codeStatus=" + this.f88898g + ", startTime=" + this.f88899h + ", endTime=" + this.f88900i + ")";
    }
}
