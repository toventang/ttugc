package com.bytedance.android.livesdk.callback;

import com.bytedance.covode.number.Covode;

public interface IHostLongPressCallback {
    static {
        Covode.recordClassIndex(8005);
    }

    void onDislikePressed();

    void onReportPressed();
}
