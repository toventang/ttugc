package com.bytedance.android.livesdk.rank.impl.p611d;

import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.livesdk.rank.api.EnumC10345i;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.rank.impl.d.a */
public final class C10386a {

    /* renamed from: a */
    public static final C10386a f25069a = new C10386a();

    private C10386a() {
    }

    static {
        Covode.recordClassIndex(11960);
    }

    /* renamed from: a */
    public static final void m18894a(long j, long j2, long j3, int i) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("room_id", j);
        jSONObject.put("user_id", j2);
        jSONObject.put("anchor_id", j3);
        jSONObject.put("room_auth_hourly_rank_state", i);
        C3854a.m9453a(3, "ttlive_hourly_rank_entrance", jSONObject.toString());
    }

    /* renamed from: a */
    public static final void m18893a(int i, long j, long j2, long j3, String str, String str2, String str3) {
        String str4;
        if (i == EnumC10345i.HOURLY_RANK.getType()) {
            str4 = EnumC10345i.HOURLY_RANK.getRankName();
        } else if (i == EnumC10345i.WEEKLY_RANK.getType()) {
            str4 = EnumC10345i.WEEKLY_RANK.getRankName();
        } else {
            str4 = "unknown";
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("rank_name", str4);
        jSONObject.put("room_id", j);
        jSONObject.put("user_id", j2);
        jSONObject.put("anchor_id", j3);
        jSONObject.put("rank_entrance_current_state", str);
        jSONObject.put("message_id", str2);
        jSONObject.put("rank_entrance_hide_reason", str3);
        C3854a.m9453a(3, "ttlive_rank_entrance", jSONObject.toString());
    }
}
