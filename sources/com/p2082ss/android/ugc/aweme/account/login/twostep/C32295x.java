package com.p2082ss.android.ugc.aweme.account.login.twostep;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.login.twostep.x */
public final class C32295x implements Serializable {
    @AbstractC27891c(mo46611a = "message")

    /* renamed from: a */
    private final String f77027a;
    @AbstractC27891c(mo46611a = "data")

    /* renamed from: b */
    private final C32296a f77028b;

    static {
        Covode.recordClassIndex(39060);
    }

    public static /* synthetic */ C32295x copy$default(C32295x xVar, String str, C32296a aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            str = xVar.f77027a;
        }
        if ((i & 2) != 0) {
            aVar = xVar.f77028b;
        }
        return xVar.copy(str, aVar);
    }

    public final String component1() {
        return this.f77027a;
    }

    public final C32296a component2() {
        return this.f77028b;
    }

    public final C32295x copy(String str, C32296a aVar) {
        return new C32295x(str, aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32295x)) {
            return false;
        }
        C32295x xVar = (C32295x) obj;
        return C89219l.m154714a(this.f77027a, xVar.f77027a) && C89219l.m154714a(this.f77028b, xVar.f77028b);
    }

    public final int hashCode() {
        String str = this.f77027a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        C32296a aVar = this.f77028b;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "UnusualInfoResponse(message=" + this.f77027a + ", data=" + this.f77028b + ")";
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.x$a */
    public static final class C32296a implements Serializable {
        @AbstractC27891c(mo46611a = "new_notice")

        /* renamed from: a */
        private final Integer f77029a;
        @AbstractC27891c(mo46611a = "description")

        /* renamed from: b */
        private final String f77030b;
        @AbstractC27891c(mo46611a = "error_code")

        /* renamed from: c */
        private final Integer f77031c;

        static {
            Covode.recordClassIndex(39061);
        }

        public static /* synthetic */ C32296a copy$default(C32296a aVar, Integer num, String str, Integer num2, int i, Object obj) {
            if ((i & 1) != 0) {
                num = aVar.f77029a;
            }
            if ((i & 2) != 0) {
                str = aVar.f77030b;
            }
            if ((i & 4) != 0) {
                num2 = aVar.f77031c;
            }
            return aVar.copy(num, str, num2);
        }

        public final Integer component1() {
            return this.f77029a;
        }

        public final String component2() {
            return this.f77030b;
        }

        public final Integer component3() {
            return this.f77031c;
        }

        public final C32296a copy(Integer num, String str, Integer num2) {
            return new C32296a(num, str, num2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C32296a)) {
                return false;
            }
            C32296a aVar = (C32296a) obj;
            return C89219l.m154714a(this.f77029a, aVar.f77029a) && C89219l.m154714a(this.f77030b, aVar.f77030b) && C89219l.m154714a(this.f77031c, aVar.f77031c);
        }

        public final int hashCode() {
            Integer num = this.f77029a;
            int i = 0;
            int hashCode = (num != null ? num.hashCode() : 0) * 31;
            String str = this.f77030b;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
            Integer num2 = this.f77031c;
            if (num2 != null) {
                i = num2.hashCode();
            }
            return hashCode2 + i;
        }

        public final String toString() {
            return "Data(new_notice=" + this.f77029a + ", errorDescription=" + this.f77030b + ", errorCode=" + this.f77031c + ")";
        }

        public final Integer getErrorCode() {
            return this.f77031c;
        }

        public final String getErrorDescription() {
            return this.f77030b;
        }

        public final Integer getNew_notice() {
            return this.f77029a;
        }

        public C32296a(Integer num, String str, Integer num2) {
            this.f77029a = num;
            this.f77030b = str;
            this.f77031c = num2;
        }
    }

    public final C32296a getData() {
        return this.f77028b;
    }

    public final String getMessage() {
        return this.f77027a;
    }

    public C32295x(String str, C32296a aVar) {
        this.f77027a = str;
        this.f77028b = aVar;
    }
}
