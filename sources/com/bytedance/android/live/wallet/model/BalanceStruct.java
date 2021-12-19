package com.bytedance.android.live.wallet.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

public final class BalanceStruct {
    private BalanceStructExtra exchangeInfo;
    @AbstractC27891c(mo46611a = "balance")
    private final UserBalance userBalance;
    @AbstractC27891c(mo46611a = "valid_user")
    private final boolean validUser;

    static {
        Covode.recordClassIndex(7098);
    }

    public BalanceStruct() {
        this(null, false, null, 7, null);
    }

    public static /* synthetic */ BalanceStruct copy$default(BalanceStruct balanceStruct, UserBalance userBalance2, boolean z, BalanceStructExtra balanceStructExtra, int i, Object obj) {
        if ((i & 1) != 0) {
            userBalance2 = balanceStruct.userBalance;
        }
        if ((i & 2) != 0) {
            z = balanceStruct.validUser;
        }
        if ((i & 4) != 0) {
            balanceStructExtra = balanceStruct.exchangeInfo;
        }
        return balanceStruct.copy(userBalance2, z, balanceStructExtra);
    }

    public final UserBalance component1() {
        return this.userBalance;
    }

    public final boolean component2() {
        return this.validUser;
    }

    public final BalanceStructExtra component3() {
        return this.exchangeInfo;
    }

    public final BalanceStruct copy(UserBalance userBalance2, boolean z, BalanceStructExtra balanceStructExtra) {
        return new BalanceStruct(userBalance2, z, balanceStructExtra);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BalanceStruct)) {
            return false;
        }
        BalanceStruct balanceStruct = (BalanceStruct) obj;
        return C89219l.m154714a(this.userBalance, balanceStruct.userBalance) && this.validUser == balanceStruct.validUser && C89219l.m154714a(this.exchangeInfo, balanceStruct.exchangeInfo);
    }

    public final int hashCode() {
        UserBalance userBalance2 = this.userBalance;
        int i = 0;
        int hashCode = (userBalance2 != null ? userBalance2.hashCode() : 0) * 31;
        boolean z = this.validUser;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = (hashCode + i2) * 31;
        BalanceStructExtra balanceStructExtra = this.exchangeInfo;
        if (balanceStructExtra != null) {
            i = balanceStructExtra.hashCode();
        }
        return i5 + i;
    }

    public final String toString() {
        return "BalanceStruct(userBalance=" + this.userBalance + ", validUser=" + this.validUser + ", exchangeInfo=" + this.exchangeInfo + ")";
    }

    public final BalanceStructExtra getExchangeInfo() {
        return this.exchangeInfo;
    }

    public final UserBalance getUserBalance() {
        return this.userBalance;
    }

    public final boolean getValidUser() {
        return this.validUser;
    }

    public final void setExchangeInfo(BalanceStructExtra balanceStructExtra) {
        this.exchangeInfo = balanceStructExtra;
    }

    public BalanceStruct(UserBalance userBalance2, boolean z, BalanceStructExtra balanceStructExtra) {
        this.userBalance = userBalance2;
        this.validUser = z;
        this.exchangeInfo = balanceStructExtra;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BalanceStruct(UserBalance userBalance2, boolean z, BalanceStructExtra balanceStructExtra, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : userBalance2, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : balanceStructExtra);
    }
}
