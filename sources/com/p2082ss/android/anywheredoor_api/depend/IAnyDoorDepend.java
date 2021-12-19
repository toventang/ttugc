package com.p2082ss.android.anywheredoor_api.depend;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.anywheredoor_api.p2120a.EnumC29730a;
import com.p2082ss.android.anywheredoor_api.p2122c.C29732a;

/* renamed from: com.ss.android.anywheredoor_api.depend.IAnyDoorDepend */
public interface IAnyDoorDepend {
    static {
        Covode.recordClassIndex(36132);
    }

    void cleanExtraMockCacheIfNeed();

    C29732a getAppInfo();

    EnumC29730a getAppType();

    Context getContext();

    IAnyDoorRouterDepend getRouter();
}
