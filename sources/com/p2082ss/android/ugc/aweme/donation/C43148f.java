package com.p2082ss.android.ugc.aweme.donation;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.donation.f */
public final class C43148f {
    @AbstractC27891c(mo46611a = "ngo_name")

    /* renamed from: a */
    public final String f100547a;
    @AbstractC27891c(mo46611a = "ngo_donation_link")

    /* renamed from: b */
    public final String f100548b;
    @AbstractC27891c(mo46611a = "ngo_icon_url")

    /* renamed from: c */
    public final String f100549c;
    @AbstractC27891c(mo46611a = "ngo_description")

    /* renamed from: d */
    public final String f100550d;
    @AbstractC27891c(mo46611a = "ngo_about_page")

    /* renamed from: e */
    public final String f100551e;

    static {
        Covode.recordClassIndex(51320);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C43148f)) {
            return false;
        }
        C43148f fVar = (C43148f) obj;
        return C89219l.m154714a(this.f100547a, fVar.f100547a) && C89219l.m154714a(this.f100548b, fVar.f100548b) && C89219l.m154714a(this.f100549c, fVar.f100549c) && C89219l.m154714a(this.f100550d, fVar.f100550d) && C89219l.m154714a(this.f100551e, fVar.f100551e);
    }

    public final int hashCode() {
        String str = this.f100547a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f100548b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f100549c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f100550d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f100551e;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode4 + i;
    }

    public final String toString() {
        return "NgoStruct(ngoName=" + this.f100547a + ", donationLink=" + this.f100548b + ", url=" + this.f100549c + ", description=" + this.f100550d + ", aboutPage=" + this.f100551e + ")";
    }
}
