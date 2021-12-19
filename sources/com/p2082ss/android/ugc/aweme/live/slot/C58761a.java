package com.p2082ss.android.ugc.aweme.live.slot;

import android.content.Context;
import com.bytedance.android.live.slot.AbstractC6187u;
import com.bytedance.android.live.slot.AbstractC6190x;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.covode.number.Covode;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.live.slot.a */
public final class C58761a implements AbstractC6190x {
    static {
        Covode.recordClassIndex(69069);
    }

    @Override // com.bytedance.android.live.slot.AbstractC6190x
    /* renamed from: b */
    public final String mo12096b() {
        return "aggregate_live_business";
    }

    @Override // com.bytedance.android.live.slot.AbstractC6190x
    /* renamed from: a */
    public final List<IIconSlot.EnumC6149b> mo12095a() {
        return C89070n.m154524c(IIconSlot.EnumC6149b.SLOT_BROADCAST_PREVIEW_TOOLBAR, IIconSlot.EnumC6149b.SLOT_LIVE_ANCHOR_TOOLBAR);
    }

    @Override // com.bytedance.android.live.slot.AbstractC6190x
    /* renamed from: a */
    public final AbstractC6187u<IIconSlot, IIconSlot.SlotViewModel, IIconSlot.EnumC6149b> mo12094a(Context context, IIconSlot.EnumC6149b bVar) {
        C89219l.m154721d(context, "");
        if (bVar == null) {
            return null;
        }
        int i = C58762b.f133729a[bVar.ordinal()];
        if (i == 1) {
            return new C58763c(IIconSlot.EnumC6149b.SLOT_BROADCAST_PREVIEW_TOOLBAR);
        }
        if (i != 2) {
            return null;
        }
        return new C58763c(IIconSlot.EnumC6149b.SLOT_LIVE_ANCHOR_TOOLBAR);
    }
}
