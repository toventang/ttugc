package com.p2082ss.android.ugc.aweme.specact.pendant.p3928b;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.specact.pendant.b.a */
public final class C74958a extends BaseResponse {
    @AbstractC27891c(mo46611a = "err_no")

    /* renamed from: a */
    public int f168518a;
    @AbstractC27891c(mo46611a = "data")

    /* renamed from: b */
    public C74959a f168519b;

    /* renamed from: com.ss.android.ugc.aweme.specact.pendant.b.a$a */
    public static final class C74959a {
        @AbstractC27891c(mo46611a = "amount")

        /* renamed from: a */
        public int f168520a;
        @AbstractC27891c(mo46611a = "amount_type")

        /* renamed from: b */
        public String f168521b;
        @AbstractC27891c(mo46611a = "next_req_interval")

        /* renamed from: c */
        public int f168522c;
        @AbstractC27891c(mo46611a = "cold_down")

        /* renamed from: d */
        public int f168523d;
        @AbstractC27891c(mo46611a = "is_last_round")

        /* renamed from: e */
        public boolean f168524e;
        @AbstractC27891c(mo46611a = "display_amount")

        /* renamed from: f */
        public int f168525f;
        @AbstractC27891c(mo46611a = "display_cash_amount")

        /* renamed from: g */
        public int f168526g;
        @AbstractC27891c(mo46611a = "display_cash_amount_i18n")

        /* renamed from: h */
        public String f168527h;
        @AbstractC27891c(mo46611a = "show_points")

        /* renamed from: i */
        public boolean f168528i;
        @AbstractC27891c(mo46611a = "canival_ratio")

        /* renamed from: j */
        public final int f168529j;

        static {
            Covode.recordClassIndex(87829);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C74959a)) {
                return false;
            }
            C74959a aVar = (C74959a) obj;
            return this.f168520a == aVar.f168520a && C89219l.m154714a(this.f168521b, aVar.f168521b) && this.f168522c == aVar.f168522c && this.f168523d == aVar.f168523d && this.f168524e == aVar.f168524e && this.f168525f == aVar.f168525f && this.f168526g == aVar.f168526g && C89219l.m154714a(this.f168527h, aVar.f168527h) && this.f168528i == aVar.f168528i && this.f168529j == aVar.f168529j;
        }

        public final int hashCode() {
            int i = this.f168520a * 31;
            String str = this.f168521b;
            int i2 = 0;
            int hashCode = (((((i + (str != null ? str.hashCode() : 0)) * 31) + this.f168522c) * 31) + this.f168523d) * 31;
            boolean z = this.f168524e;
            int i3 = 1;
            if (z) {
                z = true;
            }
            int i4 = z ? 1 : 0;
            int i5 = z ? 1 : 0;
            int i6 = z ? 1 : 0;
            int i7 = (((((hashCode + i4) * 31) + this.f168525f) * 31) + this.f168526g) * 31;
            String str2 = this.f168527h;
            if (str2 != null) {
                i2 = str2.hashCode();
            }
            int i8 = (i7 + i2) * 31;
            if (!this.f168528i) {
                i3 = 0;
            }
            return ((i8 + i3) * 31) + this.f168529j;
        }

        public final String toString() {
            return "Data(amount=" + this.f168520a + ", amountType=" + this.f168521b + ", nextReqInterval=" + this.f168522c + ", coldDown=" + this.f168523d + ", isLastRound=" + this.f168524e + ", disPlayAmount=" + this.f168525f + ", disPlayCashAmount=" + this.f168526g + ", disPlayCashAmountI18n=" + this.f168527h + ", showPoints=" + this.f168528i + ", canivalRatio=" + this.f168529j + ")";
        }
    }

    static {
        Covode.recordClassIndex(87828);
    }
}
