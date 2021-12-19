package com.bytedance.android.live.banner;

import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.live.banner.AbstractC2951c;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.banner.b */
public class C2950b implements AbstractC2951c {
    static {
        Covode.recordClassIndex(3391);
    }

    @Override // com.bytedance.android.live.banner.AbstractC2951c
    public void addOnBannerVisibilityChangeListener(long j, AbstractC2951c.AbstractC2952a aVar) {
        C89219l.m154721d(aVar, "");
    }

    @Override // com.bytedance.android.live.banner.AbstractC2951c
    public void enter(DataChannel dataChannel, Room room) {
    }

    @Override // com.bytedance.android.live.banner.AbstractC2951c
    public void fetchBanner(AbstractC1204m mVar, long j, boolean z) {
    }

    @Override // com.bytedance.android.live.banner.AbstractC2951c
    public Class<? extends LiveRecyclableWidget> getActivityTopRightBannerWidget() {
        return null;
    }

    @Override // com.bytedance.android.live.banner.AbstractC2951c
    public Class<? extends LiveRecyclableWidget> getBottomRightBannerWidget() {
        return null;
    }

    @Override // com.bytedance.android.live.banner.AbstractC2951c
    public Class<? extends LiveRecyclableWidget> getTopRightBannerWidget() {
        return null;
    }

    @Override // com.bytedance.android.live.banner.AbstractC2951c
    public void leave(DataChannel dataChannel, Room room) {
    }

    @Override // com.bytedance.android.live.base.AbstractC2953a
    public void onInit() {
    }

    @Override // com.bytedance.android.live.banner.AbstractC2951c
    public boolean shouldShowBanner(long j) {
        return false;
    }

    public boolean shouldShowBanner(Room room) {
        return false;
    }
}
