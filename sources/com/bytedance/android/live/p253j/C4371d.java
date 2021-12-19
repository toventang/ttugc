package com.bytedance.android.live.p253j;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;

/* renamed from: com.bytedance.android.live.j.d */
public class C4371d implements AbstractC4367a {
    static {
        Covode.recordClassIndex(4945);
    }

    @Override // com.bytedance.android.live.p253j.AbstractC4367a
    public Class<? extends LiveRecyclableWidget> getMicRoomAnchorTimeControlWidget() {
        return null;
    }

    @Override // com.bytedance.android.live.p253j.AbstractC4367a
    public Class<? extends LiveRecyclableWidget> getMicRoomAudienceEnterWidget() {
        return null;
    }

    @Override // com.bytedance.android.live.p253j.AbstractC4367a
    public Class<? extends LiveRecyclableWidget> getMicRoomAudienceExitWidget() {
        return null;
    }

    @Override // com.bytedance.android.live.p253j.AbstractC4367a
    public Class<? extends LiveRecyclableWidget> getMicRoomBackupTipsWidget() {
        return null;
    }

    @Override // com.bytedance.android.live.p253j.AbstractC4367a
    public boolean isMicAudience() {
        return false;
    }

    @Override // com.bytedance.android.live.p253j.AbstractC4367a
    public boolean isMicAudienceForRoom(Room room) {
        return false;
    }

    @Override // com.bytedance.android.live.p253j.AbstractC4367a
    public boolean isMicRoom() {
        return false;
    }

    @Override // com.bytedance.android.live.p253j.AbstractC4367a
    public boolean isMicRoomForAnchorNow() {
        return false;
    }

    @Override // com.bytedance.android.live.p253j.AbstractC4367a
    public boolean isMicRoomForCurrentRoom() {
        return false;
    }

    @Override // com.bytedance.android.live.p253j.AbstractC4367a
    public boolean isMicRoomForRoom(Room room) {
        return false;
    }

    @Override // com.bytedance.android.live.p253j.AbstractC4367a
    public void jumpRoom(long j, boolean z) {
    }

    @Override // com.bytedance.android.live.base.AbstractC2953a
    public void onInit() {
    }
}
