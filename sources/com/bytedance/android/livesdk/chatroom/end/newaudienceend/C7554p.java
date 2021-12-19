package com.bytedance.android.livesdk.chatroom.end.newaudienceend;

import android.content.Context;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.chatroom.backroom.p485d.C7349a;
import com.bytedance.android.livesdk.chatroom.p492g.C7589k;
import com.bytedance.android.livesdk.event.C8452e;
import com.bytedance.android.livesdk.live.p564a.C9286a;
import com.bytedance.android.livesdk.live.p566c.C9294a;
import com.bytedance.android.livesdk.livesetting.watchlive.EnableEnterRoomOptFromLiveAudienceEndSetting;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.AbstractC11815j;
import com.bytedance.android.livesdkapi.p691g.C11760a;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* renamed from: com.bytedance.android.livesdk.chatroom.end.newaudienceend.p */
public final class C7554p {
    static {
        Covode.recordClassIndex(8327);
    }

    /* renamed from: a */
    static void m15532a(Room room, Context context, DataChannel dataChannel, boolean z) {
        EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
        enterRoomConfig.f28232b.f28263g = room.getLog_pb();
        enterRoomConfig.f28232b.f28257a = room.getRequestId();
        enterRoomConfig.f28233c.f28293J = "live_end";
        enterRoomConfig.f28233c.f28295L = "live_cover";
        EnterRoomConfig a = C7589k.m15598a(enterRoomConfig, dataChannel);
        a.f28233c.f28301R = room.getId();
        a.f28233c.f28302S = room.getStreamType();
        a.f28232b.f28267k = room.getUserFrom();
        a.f28233c.f28362r = room.getOrientation();
        Boolean valueOf = Boolean.valueOf(EnableEnterRoomOptFromLiveAudienceEndSetting.INSTANCE.getValue());
        if (valueOf != null && valueOf.booleanValue()) {
            a = C11760a.m20717a(room, a);
        }
        if (!C7349a.m15251a()) {
            ((AbstractC11815j) C6193a.m13435a(AbstractC11815j.class)).mo18880b(context, a);
        } else if (z) {
            C6779a.m14563a().mo13053a(new C8452e(room.getId(), a, "jump_source_live_end"));
        } else {
            C6779a.m14563a().mo13053a(new C8452e(room.getId(), a));
        }
        C9294a.m17572a().f22727a = new C9286a("live_end");
    }
}
