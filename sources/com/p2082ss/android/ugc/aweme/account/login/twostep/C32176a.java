package com.p2082ss.android.ugc.aweme.account.login.twostep;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.login.twostep.a */
public final class C32176a implements Serializable {
    @AbstractC27891c(mo46611a = "message")

    /* renamed from: a */
    private final String f76799a;
    @AbstractC27891c(mo46611a = "data")

    /* renamed from: b */
    private final C32177a f76800b;

    static {
        Covode.recordClassIndex(38941);
    }

    public static /* synthetic */ C32176a copy$default(C32176a aVar, String str, C32177a aVar2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aVar.f76799a;
        }
        if ((i & 2) != 0) {
            aVar2 = aVar.f76800b;
        }
        return aVar.copy(str, aVar2);
    }

    public final String component1() {
        return this.f76799a;
    }

    public final C32177a component2() {
        return this.f76800b;
    }

    public final C32176a copy(String str, C32177a aVar) {
        return new C32176a(str, aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32176a)) {
            return false;
        }
        C32176a aVar = (C32176a) obj;
        return C89219l.m154714a(this.f76799a, aVar.f76799a) && C89219l.m154714a(this.f76800b, aVar.f76800b);
    }

    public final int hashCode() {
        String str = this.f76799a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        C32177a aVar = this.f76800b;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "AddVerificationResponse(message=" + this.f76799a + ", data=" + this.f76800b + ")";
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.a$a */
    public static final class C32177a implements Serializable {
        @AbstractC27891c(mo46611a = "two_step_verify_ways")

        /* renamed from: a */
        private final List<C32178aa> f76801a;
        @AbstractC27891c(mo46611a = "default_verify_way")

        /* renamed from: b */
        private final String f76802b;
        @AbstractC27891c(mo46611a = "description")

        /* renamed from: c */
        private final String f76803c;
        @AbstractC27891c(mo46611a = "error_code")

        /* renamed from: d */
        private final Integer f76804d;

        static {
            Covode.recordClassIndex(38942);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.account.login.twostep.a$a */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ C32177a copy$default(C32177a aVar, List list, String str, String str2, Integer num, int i, Object obj) {
            if ((i & 1) != 0) {
                list = aVar.f76801a;
            }
            if ((i & 2) != 0) {
                str = aVar.f76802b;
            }
            if ((i & 4) != 0) {
                str2 = aVar.f76803c;
            }
            if ((i & 8) != 0) {
                num = aVar.f76804d;
            }
            return aVar.copy(list, str, str2, num);
        }

        public final List<C32178aa> component1() {
            return this.f76801a;
        }

        public final String component2() {
            return this.f76802b;
        }

        public final String component3() {
            return this.f76803c;
        }

        public final Integer component4() {
            return this.f76804d;
        }

        public final C32177a copy(List<C32178aa> list, String str, String str2, Integer num) {
            return new C32177a(list, str, str2, num);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C32177a)) {
                return false;
            }
            C32177a aVar = (C32177a) obj;
            return C89219l.m154714a(this.f76801a, aVar.f76801a) && C89219l.m154714a(this.f76802b, aVar.f76802b) && C89219l.m154714a(this.f76803c, aVar.f76803c) && C89219l.m154714a(this.f76804d, aVar.f76804d);
        }

        public final int hashCode() {
            List<C32178aa> list = this.f76801a;
            int i = 0;
            int hashCode = (list != null ? list.hashCode() : 0) * 31;
            String str = this.f76802b;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f76803c;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
            Integer num = this.f76804d;
            if (num != null) {
                i = num.hashCode();
            }
            return hashCode3 + i;
        }

        public final String toString() {
            return "Data(two_step_verify_ways=" + this.f76801a + ", default_verify_way=" + this.f76802b + ", errorDescription=" + this.f76803c + ", errorCode=" + this.f76804d + ")";
        }

        public final String getDefault_verify_way() {
            return this.f76802b;
        }

        public final Integer getErrorCode() {
            return this.f76804d;
        }

        public final String getErrorDescription() {
            return this.f76803c;
        }

        public final List<C32178aa> getTwo_step_verify_ways() {
            return this.f76801a;
        }

        public C32177a(List<C32178aa> list, String str, String str2, Integer num) {
            this.f76801a = list;
            this.f76802b = str;
            this.f76803c = str2;
            this.f76804d = num;
        }
    }

    public final C32177a getData() {
        return this.f76800b;
    }

    public final String getMessage() {
        return this.f76799a;
    }

    public C32176a(String str, C32177a aVar) {
        this.f76799a = str;
        this.f76800b = aVar;
    }
}
