package com.twitter.sdk.android.core.services;

import com.bytedance.covode.number.Covode;
import p4640l.AbstractC89716b;
import p4640l.p4644b.AbstractC89722f;
import p4640l.p4644b.AbstractC89736t;

public interface AccountService {
    static {
        Covode.recordClassIndex(103812);
    }

    @AbstractC89722f(mo144276a = "/1.1/account/verify_credentials.json")
    AbstractC89716b<Object> verifyCredentials(@AbstractC89736t(mo144292a = "include_entities") Boolean bool, @AbstractC89736t(mo144292a = "skip_status") Boolean bool2, @AbstractC89736t(mo144292a = "include_email") Boolean bool3);
}
