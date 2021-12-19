package com.p2082ss.android.ugc.aweme.comment.p2484a;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.comment.a.h */
public final class C36182h {
    @AbstractC27891c(mo46611a = StringSet.type)

    /* renamed from: a */
    public int f85462a = 0;
    @AbstractC27891c(mo46611a = "icon")

    /* renamed from: b */
    public UrlModel f85463b = null;

    static {
        Covode.recordClassIndex(43442);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C36182h)) {
            return false;
        }
        C36182h hVar = (C36182h) obj;
        return this.f85462a == hVar.f85462a && C89219l.m154714a(this.f85463b, hVar.f85463b);
    }

    public final int hashCode() {
        int i = this.f85462a * 31;
        UrlModel urlModel = this.f85463b;
        return i + (urlModel != null ? urlModel.hashCode() : 0);
    }

    public final String toString() {
        return "NewStyleBubbleConfig(type=" + this.f85462a + ", icon=" + this.f85463b + ")";
    }

    private C36182h() {
    }
}
