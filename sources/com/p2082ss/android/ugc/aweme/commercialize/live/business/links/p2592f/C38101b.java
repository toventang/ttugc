package com.p2082ss.android.ugc.aweme.commercialize.live.business.links.p2592f;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.live.business.links.f.b */
public final class C38101b implements Serializable {
    @AbstractC27891c(mo46611a = "id")

    /* renamed from: a */
    private final long f90016a;
    @AbstractC27891c(mo46611a = "title")

    /* renamed from: b */
    private final String f90017b;
    @AbstractC27891c(mo46611a = "subtitle")

    /* renamed from: c */
    private final String f90018c;
    @AbstractC27891c(mo46611a = "url")

    /* renamed from: d */
    private final String f90019d;
    @AbstractC27891c(mo46611a = "pic")

    /* renamed from: e */
    private final String f90020e;
    @AbstractC27891c(mo46611a = "cardType")

    /* renamed from: f */
    private final int f90021f;
    @AbstractC27891c(mo46611a = "gameUrl")

    /* renamed from: g */
    private final String f90022g;
    @AbstractC27891c(mo46611a = "isPinned")

    /* renamed from: h */
    private final boolean f90023h;

    static {
        Covode.recordClassIndex(45568);
    }

    /* renamed from: com_ss_android_ugc_aweme_commercialize_live_business_links_model_ActiveCard_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m77212xe106ba22(int i) {
        return i;
    }

    /* renamed from: com_ss_android_ugc_aweme_commercialize_live_business_links_model_ActiveCard_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m77213xe106ba22(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static /* synthetic */ C38101b copy$default(C38101b bVar, long j, String str, String str2, String str3, String str4, int i, String str5, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = bVar.f90016a;
        }
        if ((i2 & 2) != 0) {
            str = bVar.f90017b;
        }
        if ((i2 & 4) != 0) {
            str2 = bVar.f90018c;
        }
        if ((i2 & 8) != 0) {
            str3 = bVar.f90019d;
        }
        if ((i2 & 16) != 0) {
            str4 = bVar.f90020e;
        }
        if ((i2 & 32) != 0) {
            i = bVar.f90021f;
        }
        if ((i2 & 64) != 0) {
            str5 = bVar.f90022g;
        }
        if ((i2 & 128) != 0) {
            z = bVar.f90023h;
        }
        return bVar.copy(j, str, str2, str3, str4, i, str5, z);
    }

    public final long component1() {
        return this.f90016a;
    }

    public final String component2() {
        return this.f90017b;
    }

    public final String component3() {
        return this.f90018c;
    }

    public final String component4() {
        return this.f90019d;
    }

    public final String component5() {
        return this.f90020e;
    }

    public final int component6() {
        return this.f90021f;
    }

    public final String component7() {
        return this.f90022g;
    }

    public final boolean component8() {
        return this.f90023h;
    }

    public final C38101b copy(long j, String str, String str2, String str3, String str4, int i, String str5, boolean z) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(str4, "");
        return new C38101b(j, str, str2, str3, str4, i, str5, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38101b)) {
            return false;
        }
        C38101b bVar = (C38101b) obj;
        return this.f90016a == bVar.f90016a && C89219l.m154714a(this.f90017b, bVar.f90017b) && C89219l.m154714a(this.f90018c, bVar.f90018c) && C89219l.m154714a(this.f90019d, bVar.f90019d) && C89219l.m154714a(this.f90020e, bVar.f90020e) && this.f90021f == bVar.f90021f && C89219l.m154714a(this.f90022g, bVar.f90022g) && this.f90023h == bVar.f90023h;
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_commercialize_live_business_links_model_ActiveCard_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = m77213xe106ba22(this.f90016a) * 31;
        String str = this.f90017b;
        int i = 0;
        int hashCode = (com_ss_android_ugc_aweme_commercialize_live_business_links_model_ActiveCard_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f90018c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f90019d;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f90020e;
        int hashCode4 = (((hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31) + m77212xe106ba22(this.f90021f)) * 31;
        String str5 = this.f90022g;
        if (str5 != null) {
            i = str5.hashCode();
        }
        int i2 = (hashCode4 + i) * 31;
        boolean z = this.f90023h;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        return i2 + i3;
    }

    public final String toString() {
        return "ActiveCard(id=" + this.f90016a + ", title=" + this.f90017b + ", subtitle=" + this.f90018c + ", url=" + this.f90019d + ", pic=" + this.f90020e + ", cardType=" + this.f90021f + ", gameUrl=" + this.f90022g + ", isPinned=" + this.f90023h + ")";
    }

    public final int getCardType() {
        return this.f90021f;
    }

    public final String getGameUrl() {
        return this.f90022g;
    }

    public final long getId() {
        return this.f90016a;
    }

    public final String getPic() {
        return this.f90020e;
    }

    public final String getSubtitle() {
        return this.f90018c;
    }

    public final String getTitle() {
        return this.f90017b;
    }

    public final String getUrl() {
        return this.f90019d;
    }

    public final boolean isPinned() {
        return this.f90023h;
    }

    public C38101b(long j, String str, String str2, String str3, String str4, int i, String str5, boolean z) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(str4, "");
        this.f90016a = j;
        this.f90017b = str;
        this.f90018c = str2;
        this.f90019d = str3;
        this.f90020e = str4;
        this.f90021f = i;
        this.f90022g = str5;
        this.f90023h = z;
    }
}
