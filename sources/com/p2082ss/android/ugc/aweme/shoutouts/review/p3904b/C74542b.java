package com.p2082ss.android.ugc.aweme.shoutouts.review.p3904b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.p1231b.AbstractC17641a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shoutouts.review.b.b */
public final class C74542b implements AbstractC17641a {

    /* renamed from: a */
    public final String f167611a;

    /* renamed from: b */
    public String f167612b;

    /* renamed from: c */
    public String f167613c;

    /* renamed from: d */
    public String f167614d;

    /* renamed from: e */
    public int f167615e;

    /* renamed from: f */
    public final String f167616f;

    /* renamed from: g */
    public final String f167617g;

    /* renamed from: h */
    public final String f167618h;

    /* renamed from: i */
    public final boolean f167619i;

    /* renamed from: j */
    public String f167620j;

    /* renamed from: k */
    public boolean f167621k;

    /* renamed from: l */
    public int f167622l;

    static {
        Covode.recordClassIndex(87348);
    }

    public C74542b() {
        this(null, null, null, null, 0, null, null, null, false, 4095);
    }

    @Override // com.bytedance.ies.powerlist.p1231b.AbstractC17641a
    /* renamed from: c */
    public final Object mo28111c(AbstractC17641a aVar) {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C74542b)) {
            return false;
        }
        C74542b bVar = (C74542b) obj;
        return C89219l.m154714a(this.f167611a, bVar.f167611a) && C89219l.m154714a(this.f167612b, bVar.f167612b) && C89219l.m154714a(this.f167613c, bVar.f167613c) && C89219l.m154714a(this.f167614d, bVar.f167614d) && this.f167615e == bVar.f167615e && C89219l.m154714a(this.f167616f, bVar.f167616f) && C89219l.m154714a(this.f167617g, bVar.f167617g) && C89219l.m154714a(this.f167618h, bVar.f167618h) && this.f167619i == bVar.f167619i && C89219l.m154714a(this.f167620j, bVar.f167620j) && this.f167621k == bVar.f167621k && this.f167622l == bVar.f167622l;
    }

    public final int hashCode() {
        String str = this.f167611a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f167612b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f167613c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f167614d;
        int hashCode4 = (((hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31) + this.f167615e) * 31;
        String str5 = this.f167616f;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f167617g;
        int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.f167618h;
        int hashCode7 = (hashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31;
        boolean z = this.f167619i;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (hashCode7 + i3) * 31;
        String str8 = this.f167620j;
        if (str8 != null) {
            i = str8.hashCode();
        }
        int i7 = (i6 + i) * 31;
        if (!this.f167621k) {
            i2 = 0;
        }
        return ((i7 + i2) * 31) + this.f167622l;
    }

    public final String toString() {
        return "ShoutoutsReviewsItem(ratingId=" + this.f167611a + ", userName=" + this.f167612b + ", ratingText=" + this.f167613c + ", createdTime=" + this.f167614d + ", ratingCount=" + this.f167615e + ", uid=" + this.f167616f + ", secUid=" + this.f167617g + ", userAvatar=" + this.f167618h + ", userVerified=" + this.f167619i + ", ratingTextTranslated=" + this.f167620j + ", isShowingTranslatedContent=" + this.f167621k + ", status=" + this.f167622l + ")";
    }

    @Override // com.bytedance.ies.powerlist.p1231b.AbstractC17641a
    /* renamed from: a */
    public final boolean mo28109a(AbstractC17641a aVar) {
        return aVar.equals(this);
    }

    @Override // com.bytedance.ies.powerlist.p1231b.AbstractC17641a
    /* renamed from: b */
    public final boolean mo28110b(AbstractC17641a aVar) {
        return aVar.equals(this);
    }

    private C74542b(String str, String str2, String str3, String str4, int i, String str5, String str6, String str7, boolean z) {
        this.f167611a = str;
        this.f167612b = str2;
        this.f167613c = str3;
        this.f167614d = str4;
        this.f167615e = i;
        this.f167616f = str5;
        this.f167617g = str6;
        this.f167618h = str7;
        this.f167619i = z;
        this.f167620j = null;
        this.f167621k = false;
        this.f167622l = 0;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C74542b(String str, String str2, String str3, String str4, int i, String str5, String str6, String str7, boolean z, int i2) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? null : str3, (i2 & 8) != 0 ? null : str4, (i2 & 16) != 0 ? 0 : i, (i2 & 32) != 0 ? null : str5, (i2 & 64) != 0 ? null : str6, (i2 & 128) == 0 ? str7 : null, (i2 & 256) == 0 ? z : false);
    }
}
