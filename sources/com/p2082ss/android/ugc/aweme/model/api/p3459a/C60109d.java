package com.p2082ss.android.ugc.aweme.model.api.p3459a;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.model.api.a.d */
public final class C60109d implements Serializable {
    @AbstractC27891c(mo46611a = "navi_id")

    /* renamed from: a */
    private final String f137016a;
    @AbstractC27891c(mo46611a = "static_profile_image")

    /* renamed from: b */
    private final UrlModel f137017b;
    @AbstractC27891c(mo46611a = "dynamic_profile_image")

    /* renamed from: c */
    private final UrlModel f137018c;
    @AbstractC27891c(mo46611a = "background_color")

    /* renamed from: d */
    private final String f137019d;

    static {
        Covode.recordClassIndex(70620);
    }

    public static /* synthetic */ C60109d copy$default(C60109d dVar, String str, UrlModel urlModel, UrlModel urlModel2, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dVar.f137016a;
        }
        if ((i & 2) != 0) {
            urlModel = dVar.f137017b;
        }
        if ((i & 4) != 0) {
            urlModel2 = dVar.f137018c;
        }
        if ((i & 8) != 0) {
            str2 = dVar.f137019d;
        }
        return dVar.copy(str, urlModel, urlModel2, str2);
    }

    public final String component1() {
        return this.f137016a;
    }

    public final UrlModel component2() {
        return this.f137017b;
    }

    public final UrlModel component3() {
        return this.f137018c;
    }

    public final String component4() {
        return this.f137019d;
    }

    public final C60109d copy(String str, UrlModel urlModel, UrlModel urlModel2, String str2) {
        return new C60109d(str, urlModel, urlModel2, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C60109d)) {
            return false;
        }
        C60109d dVar = (C60109d) obj;
        return C89219l.m154714a(this.f137016a, dVar.f137016a) && C89219l.m154714a(this.f137017b, dVar.f137017b) && C89219l.m154714a(this.f137018c, dVar.f137018c) && C89219l.m154714a(this.f137019d, dVar.f137019d);
    }

    public final int hashCode() {
        String str = this.f137016a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        UrlModel urlModel = this.f137017b;
        int hashCode2 = (hashCode + (urlModel != null ? urlModel.hashCode() : 0)) * 31;
        UrlModel urlModel2 = this.f137018c;
        int hashCode3 = (hashCode2 + (urlModel2 != null ? urlModel2.hashCode() : 0)) * 31;
        String str2 = this.f137019d;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        return "ProfileNaviImageDataModel(naviId=" + this.f137016a + ", staticImageUrlModel=" + this.f137017b + ", dynamicImageUrlModel=" + this.f137018c + ", backgroundColorHex=" + this.f137019d + ")";
    }

    public final String getBackgroundColorHex() {
        return this.f137019d;
    }

    public final UrlModel getDynamicImageUrlModel() {
        return this.f137018c;
    }

    public final String getNaviId() {
        return this.f137016a;
    }

    public final UrlModel getStaticImageUrlModel() {
        return this.f137017b;
    }

    public C60109d(String str, UrlModel urlModel, UrlModel urlModel2, String str2) {
        this.f137016a = str;
        this.f137017b = urlModel;
        this.f137018c = urlModel2;
        this.f137019d = str2;
    }
}
