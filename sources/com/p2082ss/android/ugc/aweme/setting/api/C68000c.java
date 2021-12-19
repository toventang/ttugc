package com.p2082ss.android.ugc.aweme.setting.api;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.ArrayList;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.setting.api.c */
public final class C68000c {
    @AbstractC27891c(mo46611a = "message")

    /* renamed from: a */
    public final String f152348a;
    @AbstractC27891c(mo46611a = "data")

    /* renamed from: b */
    public final C68001a f152349b;

    static {
        Covode.recordClassIndex(80196);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C68000c)) {
            return false;
        }
        C68000c cVar = (C68000c) obj;
        return C89219l.m154714a(this.f152348a, cVar.f152348a) && C89219l.m154714a(this.f152349b, cVar.f152349b);
    }

    public final int hashCode() {
        String str = this.f152348a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        C68001a aVar = this.f152349b;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "UnbindValidateResponse(message=" + this.f152348a + ", data=" + this.f152349b + ")";
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.api.c$a */
    public static final class C68001a {
        @AbstractC27891c(mo46611a = "error_code")

        /* renamed from: a */
        public int f152350a = 0;
        @AbstractC27891c(mo46611a = "extra_eligible_login_methods")

        /* renamed from: b */
        public final ArrayList<String> f152351b = null;

        static {
            Covode.recordClassIndex(80197);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C68001a)) {
                return false;
            }
            C68001a aVar = (C68001a) obj;
            return this.f152350a == aVar.f152350a && C89219l.m154714a(this.f152351b, aVar.f152351b);
        }

        public final int hashCode() {
            int i = this.f152350a * 31;
            ArrayList<String> arrayList = this.f152351b;
            return i + (arrayList != null ? arrayList.hashCode() : 0);
        }

        public final String toString() {
            return "Data(errorCode=" + this.f152350a + ", extraEligibleLoginMethod=" + this.f152351b + ")";
        }

        private C68001a() {
        }
    }
}
