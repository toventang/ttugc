package com.bytedance.android.live.core.model.startlive;

import com.bytedance.android.livesdk.model.Extra;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

public class StartLiveExtra extends Extra {
    @AbstractC27891c(mo46611a = "is_phone_binded")
    public boolean isPhoneBinded;
    @AbstractC27891c(mo46611a = "live_agreement")
    public boolean liveAgreement;
    @AbstractC27891c(mo46611a = "live_answer")
    public boolean liveAnswer;
    @AbstractC27891c(mo46611a = "realname_verify")
    public int realnameVerify;

    static {
        Covode.recordClassIndex(4499);
    }
}
