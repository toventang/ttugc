package com.bytedance.ies.xbridge.base.runtime.depend;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.base.runtime.p1292a.C18424e;

public interface IChooseMediaResultCallback {
    static {
        Covode.recordClassIndex(21129);
    }

    void onFailure(int i, String str);

    void onSuccess(C18424e eVar, String str);
}
