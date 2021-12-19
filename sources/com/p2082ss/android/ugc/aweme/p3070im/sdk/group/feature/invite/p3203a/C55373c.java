package com.p2082ss.android.ugc.aweme.p3070im.sdk.group.feature.invite.p3203a;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.invite.a.c */
public final class C55373c {
    @AbstractC27891c(mo46611a = "error_code")

    /* renamed from: a */
    public Integer f126608a = null;
    @AbstractC27891c(mo46611a = "error_title")

    /* renamed from: b */
    public String f126609b = null;
    @AbstractC27891c(mo46611a = "error_message")

    /* renamed from: c */
    public String f126610c = null;

    static {
        Covode.recordClassIndex(65138);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C55373c)) {
            return false;
        }
        C55373c cVar = (C55373c) obj;
        return C89219l.m154714a(this.f126608a, cVar.f126608a) && C89219l.m154714a(this.f126609b, cVar.f126609b) && C89219l.m154714a(this.f126610c, cVar.f126610c);
    }

    public final int hashCode() {
        Integer num = this.f126608a;
        int i = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        String str = this.f126609b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f126610c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "InviteError(errorCode=" + this.f126608a + ", errorTitle=" + this.f126609b + ", errorMessage=" + this.f126610c + ")";
    }

    private C55373c() {
    }
}
