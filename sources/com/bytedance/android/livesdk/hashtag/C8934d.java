package com.bytedance.android.livesdk.hashtag;

import com.bytedance.android.live.p249h.AbstractC4349b;
import com.bytedance.android.live.p385p.AbstractView$OnClickListenerC5841f;
import com.bytedance.android.livesdkapi.depend.model.live.EnumC11728i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.LiveWidget;

/* renamed from: com.bytedance.android.livesdk.hashtag.d */
public class C8934d implements AbstractC4349b {
    static {
        Covode.recordClassIndex(9826);
    }

    @Override // com.bytedance.android.live.base.AbstractC2953a
    public void onInit() {
    }

    @Override // com.bytedance.android.live.p249h.AbstractC4349b
    public Class<? extends LiveRecyclableWidget> getAnchorHashTagWidget() {
        return BroadcastHashTagWidget.class;
    }

    @Override // com.bytedance.android.live.p249h.AbstractC4349b
    public Class<? extends LiveRecyclableWidget> getAudienceHashTagWidget() {
        return AudienceHashTagWidget.class;
    }

    @Override // com.bytedance.android.live.p249h.AbstractC4349b
    public AbstractView$OnClickListenerC5841f getAnchorToolbarBehavior() {
        return new C8971m();
    }

    @Override // com.bytedance.android.live.p249h.AbstractC4349b
    public LiveWidget getPreviewHashTagWidget(EnumC11728i iVar) {
        return new PreviewHashtagWidget(iVar);
    }

    @Override // com.bytedance.android.live.p249h.AbstractC4349b
    public void updatePreviewHashTagWidgetLiveMode(LiveWidget liveWidget, EnumC11728i iVar) {
        if (liveWidget instanceof PreviewHashtagWidget) {
            ((PreviewHashtagWidget) liveWidget).f22000b = iVar;
        }
    }
}
