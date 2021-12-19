package com.p2082ss.android.ugc.aweme.setting.api;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.setting.api.b */
public final class C67998b {
    @AbstractC27891c(mo46611a = "message")

    /* renamed from: a */
    public final String f152344a;
    @AbstractC27891c(mo46611a = "data")

    /* renamed from: b */
    public final C67999a f152345b;

    /* renamed from: com.ss.android.ugc.aweme.setting.api.b$a */
    public static final class C67999a {
        @AbstractC27891c(mo46611a = "error_code")

        /* renamed from: a */
        public final int f152346a;
        @AbstractC27891c(mo46611a = "safe")

        /* renamed from: b */
        public final boolean f152347b;

        static {
            Covode.recordClassIndex(80195);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C67999a)) {
                return false;
            }
            C67999a aVar = (C67999a) obj;
            return this.f152346a == aVar.f152346a && this.f152347b == aVar.f152347b;
        }

        public final int hashCode() {
            int i = this.f152346a * 31;
            boolean z = this.f152347b;
            if (z) {
                z = true;
            }
            int i2 = z ? 1 : 0;
            int i3 = z ? 1 : 0;
            int i4 = z ? 1 : 0;
            return i + i2;
        }

        public final String toString() {
            return "Data(errorCode=" + this.f152346a + ", isSafe=" + this.f152347b + ")";
        }
    }

    static {
        Covode.recordClassIndex(80194);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C67998b)) {
            return false;
        }
        C67998b bVar = (C67998b) obj;
        return C89219l.m154714a(this.f152344a, bVar.f152344a) && C89219l.m154714a(this.f152345b, bVar.f152345b);
    }

    public final int hashCode() {
        String str = this.f152344a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        C67999a aVar = this.f152345b;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "SafeEnvResponse(message=" + this.f152344a + ", data=" + this.f152345b + ")";
    }
}
