package com.bytedance.android.livesdk.userinfowidget;

import com.bytedance.android.live.p404r.AbstractC6093a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;

/* renamed from: com.bytedance.android.livesdk.userinfowidget.aa */
public class C11025aa implements AbstractC6093a {
    static {
        Covode.recordClassIndex(12643);
    }

    @Override // com.bytedance.android.live.base.AbstractC2953a
    public void onInit() {
    }

    @Override // com.bytedance.android.live.p404r.AbstractC6093a
    public Class<? extends LiveRecyclableWidget> getGeneralUserInfoWidget() {
        return LiveRoomGeneralInfoWidget.class;
    }

    @Override // com.bytedance.android.live.p404r.AbstractC6093a
    public Class<? extends LiveRecyclableWidget> getUserInfoWidget() {
        return LiveRoomUserInfoWidget.class;
    }
}
