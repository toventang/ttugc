package com.twitter.sdk.android.core.services;

import com.bytedance.covode.number.Covode;
import okhttp3.AbstractC90025ab;
import p4640l.AbstractC89716b;
import p4640l.p4644b.AbstractC89728l;
import p4640l.p4644b.AbstractC89731o;
import p4640l.p4644b.AbstractC89733q;

public interface MediaService {
    static {
        Covode.recordClassIndex(103817);
    }

    @AbstractC89731o(mo144285a = "https://upload.twitter.com/1.1/media/upload.json")
    @AbstractC89728l
    AbstractC89716b<Object> upload(@AbstractC89733q(mo144287a = "media") AbstractC90025ab abVar, @AbstractC89733q(mo144287a = "media_data") AbstractC90025ab abVar2, @AbstractC89733q(mo144287a = "additional_owners") AbstractC90025ab abVar3);
}
