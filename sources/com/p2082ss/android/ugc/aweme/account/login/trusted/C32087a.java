package com.p2082ss.android.ugc.aweme.account.login.trusted;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.login.trusted.a */
public final class C32087a {
    @AbstractC27891c(mo46611a = "message")

    /* renamed from: a */
    public final String f76574a = null;
    @AbstractC27891c(mo46611a = "data")

    /* renamed from: b */
    public final C32088a f76575b = null;

    static {
        Covode.recordClassIndex(38846);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32087a)) {
            return false;
        }
        C32087a aVar = (C32087a) obj;
        return C89219l.m154714a(this.f76574a, aVar.f76574a) && C89219l.m154714a(this.f76575b, aVar.f76575b);
    }

    public final int hashCode() {
        String str = this.f76574a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        C32088a aVar = this.f76575b;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "LoginHistoryFeatureStateResponse(message=" + this.f76574a + ", data=" + this.f76575b + ")";
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.trusted.a$a */
    public static final class C32088a {
        @AbstractC27891c(mo46611a = "user_device_record_status")

        /* renamed from: a */
        public final int f76576a = 0;

        static {
            Covode.recordClassIndex(38847);
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof C32088a) && this.f76576a == ((C32088a) obj).f76576a;
            }
            return true;
        }

        public final int hashCode() {
            return this.f76576a;
        }

        public final String toString() {
            return "Data(status=" + this.f76576a + ")";
        }

        private C32088a() {
        }
    }

    private C32087a() {
    }
}
