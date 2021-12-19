package com.p2082ss.android.ugc.gamora.editor.sticker.donation.p4289c;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.editor.sticker.donation.c.a */
public final class C82770a implements Serializable {
    @AbstractC27891c(mo46611a = "double_donation_sticker")

    /* renamed from: a */
    private final String f185013a;
    @AbstractC27891c(mo46611a = "double_donation_text")

    /* renamed from: b */
    private final String f185014b;
    @AbstractC27891c(mo46611a = "double_donation_highlight")

    /* renamed from: c */
    private final String f185015c;

    static {
        Covode.recordClassIndex(96620);
    }

    public static /* synthetic */ C82770a copy$default(C82770a aVar, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aVar.f185013a;
        }
        if ((i & 2) != 0) {
            str2 = aVar.f185014b;
        }
        if ((i & 4) != 0) {
            str3 = aVar.f185015c;
        }
        return aVar.copy(str, str2, str3);
    }

    public final String component1() {
        return this.f185013a;
    }

    public final String component2() {
        return this.f185014b;
    }

    public final String component3() {
        return this.f185015c;
    }

    public final C82770a copy(String str, String str2, String str3) {
        return new C82770a(str, str2, str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C82770a)) {
            return false;
        }
        C82770a aVar = (C82770a) obj;
        return C89219l.m154714a(this.f185013a, aVar.f185013a) && C89219l.m154714a(this.f185014b, aVar.f185014b) && C89219l.m154714a(this.f185015c, aVar.f185015c);
    }

    public final int hashCode() {
        String str = this.f185013a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f185014b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f185015c;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "MatchDonationText(matchDonationTextForSticker=" + this.f185013a + ", matchDonateText=" + this.f185014b + ", matchDonationHighlightText=" + this.f185015c + ")";
    }

    public final String getMatchDonateText() {
        return this.f185014b;
    }

    public final String getMatchDonationHighlightText() {
        return this.f185015c;
    }

    public final String getMatchDonationTextForSticker() {
        return this.f185013a;
    }

    public C82770a(String str, String str2, String str3) {
        this.f185013a = str;
        this.f185014b = str2;
        this.f185015c = str3;
    }
}
