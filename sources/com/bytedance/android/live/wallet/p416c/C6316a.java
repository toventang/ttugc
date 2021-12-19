package com.bytedance.android.live.wallet.p416c;

import com.bytedance.android.live.C4139e;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdkapi.host.AbstractC11812i;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.wallet.c.a */
public final class C6316a {

    /* renamed from: a */
    public static final C6316a f15805a = new C6316a();

    private C6316a() {
    }

    /* renamed from: com.bytedance.android.live.wallet.c.a$a */
    public static final class C6317a {
        @AbstractC27891c(mo46611a = "error_code")

        /* renamed from: a */
        public final int f15806a;
        @AbstractC27891c(mo46611a = "detail_code")

        /* renamed from: b */
        public final int f15807b;
        @AbstractC27891c(mo46611a = "error_message")

        /* renamed from: c */
        public final String f15808c;

        static {
            Covode.recordClassIndex(7039);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C6317a)) {
                return false;
            }
            C6317a aVar = (C6317a) obj;
            return this.f15806a == aVar.f15806a && this.f15807b == aVar.f15807b && C89219l.m154714a(this.f15808c, aVar.f15808c);
        }

        public final int hashCode() {
            int i = ((this.f15806a * 31) + this.f15807b) * 31;
            String str = this.f15808c;
            return i + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            return "ChargeFailEntity(errorCode=" + this.f15806a + ", detailCode=" + this.f15807b + ", msg=" + this.f15808c + ")";
        }

        private /* synthetic */ C6317a() {
            this(-1, -1, "");
        }

        /* renamed from: a */
        public final String mo12357a() {
            String b = C4139e.C4140a.f11575b.mo46674b(this);
            C89219l.m154716b(b, "");
            return b;
        }

        public C6317a(int i, int i2, String str) {
            C89219l.m154721d(str, "");
            this.f15806a = i;
            this.f15807b = i2;
            this.f15808c = str;
        }
    }

    static {
        Covode.recordClassIndex(7038);
    }

    /* renamed from: a */
    public static void m13637a(int i, int i2, String str) {
        if (str == null) {
            str = "";
        }
        ((AbstractC11812i) C6193a.m13435a(AbstractC11812i.class)).mo18876a("recharge_fail", new C6317a(i, i2, str).mo12357a());
    }
}
