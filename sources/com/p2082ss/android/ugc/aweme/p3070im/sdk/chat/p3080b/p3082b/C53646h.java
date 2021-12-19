package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3080b.p3082b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.b.b.h */
public final class C53646h {

    /* renamed from: a */
    public final UrlModel f123083a;

    /* renamed from: b */
    public int f123084b;

    static {
        Covode.recordClassIndex(63226);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C53646h)) {
            return false;
        }
        C53646h hVar = (C53646h) obj;
        return C89219l.m154714a(this.f123083a, hVar.f123083a) && this.f123084b == hVar.f123084b;
    }

    public final int hashCode() {
        UrlModel urlModel = this.f123083a;
        return ((urlModel != null ? urlModel.hashCode() : 0) * 31) + this.f123084b;
    }

    public final String toString() {
        return "UrlStatusModel(url=" + this.f123083a + ", status=" + this.f123084b + ")";
    }

    private C53646h(UrlModel urlModel) {
        C89219l.m154721d(urlModel, "");
        this.f123083a = urlModel;
        this.f123084b = 0;
    }

    public /* synthetic */ C53646h(UrlModel urlModel, byte b) {
        this(urlModel);
    }
}
