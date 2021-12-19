package com.p2082ss.android.ugc.gamora.editor.sticker.donation.viewmodel;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.gamora.editor.sticker.donation.p4289c.C82770a;
import com.p2082ss.android.ugc.gamora.editor.sticker.donation.p4289c.C82772c;
import com.p2082ss.android.ugc.gamora.editor.sticker.donation.p4289c.C82774e;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.editor.sticker.donation.viewmodel.a */
public final class C82809a {

    /* renamed from: a */
    public final String f185094a;

    /* renamed from: b */
    public final boolean f185095b;

    /* renamed from: c */
    public final List<C82774e> f185096c;

    /* renamed from: d */
    public final List<C82772c> f185097d;

    /* renamed from: e */
    public final String f185098e;

    /* renamed from: f */
    public final C82770a f185099f;

    /* renamed from: g */
    public final boolean f185100g;

    /* renamed from: h */
    public final boolean f185101h;

    /* renamed from: i */
    public final boolean f185102i;

    /* renamed from: j */
    public final boolean f185103j;

    static {
        Covode.recordClassIndex(96661);
    }

    public C82809a() {
        this(null, false, null, null, null, null, false, false, false, false, 1023);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C82809a)) {
            return false;
        }
        C82809a aVar = (C82809a) obj;
        return C89219l.m154714a(this.f185094a, aVar.f185094a) && this.f185095b == aVar.f185095b && C89219l.m154714a(this.f185096c, aVar.f185096c) && C89219l.m154714a(this.f185097d, aVar.f185097d) && C89219l.m154714a(this.f185098e, aVar.f185098e) && C89219l.m154714a(this.f185099f, aVar.f185099f) && this.f185100g == aVar.f185100g && this.f185101h == aVar.f185101h && this.f185102i == aVar.f185102i && this.f185103j == aVar.f185103j;
    }

    public final int hashCode() {
        String str = this.f185094a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        boolean z = this.f185095b;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (hashCode + i3) * 31;
        List<C82774e> list = this.f185096c;
        int hashCode2 = (i6 + (list != null ? list.hashCode() : 0)) * 31;
        List<C82772c> list2 = this.f185097d;
        int hashCode3 = (hashCode2 + (list2 != null ? list2.hashCode() : 0)) * 31;
        String str2 = this.f185098e;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
        C82770a aVar = this.f185099f;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        int i7 = (hashCode4 + i) * 31;
        boolean z2 = this.f185100g;
        if (z2) {
            z2 = true;
        }
        int i8 = z2 ? 1 : 0;
        int i9 = z2 ? 1 : 0;
        int i10 = z2 ? 1 : 0;
        int i11 = (i7 + i8) * 31;
        boolean z3 = this.f185101h;
        if (z3) {
            z3 = true;
        }
        int i12 = z3 ? 1 : 0;
        int i13 = z3 ? 1 : 0;
        int i14 = z3 ? 1 : 0;
        int i15 = (i11 + i12) * 31;
        boolean z4 = this.f185102i;
        if (z4) {
            z4 = true;
        }
        int i16 = z4 ? 1 : 0;
        int i17 = z4 ? 1 : 0;
        int i18 = z4 ? 1 : 0;
        int i19 = (i15 + i16) * 31;
        if (!this.f185103j) {
            i2 = 0;
        }
        return i19 + i2;
    }

    public final String toString() {
        return "Result(searchKeyword=" + this.f185094a + ", isSearchRequest=" + this.f185095b + ", searchData=" + this.f185096c + ", data=" + this.f185097d + ", poweredByUrl=" + this.f185098e + ", matchDonationText=" + this.f185099f + ", isLoading=" + this.f185100g + ", loadSuccess=" + this.f185101h + ", isLoadMore=" + this.f185102i + ", hasMore=" + this.f185103j + ")";
    }

    private C82809a(String str, boolean z, List<C82774e> list, List<C82772c> list2, String str2, C82770a aVar, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.f185094a = str;
        this.f185095b = z;
        this.f185096c = list;
        this.f185097d = list2;
        this.f185098e = str2;
        this.f185099f = aVar;
        this.f185100g = z2;
        this.f185101h = z3;
        this.f185102i = z4;
        this.f185103j = z5;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C82809a(String str, boolean z, List list, List list2, String str2, C82770a aVar, boolean z2, boolean z3, boolean z4, boolean z5, int i) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : list2, (i & 16) != 0 ? null : str2, (i & 32) == 0 ? aVar : null, (i & 64) != 0 ? true : z2, (i & 128) != 0 ? false : z3, (i & 256) != 0 ? false : z4, (i & 512) == 0 ? z5 : false);
    }
}
