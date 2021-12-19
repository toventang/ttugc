package com.bytedance.ies.android.base.runtime.depend;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.android.base.runtime.p1119a.AbstractC16092a;
import com.bytedance.ies.android.base.runtime.p1119a.AbstractC16093b;
import com.bytedance.ies.android.base.runtime.p1119a.C16094c;
import com.bytedance.ies.android.base.runtime.p1119a.EnumC16098e;

public interface INetworkDepend {
    static {
        Covode.recordClassIndex(18391);
    }

    AbstractC16092a requestForStream(EnumC16098e eVar, C16094c cVar);

    AbstractC16093b requestForString(EnumC16098e eVar, C16094c cVar);
}
