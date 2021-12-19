package com.bytedance.android.live.p249h;

import com.bytedance.android.live.base.AbstractC2953a;
import com.bytedance.android.live.p385p.AbstractView$OnClickListenerC5841f;
import com.bytedance.android.livesdkapi.depend.model.live.EnumC11728i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.LiveWidget;

/* renamed from: com.bytedance.android.live.h.b */
public interface AbstractC4349b extends AbstractC2953a {
    static {
        Covode.recordClassIndex(4923);
    }

    Class<? extends LiveRecyclableWidget> getAnchorHashTagWidget();

    AbstractView$OnClickListenerC5841f getAnchorToolbarBehavior();

    Class<? extends LiveRecyclableWidget> getAudienceHashTagWidget();

    LiveWidget getPreviewHashTagWidget(EnumC11728i iVar);

    void updatePreviewHashTagWidgetLiveMode(LiveWidget liveWidget, EnumC11728i iVar);
}
