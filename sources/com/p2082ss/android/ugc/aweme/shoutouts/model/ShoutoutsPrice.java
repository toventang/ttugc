package com.p2082ss.android.ugc.aweme.shoutouts.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shoutouts.model.ShoutoutsPrice */
public final class ShoutoutsPrice {
    @AbstractC27891c(mo46611a = "buyer_payment")
    private final StandardMoney buyerPayment;
    @AbstractC27891c(mo46611a = "coin")
    private final int coin;
    @AbstractC27891c(mo46611a = "creator_earning")
    private final StandardMoney creatorEarning;

    static {
        Covode.recordClassIndex(87215);
    }

    /* renamed from: com_ss_android_ugc_aweme_shoutouts_model_ShoutoutsPrice_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m130888x7cd98251(int i) {
        return i;
    }

    public static /* synthetic */ ShoutoutsPrice copy$default(ShoutoutsPrice shoutoutsPrice, int i, StandardMoney standardMoney, StandardMoney standardMoney2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = shoutoutsPrice.coin;
        }
        if ((i2 & 2) != 0) {
            standardMoney = shoutoutsPrice.buyerPayment;
        }
        if ((i2 & 4) != 0) {
            standardMoney2 = shoutoutsPrice.creatorEarning;
        }
        return shoutoutsPrice.copy(i, standardMoney, standardMoney2);
    }

    public final int component1() {
        return this.coin;
    }

    public final StandardMoney component2() {
        return this.buyerPayment;
    }

    public final StandardMoney component3() {
        return this.creatorEarning;
    }

    public final ShoutoutsPrice copy(int i, StandardMoney standardMoney, StandardMoney standardMoney2) {
        return new ShoutoutsPrice(i, standardMoney, standardMoney2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShoutoutsPrice)) {
            return false;
        }
        ShoutoutsPrice shoutoutsPrice = (ShoutoutsPrice) obj;
        return this.coin == shoutoutsPrice.coin && C89219l.m154714a(this.buyerPayment, shoutoutsPrice.buyerPayment) && C89219l.m154714a(this.creatorEarning, shoutoutsPrice.creatorEarning);
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_shoutouts_model_ShoutoutsPrice_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = m130888x7cd98251(this.coin) * 31;
        StandardMoney standardMoney = this.buyerPayment;
        int i = 0;
        int hashCode = (com_ss_android_ugc_aweme_shoutouts_model_ShoutoutsPrice_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (standardMoney != null ? standardMoney.hashCode() : 0)) * 31;
        StandardMoney standardMoney2 = this.creatorEarning;
        if (standardMoney2 != null) {
            i = standardMoney2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "ShoutoutsPrice(coin=" + this.coin + ", buyerPayment=" + this.buyerPayment + ", creatorEarning=" + this.creatorEarning + ")";
    }

    public final StandardMoney getBuyerPayment() {
        return this.buyerPayment;
    }

    public final int getCoin() {
        return this.coin;
    }

    public final StandardMoney getCreatorEarning() {
        return this.creatorEarning;
    }

    public ShoutoutsPrice(int i, StandardMoney standardMoney, StandardMoney standardMoney2) {
        this.coin = i;
        this.buyerPayment = standardMoney;
        this.creatorEarning = standardMoney2;
    }
}
