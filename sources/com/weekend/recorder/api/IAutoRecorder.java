package com.weekend.recorder.api;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.weekend.recorder.api.p4510a.AbstractC87934a;
import com.weekend.recorder.api.p4510a.AbstractC87935b;

public interface IAutoRecorder {
    static {
        Covode.recordClassIndex(103946);
    }

    boolean getWeekEndRecorderSwitch(Context context);

    void init(String str, String str2, AbstractC87935b bVar, AbstractC87934a aVar);

    void switchEnable(Context context, boolean z);
}
