package com.p2082ss.android.ugc.aweme.sticker.data;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.data.b */
public final class C75307b implements Serializable {
    @AbstractC27891c(mo46611a = "language")
    public String language;
    @AbstractC27891c(mo46611a = "url")
    public UrlModel url;

    static {
        Covode.recordClassIndex(88224);
    }

    public C75307b() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ C75307b copy$default(C75307b bVar, String str, UrlModel urlModel, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bVar.language;
        }
        if ((i & 2) != 0) {
            urlModel = bVar.url;
        }
        return bVar.copy(str, urlModel);
    }

    public final String component1() {
        return this.language;
    }

    public final UrlModel component2() {
        return this.url;
    }

    public final C75307b copy(String str, UrlModel urlModel) {
        return new C75307b(str, urlModel);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C75307b)) {
            return false;
        }
        C75307b bVar = (C75307b) obj;
        return C89219l.m154714a(this.language, bVar.language) && C89219l.m154714a(this.url, bVar.url);
    }

    public final int hashCode() {
        String str = this.language;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        UrlModel urlModel = this.url;
        if (urlModel != null) {
            i = urlModel.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "AutocaptionType(language=" + this.language + ", url=" + this.url + ")";
    }

    public final String getLanguage() {
        return this.language;
    }

    public final UrlModel getUrl() {
        return this.url;
    }

    public final void setLanguage(String str) {
        this.language = str;
    }

    public final void setUrl(UrlModel urlModel) {
        this.url = urlModel;
    }

    public C75307b(String str, UrlModel urlModel) {
        this.language = str;
        this.url = urlModel;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C75307b(String str, UrlModel urlModel, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : urlModel);
    }
}
