package com.p2082ss.android.ugc.aweme.kids.common.response;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.kids.common.response.b */
public final class C57357b {
    @AbstractC27891c(mo46611a = "bed_time_start")

    /* renamed from: a */
    public final String f130738a = null;
    @AbstractC27891c(mo46611a = "bed_time_end")

    /* renamed from: b */
    public final String f130739b = null;
    @AbstractC27891c(mo46611a = "wellness_img_url")

    /* renamed from: c */
    public final String f130740c = null;
    @AbstractC27891c(mo46611a = "dark_wellness_img_url")

    /* renamed from: d */
    public final String f130741d = null;
    @AbstractC27891c(mo46611a = "title")

    /* renamed from: e */
    public final String f130742e = null;
    @AbstractC27891c(mo46611a = "subtitle")

    /* renamed from: f */
    public final String f130743f = null;

    static {
        Covode.recordClassIndex(67273);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C57357b)) {
            return false;
        }
        C57357b bVar = (C57357b) obj;
        return C89219l.m154714a(this.f130738a, bVar.f130738a) && C89219l.m154714a(this.f130739b, bVar.f130739b) && C89219l.m154714a(this.f130740c, bVar.f130740c) && C89219l.m154714a(this.f130741d, bVar.f130741d) && C89219l.m154714a(this.f130742e, bVar.f130742e) && C89219l.m154714a(this.f130743f, bVar.f130743f);
    }

    public final int hashCode() {
        String str = this.f130738a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f130739b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f130740c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f130741d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f130742e;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f130743f;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return hashCode5 + i;
    }

    public final String toString() {
        return "KidsBedTimeReminder(start=" + this.f130738a + ", end=" + this.f130739b + ", imageUrl=" + this.f130740c + ", imageUrlDark=" + this.f130741d + ", title=" + this.f130742e + ", subtitle=" + this.f130743f + ")";
    }

    private C57357b() {
    }
}
