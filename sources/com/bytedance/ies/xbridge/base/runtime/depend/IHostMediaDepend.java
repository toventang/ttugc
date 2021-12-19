package com.bytedance.ies.xbridge.base.runtime.depend;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.base.runtime.p1292a.C18423d;

public interface IHostMediaDepend {
    static {
        Covode.recordClassIndex(21134);
    }

    void handleJsInvoke(Context context, C18423d dVar, IChooseMediaResultCallback iChooseMediaResultCallback);
}
