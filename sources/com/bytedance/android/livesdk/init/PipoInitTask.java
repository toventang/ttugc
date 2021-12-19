package com.bytedance.android.livesdk.init;

import com.bytedance.android.live.annotation.AbstractC2916a;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.live.wallet.AbstractC6360g;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdk.p667x.AbstractC11587a;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;

@AbstractC2916a(mo7569a = ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY)
public class PipoInitTask extends AbstractC11587a {
    static {
        Covode.recordClassIndex(9902);
    }

    @Override // com.bytedance.android.livesdk.p667x.AbstractC11587a
    public String getTaskName() {
        return "pipo_init_task";
    }

    @Override // com.bytedance.android.livesdk.p667x.AbstractC11587a
    public void run() {
        C40780g.m82246c().submit(RunnableC9003a.f22137a);
    }

    static final /* synthetic */ void lambda$run$0$PipoInitTask() {
        if (C6193a.m13435a(IWalletService.class) != null) {
            ((IWalletService) C6193a.m13435a(IWalletService.class)).walletCenter().mo12367a((AbstractC6360g) null);
        }
    }
}
