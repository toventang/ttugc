package com.bytedance.android.live.liveinteract.platform.common.api;

import com.bytedance.android.live.network.C5805e;
import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.android.livesdk.chatroom.api.LinkApi;
import com.bytedance.android.livesdk.p561j.C9009ac;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import p4560f.p4561a.AbstractC88979t;

/* renamed from: com.bytedance.android.live.liveinteract.platform.common.api.a */
public final class C5672a {
    static {
        Covode.recordClassIndex(6270);
    }

    /* renamed from: a */
    public static AbstractC88979t<C5832d<Void>> m12412a(int i, boolean z) {
        Room room = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
        if (room == null) {
            return null;
        }
        long id = room.getId();
        String secUid = room.getOwner().getSecUid();
        if (i == 0) {
            return ((LinkApi) C5805e.m12718a().mo11572a(LinkApi.class)).updateAnchorLinkSetting(id, secUid, 0, z, false, false, false, false);
        }
        if (i == 2) {
            return ((LinkApi) C5805e.m12718a().mo11572a(LinkApi.class)).updateAnchorLinkSetting(id, secUid, 2, false, false, z, false, false);
        }
        if (i == 4) {
            return ((LinkApi) C5805e.m12718a().mo11572a(LinkApi.class)).updateAnchorLinkSetting(id, secUid, 4, false, false, false, false, true);
        }
        return null;
    }
}
