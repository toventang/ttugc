package com.p2082ss.android.ugc.aweme.account.security;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.security.a */
public final class C32937a {
    @AbstractC27891c(mo46611a = "notice_id_str")

    /* renamed from: a */
    public final String f78367a;
    @AbstractC27891c(mo46611a = "notice")

    /* renamed from: b */
    public final String f78368b;
    @AbstractC27891c(mo46611a = "highlight")

    /* renamed from: c */
    public final List<C32938b> f78369c;
    @AbstractC27891c(mo46611a = "has_notice")

    /* renamed from: d */
    public final boolean f78370d;
    @AbstractC27891c(mo46611a = "notice_type")

    /* renamed from: e */
    public final String f78371e;
    @AbstractC27891c(mo46611a = "notice_model")

    /* renamed from: f */
    public final String f78372f;
    @AbstractC27891c(mo46611a = "scheme")

    /* renamed from: g */
    public final String f78373g;

    static {
        Covode.recordClassIndex(39729);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32937a)) {
            return false;
        }
        C32937a aVar = (C32937a) obj;
        return C89219l.m154714a(this.f78367a, aVar.f78367a) && C89219l.m154714a(this.f78368b, aVar.f78368b) && C89219l.m154714a(this.f78369c, aVar.f78369c) && this.f78370d == aVar.f78370d && C89219l.m154714a(this.f78371e, aVar.f78371e) && C89219l.m154714a(this.f78372f, aVar.f78372f) && C89219l.m154714a(this.f78373g, aVar.f78373g);
    }

    public final int hashCode() {
        String str = this.f78367a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f78368b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        List<C32938b> list = this.f78369c;
        int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        boolean z = this.f78370d;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = (hashCode3 + i2) * 31;
        String str3 = this.f78371e;
        int hashCode4 = (i5 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f78372f;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f78373g;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode5 + i;
    }

    public final String toString() {
        return "SafeInfoNoticeMsg(noticeId=" + this.f78367a + ", notice=" + this.f78368b + ", highlight=" + this.f78369c + ", hasNotice=" + this.f78370d + ", noticeType=" + this.f78371e + ", noticeModel=" + this.f78372f + ", scheme=" + this.f78373g + ")";
    }

    private /* synthetic */ C32937a() {
        this("", "", "", "", "");
    }

    private C32937a(String str, String str2, String str3, String str4, String str5) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(str4, "");
        C89219l.m154721d(str5, "");
        this.f78367a = str;
        this.f78368b = str2;
        this.f78369c = null;
        this.f78370d = false;
        this.f78371e = str3;
        this.f78372f = str4;
        this.f78373g = str5;
    }
}
