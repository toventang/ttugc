package com.bytedance.android.livesdk.like;

import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.livesdk.p456as.AbstractC6872f;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.like.c */
public final class C9169c {

    /* renamed from: a */
    public static final C9169c f22337a = new C9169c();

    private C9169c() {
    }

    static {
        Covode.recordClassIndex(10076);
    }

    /* renamed from: a */
    public static final void m17444a(Room room, AbstractC9168b bVar) {
        String str;
        C89219l.m154721d(room, "");
        C89219l.m154721d(bVar, "");
        if (bVar.mo15295n()) {
            String str2 = "disabled_due_to_landscape_mode";
            String str3 = "enabled";
            if (bVar.mo15292k()) {
                str = "disabled_due_to_clear_screen";
            } else if (!bVar.mo15293l()) {
                str = str2;
            } else {
                str = str3;
            }
            if (bVar.mo15294m()) {
                str2 = str3;
            }
            if (!bVar.mo15296o()) {
                str3 = "disabled_due_to_being_audience_and_mic_room";
            }
            long id = room.getId();
            AbstractC6872f b = C11115u.m19743a().mo17915b();
            C89219l.m154716b(b, "");
            m17443a(id, b.mo13161c(), room.getOwnerUserId(), "enabled", str, str2, str3);
        }
    }

    /* renamed from: a */
    public static final void m17443a(long j, long j2, long j3, String str, String str2, String str3, String str4) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("room_id", j);
        jSONObject.put("user_id", j2);
        jSONObject.put("anchor_id", j3);
        jSONObject.put("overall_state", str);
        jSONObject.put("send_state", str2);
        jSONObject.put("receive_state", str3);
        jSONObject.put("progress_effect_state", str4);
        C3854a.m9453a(3, "ttlive_like", jSONObject.toString());
    }
}
