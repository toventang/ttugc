package com.bytedance.android.livesdk.live.api;

import com.bytedance.android.live.base.model.live.C2981d;
import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.p1610b.AbstractC21993ag;
import com.bytedance.retrofit2.p1610b.AbstractC21998f;
import com.bytedance.retrofit2.p1610b.AbstractC21999g;
import com.bytedance.retrofit2.p1610b.AbstractC22012t;
import java.util.Map;
import p4560f.p4561a.AbstractC88979t;

public interface LIveTaskApi {
    static {
        Covode.recordClassIndex(10205);
    }

    @AbstractC22012t
    @AbstractC21999g
    AbstractC88979t<C5832d<C2981d>> report(@AbstractC21993ag String str, @AbstractC21998f Map<String, String> map);
}
