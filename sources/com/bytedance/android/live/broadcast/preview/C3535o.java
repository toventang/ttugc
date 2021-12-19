package com.bytedance.android.live.broadcast.preview;

import com.bytedance.android.live.core.p214d.C3868c;
import com.bytedance.android.livesdk.p425aa.p428c.C6529h;
import com.bytedance.android.livesdk.p425aa.p428c.C6531i;
import com.bytedance.android.livesdk.p425aa.p428c.C6532j;
import com.bytedance.android.livesdk.p456as.AbstractC6872f;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.p685a.AbstractC11682d;
import com.bytedance.android.livesdkapi.session.C11868d;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import org.json.JSONException;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.broadcast.preview.o */
public final class C3535o implements AbstractC11682d {

    /* renamed from: a */
    public static final C3536a f9838a = new C3536a((byte) 0);

    static {
        Covode.recordClassIndex(4019);
    }

    @Override // com.bytedance.android.livesdkapi.depend.model.p685a.AbstractC11686g
    public final void onStartLive() {
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.o$a */
    public static final class C3536a {
        static {
            Covode.recordClassIndex(4020);
        }

        private C3536a() {
        }

        public /* synthetic */ C3536a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.android.livesdkapi.depend.model.p685a.AbstractC11682d
    /* renamed from: a */
    public final void mo8695a() {
        m8935c(0, null);
    }

    @Override // com.bytedance.android.livesdkapi.depend.model.p685a.AbstractC11682d
    /* renamed from: a */
    public final void mo8696a(int i) {
        m8935c(i, null);
    }

    @Override // com.bytedance.android.livesdkapi.depend.model.p685a.AbstractC11682d
    /* renamed from: b */
    public final void mo8699b(int i, DataChannel dataChannel) {
        C89219l.m154721d(dataChannel, "");
        m8935c(i, dataChannel);
    }

    @Override // com.bytedance.android.livesdkapi.depend.model.p685a.AbstractC11682d
    /* renamed from: a */
    public final void mo8697a(int i, DataChannel dataChannel) {
        C89219l.m154721d(dataChannel, "");
        m8935c(i, dataChannel);
    }

    /* renamed from: c */
    private static void m8935c(int i, DataChannel dataChannel) {
        Room room;
        Long l;
        Long l2;
        Integer num;
        String str;
        C6529h hVar;
        JSONObject jSONObject = new JSONObject();
        try {
            AbstractC6872f b = C11115u.m19743a().mo17915b();
            C89219l.m154716b(b, "");
            jSONObject.put("user_id", b.mo13161c());
            if (dataChannel == null || (hVar = (C6529h) dataChannel.mo28318b(C6531i.class)) == null || (room = hVar.f16310b) == null) {
                C6529h hVar2 = (C6529h) DataChannelGlobal.f42558d.mo28324b(C6532j.class);
                if (hVar2 != null) {
                    room = hVar2.f16310b;
                } else {
                    room = null;
                }
            }
            if (room != null) {
                l = Long.valueOf(room.getId());
            } else {
                l = null;
            }
            jSONObject.put("room_id", l);
            if (room != null) {
                l2 = Long.valueOf(room.getOwnerUserId());
            } else {
                l2 = null;
            }
            jSONObject.put("anchor_id", l2);
            if (room != null) {
                num = Integer.valueOf(room.liveRoomMode);
            } else {
                num = null;
            }
            jSONObject.put("live_mode", num);
            if (room != null) {
                str = room.getLabels();
            } else {
                str = null;
            }
            jSONObject.put("game_label", str);
            jSONObject.put("error_code", i);
        } catch (JSONException e) {
            C3868c.m9496a(e, String.valueOf(e));
        }
        C11868d.m20958a("livesdk_gamelive_start", null, null, jSONObject);
    }
}
