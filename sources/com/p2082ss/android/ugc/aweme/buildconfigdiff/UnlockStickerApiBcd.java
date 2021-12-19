package com.p2082ss.android.ugc.aweme.buildconfigdiff;

import com.bytedance.covode.number.Covode;
import com.google.p1998c.p2006h.p2007a.AbstractFutureC27655q;
import p4640l.p4644b.AbstractC89719c;
import p4640l.p4644b.AbstractC89721e;
import p4640l.p4644b.AbstractC89731o;

/* renamed from: com.ss.android.ugc.aweme.buildconfigdiff.UnlockStickerApiBcd */
public final class UnlockStickerApiBcd {

    /* renamed from: a */
    public static final String f82433a = "https://api.tiktokv.com";

    /* renamed from: com.ss.android.ugc.aweme.buildconfigdiff.UnlockStickerApiBcd$RetrofitApi */
    public interface RetrofitApi {
        static {
            Covode.recordClassIndex(41970);
        }

        @AbstractC89731o(mo144285a = "https://api.tiktokv.com/aweme/v1/ug/event/record/")
        @AbstractC89721e
        AbstractFutureC27655q<Object> unlockSticker(@AbstractC89719c(mo144273a = "event_type") int i, @AbstractC89719c(mo144273a = "extra") String str);
    }

    static {
        Covode.recordClassIndex(41969);
    }
}
