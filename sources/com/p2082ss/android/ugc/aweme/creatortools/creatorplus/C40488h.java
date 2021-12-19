package com.p2082ss.android.ugc.aweme.creatortools.creatorplus;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.creatortools.creatorplus.h */
public final class C40488h {
    @AbstractC27891c(mo46611a = "image")

    /* renamed from: a */
    public final UrlModel f94738a;
    @AbstractC27891c(mo46611a = "message_key")

    /* renamed from: b */
    public final String f94739b;
    @AbstractC27891c(mo46611a = "title_key")

    /* renamed from: c */
    public final String f94740c;

    static {
        Covode.recordClassIndex(48295);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40488h)) {
            return false;
        }
        C40488h hVar = (C40488h) obj;
        return C89219l.m154714a(this.f94738a, hVar.f94738a) && C89219l.m154714a(this.f94739b, hVar.f94739b) && C89219l.m154714a(this.f94740c, hVar.f94740c);
    }

    public final int hashCode() {
        UrlModel urlModel = this.f94738a;
        int i = 0;
        int hashCode = (urlModel != null ? urlModel.hashCode() : 0) * 31;
        String str = this.f94739b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f94740c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "ModalInfo(image=" + this.f94738a + ", messageKey=" + this.f94739b + ", titleKey=" + this.f94740c + ")";
    }
}
