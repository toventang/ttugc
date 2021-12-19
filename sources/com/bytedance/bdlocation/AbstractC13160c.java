package com.bytedance.bdlocation;

import android.os.Looper;
import com.bytedance.bdlocation.p846a.C13149a;
import com.bytedance.bdlocation.p846a.C13155d;
import com.bytedance.bdlocation.p846a.C13156e;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.bdlocation.c */
public interface AbstractC13160c {
    static {
        Covode.recordClassIndex(15107);
    }

    BDLocation geocode(C13155d dVar, String str);

    String getLocateName();

    void startLocation(C13149a.AbstractC13151a aVar, C13156e eVar, Looper looper);

    void stopLocation();
}
