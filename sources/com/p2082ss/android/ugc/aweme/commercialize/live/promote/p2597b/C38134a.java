package com.p2082ss.android.ugc.aweme.commercialize.live.promote.p2597b;

import android.content.Context;
import android.content.res.Resources;
import com.bytedance.android.live.slot.AbstractC6155a;
import com.bytedance.android.live.slot.AbstractC6157ab;
import com.bytedance.android.live.slot.IFrameSlot;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.android.livesdkapi.depend.p683e.AbstractC11664a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.commercialize.live.promote.api.PromoteEntryCheckApi;
import com.p2082ss.android.ugc.aweme.commercialize.live.promote.p2598c.C38140a;
import com.p2082ss.android.ugc.aweme.commercialize.util.C38583c;
import com.p2082ss.android.ugc.aweme.commercialize.util.p2620b.C38582a;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.live.promote.b.a */
public final class C38134a extends AbstractC6155a {

    /* renamed from: a */
    public static final C38135a f90099a = new C38135a((byte) 0);

    static {
        Covode.recordClassIndex(45605);
    }

    @Override // com.bytedance.android.live.slot.AbstractC6191y
    /* renamed from: a */
    public final AbstractC6157ab<IFrameSlot, IFrameSlot.SlotViewModel, IFrameSlot.EnumC6146b> mo12097a(Context context, IFrameSlot.EnumC6146b bVar) {
        C89219l.m154721d(context, "");
        return null;
    }

    @Override // com.bytedance.android.live.slot.AbstractC6191y
    /* renamed from: a */
    public final AbstractC6157ab<IIconSlot, IIconSlot.SlotViewModel, IIconSlot.EnumC6149b> mo12098a(Context context, IIconSlot.EnumC6149b bVar) {
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
        return "PromoteLiveBroadcastSlotProvider";
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.live.promote.b.a$a */
    public static final class C38135a {
        static {
            Covode.recordClassIndex(45606);
        }

        private C38135a() {
        }

        public /* synthetic */ C38135a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.live.promote.b.a$b */
    public static final class C38136b extends AbstractC11664a {
        static {
            Covode.recordClassIndex(45607);
        }

        @Override // com.bytedance.android.livesdkapi.depend.p683e.AbstractC11664a
        /* renamed from: a */
        public final int mo17678a() {
            return 2131232638;
        }

        @Override // com.bytedance.android.livesdkapi.depend.p683e.AbstractC11664a
        /* renamed from: b */
        public final String mo17680b() {
            return "promote_button";
        }

        @Override // com.bytedance.android.livesdkapi.depend.p683e.AbstractC11664a
        /* renamed from: c */
        public final int mo17681c() {
            return R.string.ex6;
        }

        @Override // com.bytedance.android.livesdkapi.depend.p683e.AbstractC11664a
        /* renamed from: d */
        public final int mo17682d() {
            return 21;
        }

        C38136b() {
        }

        /* renamed from: com.ss.android.ugc.aweme.commercialize.live.promote.b.a$b$b */
        static final class C38138b<T> implements AbstractC88433f {

            /* renamed from: a */
            final /* synthetic */ Context f90102a;

            static {
                Covode.recordClassIndex(45609);
            }

            C38138b(Context context) {
                this.f90102a = context;
            }

            @Override // p4560f.p4561a.p4567d.AbstractC88433f
            public final /* synthetic */ void accept(Object obj) {
                String str;
                Resources resources;
                Context context = this.f90102a;
                if (context == null || (resources = context.getResources()) == null) {
                    str = null;
                } else {
                    str = resources.getString(R.string.dck);
                }
                C11226ao.m19884a(str);
            }
        }

        @Override // com.bytedance.android.livesdkapi.depend.p683e.AbstractC11664a
        /* renamed from: a */
        public final void mo17679a(Context context) {
            if (context != null) {
                C38140a.m77275a(context);
            }
            ((PromoteEntryCheckApi) C38582a.m78287a(PromoteEntryCheckApi.class, C38583c.f91178a)).getPromoteEntryCheck("", "during_live").mo143254a(new C38137a("during_live", context), new C38138b(context));
            C39162r.m79460a("Promote_live_entrance_click", new C33744d().mo59983a("user_id", C38140a.m77274a()).mo59980a("promote_version", C38140a.m77276b()).mo59980a("user_account_type", C38140a.m77277c()).mo59983a("entrance_type", "live_share").f79943a);
        }

        /* renamed from: com.ss.android.ugc.aweme.commercialize.live.promote.b.a$b$a */
        static final class C38137a<T> implements AbstractC88433f {

            /* renamed from: a */
            final /* synthetic */ String f90100a;

            /* renamed from: b */
            final /* synthetic */ Context f90101b;

            static {
                Covode.recordClassIndex(45608);
            }

            C38137a(String str, Context context) {
                this.f90100a = str;
                this.f90101b = context;
            }

            /* JADX WARNING: Removed duplicated region for block: B:28:0x009c  */
            /* JADX WARNING: Removed duplicated region for block: B:31:0x00ae  */
            /* JADX WARNING: Removed duplicated region for block: B:48:0x00b9 A[EDGE_INSN: B:48:0x00b9->B:36:0x00b9 ?: BREAK  , SYNTHETIC] */
            @Override // p4560f.p4561a.p4567d.AbstractC88433f
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final /* synthetic */ void accept(java.lang.Object r10) {
                /*
                // Method dump skipped, instructions count: 231
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.commercialize.live.promote.p2597b.C38134a.C38136b.C38137a.accept(java.lang.Object):void");
            }
        }
    }

    @Override // com.bytedance.android.live.slot.AbstractC6191y
    /* renamed from: a */
    public final List<IIconSlot.EnumC6149b> mo12099a() {
        return C89070n.m154524c(IIconSlot.EnumC6149b.SLOT_BROADCAST_SHARE);
    }

    @Override // com.bytedance.android.live.slot.AbstractC6155a
    /* renamed from: a */
    public final Map<String, Object> mo12068a(Map<String, ? extends Object> map, IIconSlot.EnumC6149b bVar) {
        C89219l.m154721d(map, "");
        C89219l.m154721d(bVar, "");
        HashMap hashMap = new HashMap();
        if (C38139b.f90103a[bVar.ordinal()] == 1) {
            Object obj = map.get("param_broadcast_room_auth_promote_bool");
            if (!(obj instanceof Boolean)) {
                obj = null;
            }
            if (!(!C89219l.m154714a(obj, (Object) true))) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new C38136b());
                hashMap.put("param_live_broadcast_share_sheet_list", arrayList);
                C39162r.m79460a("Promote_live_entrance_show", new C33744d().mo59983a("user_id", C38140a.m77274a()).mo59980a("promote_version", C38140a.m77276b()).mo59980a("user_account_type", C38140a.m77277c()).mo59983a("entrance_type", "live_share").f79943a);
            }
        }
        return hashMap;
    }
}
