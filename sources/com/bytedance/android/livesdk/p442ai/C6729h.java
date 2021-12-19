package com.bytedance.android.livesdk.p442ai;

import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.ai.h */
public final class C6729h {
    static {
        Covode.recordClassIndex(7467);
    }

    /* renamed from: a */
    public static void m14301a(String str, long j, long j2, long j3, long j4, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("error_msg", str);
        hashMap.put("error_code", String.valueOf(j));
        hashMap.put("detail_error_code", String.valueOf(j2));
        if (j == 208) {
            hashMap.put("pull_stream_time", String.valueOf(j3));
            hashMap.put("start_room_time", String.valueOf(j4));
            hashMap.put("player_error", str2);
        }
        C6501b.C6502a.m13948a("livesdk_live_play_fail").mo12652a((Map<String, String>) hashMap).mo12639a().mo12655b();
    }
}
