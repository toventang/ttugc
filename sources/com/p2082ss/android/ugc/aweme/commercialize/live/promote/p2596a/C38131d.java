package com.p2082ss.android.ugc.aweme.commercialize.live.promote.p2596a;

import android.content.Context;
import com.bytedance.android.live.slot.AbstractC6157ab;
import com.bytedance.android.live.slot.AbstractC6191y;
import com.bytedance.android.live.slot.IFrameSlot;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.covode.number.Covode;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.live.promote.a.d */
public final class C38131d implements AbstractC6191y {

    /* renamed from: a */
    public static final C38132a f90096a = new C38132a((byte) 0);

    static {
        Covode.recordClassIndex(45601);
    }

    @Override // com.bytedance.android.live.slot.AbstractC6191y
    /* renamed from: a */
    public final AbstractC6157ab<IFrameSlot, IFrameSlot.SlotViewModel, IFrameSlot.EnumC6146b> mo12097a(Context context, IFrameSlot.EnumC6146b bVar) {
        C89219l.m154721d(context, "");
        return null;
    }

    @Override // com.bytedance.android.live.slot.AbstractC6191y
    /* renamed from: b */
    public final List<IFrameSlot.EnumC6146b> mo12100b() {
        return null;
    }

    @Override // com.bytedance.android.live.slot.AbstractC6191y
    /* renamed from: c */
    public final String mo12101c() {
        return "PromoteLiveSlotProvider";
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.live.promote.a.d$a */
    public static final class C38132a {
        static {
            Covode.recordClassIndex(45602);
        }

        private C38132a() {
        }

        public /* synthetic */ C38132a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.android.live.slot.AbstractC6191y
    /* renamed from: a */
    public final List<IIconSlot.EnumC6149b> mo12099a() {
        return C89070n.m154524c(IIconSlot.EnumC6149b.SLOT_BROADCAST_PREVIEW_PROMOTE);
    }

    @Override // com.bytedance.android.live.slot.AbstractC6191y
    /* renamed from: a */
    public final AbstractC6157ab<IIconSlot, IIconSlot.SlotViewModel, IIconSlot.EnumC6149b> mo12098a(Context context, IIconSlot.EnumC6149b bVar) {
        C89219l.m154721d(context, "");
        return new C38126c(context);
    }
}
