package com.bytedance.android.livesdk.widgets.giftwidget.p662b;

import android.os.SystemClock;
import androidx.fragment.app.AbstractC0952i;
import com.C1764a;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p214d.C3868c;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.android.livesdk.gift.model.C8810a;
import com.bytedance.android.livesdk.gift.model.C8859w;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p425aa.p426a.C6499a;
import com.bytedance.android.livesdk.p425aa.p426a.EnumC6500b;
import com.bytedance.android.livesdk.p425aa.p429d.C6542d;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdk.p561j.C9009ac;
import com.bytedance.android.livesdk.p561j.C9021ao;
import com.bytedance.android.livesdk.p640t.C10890a;
import com.bytedance.android.livesdk.p668y.p669a.C11591a;
import com.bytedance.android.livesdk.p668y.p670b.C11598c;
import com.bytedance.android.livesdk.p668y.p671c.C11599a;
import com.bytedance.android.livesdk.service.p624b.C10700d;
import com.bytedance.android.livesdk.service.p625c.p626a.C10715e;
import com.bytedance.android.livesdk.service.p625c.p631f.C10743a;
import com.bytedance.android.livesdk.service.p625c.p631f.C10747c;
import com.bytedance.android.livesdk.service.p625c.p631f.C10748d;
import com.bytedance.android.livesdk.service.p625c.p632g.C10752a;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdk.utils.C11199a;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.android.livesdk.wishlist.C11517b;
import com.bytedance.android.livesdk.wishlist.C11539c;
import com.bytedance.android.livesdkapi.depend.model.live.C11729j;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.widgets.giftwidget.b.al */
final /* synthetic */ class C11466al implements AbstractC88433f {

    /* renamed from: a */
    private final C11455ag f27513a;

    /* renamed from: b */
    private final C10700d f27514b;

    /* renamed from: c */
    private final Room f27515c;

    /* renamed from: d */
    private final long f27516d;

    /* renamed from: e */
    private final long f27517e;

    static {
        Covode.recordClassIndex(13125);
    }

    C11466al(C11455ag agVar, C10700d dVar, Room room, long j, long j2) {
        this.f27513a = agVar;
        this.f27514b = dVar;
        this.f27515c = room;
        this.f27516d = j;
        this.f27517e = j2;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        AbstractC0952i iVar;
        String concat;
        C11455ag agVar = this.f27513a;
        C10700d dVar = this.f27514b;
        Room room = this.f27515c;
        long j = this.f27516d;
        long j2 = this.f27517e;
        C5832d dVar2 = (C5832d) obj;
        if (dVar2.data != null) {
            if (agVar.f27481c != null) {
                iVar = (AbstractC0952i) agVar.f27481c.mo28318b(C9021ao.class);
                agVar.f27481c.mo28320c(C11517b.class, new C11539c(dVar.f25760b, dVar.f25765g));
            } else {
                iVar = null;
            }
            C8810a aVar = ((C8859w) dVar2.data).f21780a;
            if (aVar == null || aVar.f21690a <= 0) {
                if (dVar.f25776r) {
                    long j3 = dVar.f25760b;
                    HashMap hashMap = new HashMap();
                    Room room2 = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
                    User user = (User) C11115u.m19743a().mo17915b().mo13147a();
                    hashMap.put("user_id", Long.valueOf(user.getId()));
                    hashMap.put("gift_id", Long.valueOf(j3));
                    if (room2 != null) {
                        hashMap.put("anchor_id", Long.valueOf(room2.getOwnerUserId()));
                        hashMap.put("room_id", Long.valueOf(room2.getId()));
                    }
                    C3868c.m9491a(C6542d.m13984a("ttlive_fast_gift_send"), 1, hashMap);
                    C6499a.m13906a();
                    C6499a.m13912a(EnumC6500b.Gift.info, "ttlive_fast_gift_send", hashMap);
                    C6501b.C6502a.m13948a("ttlive_fast_gift_send").mo12646a("user_id", user.getId()).mo12646a("gift_id", j3).mo12639a().mo12655b();
                }
                agVar.f27480b = false;
                boolean z = (dVar.f25767i == null || room.getOwner() == null) ? true : dVar.f25767i.getId() == room.getOwner().getId();
                agVar.mo18303a((C8859w) dVar2.data);
                if (dVar.f25775q) {
                    C6501b.C6502a.m13948a("send_announcements").mo12639a().mo12650a("gift_id", (Number) Long.valueOf(dVar.f25760b)).mo12651a("reason", "gift").mo12651a("scene", C10890a.m19496b().getDesc()).mo12655b();
                }
                C10747c.m19336a(((C8859w) dVar2.data).f21800u, dVar.f25759a.toString(), j, "0", "Success");
                agVar.mo18307a(dVar, ((C8859w) dVar2.data).f21795p);
                C10752a.m19343a(dVar.f25760b, SystemClock.uptimeMillis() - j2, dVar.f25768j, C11729j.m20684a(room.getStreamType()));
                int i = dVar.f25764f;
                long j4 = dVar.f25760b;
                int i2 = ((C8859w) dVar2.data).f21789j;
                String str = dVar.f25768j;
                boolean z2 = dVar.f25769k;
                boolean z3 = dVar.f25776r;
                String str2 = dVar.f25777s;
                int i3 = dVar.f25771m;
                String str3 = dVar.f25770l;
                String str4 = ((C8859w) dVar2.data).f21798s;
                String str5 = dVar.f25774p;
                String str6 = dVar.f25773o;
                int i4 = dVar.f25761c;
                long j5 = dVar.f25763e;
                C89219l.m154721d(str3, "");
                C89219l.m154721d(str4, "");
                C10743a aVar2 = C10743a.C10745b.f25889a;
                C10748d.C10750b bVar = new C10748d.C10750b(i, j4, z2, str, str2, i3, str3, str5, str6, z, i4, j5);
                if (!aVar2.f25887g || j4 != aVar2.f25886f) {
                    if (aVar2.f25887g) {
                        aVar2.f25884d.removeCallbacks(aVar2.f25888h);
                        aVar2.mo17665a();
                    }
                    aVar2.f25881a = bVar;
                    aVar2.f25885e = 1;
                    aVar2.f25887g = true;
                    aVar2.f25884d.postDelayed(aVar2.f25888h, 3000);
                    if (j4 != aVar2.f25886f) {
                        aVar2.f25886f = j4;
                    }
                    aVar2.f25882b = z3;
                    aVar2.f25883c = str4;
                } else {
                    if (i2 == 1) {
                        aVar2.f25885e++;
                    } else {
                        aVar2.f25885e = i2;
                    }
                    aVar2.f25883c += "," + str4;
                    aVar2.f25884d.removeCallbacks(aVar2.f25888h);
                    aVar2.f25884d.postDelayed(aVar2.f25888h, 3000);
                }
                C10752a.m19347a((Throwable) null);
                if (C11199a.m19850a(agVar.f27481c)) {
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("anchor_id", String.valueOf(room.getOwner().getId()));
                    hashMap2.put("room_id", String.valueOf(room.getId()));
                    C11199a.m19849a("live_ad", "live_gift", null, hashMap2);
                    return;
                }
                return;
            }
            agVar.mo18308b();
            C10715e.m19280a("4017038", dVar.f25768j, dVar.f25777s);
            C10715e.m19281a("4017038", "limited", dVar.f25768j, dVar.f25777s);
            if (aVar.f21693d != 1 || iVar == null) {
                int i5 = aVar.f21690a / 60;
                int i6 = aVar.f21690a % 60;
                if (i5 >= 10) {
                    concat = String.valueOf(i5);
                } else {
                    concat = "0".concat(String.valueOf(i5));
                }
                String a = C3966y.m9655a().getString(R.string.dy0) != null ? C1764a.m5928a(C3966y.m9655a().getString(R.string.dy0), new Object[]{concat + ":" + (i6 >= 10 ? String.valueOf(i6) : "0".concat(String.valueOf(i6)))}) : null;
                if (!dVar.f25776r) {
                    C6779a.m14563a().mo13053a(new C11598c());
                    C11599a.C11601a.f27757a.f27753b = (long) (aVar.f21690a * 1000);
                    C11599a.C11601a.f27757a.mo18397a();
                    C11599a.C11601a.f27757a.f27752a = true;
                }
                C11226ao.m19884a(a);
                return;
            }
            C11599a.C11601a.f27757a.f27753b = (long) (aVar.f21690a * 1000);
            long j6 = aVar.f21692c;
            C11591a aVar3 = new C11591a();
            aVar3.f27744c = j6;
            aVar3.f27745d = aVar.f21691b / 60;
            aVar3.show(iVar, "GiftLimitDialog");
            C6501b.C6502a.m13948a("livesdk_consume_limit_prompt_popup_show").mo12639a().mo12646a("limit_prompt_money", aVar.f21692c).mo12655b();
        }
    }
}
