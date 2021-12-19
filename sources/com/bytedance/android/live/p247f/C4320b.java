package com.bytedance.android.live.p247f;

import android.content.Context;
import android.content.DialogInterface;
import com.bytedance.android.live.p247f.AbstractC4318a;
import com.bytedance.android.livesdk.callback.IHostLongPressCallback;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.p683e.AbstractC11665b;
import com.bytedance.android.livesdkapi.depend.p683e.C11666c;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.f.b */
public class C4320b implements AbstractC4318a {
    static {
        Covode.recordClassIndex(4893);
    }

    @Override // com.bytedance.android.live.p247f.AbstractC4318a
    public void addOnUserCountVisibilityChangeListener(long j, AbstractC4318a.AbstractC4319a aVar) {
        C89219l.m154721d(aVar, "");
    }

    @Override // com.bytedance.android.live.p247f.AbstractC4318a
    public void enter(DataChannel dataChannel, Room room) {
    }

    @Override // com.bytedance.android.live.p247f.AbstractC4318a
    public Class<? extends LiveRecyclableWidget> getLiveRoomNotifyWidget() {
        return null;
    }

    @Override // com.bytedance.android.live.p247f.AbstractC4318a
    public Class<? extends LiveRecyclableWidget> getStreamInfoWidget() {
        return null;
    }

    @Override // com.bytedance.android.live.p247f.AbstractC4318a
    public void leave(DataChannel dataChannel, Room room) {
    }

    @Override // com.bytedance.android.live.p247f.AbstractC4318a
    public void likeMicStateChange(long j, int i, boolean z) {
    }

    @Override // com.bytedance.android.live.base.AbstractC2953a
    public void onInit() {
    }

    @Override // com.bytedance.android.live.p247f.AbstractC4318a
    public DialogInterface onLongPress(Context context, boolean z, Room room, C11666c cVar, IHostLongPressCallback iHostLongPressCallback, AbstractC11665b bVar) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(room, "");
        C89219l.m154721d(cVar, "");
        C89219l.m154721d(bVar, "");
        return null;
    }

    @Override // com.bytedance.android.live.p247f.AbstractC4318a
    public boolean shouldShowUserCount(Room room) {
        return false;
    }
}
