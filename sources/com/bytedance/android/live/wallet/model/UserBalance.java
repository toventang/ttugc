package com.bytedance.android.live.wallet.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

public final class UserBalance {
    @AbstractC27891c(mo46611a = "balance")
    private long balance;
    @AbstractC27891c(mo46611a = "country_code")
    private final String countryCode;
    @AbstractC27891c(mo46611a = "currency_type")
    private final String currencyType;

    static {
        Covode.recordClassIndex(7106);
    }

    public UserBalance() {
        this(null, null, 0, 7, null);
    }

    /* renamed from: com_bytedance_android_live_wallet_model_UserBalance_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m13763x11b4ddbe(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static /* synthetic */ UserBalance copy$default(UserBalance userBalance, String str, String str2, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = userBalance.currencyType;
        }
        if ((i & 2) != 0) {
            str2 = userBalance.countryCode;
        }
        if ((i & 4) != 0) {
            j = userBalance.balance;
        }
        return userBalance.copy(str, str2, j);
    }

    public final String component1() {
        return this.currencyType;
    }

    public final String component2() {
        return this.countryCode;
    }

    public final long component3() {
        return this.balance;
    }

    public final UserBalance copy(String str, String str2, long j) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        return new UserBalance(str, str2, j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserBalance)) {
            return false;
        }
        UserBalance userBalance = (UserBalance) obj;
        return C89219l.m154714a(this.currencyType, userBalance.currencyType) && C89219l.m154714a(this.countryCode, userBalance.countryCode) && this.balance == userBalance.balance;
    }

    public final int hashCode() {
        String str = this.currencyType;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.countryCode;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((hashCode + i) * 31) + m13763x11b4ddbe(this.balance);
    }

    public final String toString() {
        return "UserBalance(currencyType=" + this.currencyType + ", countryCode=" + this.countryCode + ", balance=" + this.balance + ")";
    }

    public final long getBalance() {
        return this.balance;
    }

    public final String getCountryCode() {
        return this.countryCode;
    }

    public final String getCurrencyType() {
        return this.currencyType;
    }

    public final void setBalance(long j) {
        this.balance = j;
    }

    public UserBalance(String str, String str2, long j) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        this.currencyType = str;
        this.countryCode = str2;
        this.balance = j;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ UserBalance(String str, String str2, long j, int i, C89214g gVar) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? 0 : j);
    }
}
