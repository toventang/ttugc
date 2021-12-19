package com.p2082ss.android.ugc.aweme.model.api.p3459a;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.model.api.a.g */
public final class C60113g implements Serializable {
    @AbstractC27891c(mo46611a = StringSet.type)

    /* renamed from: a */
    private String f137027a;
    @AbstractC27891c(mo46611a = "static_image_larger")

    /* renamed from: b */
    private UrlModel f137028b;
    @AbstractC27891c(mo46611a = "static_image_thumbnail")

    /* renamed from: c */
    private UrlModel f137029c;

    static {
        Covode.recordClassIndex(70624);
    }

    public static /* synthetic */ C60113g copy$default(C60113g gVar, String str, UrlModel urlModel, UrlModel urlModel2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = gVar.f137027a;
        }
        if ((i & 2) != 0) {
            urlModel = gVar.f137028b;
        }
        if ((i & 4) != 0) {
            urlModel2 = gVar.f137029c;
        }
        return gVar.copy(str, urlModel, urlModel2);
    }

    public final String component1() {
        return this.f137027a;
    }

    public final UrlModel component2() {
        return this.f137028b;
    }

    public final UrlModel component3() {
        return this.f137029c;
    }

    public final C60113g copy(String str, UrlModel urlModel, UrlModel urlModel2) {
        return new C60113g(str, urlModel, urlModel2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C60113g)) {
            return false;
        }
        C60113g gVar = (C60113g) obj;
        return C89219l.m154714a(this.f137027a, gVar.f137027a) && C89219l.m154714a(this.f137028b, gVar.f137028b) && C89219l.m154714a(this.f137029c, gVar.f137029c);
    }

    public final int hashCode() {
        String str = this.f137027a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        UrlModel urlModel = this.f137028b;
        int hashCode2 = (hashCode + (urlModel != null ? urlModel.hashCode() : 0)) * 31;
        UrlModel urlModel2 = this.f137029c;
        if (urlModel2 != null) {
            i = urlModel2.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "ProfileNaviStaticImageDataModel(type=" + this.f137027a + ", staticImageUrl=" + this.f137028b + ", thumbnailUrl=" + this.f137029c + ")";
    }

    public final UrlModel getStaticImageUrl() {
        return this.f137028b;
    }

    public final UrlModel getThumbnailUrl() {
        return this.f137029c;
    }

    public final String getType() {
        return this.f137027a;
    }

    public final void setStaticImageUrl(UrlModel urlModel) {
        this.f137028b = urlModel;
    }

    public final void setThumbnailUrl(UrlModel urlModel) {
        this.f137029c = urlModel;
    }

    public final void setType(String str) {
        this.f137027a = str;
    }

    public C60113g(String str, UrlModel urlModel, UrlModel urlModel2) {
        this.f137027a = str;
        this.f137028b = urlModel;
        this.f137029c = urlModel2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C60113g(String str, UrlModel urlModel, UrlModel urlModel2, int i, C89214g gVar) {
        this(str, (i & 2) != 0 ? null : urlModel, urlModel2);
    }
}
