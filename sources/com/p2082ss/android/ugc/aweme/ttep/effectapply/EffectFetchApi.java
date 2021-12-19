package com.p2082ss.android.ugc.aweme.ttep.effectapply;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.p1610b.AbstractC21997e;
import com.bytedance.retrofit2.p1610b.AbstractC21999g;
import com.bytedance.retrofit2.p1610b.AbstractC22012t;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.ttep.effectapply.EffectFetchApi */
public interface EffectFetchApi {
    static {
        Covode.recordClassIndex(92445);
    }

    @AbstractC22012t(mo35799a = "/api/app/effect_meta")
    @AbstractC21999g
    C1731i<C79258a> getEffectMeta(@AbstractC21997e(mo35786a = "effect_id") String str, @AbstractC21997e(mo35786a = "sdk_version") String str2, @AbstractC21997e(mo35786a = "device_platform") String str3);

    @AbstractC22012t(mo35799a = "/api/internal/effect_meta")
    @AbstractC21999g
    C1731i<C79258a> getEffectMetaWithoutLogin(@AbstractC21997e(mo35786a = "effect_id") String str, @AbstractC21997e(mo35786a = "sdk_version") String str2, @AbstractC21997e(mo35786a = "device_platform") String str3);
}
