package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.content.DialogInterface;
import com.bytedance.android.live.adminsetting.RoomSwitchApi;
import com.bytedance.android.live.network.C5805e;
import com.bytedance.android.livesdk.util.rxutils.C11191f;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.z */
public final /* synthetic */ class DialogInterface$OnClickListenerC8123z implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private final CommentWidget f20135a;

    static {
        Covode.recordClassIndex(8930);
    }

    DialogInterface$OnClickListenerC8123z(CommentWidget commentWidget) {
        this.f20135a = commentWidget;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        CommentWidget commentWidget = this.f20135a;
        dialogInterface.dismiss();
        if (commentWidget.f19834c != null) {
            ((RoomSwitchApi) C5805e.m12718a().mo11572a(RoomSwitchApi.class)).updateSwitch(commentWidget.f19834c.getId(), 3, true).mo143271a(new C11191f()).mo143254a(new C8052ab(commentWidget), C8053ac.f20059a);
        }
    }
}
