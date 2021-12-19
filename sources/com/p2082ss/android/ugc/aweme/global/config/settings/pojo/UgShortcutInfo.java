package com.p2082ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.C16041a;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.UgShortcutInfo */
public class UgShortcutInfo {
    @AbstractC27891c(mo46611a = "h5_link")
    private String h5Link;
    @AbstractC27891c(mo46611a = "money_symbol")
    private String moneySymbol;
    @AbstractC27891c(mo46611a = "will_get_most")
    private String willGetMost;
    @AbstractC27891c(mo46611a = "withdrawal_req_interval")
    private int withdrawalReqInterval;

    static {
        Covode.recordClassIndex(62415);
    }

    public int getWithdrawalReqInterval() {
        return this.withdrawalReqInterval;
    }

    public String getH5Link() {
        String str = this.h5Link;
        if (str != null) {
            return str;
        }
        throw new C16041a();
    }

    public String getMoneySymbol() {
        String str = this.moneySymbol;
        if (str != null) {
            return str;
        }
        throw new C16041a();
    }

    public String getWillGetMost() {
        String str = this.willGetMost;
        if (str != null) {
            return str;
        }
        throw new C16041a();
    }
}
