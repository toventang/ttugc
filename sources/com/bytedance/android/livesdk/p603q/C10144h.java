package com.bytedance.android.livesdk.p603q;

import com.bytedance.android.live.p385p.EnumC5847l;
import com.bytedance.android.livesdk.chatroom.p488c.C7388g;
import com.bytedance.android.livesdk.p561j.C9093de;
import com.bytedance.android.livesdk.service.assets.GiftManager;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.bytedance.android.livesdk.q.h */
final /* synthetic */ class C10144h implements AbstractC88433f {

    /* renamed from: a */
    private final C10142g f24604a;

    static {
        Covode.recordClassIndex(11707);
    }

    C10144h(C10142g gVar) {
        this.f24604a = gVar;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        C7388g gVar;
        C10142g gVar2 = this.f24604a;
        if ((obj instanceof C7388g) && (gVar = (C7388g) obj) != null && gVar2.f24600a != null && gVar2.f24600a.mo28318b(C9093de.class) != null && gVar.f18311b == ((Room) gVar2.f24600a.mo28318b(C9093de.class)).getId()) {
            gVar2.f24601b = GiftManager.inst().findGiftById(gVar.f18310a);
            if (gVar2.f24601b == null || gVar.f18310a <= 0) {
                EnumC5847l.DUMMY_FAST_GIFT.hide(gVar2.f24600a);
            } else {
                EnumC5847l.DUMMY_FAST_GIFT.show(gVar2.f24600a);
            }
            if (gVar2.f24603d != null) {
                gVar2.f24603d.mo16986a(gVar2.f24601b);
            }
            GiftManager.inst().clearFastGift(gVar.f18311b);
        }
    }
}
