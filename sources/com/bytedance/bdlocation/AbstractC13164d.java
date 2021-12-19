package com.bytedance.bdlocation;

import com.bytedance.bdlocation.p846a.C13154c;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.bdlocation.d */
public interface AbstractC13164d {
    static {
        Covode.recordClassIndex(15111);
    }

    void onLocateChange(String str, BDLocation bDLocation);

    void onLocateError(String str, C13154c cVar);

    void onLocateStart(String str);

    void onLocateStop(String str);
}
