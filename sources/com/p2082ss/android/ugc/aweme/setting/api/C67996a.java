package com.p2082ss.android.ugc.aweme.setting.api;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.setting.api.a */
public final class C67996a {
    @AbstractC27891c(mo46611a = "message")

    /* renamed from: a */
    public final String f152339a;
    @AbstractC27891c(mo46611a = "data")

    /* renamed from: b */
    public final C67997a f152340b;

    /* renamed from: com.ss.android.ugc.aweme.setting.api.a$a */
    public static final class C67997a {
        @AbstractC27891c(mo46611a = "error_code")

        /* renamed from: a */
        public final int f152341a;
        @AbstractC27891c(mo46611a = "has_pwd")

        /* renamed from: b */
        public final boolean f152342b;
        @AbstractC27891c(mo46611a = "has_email")

        /* renamed from: c */
        public final boolean f152343c;

        static {
            Covode.recordClassIndex(80193);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C67997a)) {
                return false;
            }
            C67997a aVar = (C67997a) obj;
            return this.f152341a == aVar.f152341a && this.f152342b == aVar.f152342b && this.f152343c == aVar.f152343c;
        }

        public final int hashCode() {
            int i = this.f152341a * 31;
            boolean z = this.f152342b;
            int i2 = 1;
            if (z) {
                z = true;
            }
            int i3 = z ? 1 : 0;
            int i4 = z ? 1 : 0;
            int i5 = z ? 1 : 0;
            int i6 = (i + i3) * 31;
            if (!this.f152343c) {
                i2 = 0;
            }
            return i6 + i2;
        }

        public final String toString() {
            return "Data(errorCode=" + this.f152341a + ", hasPwd=" + this.f152342b + ", hasEmail=" + this.f152343c + ")";
        }
    }

    static {
        Covode.recordClassIndex(80192);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C67996a)) {
            return false;
        }
        C67996a aVar = (C67996a) obj;
        return C89219l.m154714a(this.f152339a, aVar.f152339a) && C89219l.m154714a(this.f152340b, aVar.f152340b);
    }

    public final int hashCode() {
        String str = this.f152339a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        C67997a aVar = this.f152340b;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "AvailableWaysResponse(message=" + this.f152339a + ", data=" + this.f152340b + ")";
    }
}
