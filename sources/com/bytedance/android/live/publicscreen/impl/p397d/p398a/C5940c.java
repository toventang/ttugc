package com.bytedance.android.live.publicscreen.impl.p397d.p398a;

import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.live.publicscreen.impl.p400f.C5967b;
import com.bytedance.android.live.publicscreen.p386a.AbstractC5859b;
import com.bytedance.android.live.publicscreen.p386a.C5889g;
import com.bytedance.android.livesdk.livesetting.gift.SuppressGiftTextMessagesSetting;
import com.bytedance.android.livesdk.model.C9904t;
import com.bytedance.android.livesdk.model.message.C9895y;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.publicscreen.impl.d.a.c */
public final class C5940c implements AbstractC5859b<C9895y> {
    static {
        Covode.recordClassIndex(6548);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.ss.ugc.live.sdk.message.data.IMessage, com.bytedance.android.live.publicscreen.a.g] */
    @Override // com.bytedance.android.live.publicscreen.p386a.AbstractC5859b
    /* renamed from: a */
    public final /* synthetic */ boolean mo10373a(C9895y yVar, C5889g gVar) {
        Room room;
        C9895y yVar2 = yVar;
        C89219l.m154721d(yVar2, "");
        C89219l.m154721d(gVar, "");
        C9904t findGiftById = ((IGiftService) C6193a.m13435a(IGiftService.class)).findGiftById(yVar2.f23934i);
        if (findGiftById != null) {
            if (findGiftById.f24002g && yVar2.f23938m == 0) {
                C5967b.m13084a(yVar2, "GiftMessage discarded because it's not the end message for the repeated gifts.");
                return true;
            } else if (findGiftById.f24000e == 11) {
                C5967b.m13084a(yVar2, "GiftMessage discarded because it's type is game.");
                return true;
            }
        }
        if (!SuppressGiftTextMessagesSetting.INSTANCE.getValue() || (room = gVar.f14753j) == null || room.giftMessageStyle != 1) {
            return false;
        }
        return true;
    }
}
