package com.bytedance.android.livesdk.chatroom.p481b;

import android.util.Base64;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.live.base.model.user.AbstractC2994b;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.network.C5809h;
import com.bytedance.android.livesdk.chatroom.model.Barrage;
import com.bytedance.android.livesdk.model.message.C9605ai;
import com.bytedance.android.livesdk.model.message.C9690bv;
import com.bytedance.android.livesdk.model.message.C9717ca;
import com.bytedance.android.livesdk.model.message.C9719cc;
import com.bytedance.android.livesdk.model.message.C9883n;
import com.bytedance.android.livesdk.model.message.C9889s;
import com.bytedance.android.livesdk.model.message.p579c.C9698b;
import com.bytedance.android.livesdkapi.p692h.C11778b;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2726d;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.covode.number.Covode;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.chatroom.b.b */
public final class C7302b {
    static {
        Covode.recordClassIndex(8065);
    }

    /* renamed from: a */
    public static C9717ca m15205a(Barrage barrage) {
        try {
            AbstractC2724b a = C5809h.m12739a().mo11582a(C9717ca.class);
            if (a == null) {
                return null;
            }
            return (C9717ca) a.mo7304a(new C2730f().mo7308a(C2726d.m7876a(Base64.decode(barrage.getScreenChatMsg(), 0))));
        } catch (Exception e) {
            C3854a.m9453a(6, "ttlive_msg", e.toString());
            return null;
        }
    }

    /* renamed from: a */
    public static C9883n m15207a(long j) {
        C9883n nVar = new C9883n();
        C11778b bVar = new C11778b();
        bVar.f28137c = j;
        bVar.f28138d = -1;
        bVar.f28141g = true;
        nVar.f28134O = bVar;
        nVar.f23882a = 1;
        return nVar;
    }

    /* renamed from: a */
    public static C9605ai m15203a(long j, User user) {
        C11778b bVar = new C11778b();
        bVar.f28137c = j;
        bVar.f28141g = true;
        C9605ai aiVar = new C9605ai(true, user);
        aiVar.f28134O = bVar;
        return aiVar;
    }

    /* renamed from: a */
    public static C9690bv m15204a(long j, String str) {
        C9690bv bvVar = new C9690bv();
        C11778b bVar = new C11778b();
        bVar.f28137c = j;
        bVar.f28141g = true;
        bvVar.f28134O = bVar;
        bvVar.f23599a = str;
        return bvVar;
    }

    /* renamed from: a */
    public static C9719cc m15206a(long j, C9698b bVar, User user) {
        if (bVar == null) {
            return null;
        }
        C11778b bVar2 = new C11778b();
        bVar2.f28137c = j;
        bVar2.f28141g = true;
        bVar2.f28144j = bVar;
        C9719cc ccVar = new C9719cc();
        ccVar.f28134O = bVar2;
        ccVar.f23688f = user;
        return ccVar;
    }

    /* renamed from: a */
    public static C9889s m15208a(long j, List<EmoteModel> list, long j2, AbstractC2994b bVar, User user) {
        C9889s sVar = new C9889s();
        sVar.f23913a = list;
        C11778b bVar2 = new C11778b();
        bVar2.f28137c = j;
        bVar2.f28138d = j2;
        bVar2.f28141g = true;
        sVar.f28134O = bVar2;
        if (user != null) {
            sVar.f23914f = user;
        } else {
            sVar.f23914f = User.from(bVar);
        }
        return sVar;
    }
}
