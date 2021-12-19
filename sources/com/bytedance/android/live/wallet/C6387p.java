package com.bytedance.android.live.wallet;

import com.bytedance.android.live.network.C5805e;
import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.android.live.wallet.api.IapApi;
import com.bytedance.android.live.wallet.model.BalanceStruct;
import com.bytedance.android.live.wallet.model.BalanceStructExtra;
import com.bytedance.android.live.wallet.model.UserBalance;
import com.bytedance.android.livesdk.util.rxutils.C11191f;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.live.wallet.p */
public final /* synthetic */ class C6387p implements AbstractC88433f {

    /* renamed from: a */
    private final C6367i f15962a;

    static {
        Covode.recordClassIndex(7117);
    }

    C6387p(C6367i iVar) {
        this.f15962a = iVar;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        C6367i iVar = this.f15962a;
        BalanceStruct balanceStruct = (BalanceStruct) ((C5832d) obj).data;
        if (balanceStruct != null && balanceStruct.getValidUser() && balanceStruct.getUserBalance() != null) {
            BalanceStructExtra exchangeInfo = iVar.f15899b.getExchangeInfo();
            iVar.f15899b = balanceStruct;
            iVar.f15899b.setExchangeInfo(exchangeInfo);
            UserBalance userBalance = balanceStruct.getUserBalance();
            ((IapApi) C5805e.m12718a().mo11572a(IapApi.class)).getExchangeRatio(userBalance.getCurrencyType(), userBalance.getCountryCode(), 100, userBalance.getBalance(), 2).mo143271a(new C11191f()).mo143254a(new C6389r(iVar), C6390s.f15965a);
        }
    }
}
