package com.bytedance.android.live.broadcast.p192c.p193a;

import com.bytedance.android.live.core.p214d.C3868c;
import com.bytedance.android.livesdk.p425aa.p429d.C6542d;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.bytedance.android.live.broadcast.c.a.r */
final /* synthetic */ class C3213r implements AbstractC88433f {

    /* renamed from: a */
    private final long f9240a;

    /* renamed from: b */
    private final Room f9241b;

    static {
        Covode.recordClassIndex(3694);
    }

    C3213r(long j, Room room) {
        this.f9240a = j;
        this.f9241b = room;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        long j = this.f9240a;
        Room room = this.f9241b;
        HashMap hashMap = new HashMap();
        hashMap.put("response", obj != null ? obj.toString() : "no response");
        hashMap.put("room_id", Long.valueOf(j));
        if (room != null) {
            hashMap.put("anchor_id", Long.valueOf(room.getOwnerUserId()));
            hashMap.put("live_type", Integer.valueOf(room.getOrientation()));
        }
        C3868c.m9491a(C6542d.m13984a("service_sticker_report_status"), 0, hashMap);
    }
}
