package com.bytedance.android.livesdk.lynx.lynxcard;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;

/* renamed from: com.bytedance.android.livesdk.lynx.lynxcard.f */
public class C9373f implements AbstractC9368b {
    static {
        Covode.recordClassIndex(10880);
    }

    @Override // com.bytedance.android.live.base.AbstractC2953a
    public void onInit() {
    }

    @Override // com.bytedance.android.livesdk.lynx.lynxcard.AbstractC9368b
    public Class<? extends LiveRecyclableWidget> getLynxCardPreviewWidget() {
        return LynxCardPreviewWidget.class;
    }

    @Override // com.bytedance.android.livesdk.lynx.lynxcard.AbstractC9368b
    public Class<? extends LiveRecyclableWidget> getLynxCardWidget() {
        return LynxCardWidget.class;
    }
}
