package com.p2082ss.android.ugc.aweme.ecommercelive.business.common.p2870c;

import android.content.Context;
import com.bytedance.android.live.slot.AbstractC6157ab;
import com.bytedance.android.live.slot.AbstractC6191y;
import com.bytedance.android.live.slot.IFrameSlot;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.ecommercelive.business.audience.p2866a.C45684b;
import com.p2082ss.android.ugc.aweme.ecommercelive.business.audience.slot.C45711b;
import com.p2082ss.android.ugc.aweme.ecommercelive.business.audience.slot.popcard.C45736i;
import java.util.List;
import p4600h.C89376n;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommercelive.business.common.c.a */
public final class C45796a implements AbstractC6191y {

    /* renamed from: a */
    public static final C45797a f106698a = new C45797a((byte) 0);

    static {
        Covode.recordClassIndex(54314);
    }

    @Override // com.bytedance.android.live.slot.AbstractC6191y
    /* renamed from: c */
    public final String mo12101c() {
        return "ecommerce_shop";
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommercelive.business.common.c.a$a */
    public static final class C45797a {
        static {
            Covode.recordClassIndex(54315);
        }

        private C45797a() {
        }

        public /* synthetic */ C45797a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.android.live.slot.AbstractC6191y
    /* renamed from: a */
    public final List<IIconSlot.EnumC6149b> mo12099a() {
        return C89070n.m154524c(IIconSlot.EnumC6149b.SLOT_LIVE_WATCHER_TOOLBAR);
    }

    @Override // com.bytedance.android.live.slot.AbstractC6191y
    /* renamed from: b */
    public final List<IFrameSlot.EnumC6146b> mo12100b() {
        String a = C45684b.m88193a();
        int hashCode = a.hashCode();
        if (hashCode != -1033381948) {
            if (hashCode == 46430734 && a.equals("style_right")) {
                return C89070n.m154524c(IFrameSlot.EnumC6146b.SLOT_LIVE_WATCHER_L3_POP);
            }
        } else if (a.equals("style_transparent")) {
            return C89070n.m154524c(IFrameSlot.EnumC6146b.SLOT_LIVE_WATCHER_L2_POP);
        }
        return C89070n.m154524c(IFrameSlot.EnumC6146b.SLOT_LIVE_BOTTOM_POP);
    }

    @Override // com.bytedance.android.live.slot.AbstractC6191y
    /* renamed from: a */
    public final AbstractC6157ab<IIconSlot, IIconSlot.SlotViewModel, IIconSlot.EnumC6149b> mo12098a(Context context, IIconSlot.EnumC6149b bVar) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(bVar, "");
        if (C45798b.f106700b[bVar.ordinal()] != 1) {
            return null;
        }
        return new C45711b(context);
    }

    @Override // com.bytedance.android.live.slot.AbstractC6191y
    /* renamed from: a */
    public final AbstractC6157ab<IFrameSlot, IFrameSlot.SlotViewModel, IFrameSlot.EnumC6146b> mo12097a(Context context, IFrameSlot.EnumC6146b bVar) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(bVar, "");
        int i = C45798b.f106699a[bVar.ordinal()];
        if (i == 1) {
            return new C45736i(context);
        }
        if (i == 2) {
            return new C45736i(context);
        }
        if (i == 3) {
            return new C45736i(context);
        }
        throw new C89376n();
    }
}
