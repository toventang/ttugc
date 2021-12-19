package com.p2082ss.android.ugc.aweme.account.login.twostep;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.login.twostep.b */
public final class C32180b implements Serializable {
    @AbstractC27891c(mo46611a = "message")

    /* renamed from: a */
    private final String f76811a;
    @AbstractC27891c(mo46611a = "data")

    /* renamed from: b */
    private final C32181a f76812b;

    static {
        Covode.recordClassIndex(38945);
    }

    public static /* synthetic */ C32180b copy$default(C32180b bVar, String str, C32181a aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bVar.f76811a;
        }
        if ((i & 2) != 0) {
            aVar = bVar.f76812b;
        }
        return bVar.copy(str, aVar);
    }

    public final String component1() {
        return this.f76811a;
    }

    public final C32181a component2() {
        return this.f76812b;
    }

    public final C32180b copy(String str, C32181a aVar) {
        return new C32180b(str, aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32180b)) {
            return false;
        }
        C32180b bVar = (C32180b) obj;
        return C89219l.m154714a(this.f76811a, bVar.f76811a) && C89219l.m154714a(this.f76812b, bVar.f76812b);
    }

    public final int hashCode() {
        String str = this.f76811a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        C32181a aVar = this.f76812b;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "AuthDeviceResponse(message=" + this.f76811a + ", data=" + this.f76812b + ")";
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.b$a */
    public static final class C32181a implements Serializable {
        @AbstractC27891c(mo46611a = "auth_device")

        /* renamed from: a */
        private final List<C32186e> f76813a;
        @AbstractC27891c(mo46611a = "description")

        /* renamed from: b */
        private final String f76814b;
        @AbstractC27891c(mo46611a = "error_code")

        /* renamed from: c */
        private final Integer f76815c;

        static {
            Covode.recordClassIndex(38946);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.account.login.twostep.b$a */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ C32181a copy$default(C32181a aVar, List list, String str, Integer num, int i, Object obj) {
            if ((i & 1) != 0) {
                list = aVar.f76813a;
            }
            if ((i & 2) != 0) {
                str = aVar.f76814b;
            }
            if ((i & 4) != 0) {
                num = aVar.f76815c;
            }
            return aVar.copy(list, str, num);
        }

        public final List<C32186e> component1() {
            return this.f76813a;
        }

        public final String component2() {
            return this.f76814b;
        }

        public final Integer component3() {
            return this.f76815c;
        }

        public final C32181a copy(List<C32186e> list, String str, Integer num) {
            return new C32181a(list, str, num);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C32181a)) {
                return false;
            }
            C32181a aVar = (C32181a) obj;
            return C89219l.m154714a(this.f76813a, aVar.f76813a) && C89219l.m154714a(this.f76814b, aVar.f76814b) && C89219l.m154714a(this.f76815c, aVar.f76815c);
        }

        public final int hashCode() {
            List<C32186e> list = this.f76813a;
            int i = 0;
            int hashCode = (list != null ? list.hashCode() : 0) * 31;
            String str = this.f76814b;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
            Integer num = this.f76815c;
            if (num != null) {
                i = num.hashCode();
            }
            return hashCode2 + i;
        }

        public final String toString() {
            return "Data(auth_device=" + this.f76813a + ", errorDescription=" + this.f76814b + ", errorCode=" + this.f76815c + ")";
        }

        public final List<C32186e> getAuth_device() {
            return this.f76813a;
        }

        public final Integer getErrorCode() {
            return this.f76815c;
        }

        public final String getErrorDescription() {
            return this.f76814b;
        }

        public C32181a(List<C32186e> list, String str, Integer num) {
            this.f76813a = list;
            this.f76814b = str;
            this.f76815c = num;
        }
    }

    public final C32181a getData() {
        return this.f76812b;
    }

    public final String getMessage() {
        return this.f76811a;
    }

    public C32180b(String str, C32181a aVar) {
        this.f76811a = str;
        this.f76812b = aVar;
    }
}
