package com.bytedance.android.livesdk.widgets.giftwidget.p662b;

import android.os.SystemClock;
import com.bytedance.android.live.core.p214d.C3868c;
import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.android.livesdk.chatroom.C7411d;
import com.bytedance.android.livesdk.gift.model.C8859w;
import com.bytedance.android.livesdk.gift.model.Prop;
import com.bytedance.android.livesdk.p425aa.p429d.C6542d;
import com.bytedance.android.livesdk.service.p624b.C10700d;
import com.bytedance.android.livesdk.service.p625c.p626a.C10715e;
import com.bytedance.android.livesdk.service.p625c.p629d.C10738a;
import com.bytedance.android.livesdk.service.p625c.p632g.C10752a;
import com.bytedance.android.livesdkapi.depend.model.live.C11729j;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.bytedance.android.livesdk.widgets.giftwidget.b.ai */
final /* synthetic */ class C11463ai implements AbstractC88433f {

    /* renamed from: a */
    private final C11455ag f27504a;

    /* renamed from: b */
    private final Room f27505b;

    /* renamed from: c */
    private final long f27506c;

    /* renamed from: d */
    private final long f27507d;

    /* renamed from: e */
    private final C10700d f27508e;

    static {
        Covode.recordClassIndex(13122);
    }

    C11463ai(C11455ag agVar, Room room, long j, long j2, C10700d dVar) {
        this.f27504a = agVar;
        this.f27505b = room;
        this.f27506c = j;
        this.f27507d = j2;
        this.f27508e = dVar;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        C11455ag agVar = this.f27504a;
        Room room = this.f27505b;
        long j = this.f27506c;
        long j2 = this.f27507d;
        C10700d dVar = this.f27508e;
        C5832d dVar2 = (C5832d) obj;
        agVar.f27480b = false;
        C8859w wVar = (C8859w) dVar2.data;
        long j3 = dVar2.extra.now;
        long currentTimeMillis = System.currentTimeMillis();
        for (Prop prop : wVar.f21793n) {
            prop.setNowTimeDiff((j3 - currentTimeMillis) / 1000);
        }
        agVar.mo18303a(wVar);
        String a = C11729j.m20684a(room.getStreamType());
        long uptimeMillis = SystemClock.uptimeMillis() - j2;
        String str = dVar.f25768j;
        HashMap hashMap = new HashMap();
        hashMap.put("prop_id", Long.valueOf(j));
        C10752a.m19348a(hashMap);
        hashMap.put("event_module", "bottom_tab");
        if (C13627m.m24498a(str)) {
            str = "direct_gift_tab";
        }
        hashMap.put("gift_enter_from", str);
        hashMap.put("live_type", a);
        if (!C13627m.m24498a(C7411d.m15284a().mo13614e())) {
            hashMap.put("enter_live_method", C7411d.m15284a().mo13614e());
        }
        C3868c.m9489a(C6542d.m13984a("ttlive_gift_send_status"), 0, uptimeMillis, hashMap);
        C10738a aVar = C10738a.C10740b.f25878a;
        C10715e.C10721f fVar = new C10715e.C10721f(j);
        if (!aVar.f25876e || j != aVar.f25875d) {
            if (aVar.f25876e) {
                aVar.f25873b.removeCallbacks(aVar.f25877f);
                aVar.mo17663a();
            }
            aVar.f25872a = fVar;
            aVar.f25874c = 1;
            aVar.f25876e = true;
            aVar.f25873b.postDelayed(aVar.f25877f, 3000);
            if (j != aVar.f25875d) {
                aVar.f25875d = j;
                return;
            }
            return;
        }
        aVar.f25874c++;
        aVar.f25873b.removeCallbacks(aVar.f25877f);
        aVar.f25873b.postDelayed(aVar.f25877f, 3000);
    }
}
