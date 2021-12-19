package com.bytedance.android.livesdkapi.host;

import com.bytedance.android.live.base.AbstractC2953a;
import com.bytedance.covode.number.Covode;
import java.util.Map;

public interface IHostWallet extends AbstractC2953a {

    /* renamed from: com.bytedance.android.livesdkapi.host.IHostWallet$a */
    public interface AbstractC11793a {
        static {
            Covode.recordClassIndex(13491);
        }
    }

    /* renamed from: com.bytedance.android.livesdkapi.host.IHostWallet$b */
    public interface AbstractC11794b {
        static {
            Covode.recordClassIndex(13492);
        }
    }

    static {
        Covode.recordClassIndex(13490);
    }

    AbstractC11793a getBillingClient(AbstractC11794b bVar);

    Map<String, String> getHostWalletSetting();
}
