package com.p2082ss.android.ugc.aweme.commercialize.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import java.util.List;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.model.ag */
public final class C38220ag implements Serializable {
    @AbstractC27891c(mo46611a = "render_type")

    /* renamed from: a */
    private final String f90285a;
    @AbstractC27891c(mo46611a = "flutter_version")

    /* renamed from: b */
    private final int f90286b;
    @AbstractC27891c(mo46611a = "page_data_url")

    /* renamed from: c */
    private final String f90287c;
    @AbstractC27891c(mo46611a = "page_data_backup_url")

    /* renamed from: d */
    private final String f90288d;
    @AbstractC27891c(mo46611a = "preload_net_type")

    /* renamed from: e */
    private final int f90289e;
    @AbstractC27891c(mo46611a = "android_page_data_hash")

    /* renamed from: f */
    private final String f90290f;
    @AbstractC27891c(mo46611a = "is_support_native_animation")

    /* renamed from: g */
    private final boolean f90291g;
    @AbstractC27891c(mo46611a = "animation_type")

    /* renamed from: h */
    private final String f90292h;
    @AbstractC27891c(mo46611a = "gecko_channel")

    /* renamed from: i */
    private final List<String> f90293i;
    @AbstractC27891c(mo46611a = "second_page_gecko_channel")

    /* renamed from: j */
    private final List<String> f90294j;
    @AbstractC27891c(mo46611a = "site_type")

    /* renamed from: k */
    private final String f90295k;
    @AbstractC27891c(mo46611a = "lynx_scheme")

    /* renamed from: l */
    private final String f90296l;
    @AbstractC27891c(mo46611a = "lynx_landing_style")

    /* renamed from: m */
    private final int f90297m;

    static {
        Covode.recordClassIndex(45704);
    }

    /* renamed from: com_ss_android_ugc_aweme_commercialize_model_NativeSiteConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m77589xc653dc7a(int i) {
        return i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.commercialize.model.ag */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C38220ag copy$default(C38220ag agVar, String str, int i, String str2, String str3, int i2, String str4, boolean z, String str5, List list, List list2, String str6, String str7, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = agVar.f90285a;
        }
        if ((i4 & 2) != 0) {
            i = agVar.f90286b;
        }
        if ((i4 & 4) != 0) {
            str2 = agVar.f90287c;
        }
        if ((i4 & 8) != 0) {
            str3 = agVar.f90288d;
        }
        if ((i4 & 16) != 0) {
            i2 = agVar.f90289e;
        }
        if ((i4 & 32) != 0) {
            str4 = agVar.f90290f;
        }
        if ((i4 & 64) != 0) {
            z = agVar.f90291g;
        }
        if ((i4 & 128) != 0) {
            str5 = agVar.f90292h;
        }
        if ((i4 & 256) != 0) {
            list = agVar.f90293i;
        }
        if ((i4 & 512) != 0) {
            list2 = agVar.f90294j;
        }
        if ((i4 & 1024) != 0) {
            str6 = agVar.f90295k;
        }
        if ((i4 & 2048) != 0) {
            str7 = agVar.f90296l;
        }
        if ((i4 & 4096) != 0) {
            i3 = agVar.f90297m;
        }
        return agVar.copy(str, i, str2, str3, i2, str4, z, str5, list, list2, str6, str7, i3);
    }

    public final String component1() {
        return this.f90285a;
    }

    public final List<String> component10() {
        return this.f90294j;
    }

    public final String component11() {
        return this.f90295k;
    }

    public final String component12() {
        return this.f90296l;
    }

    public final int component13() {
        return this.f90297m;
    }

    public final int component2() {
        return this.f90286b;
    }

    public final String component3() {
        return this.f90287c;
    }

    public final String component4() {
        return this.f90288d;
    }

    public final int component5() {
        return this.f90289e;
    }

    public final String component6() {
        return this.f90290f;
    }

    public final boolean component7() {
        return this.f90291g;
    }

    public final String component8() {
        return this.f90292h;
    }

    public final List<String> component9() {
        return this.f90293i;
    }

    public final C38220ag copy(String str, int i, String str2, String str3, int i2, String str4, boolean z, String str5, List<String> list, List<String> list2, String str6, String str7, int i3) {
        return new C38220ag(str, i, str2, str3, i2, str4, z, str5, list, list2, str6, str7, i3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38220ag)) {
            return false;
        }
        C38220ag agVar = (C38220ag) obj;
        return C89219l.m154714a(this.f90285a, agVar.f90285a) && this.f90286b == agVar.f90286b && C89219l.m154714a(this.f90287c, agVar.f90287c) && C89219l.m154714a(this.f90288d, agVar.f90288d) && this.f90289e == agVar.f90289e && C89219l.m154714a(this.f90290f, agVar.f90290f) && this.f90291g == agVar.f90291g && C89219l.m154714a(this.f90292h, agVar.f90292h) && C89219l.m154714a(this.f90293i, agVar.f90293i) && C89219l.m154714a(this.f90294j, agVar.f90294j) && C89219l.m154714a(this.f90295k, agVar.f90295k) && C89219l.m154714a(this.f90296l, agVar.f90296l) && this.f90297m == agVar.f90297m;
    }

    public final int hashCode() {
        String str = this.f90285a;
        int i = 0;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + m77589xc653dc7a(this.f90286b)) * 31;
        String str2 = this.f90287c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f90288d;
        int hashCode3 = (((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + m77589xc653dc7a(this.f90289e)) * 31;
        String str4 = this.f90290f;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        boolean z = this.f90291g;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = (hashCode4 + i2) * 31;
        String str5 = this.f90292h;
        int hashCode5 = (i5 + (str5 != null ? str5.hashCode() : 0)) * 31;
        List<String> list = this.f90293i;
        int hashCode6 = (hashCode5 + (list != null ? list.hashCode() : 0)) * 31;
        List<String> list2 = this.f90294j;
        int hashCode7 = (hashCode6 + (list2 != null ? list2.hashCode() : 0)) * 31;
        String str6 = this.f90295k;
        int hashCode8 = (hashCode7 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.f90296l;
        if (str7 != null) {
            i = str7.hashCode();
        }
        return ((hashCode8 + i) * 31) + m77589xc653dc7a(this.f90297m);
    }

    public final String toString() {
        return "NativeSiteConfig(renderType=" + this.f90285a + ", flutterVersion=" + this.f90286b + ", pageDataUrl=" + this.f90287c + ", pageDataBackupUrl=" + this.f90288d + ", preloadNetType=" + this.f90289e + ", androidPageDataHash=" + this.f90290f + ", isSupportNativeAnimation=" + this.f90291g + ", animationType=" + this.f90292h + ", geckoChannel=" + this.f90293i + ", secondPageGeckoChannel=" + this.f90294j + ", siteType=" + this.f90295k + ", lynxScheme=" + this.f90296l + ", lynxLandingStyle=" + this.f90297m + ")";
    }

    public final String getAndroidPageDataHash() {
        return this.f90290f;
    }

    public final String getAnimationType() {
        return this.f90292h;
    }

    public final int getFlutterVersion() {
        return this.f90286b;
    }

    public final List<String> getGeckoChannel() {
        return this.f90293i;
    }

    public final int getLynxLandingStyle() {
        return this.f90297m;
    }

    public final String getLynxScheme() {
        return this.f90296l;
    }

    public final String getPageDataBackupUrl() {
        return this.f90288d;
    }

    public final String getPageDataUrl() {
        return this.f90287c;
    }

    public final int getPreloadNetType() {
        return this.f90289e;
    }

    public final String getRenderType() {
        return this.f90285a;
    }

    public final List<String> getSecondPageGeckoChannel() {
        return this.f90294j;
    }

    public final String getSiteType() {
        return this.f90295k;
    }

    public final boolean isSupportNativeAnimation() {
        return this.f90291g;
    }

    public C38220ag(String str, int i, String str2, String str3, int i2, String str4, boolean z, String str5, List<String> list, List<String> list2, String str6, String str7, int i3) {
        this.f90285a = str;
        this.f90286b = i;
        this.f90287c = str2;
        this.f90288d = str3;
        this.f90289e = i2;
        this.f90290f = str4;
        this.f90291g = z;
        this.f90292h = str5;
        this.f90293i = list;
        this.f90294j = list2;
        this.f90295k = str6;
        this.f90296l = str7;
        this.f90297m = i3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C38220ag(String str, int i, String str2, String str3, int i2, String str4, boolean z, String str5, List list, List list2, String str6, String str7, int i3, int i4, C89214g gVar) {
        this(str, (i4 & 2) != 0 ? 0 : i, str2, str3, (i4 & 16) != 0 ? 0 : i2, str4, (i4 & 64) != 0 ? false : z, str5, list, list2, str6, str7, (i4 & 4096) != 0 ? 0 : i3);
    }
}
