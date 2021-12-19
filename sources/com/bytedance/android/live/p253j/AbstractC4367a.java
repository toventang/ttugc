package com.bytedance.android.live.p253j;

import com.bytedance.android.live.base.AbstractC2953a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;

/* renamed from: com.bytedance.android.live.j.a */
public interface AbstractC4367a extends AbstractC2953a {

    /* renamed from: com.bytedance.android.live.j.a$a */
    public static final class C4368a {
        static {
            Covode.recordClassIndex(4942);
        }
    }

    static {
        Covode.recordClassIndex(4941);
    }

    Class<? extends LiveRecyclableWidget> getMicRoomAnchorTimeControlWidget();

    Class<? extends LiveRecyclableWidget> getMicRoomAudienceEnterWidget();

    Class<? extends LiveRecyclableWidget> getMicRoomAudienceExitWidget();

    Class<? extends LiveRecyclableWidget> getMicRoomBackupTipsWidget();

    boolean isMicAudience();

    boolean isMicAudienceForRoom(Room room);

    boolean isMicRoom();

    boolean isMicRoomForAnchorNow();

    boolean isMicRoomForCurrentRoom();

    boolean isMicRoomForRoom(Room room);

    void jumpRoom(long j, boolean z);
}
