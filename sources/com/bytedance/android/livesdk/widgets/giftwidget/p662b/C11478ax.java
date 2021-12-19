package com.bytedance.android.livesdk.widgets.giftwidget.p662b;

import com.bytedance.android.livesdk.model.C9904t;
import com.bytedance.android.livesdk.model.message.C9691bw;
import com.bytedance.android.livesdk.model.message.p579c.C9698b;
import com.bytedance.android.livesdk.model.message.p579c.C9700d;
import com.bytedance.android.livesdk.service.assets.GiftManager;
import com.bytedance.android.livesdkapi.p692h.C11778b;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.Collection;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.widgets.giftwidget.b.ax */
public final class C11478ax {

    /* renamed from: a */
    public DataChannel f27540a;

    static {
        Covode.recordClassIndex(13137);
    }

    /* renamed from: a */
    public static void m20318a(C9691bw bwVar, long j) {
        C11778b bVar;
        C9698b bVar2;
        C9904t findGiftById = GiftManager.inst().findGiftById(j);
        if (!(findGiftById == null || bwVar == null || (bVar = bwVar.f28134O) == null || (bVar2 = bVar.f28144j) == null || C13603b.m24435a((Collection) bVar2.f23648d))) {
            for (C9700d dVar : bVar2.f23648d) {
                C89219l.m154716b(dVar, "");
                if (dVar.f23661e != null) {
                    dVar.f23661e.f23668d = findGiftById;
                    return;
                }
            }
        }
    }
}
