package com.p2082ss.android.ugc.aweme.compliance.api.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.ss.android.ugc.aweme.compliance.api.model.m */
public final class C39252m {

    /* renamed from: b */
    public static final C39253a f92731b = new C39253a((byte) 0);
    @AbstractC27891c(mo46611a = "status")

    /* renamed from: a */
    public final int f92732a = 2;

    static {
        Covode.recordClassIndex(46910);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C39252m) && this.f92732a == ((C39252m) obj).f92732a;
        }
        return true;
    }

    public final int hashCode() {
        return this.f92732a;
    }

    public final String toString() {
        return "PrivacyAgreementRecord(status=" + this.f92732a + ")";
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.api.model.m$a */
    public static final class C39253a {
        static {
            Covode.recordClassIndex(46911);
        }

        private C39253a() {
        }

        public /* synthetic */ C39253a(byte b) {
            this();
        }
    }
}
