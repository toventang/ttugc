package com.bytedance.android.livesdk.chatroom.detail;

import com.bytedance.android.live.core.p214d.C3868c;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.chatroom.p492g.C7572d;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.livesdk.chatroom.detail.w */
public final /* synthetic */ class RunnableC7464w implements Runnable {

    /* renamed from: a */
    private final C7463v f18558a;

    static {
        Covode.recordClassIndex(8234);
    }

    RunnableC7464w(C7463v vVar) {
        this.f18558a = vVar;
    }

    public final void run() {
        long j;
        long j2;
        C7463v vVar = this.f18558a;
        JSONObject jSONObject = new JSONObject();
        HashMap hashMap = new HashMap(40);
        if (vVar.f18553c != null) {
            C7463v.m15371a(jSONObject, "room_id", Long.valueOf(vVar.f18553c.f8117g));
            C7463v.m15371a(jSONObject, "enter_room_type", vVar.f18553c.f8112b);
            C7463v.m15371a(jSONObject, "enter_room_merge_type", vVar.f18553c.f8113c);
            C7463v.m15371a(jSONObject, "enter_room_method_type", vVar.f18553c.f8114d);
            C7463v.m15371a(jSONObject, "enterRoomStage", Integer.valueOf(vVar.f18553c.f8111a));
            C7463v.m15371a(jSONObject, "playerStatus", Integer.valueOf(vVar.f18553c.f8116f));
            C7463v.m15371a(jSONObject, "enter_room_sub_type", vVar.f18553c.f8115e);
            hashMap.put("room_id", String.valueOf(vVar.f18553c.f8117g));
            hashMap.put("enter_room_type", String.valueOf(vVar.f18553c.f8112b));
            hashMap.put("enter_room_merge_type", String.valueOf(vVar.f18553c.f8113c));
            hashMap.put("enter_room_method_type", String.valueOf(vVar.f18553c.f8114d));
            hashMap.put("enterRoomStage", String.valueOf(vVar.f18553c.f8111a));
            hashMap.put("playerStatus", String.valueOf(vVar.f18553c.f8116f));
            hashMap.put("enter_room_sub_type", String.valueOf(vVar.f18553c.f8115e));
            vVar.mo13694a("play_container_build", Long.valueOf(vVar.f18553c.f8120j));
        }
        C7463v.m15371a(jSONObject, "has_warmed_up", Integer.valueOf(vVar.f18554d ? 1 : 0));
        hashMap.put("has_warmed_up", String.valueOf(vVar.f18554d ? 1 : 0));
        C7463v.m15371a(jSONObject, "is_share_player", Integer.valueOf(vVar.f18555e ? 1 : 0));
        hashMap.put("is_share_player", String.valueOf(vVar.f18555e ? 1 : 0));
        C7463v.m15371a(jSONObject, "is_pre_create_surface", Integer.valueOf(vVar.f18556f ? 1 : 0));
        hashMap.put("is_pre_create_surface", String.valueOf(vVar.f18556f ? 1 : 0));
        for (Map.Entry<String, Long> entry : vVar.f18551a.entrySet()) {
            C7463v.m15371a(jSONObject, entry.getKey(), entry.getValue());
            hashMap.put(entry.getKey(), String.valueOf(entry.getValue()));
        }
        hashMap.put("duration", String.valueOf(vVar.mo13695b()));
        C7463v.m15371a(jSONObject, "duration", String.valueOf(vVar.mo13695b()));
        Long l = vVar.f18551a.get("start");
        Long l2 = vVar.f18551a.get("sdk_player_first_frame");
        if (l == null || l2 == null) {
            j = 0;
        } else {
            j = l2.longValue() - l.longValue();
            if (j < 0) {
                j = -1;
            }
        }
        if (vVar.f18555e && j < 0) {
            j = 0;
        }
        hashMap.put("first_frame_duration", String.valueOf(j));
        C7463v.m15371a(jSONObject, "first_frame_duration", String.valueOf(j));
        if (((IHostContext) C6193a.m13435a(IHostContext.class)).isOffline()) {
            StringBuilder sb = new StringBuilder();
            sb.append(hashMap.toString()).append("\n");
            for (Map.Entry<String, Long> entry2 : vVar.f18551a.entrySet()) {
                C7463v.m15371a(jSONObject, entry2.getKey(), entry2.getValue());
                hashMap.put(entry2.getKey(), String.valueOf(entry2.getValue()));
                StringBuilder append = sb.append(entry2.getKey()).append(": ");
                String key = entry2.getKey();
                Long l3 = vVar.f18551a.get("start");
                Long l4 = vVar.f18551a.get(key);
                if (l3 == null || l4 == null) {
                    j2 = 0;
                } else {
                    j2 = l4.longValue() - l3.longValue();
                }
                append.append(j2).append(" <--> " + entry2.getValue() + " - " + vVar.mo13696b("start") + "  ").append("\n");
            }
            C7572d.m15561a("RoomPlayerLogger_TAG", sb.toString());
        }
        C3868c.m9490a("ttlive_enter_room_full_link_monitor", 0, 0, jSONObject);
        C6501b.C6502a.m13948a("livesdk_enter_room_duration").mo12652a((Map<String, String>) hashMap).mo12639a().mo12655b();
        vVar.f18557g = true;
        vVar.f18551a.clear();
        vVar.f18553c = null;
        vVar.f18552b = null;
        vVar.f18554d = false;
        vVar.f18555e = false;
        vVar.f18556f = false;
    }
}
