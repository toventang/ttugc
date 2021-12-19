package com.p2082ss.android.ugc.aweme.profile.p3576ui.p3581v2;

import com.bytedance.assem.arch.extensions.C12776a;
import com.bytedance.assem.arch.service.AbstractC12798a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import p4600h.C89391z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.v2.ac */
public final class C64207ac implements AbstractC12798a {

    /* renamed from: a */
    public final String f145626a;

    /* renamed from: b */
    public final String f145627b;

    /* renamed from: c */
    public final String f145628c;

    /* renamed from: d */
    public final String f145629d;

    /* renamed from: e */
    public final String f145630e;

    /* renamed from: f */
    public final String f145631f;

    /* renamed from: g */
    public final Aweme f145632g;

    /* renamed from: h */
    public final String f145633h;

    /* renamed from: i */
    public final C12776a<C89391z> f145634i;

    /* renamed from: j */
    public final boolean f145635j;

    /* renamed from: k */
    public final C12776a<Boolean> f145636k;

    /* renamed from: l */
    public final C12776a<C89391z> f145637l;

    /* renamed from: m */
    public final C12776a<C89391z> f145638m;

    /* renamed from: n */
    public final C12776a<C89391z> f145639n;

    static {
        Covode.recordClassIndex(75652);
    }

    /* renamed from: a */
    public static /* synthetic */ C64207ac m116113a(C64207ac acVar, String str, String str2, String str3, String str4, String str5, String str6, Aweme aweme, String str7, C12776a aVar, boolean z, C12776a aVar2, C12776a aVar3, C12776a aVar4, C12776a aVar5, int i) {
        C12776a aVar6 = aVar5;
        C12776a aVar7 = aVar4;
        C12776a aVar8 = aVar3;
        C12776a aVar9 = aVar2;
        String str8 = str4;
        String str9 = str3;
        String str10 = str2;
        String str11 = str;
        String str12 = str5;
        String str13 = str6;
        Aweme aweme2 = aweme;
        String str14 = str7;
        C12776a aVar10 = aVar;
        boolean z2 = z;
        if ((i & 1) != 0) {
            str11 = acVar.f145626a;
        }
        if ((i & 2) != 0) {
            str10 = acVar.f145627b;
        }
        if ((i & 4) != 0) {
            str9 = acVar.f145628c;
        }
        if ((i & 8) != 0) {
            str8 = acVar.f145629d;
        }
        if ((i & 16) != 0) {
            str12 = acVar.f145630e;
        }
        if ((i & 32) != 0) {
            str13 = acVar.f145631f;
        }
        if ((i & 64) != 0) {
            aweme2 = acVar.f145632g;
        }
        if ((i & 128) != 0) {
            str14 = acVar.f145633h;
        }
        if ((i & 256) != 0) {
            aVar10 = acVar.f145634i;
        }
        if ((i & 512) != 0) {
            z2 = acVar.f145635j;
        }
        if ((i & 1024) != 0) {
            aVar9 = acVar.f145636k;
        }
        if ((i & 2048) != 0) {
            aVar8 = acVar.f145637l;
        }
        if ((i & 4096) != 0) {
            aVar7 = acVar.f145638m;
        }
        if ((i & 8192) != 0) {
            aVar6 = acVar.f145639n;
        }
        return m116114a(str11, str10, str9, str8, str12, str13, aweme2, str14, aVar10, z2, aVar9, aVar8, aVar7, aVar6);
    }

    /* renamed from: a */
    private static C64207ac m116114a(String str, String str2, String str3, String str4, String str5, String str6, Aweme aweme, String str7, C12776a<C89391z> aVar, boolean z, C12776a<Boolean> aVar2, C12776a<C89391z> aVar3, C12776a<C89391z> aVar4, C12776a<C89391z> aVar5) {
        return new C64207ac(str, str2, str3, str4, str5, str6, aweme, str7, aVar, z, aVar2, aVar3, aVar4, aVar5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C64207ac)) {
            return false;
        }
        C64207ac acVar = (C64207ac) obj;
        return C89219l.m154714a(this.f145626a, acVar.f145626a) && C89219l.m154714a(this.f145627b, acVar.f145627b) && C89219l.m154714a(this.f145628c, acVar.f145628c) && C89219l.m154714a(this.f145629d, acVar.f145629d) && C89219l.m154714a(this.f145630e, acVar.f145630e) && C89219l.m154714a(this.f145631f, acVar.f145631f) && C89219l.m154714a(this.f145632g, acVar.f145632g) && C89219l.m154714a(this.f145633h, acVar.f145633h) && C89219l.m154714a(this.f145634i, acVar.f145634i) && this.f145635j == acVar.f145635j && C89219l.m154714a(this.f145636k, acVar.f145636k) && C89219l.m154714a(this.f145637l, acVar.f145637l) && C89219l.m154714a(this.f145638m, acVar.f145638m) && C89219l.m154714a(this.f145639n, acVar.f145639n);
    }

    public final int hashCode() {
        String str = this.f145626a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f145627b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f145628c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f145629d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f145630e;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f145631f;
        int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        Aweme aweme = this.f145632g;
        int hashCode7 = (hashCode6 + (aweme != null ? aweme.hashCode() : 0)) * 31;
        String str7 = this.f145633h;
        int hashCode8 = (hashCode7 + (str7 != null ? str7.hashCode() : 0)) * 31;
        C12776a<C89391z> aVar = this.f145634i;
        int hashCode9 = (hashCode8 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        boolean z = this.f145635j;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = (hashCode9 + i2) * 31;
        C12776a<Boolean> aVar2 = this.f145636k;
        int hashCode10 = (i5 + (aVar2 != null ? aVar2.hashCode() : 0)) * 31;
        C12776a<C89391z> aVar3 = this.f145637l;
        int hashCode11 = (hashCode10 + (aVar3 != null ? aVar3.hashCode() : 0)) * 31;
        C12776a<C89391z> aVar4 = this.f145638m;
        int hashCode12 = (hashCode11 + (aVar4 != null ? aVar4.hashCode() : 0)) * 31;
        C12776a<C89391z> aVar5 = this.f145639n;
        if (aVar5 != null) {
            i = aVar5.hashCode();
        }
        return hashCode12 + i;
    }

    public final String toString() {
        return "UserProfileData(uid=" + this.f145626a + ", secUid=" + this.f145627b + ", previousPage=" + this.f145628c + ", eventType=" + this.f145629d + ", showWindowSource=" + this.f145630e + ", previousPagePosition=" + this.f145631f + ", aweme=" + this.f145632g + ", feedsAwemeId=" + this.f145633h + ", clearDataEvent=" + this.f145634i + ", isVisible=" + this.f145635j + ", visibleChangeEvent=" + this.f145636k + ", clearDataForBlock=" + this.f145637l + ", setUserEvent=" + this.f145638m + ", setLazy=" + this.f145639n + ")";
    }

    public /* synthetic */ C64207ac() {
        this(null, null, null, null, null, null, null, null, null, true, null, null, null, null);
    }

    private C64207ac(String str, String str2, String str3, String str4, String str5, String str6, Aweme aweme, String str7, C12776a<C89391z> aVar, boolean z, C12776a<Boolean> aVar2, C12776a<C89391z> aVar3, C12776a<C89391z> aVar4, C12776a<C89391z> aVar5) {
        this.f145626a = str;
        this.f145627b = str2;
        this.f145628c = str3;
        this.f145629d = str4;
        this.f145630e = str5;
        this.f145631f = str6;
        this.f145632g = aweme;
        this.f145633h = str7;
        this.f145634i = aVar;
        this.f145635j = z;
        this.f145636k = aVar2;
        this.f145637l = aVar3;
        this.f145638m = aVar4;
        this.f145639n = aVar5;
    }
}
