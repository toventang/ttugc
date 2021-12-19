package com.p2082ss.android.ugc.aweme.model.api.p3459a;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.model.api.a.a */
public final class C60106a implements Serializable {
    @AbstractC27891c(mo46611a = StringSet.name)

    /* renamed from: a */
    private String f137006a;
    @AbstractC27891c(mo46611a = "animation_url")

    /* renamed from: b */
    private UrlModel f137007b;

    static {
        Covode.recordClassIndex(70617);
    }

    public static /* synthetic */ C60106a copy$default(C60106a aVar, String str, UrlModel urlModel, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aVar.f137006a;
        }
        if ((i & 2) != 0) {
            urlModel = aVar.f137007b;
        }
        return aVar.copy(str, urlModel);
    }

    public final String component1() {
        return this.f137006a;
    }

    public final UrlModel component2() {
        return this.f137007b;
    }

    public final C60106a copy(String str, UrlModel urlModel) {
        return new C60106a(str, urlModel);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C60106a)) {
            return false;
        }
        C60106a aVar = (C60106a) obj;
        return C89219l.m154714a(this.f137006a, aVar.f137006a) && C89219l.m154714a(this.f137007b, aVar.f137007b);
    }

    public final int hashCode() {
        String str = this.f137006a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        UrlModel urlModel = this.f137007b;
        if (urlModel != null) {
            i = urlModel.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "ProfileNaviAnimatedGifDataModel(name=" + this.f137006a + ", url=" + this.f137007b + ")";
    }

    public final String getName() {
        return this.f137006a;
    }

    public final UrlModel getUrl() {
        return this.f137007b;
    }

    public final void setName(String str) {
        this.f137006a = str;
    }

    public final void setUrl(UrlModel urlModel) {
        this.f137007b = urlModel;
    }

    public C60106a(String str, UrlModel urlModel) {
        this.f137006a = str;
        this.f137007b = urlModel;
    }
}
