package com.bytedance.android.live.p385p;

import android.content.Context;
import com.bytedance.android.live.base.AbstractC2953a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;

/* renamed from: com.bytedance.android.live.p.h */
public interface AbstractC5843h extends AbstractC2953a {
    static {
        Covode.recordClassIndex(6450);
    }

    Class<? extends LiveRecyclableWidget> audienceToolbarWidget();

    Class<? extends LiveRecyclableWidget> broadcastToolbarWidget();

    void preloadAudienceToolbarWidget();

    void preloadBroadcastToolbarWidget();

    void preloadToolbarView(Context context, int i, EnumC5854q qVar);

    void releaseToolbarView();

    AbstractC5842g toolbarManager();

    Class<? extends LiveRecyclableWidget> toolbarWidget();
}
