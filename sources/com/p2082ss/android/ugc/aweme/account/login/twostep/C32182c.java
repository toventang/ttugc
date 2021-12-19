package com.p2082ss.android.ugc.aweme.account.login.twostep;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.login.twostep.c */
public final class C32182c implements Serializable {
    @AbstractC27891c(mo46611a = "message")

    /* renamed from: a */
    private final String f76816a;
    @AbstractC27891c(mo46611a = "data")

    /* renamed from: b */
    private final C32292u f76817b;

    static {
        Covode.recordClassIndex(38947);
    }

    public static /* synthetic */ C32182c copy$default(C32182c cVar, String str, C32292u uVar, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cVar.f76816a;
        }
        if ((i & 2) != 0) {
            uVar = cVar.f76817b;
        }
        return cVar.copy(str, uVar);
    }

    public final String component1() {
        return this.f76816a;
    }

    public final C32292u component2() {
        return this.f76817b;
    }

    public final C32182c copy(String str, C32292u uVar) {
        return new C32182c(str, uVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32182c)) {
            return false;
        }
        C32182c cVar = (C32182c) obj;
        return C89219l.m154714a(this.f76816a, cVar.f76816a) && C89219l.m154714a(this.f76817b, cVar.f76817b);
    }

    public final int hashCode() {
        String str = this.f76816a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        C32292u uVar = this.f76817b;
        if (uVar != null) {
            i = uVar.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "AvailableWaysResponse(message=" + this.f76816a + ", data=" + this.f76817b + ")";
    }

    public final C32292u getData() {
        return this.f76817b;
    }

    public final String getMessage() {
        return this.f76816a;
    }

    public C32182c(String str, C32292u uVar) {
        this.f76816a = str;
        this.f76817b = uVar;
    }
}
