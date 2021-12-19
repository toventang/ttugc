package com.bytedance.android.live.liveinteract.multilive.p341a.p345d;

import android.content.DialogInterface;
import com.bytedance.android.live.liveinteract.api.p260a.C4386c;
import com.bytedance.android.live.network.C5805e;
import com.bytedance.android.livesdk.chatroom.api.LinkApi;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiLiveServerAutoJoinChannel;
import com.bytedance.android.livesdk.p458b.p459a.C6894d;
import com.bytedance.android.livesdk.p561j.C9009ac;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;

/* renamed from: com.bytedance.android.live.liveinteract.multilive.a.d.g */
final /* synthetic */ class DialogInterface$OnClickListenerC5417g implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private final View$OnClickListenerC5408a f13965a;

    static {
        Covode.recordClassIndex(6012);
    }

    DialogInterface$OnClickListenerC5417g(View$OnClickListenerC5408a aVar) {
        this.f13965a = aVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        Room room;
        View$OnClickListenerC5408a aVar = this.f13965a;
        if (!(aVar.f13944n || (room = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class)) == null || room.getOwner() == null)) {
            aVar.f13944n = true;
            aVar.f13941k.mo142945a(((LinkApi) C5805e.m12718a().mo11572a(LinkApi.class)).linkInRoomGuestReplyAnchor(room.getId(), 2, room.getId(), room.getOwnerUserId(), C4386c.m10499a().f11990k, C6894d.m14753a().f17274u, MultiLiveServerAutoJoinChannel.INSTANCE.getValue()).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C5418h(aVar), new C5419i(aVar)));
        }
        dialogInterface.dismiss();
    }
}
