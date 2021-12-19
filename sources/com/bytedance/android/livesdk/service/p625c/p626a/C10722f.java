package com.bytedance.android.livesdk.service.p625c.p626a;

import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p456as.AbstractC6872f;
import com.bytedance.android.livesdk.p561j.C9009ac;
import com.bytedance.android.livesdk.p640t.C10890a;
import com.bytedance.android.livesdk.service.p621a.C10639c;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.service.c.a.f */
public final class C10722f {

    /* renamed from: a */
    public static final C10722f f25830a = new C10722f();

    private C10722f() {
    }

    static {
        Covode.recordClassIndex(12319);
    }

    /* renamed from: a */
    private static boolean m19300a() {
        Room room = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
        if (room == null) {
            return false;
        }
        long ownerUserId = room.getOwnerUserId();
        AbstractC6872f b = C11115u.m19743a().mo17915b();
        C89219l.m154716b(b, "");
        if (ownerUserId == b.mo13161c()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static final void m19298a(long j) {
        C6501b.C6502a.m13948a("livesdk_gift_panel_load_duration").mo12639a().mo12654b("live").mo12656c("click").mo12658d("live_detail").mo12651a("duration", String.valueOf(j)).mo12655b();
    }

    /* renamed from: a */
    public static final void m19299a(String str, boolean z, String str2, String str3) {
        String str4;
        String str5;
        C6501b a = C6501b.C6502a.m13948a("gift_panel_show").mo12639a();
        if (str == null) {
            str = "icon";
        }
        C6501b a2 = a.mo12651a("gift_enter_from", str).mo12651a("send_gift_scene", C10890a.m19496b().getDesc());
        if (z) {
            str4 = "portrait";
        } else {
            str4 = "landscape";
        }
        C6501b a3 = a2.mo12651a("room_orientation", str4).mo12651a("hashtag_type", str2).mo12651a("hashtag_id", str3);
        if (m19300a()) {
            str5 = "1";
        } else {
            str5 = "0";
        }
        a3.mo12651a("is_anchor", str5).mo12651a("gift_dialog_request_id", C10639c.f25641a).mo12655b();
    }
}
