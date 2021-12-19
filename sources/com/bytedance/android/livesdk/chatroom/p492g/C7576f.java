package com.bytedance.android.livesdk.chatroom.p492g;

import android.os.SystemClock;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdk.model.message.C9878i;
import com.bytedance.android.livesdk.p456as.AbstractC6872f;
import com.bytedance.android.livesdk.p458b.p459a.C6896e;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.p692h.C11778b;
import com.bytedance.android.livesdkapi.session.C11868d;
import com.bytedance.android.message.AbstractC11890c;
import com.bytedance.android.message.IMessageService;
import com.bytedance.covode.number.Covode;
import org.json.JSONException;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.chatroom.g.f */
public final class C7576f implements AbstractC11890c {

    /* renamed from: a */
    public static final C6896e f18799a = new C6896e();

    /* renamed from: b */
    public static Room f18800b;

    /* renamed from: c */
    public static final C7576f f18801c;

    private C7576f() {
    }

    static {
        Covode.recordClassIndex(8349);
        C7576f fVar = new C7576f();
        f18801c = fVar;
        ((IMessageService) C6193a.m13435a(IMessageService.class)).addOnMessageParsedListener(fVar);
    }

    /* renamed from: a */
    public static void m15565a() {
        int i;
        Long l;
        Long l2;
        RoomAuthStatus roomAuthStatus;
        RoomAuthStatus roomAuthStatus2;
        JSONObject jSONObject = new JSONObject();
        try {
            Room room = f18800b;
            int i2 = 0;
            if (room == null || (roomAuthStatus2 = room.getRoomAuthStatus()) == null || roomAuthStatus2.enableChat) {
                i = 1;
            } else {
                i = 0;
            }
            jSONObject.put("chat_state", i);
            Room room2 = f18800b;
            if (!(room2 == null || (roomAuthStatus = room2.getRoomAuthStatus()) == null)) {
                i2 = roomAuthStatus.getPublicScreenAuth();
            }
            jSONObject.put("public_screen_state", i2);
            AbstractC6872f b = C11115u.m19743a().mo17915b();
            C89219l.m154716b(b, "");
            jSONObject.put("user_id", b.mo13161c());
            Room room3 = f18800b;
            if (room3 != null) {
                l = Long.valueOf(room3.getId());
            } else {
                l = null;
            }
            jSONObject.put("room_id", l);
            Room room4 = f18800b;
            if (room4 != null) {
                l2 = Long.valueOf(room4.getOwnerUserId());
            } else {
                l2 = null;
            }
            jSONObject.put("anchor_id", l2);
        } catch (JSONException unused) {
        }
        C11868d.m20958a("ttlive_message_link_overall_state", null, null, jSONObject);
    }

    /* renamed from: a */
    public static void m15566a(int i) {
        Long l;
        Long l2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("send_precondition_error_code", i);
            AbstractC6872f b = C11115u.m19743a().mo17915b();
            C89219l.m154716b(b, "");
            jSONObject.put("user_id", b.mo13161c());
            Room room = f18800b;
            if (room != null) {
                l = Long.valueOf(room.getId());
            } else {
                l = null;
            }
            jSONObject.put("room_id", l);
            Room room2 = f18800b;
            if (room2 != null) {
                l2 = Long.valueOf(room2.getOwnerUserId());
            } else {
                l2 = null;
            }
            jSONObject.put("anchor_id", l2);
        } catch (JSONException unused) {
        }
        C11868d.m20958a("ttlive_chat", null, null, jSONObject);
    }

    @Override // com.bytedance.android.message.AbstractC11890c
    /* renamed from: a */
    public final void mo13826a(C9878i iVar) {
        long j;
        Long l;
        Long l2;
        Long l3;
        C89219l.m154721d(iVar, "");
        C6896e eVar = f18799a;
        C11778b bVar = iVar.f28134O;
        if (bVar != null) {
            j = bVar.f28138d;
        } else {
            j = 0;
        }
        Long valueOf = Long.valueOf(eVar.mo13190a(j));
        if (valueOf.longValue() > 0 && 1 != 0 && valueOf != null) {
            long longValue = valueOf.longValue();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("message_send_receive_duration", SystemClock.uptimeMillis() - longValue);
                AbstractC6872f b = C11115u.m19743a().mo17915b();
                C89219l.m154716b(b, "");
                jSONObject.put("user_id", b.mo13161c());
                Room room = f18800b;
                if (room != null) {
                    l = Long.valueOf(room.getId());
                } else {
                    l = null;
                }
                jSONObject.put("room_id", l);
                Room room2 = f18800b;
                if (room2 != null) {
                    l2 = Long.valueOf(room2.getOwnerUserId());
                } else {
                    l2 = null;
                }
                jSONObject.put("anchor_id", l2);
                C11778b bVar2 = iVar.f28134O;
                if (bVar2 != null) {
                    l3 = Long.valueOf(bVar2.f28138d);
                } else {
                    l3 = null;
                }
                jSONObject.put("msg_id", l3);
            } catch (JSONException unused) {
            }
            C11868d.m20958a("ttlive_chat_message_metrics", null, null, jSONObject);
        }
    }
}
