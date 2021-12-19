package com.p2082ss.android.ugc.aweme.teens;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22018z;
import p4560f.p4561a.AbstractC88979t;

/* renamed from: com.ss.android.ugc.aweme.teens.TeensApi */
public interface TeensApi {
    static {
        Covode.recordClassIndex(90850);
    }

    @AbstractC22000h(mo35789a = "/aweme/v1/teen/protector/vote/")
    AbstractC88979t<Object> sendTeensGuardian(@AbstractC22018z(mo35807a = "vote_id") String str, @AbstractC22018z(mo35807a = "option_id") int i, @AbstractC22018z(mo35807a = "vote_option") int i2);
}
