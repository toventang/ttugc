package com.p2082ss.android.ugc.aweme.live.settings;

import com.bytedance.covode.number.Covode;
import java.util.Map;
import p077b.C1731i;
import p4640l.p4644b.AbstractC89722f;
import p4640l.p4644b.AbstractC89737u;

/* renamed from: com.ss.android.ugc.aweme.live.settings.LiveSDKSettingApi */
public interface LiveSDKSettingApi {
    static {
        Covode.recordClassIndex(69064);
    }

    @AbstractC89722f(mo144276a = "/webcast/setting/")
    C1731i<C58760c> querySettings(@AbstractC89737u Map<String, String> map);
}
