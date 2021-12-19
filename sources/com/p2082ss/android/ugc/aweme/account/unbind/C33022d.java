package com.p2082ss.android.ugc.aweme.account.unbind;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.unbind.d */
public final class C33022d {
    @AbstractC27891c(mo46611a = "message")

    /* renamed from: a */
    public final String f78562a;
    @AbstractC27891c(mo46611a = "data")

    /* renamed from: b */
    public final C33023a f78563b;

    /* renamed from: com.ss.android.ugc.aweme.account.unbind.d$a */
    public static final class C33023a {
        @AbstractC27891c(mo46611a = "error_code")

        /* renamed from: a */
        public int f78564a;
        @AbstractC27891c(mo46611a = "description")

        /* renamed from: b */
        public final String f78565b;

        static {
            Covode.recordClassIndex(39829);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C33023a)) {
                return false;
            }
            C33023a aVar = (C33023a) obj;
            return this.f78564a == aVar.f78564a && C89219l.m154714a(this.f78565b, aVar.f78565b);
        }

        public final int hashCode() {
            int i = this.f78564a * 31;
            String str = this.f78565b;
            return i + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            return "Data(errorCode=" + this.f78564a + ", description=" + this.f78565b + ")";
        }
    }

    static {
        Covode.recordClassIndex(39828);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C33022d)) {
            return false;
        }
        C33022d dVar = (C33022d) obj;
        return C89219l.m154714a(this.f78562a, dVar.f78562a) && C89219l.m154714a(this.f78563b, dVar.f78563b);
    }

    public final int hashCode() {
        String str = this.f78562a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        C33023a aVar = this.f78563b;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "UnbindResponse(message=" + this.f78562a + ", data=" + this.f78563b + ")";
    }
}
