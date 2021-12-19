package com.bytedance.android.live.wallet.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

public final class RevenueExchange {
    @AbstractC27891c(mo46611a = "revenue")
    private final long balance;
    @AbstractC27891c(mo46611a = "currency")
    private final String currency;
    @AbstractC27891c(mo46611a = "price_dot")
    private final int dot;
    @AbstractC27891c(mo46611a = "enable")
    private final boolean enableExchange;
    @AbstractC27891c(mo46611a = "has_short_video_gift")
    private final boolean isRevenue;
    @AbstractC27891c(mo46611a = "unit_price")
    private final int price;
    @AbstractC27891c(mo46611a = "region")
    private final String region;

    static {
        Covode.recordClassIndex(7105);
    }

    public RevenueExchange() {
        this(null, false, false, 0, null, 0, 0, 127, null);
    }

    /* renamed from: com_bytedance_android_live_wallet_model_RevenueExchange_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m13761xc0b7330c(int i) {
        return i;
    }

    /* renamed from: com_bytedance_android_live_wallet_model_RevenueExchange_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m13762xc0b7330c(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static /* synthetic */ RevenueExchange copy$default(RevenueExchange revenueExchange, String str, boolean z, boolean z2, int i, String str2, long j, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = revenueExchange.currency;
        }
        if ((i3 & 2) != 0) {
            z = revenueExchange.enableExchange;
        }
        if ((i3 & 4) != 0) {
            z2 = revenueExchange.isRevenue;
        }
        if ((i3 & 8) != 0) {
            i = revenueExchange.dot;
        }
        if ((i3 & 16) != 0) {
            str2 = revenueExchange.region;
        }
        if ((i3 & 32) != 0) {
            j = revenueExchange.balance;
        }
        if ((i3 & 64) != 0) {
            i2 = revenueExchange.price;
        }
        return revenueExchange.copy(str, z, z2, i, str2, j, i2);
    }

    public final String component1() {
        return this.currency;
    }

    public final boolean component2() {
        return this.enableExchange;
    }

    public final boolean component3() {
        return this.isRevenue;
    }

    public final int component4() {
        return this.dot;
    }

    public final String component5() {
        return this.region;
    }

    public final long component6() {
        return this.balance;
    }

    public final int component7() {
        return this.price;
    }

    public final RevenueExchange copy(String str, boolean z, boolean z2, int i, String str2, long j, int i2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        return new RevenueExchange(str, z, z2, i, str2, j, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RevenueExchange)) {
            return false;
        }
        RevenueExchange revenueExchange = (RevenueExchange) obj;
        return C89219l.m154714a(this.currency, revenueExchange.currency) && this.enableExchange == revenueExchange.enableExchange && this.isRevenue == revenueExchange.isRevenue && this.dot == revenueExchange.dot && C89219l.m154714a(this.region, revenueExchange.region) && this.balance == revenueExchange.balance && this.price == revenueExchange.price;
    }

    public final int hashCode() {
        String str = this.currency;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        boolean z = this.enableExchange;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (hashCode + i3) * 31;
        if (!this.isRevenue) {
            i2 = 0;
        }
        int com_bytedance_android_live_wallet_model_RevenueExchange_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = (((i6 + i2) * 31) + m13761xc0b7330c(this.dot)) * 31;
        String str2 = this.region;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((((com_bytedance_android_live_wallet_model_RevenueExchange_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + i) * 31) + m13762xc0b7330c(this.balance)) * 31) + m13761xc0b7330c(this.price);
    }

    public final String toString() {
        return "RevenueExchange(currency=" + this.currency + ", enableExchange=" + this.enableExchange + ", isRevenue=" + this.isRevenue + ", dot=" + this.dot + ", region=" + this.region + ", balance=" + this.balance + ", price=" + this.price + ")";
    }

    public final long getBalance() {
        return this.balance;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final int getDot() {
        return this.dot;
    }

    public final boolean getEnableExchange() {
        return this.enableExchange;
    }

    public final int getPrice() {
        return this.price;
    }

    public final String getRegion() {
        return this.region;
    }

    public final boolean isRevenue() {
        return this.isRevenue;
    }

    public RevenueExchange(String str, boolean z, boolean z2, int i, String str2, long j, int i2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        this.currency = str;
        this.enableExchange = z;
        this.isRevenue = z2;
        this.dot = i;
        this.region = str2;
        this.balance = j;
        this.price = i2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ RevenueExchange(java.lang.String r10, boolean r11, boolean r12, int r13, java.lang.String r14, long r15, int r17, int r18, p4600h.p4611f.p4613b.C89214g r19) {
        /*
            r9 = this;
            r6 = r15
            r1 = r10
            r3 = r12
            r2 = r11
            r4 = r13
            r0 = r18 & 1
            java.lang.String r5 = ""
            if (r0 == 0) goto L_0x000c
            r1 = r5
        L_0x000c:
            r0 = r18 & 2
            r8 = 0
            if (r0 == 0) goto L_0x0012
            r2 = 0
        L_0x0012:
            r0 = r18 & 4
            if (r0 == 0) goto L_0x0017
            r3 = 0
        L_0x0017:
            r0 = r18 & 8
            if (r0 == 0) goto L_0x001c
            r4 = 0
        L_0x001c:
            r0 = r18 & 16
            if (r0 == 0) goto L_0x0032
        L_0x0020:
            r0 = r18 & 32
            if (r0 == 0) goto L_0x0026
            r6 = 0
        L_0x0026:
            r0 = r18 & 64
            if (r0 == 0) goto L_0x002f
        L_0x002a:
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r8)
            return
        L_0x002f:
            r8 = r17
            goto L_0x002a
        L_0x0032:
            r5 = r14
            goto L_0x0020
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.wallet.model.RevenueExchange.<init>(java.lang.String, boolean, boolean, int, java.lang.String, long, int, int, h.f.b.g):void");
    }
}
