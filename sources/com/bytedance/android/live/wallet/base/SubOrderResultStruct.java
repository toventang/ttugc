package com.bytedance.android.live.wallet.base;

import com.bytedance.android.live.base.model.user.SubscribeBadge;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

public class SubOrderResultStruct {
    @AbstractC27891c(mo46611a = "status")
    public int status;
    @AbstractC27891c(mo46611a = "sub_info")
    public C6309a subChargeInfo;

    /* renamed from: com.bytedance.android.live.wallet.base.SubOrderResultStruct$a */
    public class C6309a {
        @AbstractC27891c(mo46611a = "sub_level")

        /* renamed from: a */
        public C6310b f15785a;

        static {
            Covode.recordClassIndex(7031);
        }
    }

    /* renamed from: com.bytedance.android.live.wallet.base.SubOrderResultStruct$b */
    public class C6310b {
        @AbstractC27891c(mo46611a = "badge")

        /* renamed from: a */
        public SubscribeBadge f15786a;

        static {
            Covode.recordClassIndex(7032);
        }
    }

    static {
        Covode.recordClassIndex(7030);
    }
}
