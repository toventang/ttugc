package com.bytedance.android.livesdk.p442ai;

import android.os.SystemClock;
import android.util.Pair;
import com.bytedance.android.live.core.p214d.C3866a;
import com.bytedance.android.live.core.p214d.C3868c;
import com.bytedance.android.livesdk.p425aa.C6544e;
import com.bytedance.android.livesdk.p425aa.p426a.C6499a;
import com.bytedance.android.livesdk.p425aa.p426a.EnumC6500b;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.ai.l */
public final class C6739l extends C3866a {

    /* renamed from: a */
    public long f16722a;

    /* renamed from: b */
    public volatile boolean f16723b;

    /* renamed from: c */
    public int f16724c;

    /* renamed from: d */
    public C6750t f16725d;

    /* renamed from: e */
    public Map<String, Long> f16726e = new HashMap();

    /* renamed from: f */
    public Map<String, Long> f16727f = new HashMap(6);

    /* renamed from: g */
    private volatile boolean f16728g;

    static {
        Covode.recordClassIndex(7477);
    }

    /* renamed from: b */
    public static Pair<String, String> m14389b() {
        return new Pair<>(C6544e.m13987a(), C6544e.m13990d());
    }

    /* renamed from: c */
    public static void m14390c() {
        JSONObject jSONObject = new JSONObject();
        C3866a.m9474a(jSONObject, "error_code", 0L);
        C3866a.m9475a(jSONObject, "error_msg", "show live end fg");
        C3868c.m9492a("ttlive_audience_enter_room_all", 0, jSONObject);
    }

    /* renamed from: a */
    public final long mo12945a() {
        long j;
        if (this.f16722a > 0) {
            j = SystemClock.uptimeMillis() - this.f16722a;
        } else {
            j = 0;
        }
        this.f16722a = 0;
        return j;
    }

    /* renamed from: a */
    public final void mo12950a(String str) {
        m14388a(str, System.currentTimeMillis());
    }

    /* renamed from: b */
    public final long mo12951b(String str) {
        Long l = this.f16726e.get(str);
        if (l == null || l.longValue() <= 0) {
            return 0;
        }
        return l.longValue();
    }

    /* renamed from: a */
    public final void mo12949a(long j) {
        if (!this.f16723b) {
            this.f16723b = true;
            long a = mo12945a();
            JSONObject jSONObject = new JSONObject();
            m9475a(jSONObject, "enter_room_type", "other");
            m9474a(jSONObject, "room_id", j);
            Pair<String, String> b = m14389b();
            m9475a(jSONObject, "enter_from_merge", (String) b.first);
            m9475a(jSONObject, "enter_method", (String) b.second);
            C3868c.m9490a("ttlive_audience_enter_room_all", 2, a, jSONObject);
            C3868c.m9492a("ttlive_audience_enter_room_error", 2, jSONObject);
            C6499a.m13906a();
            C6499a.m13911a(EnumC6500b.Room.info, "ttlive_audience_enter_room", 2, jSONObject);
            if (C11115u.m19743a().mo17915b().mo13164d()) {
                C3868c.m9490a("ttlive_audience_minor_enter_room_all", 2, a, jSONObject);
                C3868c.m9492a("ttlive_audience_minor_enter_room_error", 2, jSONObject);
            }
        }
    }

    /* renamed from: a */
    private void m14388a(String str, long j) {
        this.f16726e.put(str, Long.valueOf(j));
    }

    /* renamed from: a */
    public final void mo12946a(int i, String str) {
        if (!this.f16728g) {
            this.f16728g = true;
            JSONObject jSONObject = new JSONObject();
            m9474a(jSONObject, "exit_code", (long) i);
            m9475a(jSONObject, "exit_msg", str);
            C3868c.m9492a("ttlive_audience_leave_room", 3, jSONObject);
        }
    }

    /* renamed from: a */
    public final void mo12947a(int i, String str, long j) {
        if (!this.f16728g) {
            if (i != 115) {
                this.f16728g = true;
            }
            JSONObject jSONObject = new JSONObject();
            m9474a(jSONObject, "exit_code", (long) i);
            m9475a(jSONObject, "exit_msg", str);
            m9474a(jSONObject, "room_id", j);
            C3868c.m9492a("ttlive_audience_leave_room", 3, jSONObject);
        }
    }

    /* renamed from: a */
    public final void mo12948a(int i, String str, long j, String str2, String str3) {
        if (!this.f16723b) {
            this.f16723b = true;
            mo12945a();
            JSONObject jSONObject = new JSONObject();
            m9475a(jSONObject, "enter_room_type", "other");
            m9475a(jSONObject, "room_type", str2);
            m9474a(jSONObject, "error_code", (long) i);
            m9475a(jSONObject, "error_msg", str);
            m9474a(jSONObject, "room_id", j);
            m9475a(jSONObject, "pull_url", str3);
            Pair<String, String> b = m14389b();
            m9475a(jSONObject, "enter_from_merge", (String) b.first);
            m9475a(jSONObject, "enter_method", (String) b.second);
            C3868c.m9497b("ttlive_audience_enter_room_all", 1, jSONObject);
            C3868c.m9492a("ttlive_audience_enter_room_error", 1, jSONObject);
            C6499a.m13906a();
            C6499a.m13911a(EnumC6500b.Room.info, "ttlive_audience_enter_room", 1, jSONObject);
            if (C11115u.m19743a().mo17915b().mo13164d()) {
                C3868c.m9497b("ttlive_audience_minor_enter_room_all", 1, jSONObject);
                C3868c.m9492a("ttlive_audience_minor_enter_room_error", 1, jSONObject);
            }
        }
    }
}
