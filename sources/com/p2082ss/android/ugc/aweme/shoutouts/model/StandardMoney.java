package com.p2082ss.android.ugc.aweme.shoutouts.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shoutouts.model.StandardMoney */
public final class StandardMoney {
    @AbstractC27891c(mo46611a = "currency_character")
    private final String currencyCharacter;
    @AbstractC27891c(mo46611a = "currency_name")
    private final String currencyName;
    @AbstractC27891c(mo46611a = "money")
    private final int money;
    @AbstractC27891c(mo46611a = "money_str")
    private final String moneyStr;

    static {
        Covode.recordClassIndex(87226);
    }

    /* renamed from: com_ss_android_ugc_aweme_shoutouts_model_StandardMoney_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m130893x37a7af4d(int i) {
        return i;
    }

    public static /* synthetic */ StandardMoney copy$default(StandardMoney standardMoney, int i, String str, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = standardMoney.money;
        }
        if ((i2 & 2) != 0) {
            str = standardMoney.currencyName;
        }
        if ((i2 & 4) != 0) {
            str2 = standardMoney.currencyCharacter;
        }
        if ((i2 & 8) != 0) {
            str3 = standardMoney.moneyStr;
        }
        return standardMoney.copy(i, str, str2, str3);
    }

    public final int component1() {
        return this.money;
    }

    public final String component2() {
        return this.currencyName;
    }

    public final String component3() {
        return this.currencyCharacter;
    }

    public final String component4() {
        return this.moneyStr;
    }

    public final StandardMoney copy(int i, String str, String str2, String str3) {
        return new StandardMoney(i, str, str2, str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StandardMoney)) {
            return false;
        }
        StandardMoney standardMoney = (StandardMoney) obj;
        return this.money == standardMoney.money && C89219l.m154714a(this.currencyName, standardMoney.currencyName) && C89219l.m154714a(this.currencyCharacter, standardMoney.currencyCharacter) && C89219l.m154714a(this.moneyStr, standardMoney.moneyStr);
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_shoutouts_model_StandardMoney_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = m130893x37a7af4d(this.money) * 31;
        String str = this.currencyName;
        int i = 0;
        int hashCode = (com_ss_android_ugc_aweme_shoutouts_model_StandardMoney_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.currencyCharacter;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.moneyStr;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "StandardMoney(money=" + this.money + ", currencyName=" + this.currencyName + ", currencyCharacter=" + this.currencyCharacter + ", moneyStr=" + this.moneyStr + ")";
    }

    public final String getCurrencyCharacter() {
        return this.currencyCharacter;
    }

    public final String getCurrencyName() {
        return this.currencyName;
    }

    public final int getMoney() {
        return this.money;
    }

    public final String getMoneyStr() {
        return this.moneyStr;
    }

    public StandardMoney(int i, String str, String str2, String str3) {
        this.money = i;
        this.currencyName = str;
        this.currencyCharacter = str2;
        this.moneyStr = str3;
    }
}
