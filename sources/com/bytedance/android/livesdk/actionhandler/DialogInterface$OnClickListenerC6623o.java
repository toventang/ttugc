package com.bytedance.android.livesdk.actionhandler;

import android.content.DialogInterface;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdkapi.session.EnterRoomLinkSession;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.actionhandler.o */
final /* synthetic */ class DialogInterface$OnClickListenerC6623o implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private final RoomActionHandler f16520a;

    /* renamed from: b */
    private final EnterRoomLinkSession f16521b;

    /* renamed from: c */
    private final Room f16522c;

    /* renamed from: d */
    private final EnterRoomConfig f16523d;

    static {
        Covode.recordClassIndex(7361);
    }

    DialogInterface$OnClickListenerC6623o(RoomActionHandler roomActionHandler, EnterRoomLinkSession enterRoomLinkSession, Room room, EnterRoomConfig enterRoomConfig) {
        this.f16520a = roomActionHandler;
        this.f16521b = enterRoomLinkSession;
        this.f16522c = room;
        this.f16523d = enterRoomConfig;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f16520a.lambda$handleEnterRoom$3$RoomActionHandler(this.f16521b, this.f16522c, this.f16523d, dialogInterface, i);
    }
}
