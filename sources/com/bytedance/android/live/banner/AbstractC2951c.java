package com.bytedance.android.live.banner;

import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.live.base.AbstractC2953a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;

/* renamed from: com.bytedance.android.live.banner.c */
public interface AbstractC2951c extends AbstractC2953a {

    /* renamed from: com.bytedance.android.live.banner.c$a */
    public interface AbstractC2952a {
        static {
            Covode.recordClassIndex(3393);
        }

        /* renamed from: a */
        void mo7729a();
    }

    static {
        Covode.recordClassIndex(3392);
    }

    void addOnBannerVisibilityChangeListener(long j, AbstractC2952a aVar);

    void enter(DataChannel dataChannel, Room room);

    void fetchBanner(AbstractC1204m mVar, long j, boolean z);

    Class<? extends LiveRecyclableWidget> getActivityTopRightBannerWidget();

    Class<? extends LiveRecyclableWidget> getBottomRightBannerWidget();

    Class<? extends LiveRecyclableWidget> getTopRightBannerWidget();

    void leave(DataChannel dataChannel, Room room);

    boolean shouldShowBanner(long j);
}
