package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.jsbridge2.AbstractC18337f;
import com.bytedance.ies.web.jsbridge2.C18338g;
import com.google.gson.p2018a.AbstractC27891c;

public class SendRedEnvelopSuccessMethod extends AbstractC18337f<Params, Object> {
    static {
        Covode.recordClassIndex(7813);
    }

    /* access modifiers changed from: package-private */
    public static final class Params {
        @AbstractC27891c(mo46611a = "delay_time")
        String delayTime;
        @AbstractC27891c(mo46611a = "envelope_diamond")
        String envelopeDiamond;
        @AbstractC27891c(mo46611a = "envelope_id")
        String envelopeId;
        @AbstractC27891c(mo46611a = "envelope_type")
        String envelopeType;
        @AbstractC27891c(mo46611a = "left_diamond")
        String leftDiamond;

        static {
            Covode.recordClassIndex(7814);
        }

        Params() {
        }
    }

    public Object invoke(Params params, C18338g gVar) {
        try {
            ((IWalletService) C6193a.m13435a(IWalletService.class)).walletCenter().mo12366a((long) Integer.parseInt(params.leftDiamond));
        } catch (Exception e) {
            C3854a.m9458a("SendRedEnvelopSuccessMe", e);
        }
        C11115u.m19743a().mo17915b().mo13166f();
        return null;
    }
}
