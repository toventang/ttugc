package com.bytedance.android.livesdk.widgets.giftwidget.p662b;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p214d.C3868c;
import com.bytedance.android.live.p172a.p173a.C2908a;
import com.bytedance.android.live.p172a.p173a.p175b.C2912a;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p425aa.p426a.C6499a;
import com.bytedance.android.livesdk.p425aa.p426a.EnumC6500b;
import com.bytedance.android.livesdk.p425aa.p429d.C6542d;
import com.bytedance.android.livesdk.p561j.C9009ac;
import com.bytedance.android.livesdk.service.p624b.C10700d;
import com.bytedance.android.livesdk.service.p625c.p626a.C10715e;
import com.bytedance.android.livesdk.service.p625c.p631f.C10747c;
import com.bytedance.android.livesdk.service.p625c.p632g.C10752a;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.HashMap;
import java.util.Map;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.bytedance.android.livesdk.widgets.giftwidget.b.am */
final /* synthetic */ class C11467am implements AbstractC88433f {

    /* renamed from: a */
    private final C11455ag f27518a;

    /* renamed from: b */
    private final C10700d f27519b;

    /* renamed from: c */
    private final Room f27520c;

    /* renamed from: d */
    private final long f27521d;

    static {
        Covode.recordClassIndex(13126);
    }

    C11467am(C11455ag agVar, C10700d dVar, Room room, long j) {
        this.f27518a = agVar;
        this.f27519b = dVar;
        this.f27520c = room;
        this.f27521d = j;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        String message;
        String message2;
        String message3;
        C11455ag agVar = this.f27518a;
        C10700d dVar = this.f27519b;
        Room room = this.f27520c;
        long j = this.f27521d;
        Throwable th = (Throwable) obj;
        if (dVar.f25776r) {
            long j2 = dVar.f25760b;
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            Room room2 = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
            User user = (User) C11115u.m19743a().mo17915b().mo13147a();
            hashMap.put("user_id", String.valueOf(user.getId()));
            hashMap2.put("user_id", String.valueOf(user.getId()));
            hashMap.put("gift_id", String.valueOf(j2));
            hashMap2.put("gift_id", String.valueOf(j2));
            if (room2 != null) {
                hashMap.put("anchor_id", String.valueOf(room2.getOwnerUserId()));
                hashMap.put("room_id", String.valueOf(room2.getId()));
                hashMap2.put("anchor_id", String.valueOf(room2.getOwnerUserId()));
                hashMap2.put("room_id", String.valueOf(room2.getId()));
            }
            if (th != null) {
                if (th instanceof C2908a) {
                    C2908a aVar = (C2908a) th;
                    hashMap.put("error_code", String.valueOf(aVar.getErrorCode()));
                    hashMap2.put("error_code", String.valueOf(aVar.getErrorCode()));
                }
                hashMap.put("error_msg", th.getMessage());
                hashMap2.put("error_msg", th.getMessage());
            }
            C3868c.m9491a(C6542d.m13984a("ttlive_fast_gift_send"), 1, hashMap2);
            C3868c.m9491a(C6542d.m13985b("ttlive_fast_gift_send"), 1, hashMap2);
            C6499a.m13906a();
            C6499a.m13912a(EnumC6500b.Gift.info, "ttlive_fast_gift_send", hashMap);
            C6501b.C6502a.m13948a("ttlive_fast_gift_send").mo12652a((Map<String, String>) hashMap).mo12639a().mo12655b();
        }
        boolean z = th instanceof C2912a;
        if (z) {
            message = String.valueOf(((C2908a) th).getErrorCode());
        } else {
            message = th.getMessage();
        }
        C10715e.m19280a(message, dVar.f25768j, dVar.f25777s);
        if (z) {
            message2 = String.valueOf(((C2908a) th).getErrorCode());
        } else {
            message2 = th.getMessage();
        }
        C10715e.m19281a(message2, th.getMessage(), dVar.f25768j, dVar.f25777s);
        agVar.f27480b = false;
        agVar.mo18308b();
        agVar.f27483e.mo18285a((Exception) th, dVar);
        C10752a.m19344a(dVar.f25760b, room.getId(), th);
        C10752a.m19347a(th);
        String aVar2 = dVar.f25759a.toString();
        if (z) {
            message3 = String.valueOf(((C2908a) th).getErrorCode());
        } else {
            message3 = th.getMessage();
        }
        C10747c.m19336a(null, aVar2, j, message3, th.getMessage());
    }
}
