package com.p2082ss.android.ugc.aweme.account.login.trusted;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.login.trusted.j */
public final class C32107j {
    @AbstractC27891c(mo46611a = "message")

    /* renamed from: a */
    public final String f76609a = null;
    @AbstractC27891c(mo46611a = "data")

    /* renamed from: b */
    public final C32108a f76610b = null;

    static {
        Covode.recordClassIndex(38866);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32107j)) {
            return false;
        }
        C32107j jVar = (C32107j) obj;
        return C89219l.m154714a(this.f76609a, jVar.f76609a) && C89219l.m154714a(this.f76610b, jVar.f76610b);
    }

    public final int hashCode() {
        String str = this.f76609a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        C32108a aVar = this.f76610b;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "TrustedUsersResponse(message=" + this.f76609a + ", data=" + this.f76610b + ")";
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.trusted.j$a */
    public static final class C32108a {
        @AbstractC27891c(mo46611a = "trust_users")

        /* renamed from: a */
        public final List<C32105h> f76611a = null;

        static {
            Covode.recordClassIndex(38867);
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof C32108a) && C89219l.m154714a(this.f76611a, ((C32108a) obj).f76611a);
            }
            return true;
        }

        public final int hashCode() {
            List<C32105h> list = this.f76611a;
            if (list != null) {
                return list.hashCode();
            }
            return 0;
        }

        public final String toString() {
            return "Data(records=" + this.f76611a + ")";
        }

        private C32108a() {
        }
    }

    private C32107j() {
    }
}
