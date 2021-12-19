package com.p2082ss.android.ugc.aweme.services.external.p3712ui;

import android.content.Context;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.services.external.ui.IEditService */
public interface IEditService {
    static {
        Covode.recordClassIndex(79859);
    }

    void startEdit(Context context, EditConfig editConfig);

    void startEdit(Context context, EditConfig editConfig, ShareConfig shareConfig);
}
