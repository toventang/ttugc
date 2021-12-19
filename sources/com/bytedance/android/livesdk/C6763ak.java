package com.bytedance.android.livesdk;

import android.os.SystemClock;
import com.bytedance.android.live.core.p214d.C3868c;
import com.bytedance.android.live.core.performance.C4017b;
import com.bytedance.android.livesdk.p425aa.p426a.C6499a;
import com.bytedance.android.livesdk.p425aa.p426a.EnumC6500b;
import com.bytedance.android.livesdk.p425aa.p429d.C6542d;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.ak */
public final class C6763ak {

    /* renamed from: a */
    public static final String f16800a = C6542d.m13984a("ttlive_ws_connect_status");

    /* renamed from: b */
    private static final String f16801b = C6542d.m13985b("ttlive_ws_connect_status");

    /* renamed from: c */
    private long f16802c;

    /* renamed from: d */
    private boolean f16803d;

    /* renamed from: a */
    public final void mo12964a() {
        if (!this.f16803d) {
            this.f16803d = true;
            this.f16802c = SystemClock.uptimeMillis();
        }
    }

    static {
        Covode.recordClassIndex(7501);
    }

    /* renamed from: b */
    public final long mo12967b() {
        long j;
        if (this.f16802c > 0) {
            j = SystemClock.uptimeMillis() - this.f16802c;
        } else {
            j = 0;
        }
        this.f16802c = 0;
        this.f16803d = false;
        return j;
    }

    /* renamed from: a */
    public final void mo12966a(long j, String str, String str2) {
        mo12967b();
        JSONObject jSONObject = new JSONObject();
        C4017b.m9798a(jSONObject, "room_id", j);
        C4017b.m9799a(jSONObject, "reason", str);
        C4017b.m9799a(jSONObject, "push_server", str2);
        C3868c.m9497b(f16800a, 2, jSONObject);
        C6499a.m13906a();
        C6499a.m13911a(EnumC6500b.Room.info, "ttlive_ws_connect_status", 2, jSONObject);
    }

    /* renamed from: a */
    public final void mo12965a(long j, int i, String str, String str2, HashMap<String, String> hashMap) {
        mo12967b();
        JSONObject jSONObject = new JSONObject();
        C4017b.m9798a(jSONObject, "room_id", j);
        C4017b.m9798a(jSONObject, "error_code", (long) i);
        C4017b.m9799a(jSONObject, "error_msg", str);
        C4017b.m9799a(jSONObject, "push_server", str2);
        if (hashMap != null) {
            C4017b.m9799a(jSONObject, "params", hashMap.toString());
        }
        C3868c.m9497b(f16800a, 1, jSONObject);
        C3868c.m9492a(f16801b, 1, jSONObject);
        C6499a.m13906a();
        C6499a.m13911a(EnumC6500b.Room.info, "ttlive_ws_connect_status", 1, jSONObject);
    }
}
