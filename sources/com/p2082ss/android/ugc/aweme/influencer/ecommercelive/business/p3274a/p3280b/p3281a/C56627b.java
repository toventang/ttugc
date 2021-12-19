package com.p2082ss.android.ugc.aweme.influencer.ecommercelive.business.p3274a.p3280b.p3281a;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.core.content.C0643b;
import androidx.core.content.p032a.C0637f;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1213t;
import androidx.p063m.p064a.p065a.C1261i;
import com.bytedance.android.live.base.model.user.AbstractC2994b;
import com.bytedance.android.live.slot.AbstractC6157ab;
import com.bytedance.android.live.slot.AbstractC6171g;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.livesdk.p456as.AbstractC6872f;
import com.bytedance.android.livesdk.tunnel.EnumC10927a;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdkapi.depend.model.live.CommerceStruct;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.AbstractC18754n;
import com.bytedance.ies.xbridge.C18586i;
import com.bytedance.ies.xbridge.p1301e.AbstractC18511d;
import com.bytedance.ies.xbridge.p1301e.C18494b;
import com.bytedance.ies.xbridge.p1301e.C18502c;
import com.bytedance.router.SmartRouter;
import com.google.gson.C27910f;
import com.p2082ss.android.ugc.aweme.influencer.ecommercelive.business.common.p3282a.C56631a;
import com.p2082ss.android.ugc.aweme.influencer.ecommercelive.business.common.p3283b.AbstractC56636b;
import com.p2082ss.android.ugc.aweme.influencer.ecommercelive.business.common.p3283b.C56635a;
import com.p2082ss.android.ugc.aweme.influencer.ecommercelive.business.common.p3283b.C56638d;
import com.p2082ss.android.ugc.aweme.influencer.ecommercelive.business.common.p3284c.C56644c;
import com.p2082ss.android.ugc.aweme.influencer.ecommercelive.framework.p3285a.C56645a;
import com.p2082ss.android.ugc.aweme.influencer.ecommercelive.framework.p3286b.p3287a.C56649a;
import com.p2082ss.android.ugc.aweme.influencer.ecommercelive.framework.p3286b.p3288b.C56651b;
import com.p2082ss.android.ugc.aweme.influencer.ecommercelive.framework.settings.C56654a;
import com.p2082ss.android.ugc.aweme.live.ILiveOuterService;
import com.p2082ss.android.ugc.aweme.live.LiveOuterService;
import com.p2082ss.android.ugc.trill.R;
import com.p2082ss.ugc.live.sdk.message.data.IMessage;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.AbstractC89516am;
import kotlinx.coroutines.AbstractC89568bz;
import kotlinx.coroutines.C89517an;
import kotlinx.coroutines.C89536ay;
import kotlinx.coroutines.C89624i;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.p4604a.EnumC89098a;
import p4600h.p4603c.p4605b.p4606a.AbstractC89118k;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.influencer.ecommercelive.business.a.b.a.b */
public final class C56627b extends AbstractC56636b<IIconSlot, IIconSlot.SlotViewModel, IIconSlot.EnumC6149b> implements AbstractC18511d {

    /* renamed from: f */
    public static final C56628a f129067f = new C56628a((byte) 0);

    /* renamed from: c */
    public IIconSlot.SlotViewModel f129068c;

    /* renamed from: d */
    public C56645a f129069d = new C56645a("ECDuringLiveBroadcasterWidget");

    /* renamed from: e */
    public final Context f129070e;

    /* renamed from: g */
    private AbstractC6157ab.AbstractC6158a f129071g;

    /* renamed from: h */
    private C56631a f129072h;

    /* renamed from: i */
    private final C56624a f129073i = new C56624a(new C56629b(this));

    /* renamed from: j */
    private Room f129074j;

    static {
        Covode.recordClassIndex(66471);
    }

    @Override // com.bytedance.android.live.slot.AbstractC6157ab, com.bytedance.android.live.slot.AbstractC6166b
    /* renamed from: a */
    public final void mo12072a(IMessage iMessage) {
    }

    @Override // com.bytedance.android.live.slot.AbstractC6157ab
    /* renamed from: g */
    public final String mo12080g() {
        return "ec_shop";
    }

    /* renamed from: com.ss.android.ugc.aweme.influencer.ecommercelive.business.a.b.a.b$a */
    public static final class C56628a {
        static {
            Covode.recordClassIndex(66472);
        }

        private C56628a() {
        }

        public /* synthetic */ C56628a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.android.live.slot.AbstractC6157ab
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ Enum mo12078e() {
        return IIconSlot.EnumC6149b.SLOT_LIVE_ANCHOR_TOOLBAR;
    }

    @Override // com.bytedance.android.live.slot.AbstractC6157ab
    /* renamed from: f */
    public final /* bridge */ /* synthetic */ Object mo12079f() {
        return this.f129073i;
    }

    @Override // com.bytedance.android.live.slot.AbstractC6157ab, com.bytedance.android.live.slot.AbstractC6166b
    /* renamed from: a */
    public final List<Integer> mo12069a() {
        return new ArrayList();
    }

    @Override // com.bytedance.android.live.slot.AbstractC6157ab, com.p2082ss.android.ugc.aweme.influencer.ecommercelive.business.common.p3283b.AbstractC56636b, com.bytedance.android.live.slot.AbstractC6166b
    /* renamed from: d */
    public final void mo12077d() {
        super.mo12077d();
        mo93525i();
        C18494b.m34422b("set_live_continue", this);
        C18494b.m34422b("talent_live_product_has_pin", this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final String mo93518h() {
        String valueOf;
        Room room = this.f129074j;
        if (room == null || (valueOf = String.valueOf(room.getId())) == null) {
            return "0";
        }
        return valueOf;
    }

    /* renamed from: j */
    private final String m102614j() {
        Long l;
        AbstractC2994b author;
        String valueOf;
        Room room = this.f129074j;
        if (room != null && (author = room.author()) != null && (valueOf = String.valueOf(author.getId())) != null) {
            return valueOf;
        }
        AbstractC6872f b = C11115u.m19743a().mo17915b();
        if (b != null) {
            l = Long.valueOf(b.mo13161c());
        } else {
            l = null;
        }
        return String.valueOf(l);
    }

    /* renamed from: com.ss.android.ugc.aweme.influencer.ecommercelive.business.a.b.a.b$b */
    public static final class C56629b extends AbstractC6171g {

        /* renamed from: c */
        final /* synthetic */ C56627b f129075c;

        static {
            Covode.recordClassIndex(66473);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56629b(C56627b bVar) {
            super((byte) 0);
            this.f129075c = bVar;
        }

        @Override // com.bytedance.android.live.slot.AbstractC6171g
        /* renamed from: a */
        public final void mo12084a(String str) {
            C1213t<String> tVar;
            C89219l.m154721d(str, "");
            SmartRouter.buildRoute(this.f129075c.f129070e, C89361p.m154869a(C89361p.m154869a(C89361p.m154869a(C56654a.m102658a(), "_roomId_", this.f129075c.mo93518h(), false), "_isLiving_", "true", false), "_liveStatus_", "during_live", false)).open();
            IIconSlot.SlotViewModel slotViewModel = this.f129075c.f129068c;
            if (!(slotViewModel == null || (tVar = slotViewModel.f15360k) == null)) {
                tVar.setValue("");
            }
            C56635a.m102628b(this.f129075c.f129069d);
        }
    }

    public C56627b(Context context) {
        C89219l.m154721d(context, "");
        this.f129070e = context;
    }

    @Override // com.bytedance.android.live.slot.AbstractC6157ab, com.bytedance.android.live.slot.AbstractC6166b
    /* renamed from: a */
    public final void mo12073a(String str) {
        if (C89219l.m154714a((Object) str, (Object) "during_live")) {
            AbstractC89568bz unused = C89624i.m155555a(C89517an.m155448a(C56651b.f129115b), null, null, new C56630c(this, null), 3);
            mo93524a(new C56638d("rd_tiktokec_during_live_icon_show", m102614j(), mo93518h()));
        }
        C56635a.m102627a(this.f129069d);
    }

    /* renamed from: com.ss.android.ugc.aweme.influencer.ecommercelive.business.a.b.a.b$c */
    static final class C56630c extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f129076a;

        /* renamed from: b */
        final /* synthetic */ C56627b f129077b;

        static {
            Covode.recordClassIndex(66474);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56630c(C56627b bVar, AbstractC89124d dVar) {
            super(2, dVar);
            this.f129077b = bVar;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C56630c(this.f129077b, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C56630c) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            C1213t<String> tVar;
            EnumC89098a aVar = EnumC89098a.COROUTINE_SUSPENDED;
            int i = this.f129076a;
            if (i == 0) {
                C89382r.m154942a(obj);
                this.f129076a = 1;
                if (C89536ay.m155464a(800, this) == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                C89382r.m154942a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            if (C56649a.m102651b("need_show_ec_tip_in_living_room")) {
                IIconSlot.SlotViewModel slotViewModel = this.f129077b.f129068c;
                if (slotViewModel != null) {
                    slotViewModel.f15362m = 15000;
                }
                IIconSlot.SlotViewModel slotViewModel2 = this.f129077b.f129068c;
                if (!(slotViewModel2 == null || (tVar = slotViewModel2.f15360k) == null)) {
                    tVar.setValue(this.f129077b.f129070e.getResources().getString(R.string.ei));
                }
                C56649a.m102650a("need_show_ec_tip_in_living_room");
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.ies.xbridge.p1301e.AbstractC18511d
    /* renamed from: a */
    public final void mo8791a(C18502c cVar) {
        C1213t<Drawable> tVar;
        boolean z;
        EnumC10927a aVar;
        C89219l.m154721d(cVar, "");
        Context context = this.f129070e;
        C1261i iVar = null;
        if (!(context instanceof ActivityC0945e)) {
            context = null;
        }
        ActivityC0945e eVar = (ActivityC0945e) context;
        if (eVar != null) {
            boolean z2 = false;
            if (C89219l.m154714a((Object) "set_live_continue", (Object) cVar.f44153a)) {
                AbstractC18754n nVar = cVar.f44154b;
                if (nVar != null) {
                    z = C18586i.m34542a(nVar, "continue", false);
                } else {
                    z = true;
                }
                ILiveOuterService s = LiveOuterService.m107269s();
                C89219l.m154716b(s, "");
                C1213t<EnumC10927a> tVar2 = s.mo95843q().mo96046a(eVar).f26253a;
                if (z) {
                    aVar = EnumC10927a.STREAM_ON;
                } else {
                    aVar = EnumC10927a.STREAM_PAUSE;
                }
                tVar2.setValue(aVar);
            } else if (C89219l.m154714a((Object) "talent_live_product_has_pin", (Object) cVar.f44153a)) {
                AbstractC18754n nVar2 = cVar.f44154b;
                if (nVar2 != null) {
                    z2 = C18586i.m34542a(nVar2, "hasPin", false);
                }
                IIconSlot.SlotViewModel slotViewModel = this.f129068c;
                if (slotViewModel != null && (tVar = slotViewModel.f15357h) != null) {
                    if (z2) {
                        iVar = C1261i.m4015a(eVar.getResources(), R.drawable.a6d, null);
                    }
                    tVar.setValue(iVar);
                }
            }
        }
    }

    @Override // com.bytedance.android.live.slot.AbstractC6157ab, com.bytedance.android.live.slot.AbstractC6166b
    /* renamed from: a */
    public final /* synthetic */ void mo12071a(AbstractC1174ac acVar, AbstractC6157ab.AbstractC6158a aVar) {
        int i;
        IIconSlot.SlotViewModel slotViewModel;
        IIconSlot.SlotViewModel slotViewModel2 = (IIconSlot.SlotViewModel) acVar;
        C89219l.m154721d(slotViewModel2, "");
        C89219l.m154721d(aVar, "");
        super.mo12071a(slotViewModel2, aVar);
        C56644c.m102642a(slotViewModel2);
        C1213t<Drawable> tVar = slotViewModel2.f15354e;
        C89219l.m154716b(tVar, "");
        tVar.setValue(C0637f.m2348a(this.f129070e.getResources(), 2131231942, null));
        C1213t<Drawable> tVar2 = slotViewModel2.f15355f;
        C89219l.m154716b(tVar2, "");
        tVar2.setValue(C0637f.m2348a(this.f129070e.getResources(), 2131231943, null));
        C1213t<String> tVar3 = slotViewModel2.f15358i;
        C89219l.m154716b(tVar3, "");
        tVar3.setValue(this.f129070e.getString(R.string.eds));
        C1213t<Drawable> tVar4 = slotViewModel2.f15356g;
        C89219l.m154716b(tVar4, "");
        tVar4.setValue(C0643b.m2369a(this.f129070e, (int) R.drawable.a6a));
        C1213t<String> tVar5 = slotViewModel2.f15359j;
        C89219l.m154716b(tVar5, "");
        tVar5.setValue(this.f129070e.getString(R.string.ev));
        this.f129068c = slotViewModel2;
        this.f129071g = aVar;
        C56631a aVar2 = this.f129072h;
        if (!(aVar2 == null || (i = aVar2.f129078a) <= 0 || (slotViewModel = this.f129068c) == null)) {
            slotViewModel.f15365p = Integer.valueOf(i);
        }
        C18494b.m34419a("set_live_continue", this, "ECDuringLiveBroadcasterWidget");
        C18494b.m34419a("talent_live_product_has_pin", this, "ECDuringLiveBroadcasterWidget");
    }

    @Override // com.bytedance.android.live.slot.AbstractC6157ab
    /* renamed from: a */
    public final void mo12074a(Map<String, ? extends Object> map, AbstractC6157ab.AbstractC6159b bVar) {
        CommerceStruct commerceStruct;
        String str;
        CommerceStruct commerceStruct2;
        C89219l.m154721d(map, "");
        C89219l.m154721d(bVar, "");
        Object obj = map.get("param_room");
        C56631a aVar = null;
        if (!(obj instanceof Room)) {
            obj = null;
        }
        Room room = (Room) obj;
        this.f129074j = room;
        boolean z = true;
        if (room == null || (commerceStruct2 = room.getCommerceStruct()) == null || commerceStruct2.commercePermission != 1) {
            z = false;
        }
        Room room2 = this.f129074j;
        if (!(room2 == null || (commerceStruct = room2.getCommerceStruct()) == null || (str = commerceStruct.oecInitDataString) == null)) {
            try {
                aVar = (C56631a) new C27910f().mo46670a(str, C56631a.class);
            } catch (Exception unused) {
            }
        }
        this.f129072h = aVar;
        C56645a aVar2 = this.f129069d;
        String h = mo93518h();
        aVar2.mo93532a("anchor_id", m102614j());
        aVar2.mo93532a("EVENT_ORIGIN_FEATURE", "TEMAI");
        aVar2.mo93532a("room_id", h);
        aVar2.mo93532a("live_status", "during_live");
        bVar.mo12045a(z);
    }
}
