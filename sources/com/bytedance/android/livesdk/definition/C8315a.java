package com.bytedance.android.livesdk.definition;

import com.bytedance.android.live.base.AbstractC2953a;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.p250i.p251a.AbstractC4357d;
import com.bytedance.android.live.p379n.AbstractC5777j;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p456as.AbstractC6872f;
import com.bytedance.android.livesdk.p561j.C9009ac;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.session.C11870f;
import com.bytedance.android.livesdkapi.session.EnterRoomLinkSession;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.definition.a */
public final class C8315a {
    static {
        Covode.recordClassIndex(9153);
    }

    /* renamed from: a */
    public static final void m16467a() {
        C6501b a = C6501b.C6502a.m13948a("livesdk_live_anchor_definition_selection_select_success");
        AbstractC6872f b = C11115u.m19743a().mo17915b();
        C89219l.m154716b(b, "");
        a.mo12646a("anchor_id", b.mo13161c()).mo12644a("screen_share").mo12655b();
    }

    /* renamed from: b */
    static final String m16470b() {
        Room room = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
        if (room == null || room.getOwner() == null) {
            return "";
        }
        User owner = room.getOwner();
        C89219l.m154716b(owner, "");
        return String.valueOf(owner.getId());
    }

    /* renamed from: a */
    public static final void m16468a(String str, String str2, String str3) {
        String g;
        String str4 = "";
        C89219l.m154721d(str, str4);
        C89219l.m154721d(str2, str4);
        C89219l.m154721d(str3, str4);
        C11870f fVar = C11870f.C11871a.f28404a;
        C89219l.m154716b(fVar, str4);
        EnterRoomLinkSession a = fVar.mo19010a();
        C89219l.m154716b(a, str4);
        String str5 = a.f28391b.f28233c.f28288E;
        if (str5 == null) {
            str5 = str4;
        }
        AbstractC2953a a2 = C6193a.m13435a(AbstractC4357d.class);
        C89219l.m154716b(a2, str4);
        AbstractC5777j b = ((AbstractC4357d) a2).getLivePlayControllerManager().mo11553b(str5);
        if (!(b == null || (g = b.mo11547g()) == null)) {
            str4 = g;
        }
        C6501b.C6502a.m13948a("livesdk_live_definition_selection_btn_show").mo12651a("anchor_id", m16470b()).mo12651a("room_id", str).mo12651a("room_orientation", str3).mo12651a("current_definition", str4).mo12644a(str2).mo12655b();
    }

    /* renamed from: a */
    public static final void m16469a(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(str4, "");
        C89219l.m154721d(str5, "");
        C89219l.m154721d(str6, "");
        C89219l.m154721d(str7, "");
        C6501b.C6502a.m13948a("livesdk_live_definition_selection_select_success").mo12651a("anchor_id", m16470b()).mo12651a("room_id", str).mo12651a("room_orientation", str3).mo12651a("current_definition", str7).mo12651a("duration", str4).mo12651a("previous_definition", str5).mo12651a("switch_type", str6).mo12644a(str2).mo12655b();
    }
}
