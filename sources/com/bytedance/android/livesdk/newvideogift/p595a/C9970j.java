package com.bytedance.android.livesdk.newvideogift.p595a;

import com.bytedance.android.live.core.p214d.C3868c;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.newvideogift.a.j */
public final class C9970j {
    static {
        Covode.recordClassIndex(11522);
    }

    /* renamed from: com.bytedance.android.livesdk.newvideogift.a.j$a */
    public enum EnumC9971a {
        receive_message,
        consume_message,
        load_resource_success,
        consume_effect_message,
        playcontroller_receive,
        playcontroller_start,
        playcontroller_end;

        static {
            Covode.recordClassIndex(11523);
        }
    }

    /* renamed from: a */
    public static void m18395a(EnumC9971a aVar, long j, long j2, long j3) {
        int i;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("timestamp", System.currentTimeMillis());
            jSONObject.put("event", aVar.name());
            C9958e.m18293a();
            if (C9958e.m18294b()) {
                i = 1;
            } else {
                i = 0;
            }
            jSONObject.put("player_state", i);
            jSONObject.put("message_id", j);
            jSONObject.put("gift_id", j2);
            jSONObject.put("effect_id", j3);
            C3868c.m9492a("ttlive_video_gift_show_link_all", 0, jSONObject);
        } catch (Exception unused) {
        }
    }
}
