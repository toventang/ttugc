package com.bytedance.ies.xbridge.base.runtime.depend;

import com.bytedance.covode.number.Covode;
import java.util.Map;

public interface IHostNetworkDepend {

    /* renamed from: com.bytedance.ies.xbridge.base.runtime.depend.IHostNetworkDepend$a */
    public static final class C18453a {
        static {
            Covode.recordClassIndex(21136);
        }
    }

    static {
        Covode.recordClassIndex(21135);
    }

    XIRetrofit createRetrofit(String str, boolean z);

    Map<String, Object> getAPIParams();
}
