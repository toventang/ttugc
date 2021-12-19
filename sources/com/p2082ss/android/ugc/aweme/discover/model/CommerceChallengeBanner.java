package com.p2082ss.android.ugc.aweme.discover.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.model.CommerceChallengeBanner */
public final class CommerceChallengeBanner implements Serializable {
    @AbstractC27891c(mo46611a = "icon")
    private final UrlModel icon;
    @AbstractC27891c(mo46611a = "open_url")
    private final String openUrl;
    @AbstractC27891c(mo46611a = "web_url")
    private final String webUrl;

    static {
        Covode.recordClassIndex(50439);
    }

    public static /* synthetic */ CommerceChallengeBanner copy$default(CommerceChallengeBanner commerceChallengeBanner, UrlModel urlModel, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            urlModel = commerceChallengeBanner.icon;
        }
        if ((i & 2) != 0) {
            str = commerceChallengeBanner.webUrl;
        }
        if ((i & 4) != 0) {
            str2 = commerceChallengeBanner.openUrl;
        }
        return commerceChallengeBanner.copy(urlModel, str, str2);
    }

    public final UrlModel component1() {
        return this.icon;
    }

    public final String component2() {
        return this.webUrl;
    }

    public final String component3() {
        return this.openUrl;
    }

    public final CommerceChallengeBanner copy(UrlModel urlModel, String str, String str2) {
        C89219l.m154721d(urlModel, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        return new CommerceChallengeBanner(urlModel, str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommerceChallengeBanner)) {
            return false;
        }
        CommerceChallengeBanner commerceChallengeBanner = (CommerceChallengeBanner) obj;
        return C89219l.m154714a(this.icon, commerceChallengeBanner.icon) && C89219l.m154714a(this.webUrl, commerceChallengeBanner.webUrl) && C89219l.m154714a(this.openUrl, commerceChallengeBanner.openUrl);
    }

    public final int hashCode() {
        UrlModel urlModel = this.icon;
        int i = 0;
        int hashCode = (urlModel != null ? urlModel.hashCode() : 0) * 31;
        String str = this.webUrl;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.openUrl;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "CommerceChallengeBanner(icon=" + this.icon + ", webUrl=" + this.webUrl + ", openUrl=" + this.openUrl + ")";
    }

    public final UrlModel getIcon() {
        return this.icon;
    }

    public final String getOpenUrl() {
        return this.openUrl;
    }

    public final String getWebUrl() {
        return this.webUrl;
    }

    public CommerceChallengeBanner(UrlModel urlModel, String str, String str2) {
        C89219l.m154721d(urlModel, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        this.icon = urlModel;
        this.webUrl = str;
        this.openUrl = str2;
    }
}
