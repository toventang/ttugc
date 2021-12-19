package com.bytedance.android.livesdk.lynx.lynxcard;

import com.bytedance.android.live.base.AbstractC2953a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;

/* renamed from: com.bytedance.android.livesdk.lynx.lynxcard.b */
public interface AbstractC9368b extends AbstractC2953a {
    static {
        Covode.recordClassIndex(10875);
    }

    Class<? extends LiveRecyclableWidget> getLynxCardPreviewWidget();

    Class<? extends LiveRecyclableWidget> getLynxCardWidget();
}
