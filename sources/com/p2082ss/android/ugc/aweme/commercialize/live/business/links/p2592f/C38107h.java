package com.p2082ss.android.ugc.aweme.commercialize.live.business.links.p2592f;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.live.business.links.f.h */
public final class C38107h {
    @AbstractC27891c(mo46611a = "title")

    /* renamed from: a */
    public final String f90036a;
    @AbstractC27891c(mo46611a = "subtitle")

    /* renamed from: b */
    public final String f90037b;
    @AbstractC27891c(mo46611a = "pic_url")

    /* renamed from: c */
    public final String f90038c;
    @AbstractC27891c(mo46611a = "link_id")

    /* renamed from: d */
    public final long f90039d;
    @AbstractC27891c(mo46611a = "link_url")

    /* renamed from: e */
    public final String f90040e;
    @AbstractC27891c(mo46611a = "card_type")

    /* renamed from: f */
    public final int f90041f;
    @AbstractC27891c(mo46611a = "game_url")

    /* renamed from: g */
    public final String f90042g;

    static {
        Covode.recordClassIndex(45574);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38107h)) {
            return false;
        }
        C38107h hVar = (C38107h) obj;
        return C89219l.m154714a(this.f90036a, hVar.f90036a) && C89219l.m154714a(this.f90037b, hVar.f90037b) && C89219l.m154714a(this.f90038c, hVar.f90038c) && this.f90039d == hVar.f90039d && C89219l.m154714a(this.f90040e, hVar.f90040e) && this.f90041f == hVar.f90041f && C89219l.m154714a(this.f90042g, hVar.f90042g);
    }

    public final String toString() {
        return "CardData(title=" + this.f90036a + ", subtitle=" + this.f90037b + ", picUrl=" + this.f90038c + ", linkId=" + this.f90039d + ", linkUrl=" + this.f90040e + ", cardType=" + this.f90041f + ", gameUrl=" + this.f90042g + ")";
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        String str = this.f90036a;
        int i5 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i6 = i * 31;
        String str2 = this.f90037b;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = (i6 + i2) * 31;
        String str3 = this.f90038c;
        if (str3 != null) {
            i3 = str3.hashCode();
        } else {
            i3 = 0;
        }
        long j = this.f90039d;
        int i8 = (((i7 + i3) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        String str4 = this.f90040e;
        if (str4 != null) {
            i4 = str4.hashCode();
        } else {
            i4 = 0;
        }
        int i9 = (((i8 + i4) * 31) + this.f90041f) * 31;
        String str5 = this.f90042g;
        if (str5 != null) {
            i5 = str5.hashCode();
        }
        return i9 + i5;
    }
}
