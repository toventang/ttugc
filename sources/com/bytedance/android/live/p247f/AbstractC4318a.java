package com.bytedance.android.live.p247f;

import android.content.Context;
import android.content.DialogInterface;
import com.bytedance.android.live.base.AbstractC2953a;
import com.bytedance.android.livesdk.callback.IHostLongPressCallback;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.p683e.AbstractC11665b;
import com.bytedance.android.livesdkapi.depend.p683e.C11666c;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;

/* renamed from: com.bytedance.android.live.f.a */
public interface AbstractC4318a extends AbstractC2953a {

    /* renamed from: com.bytedance.android.live.f.a$a */
    public interface AbstractC4319a {
        static {
            Covode.recordClassIndex(4892);
        }

        /* renamed from: a */
        void mo10009a(boolean z);
    }

    static {
        Covode.recordClassIndex(4891);
    }

    void addOnUserCountVisibilityChangeListener(long j, AbstractC4319a aVar);

    void enter(DataChannel dataChannel, Room room);

    Class<? extends LiveRecyclableWidget> getLiveRoomNotifyWidget();

    Class<? extends LiveRecyclableWidget> getStreamInfoWidget();

    void leave(DataChannel dataChannel, Room room);

    void likeMicStateChange(long j, int i, boolean z);

    DialogInterface onLongPress(Context context, boolean z, Room room, C11666c cVar, IHostLongPressCallback iHostLongPressCallback, AbstractC11665b bVar);

    boolean shouldShowUserCount(Room room);
}
