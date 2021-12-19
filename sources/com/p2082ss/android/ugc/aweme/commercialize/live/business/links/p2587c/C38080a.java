package com.p2082ss.android.ugc.aweme.commercialize.live.business.links.p2587c;

import android.content.Context;
import com.bytedance.android.live.slot.AbstractC6157ab;
import com.bytedance.android.live.slot.AbstractC6191y;
import com.bytedance.android.live.slot.IFrameSlot;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.commercialize.live.business.links.p2577a.p2579b.C38061a;
import com.p2082ss.android.ugc.aweme.commercialize.live.business.links.p2580b.p2581a.p2583b.C38065a;
import com.p2082ss.android.ugc.aweme.commercialize.live.business.links.p2580b.p2584b.p2586b.C38074a;
import com.p2082ss.android.ugc.aweme.commercialize.live.business.links.p2587c.p2589b.C38085a;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.live.business.links.c.a */
public final class C38080a implements AbstractC6191y {

    /* renamed from: a */
    public static final C38081a f89977a = new C38081a((byte) 0);

    static {
        Covode.recordClassIndex(45547);
    }

    @Override // com.bytedance.android.live.slot.AbstractC6191y
    /* renamed from: c */
    public final String mo12101c() {
        return "commercialize_live_business_links";
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.live.business.links.c.a$a */
    public static final class C38081a {
        static {
            Covode.recordClassIndex(45548);
        }

        private C38081a() {
        }

        public /* synthetic */ C38081a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.android.live.slot.AbstractC6191y
    /* renamed from: b */
    public final List<IFrameSlot.EnumC6146b> mo12100b() {
        return C89070n.m154524c(IFrameSlot.EnumC6146b.SLOT_LIVE_BOTTOM_POP);
    }

    @Override // com.bytedance.android.live.slot.AbstractC6191y
    /* renamed from: a */
    public final List<IIconSlot.EnumC6149b> mo12099a() {
        return C89070n.m154524c(IIconSlot.EnumC6149b.SLOT_BROADCAST_PREVIEW_TOOLBAR, IIconSlot.EnumC6149b.SLOT_LIVE_ANCHOR_TOOLBAR, IIconSlot.EnumC6149b.SLOT_LIVE_WATCHER_TOOLBAR);
    }

    @Override // com.bytedance.android.live.slot.AbstractC6191y
    /* renamed from: a */
    public final AbstractC6157ab<IFrameSlot, IFrameSlot.SlotViewModel, IFrameSlot.EnumC6146b> mo12097a(Context context, IFrameSlot.EnumC6146b bVar) {
        C89219l.m154721d(context, "");
        if (bVar != null && C38084b.f89982a[bVar.ordinal()] == 1) {
            return new C38085a();
        }
        return null;
    }

    @Override // com.bytedance.android.live.slot.AbstractC6191y
    /* renamed from: a */
    public final AbstractC6157ab<IIconSlot, IIconSlot.SlotViewModel, IIconSlot.EnumC6149b> mo12098a(Context context, IIconSlot.EnumC6149b bVar) {
        C89219l.m154721d(context, "");
        if (bVar == null) {
            return null;
        }
        int i = C38084b.f89983b[bVar.ordinal()];
        if (i == 1) {
            return new C38065a();
        }
        if (i == 2) {
            return new C38074a();
        }
        if (i != 3) {
            return null;
        }
        return new C38061a();
    }
}
