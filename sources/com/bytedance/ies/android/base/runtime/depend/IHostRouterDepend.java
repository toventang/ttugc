package com.bytedance.ies.android.base.runtime.depend;

import com.bytedance.covode.number.Covode;

public interface IHostRouterDepend {
    static {
        Covode.recordClassIndex(18388);
    }

    boolean isHostScheme(String str);

    boolean openHostScheme(String str);
}
