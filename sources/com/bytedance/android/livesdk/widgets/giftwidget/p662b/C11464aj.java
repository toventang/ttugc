package com.bytedance.android.livesdk.widgets.giftwidget.p662b;

import com.bytedance.android.live.core.p214d.C3868c;
import com.bytedance.android.live.p172a.p173a.C2908a;
import com.bytedance.android.livesdk.p425aa.p426a.C6499a;
import com.bytedance.android.livesdk.p425aa.p426a.EnumC6500b;
import com.bytedance.android.livesdk.p425aa.p429d.C6542d;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.bytedance.android.livesdk.widgets.giftwidget.b.aj */
final /* synthetic */ class C11464aj implements AbstractC88433f {

    /* renamed from: a */
    private final C11455ag f27509a;

    /* renamed from: b */
    private final long f27510b;

    /* renamed from: c */
    private final Room f27511c;

    static {
        Covode.recordClassIndex(13123);
    }

    C11464aj(C11455ag agVar, long j, Room room) {
        this.f27509a = agVar;
        this.f27510b = j;
        this.f27511c = room;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        C11455ag agVar = this.f27509a;
        long j = this.f27510b;
        Room room = this.f27511c;
        Throwable th = (Throwable) obj;
        agVar.mo18308b();
        agVar.f27480b = false;
        long id = room.getId();
        HashMap hashMap = new HashMap();
        hashMap.put("room_id", Long.valueOf(id));
        hashMap.put("prop_id", Long.valueOf(j));
        if (th instanceof C2908a) {
            hashMap.put("error_code", Integer.valueOf(((C2908a) th).getErrorCode()));
        } else {
            hashMap.put("error_code", 0);
        }
        hashMap.put("error_msg", th.getMessage());
        C3868c.m9489a(C6542d.m13984a("ttlive_prop_send_status"), 1, 0, hashMap);
        C3868c.m9491a(C6542d.m13985b("ttlive_prop_send_status"), 1, hashMap);
        C6499a.m13906a();
        C6499a.m13912a(EnumC6500b.Gift.info, "ttlive_prop_send_status", hashMap);
        agVar.mo18302a();
    }
}
