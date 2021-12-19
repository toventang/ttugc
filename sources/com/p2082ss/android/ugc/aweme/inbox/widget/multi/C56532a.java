package com.p2082ss.android.ugc.aweme.inbox.widget.multi;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.inbox.widget.multi.a */
public final class C56532a {
    @AbstractC27891c(mo46611a = "url_model")

    /* renamed from: a */
    public final UrlModel f128910a;
    @AbstractC27891c(mo46611a = "res_id")

    /* renamed from: b */
    public final int f128911b;
    @AbstractC27891c(mo46611a = "url")

    /* renamed from: c */
    public final String f128912c;

    static {
        Covode.recordClassIndex(66355);
    }

    public C56532a() {
        this(null, 0, null, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C56532a)) {
            return false;
        }
        C56532a aVar = (C56532a) obj;
        return C89219l.m154714a(this.f128910a, aVar.f128910a) && this.f128911b == aVar.f128911b && C89219l.m154714a(this.f128912c, aVar.f128912c);
    }

    public final int hashCode() {
        UrlModel urlModel = this.f128910a;
        int i = 0;
        int hashCode = (((urlModel != null ? urlModel.hashCode() : 0) * 31) + this.f128911b) * 31;
        String str = this.f128912c;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "ActivityIcon(urlModel=" + this.f128910a + ", resId=" + this.f128911b + ", url=" + this.f128912c + ")";
    }

    private C56532a(UrlModel urlModel, int i, String str) {
        this.f128910a = urlModel;
        this.f128911b = i;
        this.f128912c = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C56532a(UrlModel urlModel, int i, String str, int i2) {
        this((i2 & 1) != 0 ? null : urlModel, (i2 & 2) != 0 ? -1 : i, (i2 & 4) != 0 ? null : str);
    }
}
