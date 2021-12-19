package com.p2082ss.android.ugc.aweme.influencer.ecommercelive.business.common.p3284c;

import android.content.Context;
import com.bytedance.android.live.slot.AbstractC6157ab;
import com.bytedance.android.live.slot.AbstractC6191y;
import com.bytedance.android.live.slot.IFrameSlot;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.influencer.ecommercelive.business.p3274a.p3275a.p3276a.p3277a.p3279b.C56618b;
import com.p2082ss.android.ugc.aweme.influencer.ecommercelive.business.p3274a.p3280b.p3281a.C56627b;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.influencer.ecommercelive.business.common.c.a */
public final class C56641a implements AbstractC6191y {

    /* renamed from: a */
    public static final C56642a f129097a = new C56642a((byte) 0);

    static {
        Covode.recordClassIndex(66486);
    }

    @Override // com.bytedance.android.live.slot.AbstractC6191y
    /* renamed from: a */
    public final AbstractC6157ab<IFrameSlot, IFrameSlot.SlotViewModel, IFrameSlot.EnumC6146b> mo12097a(Context context, IFrameSlot.EnumC6146b bVar) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(bVar, "");
        return null;
    }

    @Override // com.bytedance.android.live.slot.AbstractC6191y
    /* renamed from: c */
    public final String mo12101c() {
        return "ecommerce_shop_influencer";
    }

    /* renamed from: com.ss.android.ugc.aweme.influencer.ecommercelive.business.common.c.a$a */
    public static final class C56642a {
        static {
            Covode.recordClassIndex(66487);
        }

        private C56642a() {
        }

        public /* synthetic */ C56642a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.android.live.slot.AbstractC6191y
    /* renamed from: b */
    public final List<IFrameSlot.EnumC6146b> mo12100b() {
        return new ArrayList();
    }

    @Override // com.bytedance.android.live.slot.AbstractC6191y
    /* renamed from: a */
    public final List<IIconSlot.EnumC6149b> mo12099a() {
        return C89070n.m154524c(IIconSlot.EnumC6149b.SLOT_BROADCAST_PREVIEW_TOOLBAR, IIconSlot.EnumC6149b.SLOT_LIVE_ANCHOR_TOOLBAR);
    }

    @Override // com.bytedance.android.live.slot.AbstractC6191y
    /* renamed from: a */
    public final AbstractC6157ab<IIconSlot, IIconSlot.SlotViewModel, IIconSlot.EnumC6149b> mo12098a(Context context, IIconSlot.EnumC6149b bVar) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(bVar, "");
        int i = C56643b.f129098a[bVar.ordinal()];
        if (i == 1) {
            return new C56618b(context);
        }
        if (i != 2) {
            return null;
        }
        return new C56627b(context);
    }
}
