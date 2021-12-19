package com.bytedance.ies.ugc.aweme.ttsetting;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.AbstractC21983b;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22018z;
import com.google.gson.AbstractC28019l;

public final class TTSettingDataApi {

    public interface SettingApi {
        static {
            Covode.recordClassIndex(20809);
        }

        @AbstractC22000h(mo35789a = "/service/settings/v2/")
        AbstractC21983b<AbstractC28019l> getResponse(@AbstractC22018z(mo35807a = "has_local_cache") boolean z, @AbstractC22018z(mo35807a = "app") int i, @AbstractC22018z(mo35807a = "default") int i2);
    }

    static {
        Covode.recordClassIndex(20808);
    }
}
