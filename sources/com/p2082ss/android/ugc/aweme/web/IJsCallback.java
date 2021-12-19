package com.p2082ss.android.ugc.aweme.web;

import android.os.ResultReceiver;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.web.IJsCallback */
public interface IJsCallback<T> {
    static {
        Covode.recordClassIndex(94900);
    }

    T get();

    ResultReceiver getResultReceiver();
}
